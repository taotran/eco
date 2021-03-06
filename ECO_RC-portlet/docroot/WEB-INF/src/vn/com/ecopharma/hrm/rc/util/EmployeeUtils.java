package vn.com.ecopharma.hrm.rc.util;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PipedOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.lang3.StringUtils;

import vn.com.ecopharma.emp.model.District;
import vn.com.ecopharma.emp.model.Emp;
import vn.com.ecopharma.emp.model.EmpBankInfo;
import vn.com.ecopharma.emp.model.EmpLaborContract;
import vn.com.ecopharma.emp.service.DocumentLocalServiceUtil;
import vn.com.ecopharma.emp.service.EmpBankInfoLocalServiceUtil;
import vn.com.ecopharma.emp.service.EmpLaborContractLocalServiceUtil;
import vn.com.ecopharma.emp.service.EmpLocalServiceUtil;
import vn.com.ecopharma.hrm.rc.dto.AddressObjectItem;
import vn.com.ecopharma.hrm.rc.dto.BankInfoObject;
import vn.com.ecopharma.hrm.rc.dto.DependentName;
import vn.com.ecopharma.hrm.rc.dto.DocumentItem;
import vn.com.ecopharma.hrm.rc.dto.EmpIndexedItem;
import vn.com.ecopharma.hrm.rc.dto.LaborContractItem;

import com.liferay.faces.portal.context.LiferayFacesContext;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.ParseException;
import com.liferay.portal.model.Address;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.User;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.UserLocalServiceUtil;

/**
 * @author TaoTran
 *
 */
public class EmployeeUtils {

	private static final String ZIP_CODE = "70000";

	private static final String EMAIL_SUFFIX = "@ecopharma.com.vn";

	private static final Log LOGGER = LogFactoryUtil
			.getLog(EmployeeUtils.class);

	private EmployeeUtils() {
	}

	/**
	 * @param items
	 * @return
	 */
	public static Map<Address, Boolean> transferAddressObjectListToAddressMap(
			List<AddressObjectItem> items) {
		final Map<Address, Boolean> resultMap = new HashMap<>(items.size());
		for (AddressObjectItem item : items) {
			final District district = item.getDistrict();
			final Address address = item.getAddress();
			long countryId = item.getCountry() != null ? item.getCountry()
					.getCountryId() : address.getCountryId();
			long regionId = item.getRegion() != null ? item.getRegion()
					.getRegionId() : address.getRegionId();
			address.setCountryId(countryId);
			address.setRegionId(regionId);
			// if (StringUtils.trimToNull(address.getStreet3()) == null)
			if (district != null)
				address.setStreet3(item.isUIDeleted() ? StringUtils.EMPTY
						: district.getRegionCode() + "_" + district.getName());

			address.setZip(ZIP_CODE);
			resultMap.put(address, item.isUIDeleted());
		}
		return resultMap;
	}

	/**
	 * @param items
	 * @return
	 */
	public static Map<String, Boolean> transferDependentNameObjectListToDependentNameMap(
			List<DependentName> items) {
		final Map<String, Boolean> resultMap = new HashMap<>();

		for (DependentName item : items) {
			resultMap.put(item.getName(), item.isUIDeleted());
		}
		return resultMap;
	}

	public static List<BankInfoObject> getBankInfoObjectsFromEmp(long empId) {
		final List<BankInfoObject> result = new ArrayList<>();
		final List<EmpBankInfo> empBankInfos = EmpBankInfoLocalServiceUtil
				.findByEmp(empId);
		if (empBankInfos.isEmpty()) {
			result.add(new BankInfoObject());
			return result;
		}

		for (EmpBankInfo item : empBankInfos) {
			result.add(new BankInfoObject(item));
		}
		return result;
	}

	public static List<DocumentItem> getDocumentItemsFromEmp(long empId) {
		final List<DocumentItem> result = new ArrayList<>();
		final List<vn.com.ecopharma.emp.model.Document> documents = DocumentLocalServiceUtil
				.findByClassNameAndClassPK(Emp.class.getName(), empId);
		for (vn.com.ecopharma.emp.model.Document document : documents)
			result.add(new DocumentItem(document));
		return result;
	}

	public static List<LaborContractItem> getLaborContractItemsFromEmp(
			long empId) {
		final List<LaborContractItem> result = new ArrayList<>();
		final List<EmpLaborContract> empLaborContracts = EmpLaborContractLocalServiceUtil
				.findByEmp(empId);
		for (EmpLaborContract item : empLaborContracts)
			result.add(new LaborContractItem(item));
		return result;
	}

	public static Map<EmpBankInfo, Boolean> transferBankInfoObjectListToBankInfoMap(
			List<BankInfoObject> items) {
		final Map<EmpBankInfo, Boolean> resultMap = new HashMap<>();
		for (BankInfoObject obj : items) {
			resultMap.put(obj.getObject(), obj.isUIDeleted());
		}

		return resultMap;
	}

