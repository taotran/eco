package vn.com.ecopharma.hrm.tt.bean;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import vn.com.ecopharma.emp.model.Department;
import vn.com.ecopharma.emp.model.Devision;
import vn.com.ecopharma.emp.model.Titles;
import vn.com.ecopharma.emp.model.Unit;
import vn.com.ecopharma.emp.model.UnitGroup;

public interface OrganizationFilter extends Serializable {

	public void onDevisionChanged();

	public void onDepartmentChanged();

	public void onUnitChanged();

	public void onUnitGroupChanged();

	public List<Unit> getUnits();

	public List<UnitGroup> getUnitGroups();

	public List<Department> getDepartments();

	public List<Devision> getDevisions();

	public List<Titles> getTitlesList();

	public List<Devision> getSelectedDevisions();

	public void setSelectedDevisions(List<Devision> selectedDevisions);

	public List<Department> getSelectedDepartments();

	public void setSelectedDepartments(List<Department> selectedDepartments);

	public List<Unit> getSelectedUnits();

	public void setSelectedUnits(List<Unit> selectedUnits);

	public List<UnitGroup> getSelectedUnitGroups();

	public void setSelectedUnitGroups(List<UnitGroup> selectedUnitGroups);

	public List<Titles> getSelectedTitlesList();

	public void setSelectedTitlesList(List<Titles> selectedTitlesList);

	public List<String> getSelectedDevisionStrings();

	public List<String> getSelectedDepartmentStrings();

	public List<String> getSelectedUnitStrings();

	public List<String> getSelectedUnitGroupStrings();

	public List<String> getSelectedTitlesListStrings();

	public Map<String, List<String>> getOrganizationFilters();

}
