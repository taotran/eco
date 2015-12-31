package vn.com.ecopharma.hrm.rc.bean;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import vn.com.ecopharma.emp.model.Department;
import vn.com.ecopharma.emp.model.Devision;
import vn.com.ecopharma.emp.model.Titles;
import vn.com.ecopharma.emp.model.Unit;
import vn.com.ecopharma.emp.model.UnitGroup;
import vn.com.ecopharma.emp.service.DepartmentLocalServiceUtil;
import vn.com.ecopharma.emp.service.DevisionLocalServiceUtil;
import vn.com.ecopharma.emp.service.TitlesLocalServiceUtil;
import vn.com.ecopharma.emp.service.UnitGroupLocalServiceUtil;
import vn.com.ecopharma.emp.service.UnitLocalServiceUtil;
import vn.com.ecopharma.hrm.rc.util.BeanUtils;

@ManagedBean
@ViewScoped
public class TitlesActionBean {

	private Titles titles;
	private Devision devision;
	private Department department;
	private Unit unit;
	private UnitGroup unitGroup;

	public void onUpdateTitles() {
		final VacancyBean vacancyBean = BeanUtils.getVacancyBean();
		vacancyBean.getVacancyItem().setTitles(this.titles);
	}

	public List<Titles> getTitlesList() {
		if (department == null && unit == null && unitGroup == null)
			return new ArrayList<Titles>();
		long departmentId = department != null ? department.getDepartmentId()
				: 0L;
		long unitId = unit != null ? unit.getUnitId() : 0L;
		long unitGroupId = unitGroup != null ? unitGroup.getUnitGroupId() : 0L;
		return TitlesLocalServiceUtil.findByRelatedEntities(departmentId,
				unitId, unitGroupId);
	}

	public List<UnitGroup> getUnitGroups() {
		return unit != null ? UnitGroupLocalServiceUtil.findByUnit(unit
				.getUnitId()) : null;
	}

	public List<Unit> getUnits() {
		final Department empDepartment = department;
		return empDepartment != null ? UnitLocalServiceUtil
				.findByDepartment(empDepartment.getDepartmentId())
				: new ArrayList<Unit>();
	}

	public List<Department> getDepartments() {
		List<Department> departments = devision != null ? DepartmentLocalServiceUtil
				.findByDevision(devision.getDevisionId())
				: new ArrayList<Department>();
		if (departments.isEmpty() || !departments.contains(department)) {
			department = null;
		}
		return departments;
	}

	public List<Devision> getDevisions() {
		return DevisionLocalServiceUtil.findAll();
	}

	public void onDevisionChanged() {
		department = null;
		unit = null;
		unitGroup = null;
		titles = null;
	}

	public void onDepartmentChanged() {
		unit = null;
		unitGroup = null;
		titles = null;
	}

	public void onUnitChanged() {
		unitGroup = null;
		titles = null;
	}

	public void onUnitGroupChanged() {
		titles = null;
	}

	public Titles getTitles() {
		return titles;
	}

	public void setTitles(Titles titles) {
		this.titles = titles;
	}

	public Devision getDevision() {
		return devision;
	}

	public void setDevision(Devision devision) {
		this.devision = devision;
	}

	public Department getDepartment() {
		return department;
	}

	public void setDepartment(Department department) {
		this.department = department;
	}

	public Unit getUnit() {
		return unit;
	}

	public void setUnit(Unit unit) {
		this.unit = unit;
	}

	public UnitGroup getUnitGroup() {
		return unitGroup;
	}

	public void setUnitGroup(UnitGroup unitGroup) {
		this.unitGroup = unitGroup;
	}
}
