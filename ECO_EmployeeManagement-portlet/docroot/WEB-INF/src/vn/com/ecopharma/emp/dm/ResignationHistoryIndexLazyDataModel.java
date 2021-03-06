package vn.com.ecopharma.emp.dm;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.primefaces.model.SortOrder;

import vn.com.ecopharma.emp.bean.filter.ResignationFilterBean;
import vn.com.ecopharma.emp.constant.ResignationHistoryField;
import vn.com.ecopharma.emp.dto.ResignationHistoryIndexedItem;
import vn.com.ecopharma.emp.service.ResignationHistoryLocalServiceUtil;
import vn.com.ecopharma.emp.util.BeanUtils;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.search.Document;
import com.liferay.portal.kernel.search.Sort;

public class ResignationHistoryIndexLazyDataModel
		extends
		AbstractEmpBaseLazyDataModel<ResignationHistoryIndexedItem, ResignationFilterBean> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	private static final Log LOGGER = LogFactoryUtil
			.getLog(ResignationHistoryIndexLazyDataModel.class);

	@Override
	public ResignationHistoryIndexedItem getRowData(String rowKey) {
		return new ResignationHistoryIndexedItem(
				ResignationHistoryLocalServiceUtil.getIndexedDocument(rowKey,
						searchContext));

	}

	@Override
	public List<ResignationHistoryIndexedItem> load(int first, int pageSize,
			String sortField, SortOrder sortOrder, Map<String, Object> filters) {
		final List<ResignationHistoryIndexedItem> results = new ArrayList<>();
		try {
			super.bindOrganizationFilterFields(filters,
					BeanUtils.getResignationFilterBean());

			final Sort sort = new Sort(ResignationHistoryField.ID, false);
			final List<Document> documents = ResignationHistoryLocalServiceUtil
					.filterByFields(searchContext, filters, sort,
							searchContext.getCompanyId(), first, first
									+ pageSize);
			for (Document document : documents) {
				results.add(new ResignationHistoryIndexedItem(document));
			}
			setPageSize(pageSize);
			setRowCount(ResignationHistoryLocalServiceUtil.countFilterByFields(
					searchContext, filters, sort, searchContext.getCompanyId()));

			return results;
		} catch (PortalException e) {
			LOGGER.info(e);
		}
		return new ArrayList<>();
	}
}