	public static Map<EmpBankInfo, Boolean> transferEmpBankInfoListToBankInfoMap(
			List<EmpBankInfo> items) {
		final Map<EmpBankInfo, Boolean> resultMap = new HashMap<>();
		for (EmpBankInfo obj : items) {
			resultMap.put(obj, false);
		}

		return resultMap;
	}

	public static Map<EmpLaborContract, Boolean> transferEmpLaborContractInfoListToEmpLaborContractMap(
			List<LaborContractItem> items) {
		final Map<EmpLaborContract, Boolean> resultMap = new HashMap<>();
		for (LaborContractItem obj : items) {
			resultMap.put(obj.getObject(), obj.isUIDeleted());
		}
		return resultMap;
	}

	public static int numberOfValidDependentName(List<DependentName> items) {
		int count = 0;
		for (DependentName item : items) {
			if (!item.isUIDeleted())
				count++;
		}
		return count;
	}

	/**
	 * @param s
	 * @return
	 */
	public static List<DependentName> getDependentNamesFromString(String s) {
		final List<DependentName> result = new ArrayList<>();
		if (org.apache.commons.lang.StringUtils.trimToNull(s) == null) {
			return result;
		}
		String[] splitNames = s.split(";");
		for (int i = 0; i < splitNames.length; i++) {
			result.add(new DependentName(splitNames[i], Boolean.FALSE));
		}
		return result;
	}

	public static String getFullnameFromUser(User user) {
		return StringUtils.trimToEmpty(user.getLastName()) + " "
				+ StringUtils.trimToEmpty(user.getMiddleName()) + " "
				+ StringUtils.trimToEmpty(user.getFirstName());
	}

	public static String getViFullnameFromUser(User user) {
		return StringUtils.trimToEmpty(user.getLastName()) + " "
				+ StringUtils.trimToEmpty(user.getMiddleName()) + " "
				+ StringUtils.trimToEmpty(user.getFirstName());
	}

	public static List<Long> getIdsFromBasedModelList(List<BaseModel<?>> list) {
		final List<Long> ids = new ArrayList<>();
		for (BaseModel<?> obj : list) {
			ids.add(new Long(obj.getPrimaryKeyObj().toString()));
		}
		return ids;
	}

	public static ServiceContext getServiceContext() {
		return LiferayFacesContext.getInstance().getServiceContext();
	}

	public static long getCompanyId() {
		return getServiceContext().getCompanyId();
	}

	public static long getBaseModelPrimaryKey(BaseModel<?> model) {
		if (model == null)
			return 0;
		return Long.valueOf(String.valueOf(model.getPrimaryKeyObj()));
	}

	public static String generateEmailByUsername(String username) {
		return username + EMAIL_SUFFIX;
	}

	public static String regenerateUsername(String currentUsername,
			int increment) {

		try {
			if (UserLocalServiceUtil.fetchUserByScreenName(getServiceContext()
					.getCompanyId(), currentUsername) == null) {
				return currentUsername;
			}

			if (increment > 1) {
				currentUsername = currentUsername.substring(0, // NOSONAR
						currentUsername.length() - 1) + increment;
			} else {
				currentUsername = currentUsername + increment; // NOSONAR
			}

			increment += 1; // NOSONAR
			return regenerateUsername(currentUsername, increment);
		} catch (SystemException e) {
			LOGGER.info(e);
		}
		return currentUsername;
	}

	public static void writeOutputStreamToPipedOutputStream(
			ByteArrayOutputStream originOut, PipedOutputStream pipedOutputStream) {
		try {
			originOut.writeTo(pipedOutputStream);
			originOut.flush();
		} catch (IOException e) {
			LogFactoryUtil.getLog(EmployeeUtils.class).info(e);
		} finally {
			closeOutputStream(originOut);
			closeOutputStream(pipedOutputStream);
		}
	}

	private static void closeOutputStream(OutputStream outputStream) {
		if (outputStream != null) {
			try {
				outputStream.close();
			} catch (IOException e) {
				LogFactoryUtil.getLog(EmployeeUtils.class).info(e);
			}
		}
	}

	/**
	 * Provide at least 2 employee's name characters to search employee
	 * 
	 * @param query
	 * @return
	 */
	public static List<EmpIndexedItem> searchEmpByName(String query) {
		try {
			return getEmployeeIndexedItemsFromIndexedDocuments(EmpLocalServiceUtil
					.filterEmployeeByAutocompleteQuery(query,
							RCUtils.getCurrentSearchContext(),
							QueryUtil.ALL_POS, QueryUtil.ALL_POS));
		} catch (ParseException e) {
			LogFactoryUtil.getLog(EmployeeUtils.class).info(e);
		}
		return new ArrayList<>();
	}

	/**
	 * @param documents
	 * @return
	 */
	public static List<EmpIndexedItem> getEmployeeIndexedItemsFromIndexedDocuments(
			List<Document> documents) {

		final List<EmpIndexedItem> results = new ArrayList<>(documents.size());
		for (final Document document : documents) {
			results.add(new EmpIndexedItem(document));
		}
		return results;
	}
}
