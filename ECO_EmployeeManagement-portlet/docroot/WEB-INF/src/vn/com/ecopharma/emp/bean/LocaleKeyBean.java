package vn.com.ecopharma.emp.bean;

import java.io.Serializable;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

import org.apache.commons.lang3.StringUtils;

import vn.com.ecopharma.emp.enumeration.DisciplineType;
import vn.com.ecopharma.emp.enumeration.ResignationType;
import vn.com.ecopharma.emp.enumeration.VacationLeaveType;

/**
 * @author TaoTran
 *
 */
@ManagedBean
@RequestScoped
public class LocaleKeyBean implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	

	public String getDisciplineTypeKey(String type) {
		if (StringUtils.EMPTY.equals(type))
			return StringUtils.EMPTY;
		DisciplineType disciplineType = DisciplineType.valueOf(type);
		return disciplineType.getLocalizedString();
	}

	public String getLeaveTypeKey(String type) {
		if (StringUtils.EMPTY.equals(type))
			return StringUtils.EMPTY;
		type = type.replaceAll(" ", "_");
		VacationLeaveType typeEnum = VacationLeaveType.valueOf(type);
		return typeEnum.getLocalizedString();
	}

	public String getResignedTypeKey(String type) {
		if (StringUtils.EMPTY.equals(type))
			return StringUtils.EMPTY;
		type = type.replaceAll(" ", "_");
		ResignationType typeEnum = ResignationType.valueOf(type);
		return typeEnum.getLocalizedString();
	}
}
