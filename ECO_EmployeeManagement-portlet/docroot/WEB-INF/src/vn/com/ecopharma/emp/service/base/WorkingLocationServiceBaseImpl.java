/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package vn.com.ecopharma.emp.service.base;

import com.liferay.portal.kernel.bean.BeanReference;
import com.liferay.portal.kernel.bean.IdentifiableBean;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdate;
import com.liferay.portal.kernel.dao.jdbc.SqlUpdateFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.service.BaseServiceImpl;
import com.liferay.portal.service.persistence.UserPersistence;

import vn.com.ecopharma.emp.model.WorkingLocation;
import vn.com.ecopharma.emp.service.WorkingLocationService;
import vn.com.ecopharma.emp.service.persistence.CertificatePersistence;
import vn.com.ecopharma.emp.service.persistence.DepartmentPersistence;
import vn.com.ecopharma.emp.service.persistence.DevisionPersistence;
import vn.com.ecopharma.emp.service.persistence.DistrictPersistence;
import vn.com.ecopharma.emp.service.persistence.EmpPersistence;
import vn.com.ecopharma.emp.service.persistence.EmployeeTitlesHistoryPersistence;
import vn.com.ecopharma.emp.service.persistence.LevelPersistence;
import vn.com.ecopharma.emp.service.persistence.LocationPersistence;
import vn.com.ecopharma.emp.service.persistence.PromotedHistoryPersistence;
import vn.com.ecopharma.emp.service.persistence.ResignationHistoryPersistence;
import vn.com.ecopharma.emp.service.persistence.ResourceConfigPersistence;
import vn.com.ecopharma.emp.service.persistence.TitlesPersistence;
import vn.com.ecopharma.emp.service.persistence.UnitGroupPersistence;
import vn.com.ecopharma.emp.service.persistence.UnitPersistence;
import vn.com.ecopharma.emp.service.persistence.UniversityPersistence;
import vn.com.ecopharma.emp.service.persistence.WorkingLocationPersistence;

import javax.sql.DataSource;

/**
 * Provides the base implementation for the working location remote service.
 *
 * <p>
 * This implementation exists only as a container for the default service methods generated by ServiceBuilder. All custom service methods should be put in {@link vn.com.ecopharma.emp.service.impl.WorkingLocationServiceImpl}.
 * </p>
 *
 * @author tvt
 * @see vn.com.ecopharma.emp.service.impl.WorkingLocationServiceImpl
 * @see vn.com.ecopharma.emp.service.WorkingLocationServiceUtil
 * @generated
 */
public abstract class WorkingLocationServiceBaseImpl extends BaseServiceImpl
	implements WorkingLocationService, IdentifiableBean {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link vn.com.ecopharma.emp.service.WorkingLocationServiceUtil} to access the working location remote service.
	 */

	/**
	 * Returns the certificate local service.
	 *
	 * @return the certificate local service
	 */
	public vn.com.ecopharma.emp.service.CertificateLocalService getCertificateLocalService() {
		return certificateLocalService;
	}

	/**
	 * Sets the certificate local service.
	 *
	 * @param certificateLocalService the certificate local service
	 */
	public void setCertificateLocalService(
		vn.com.ecopharma.emp.service.CertificateLocalService certificateLocalService) {
		this.certificateLocalService = certificateLocalService;
	}

	/**
	 * Returns the certificate remote service.
	 *
	 * @return the certificate remote service
	 */
	public vn.com.ecopharma.emp.service.CertificateService getCertificateService() {
		return certificateService;
	}

	/**
	 * Sets the certificate remote service.
	 *
	 * @param certificateService the certificate remote service
	 */
	public void setCertificateService(
		vn.com.ecopharma.emp.service.CertificateService certificateService) {
		this.certificateService = certificateService;
	}

	/**
	 * Returns the certificate persistence.
	 *
	 * @return the certificate persistence
	 */
	public CertificatePersistence getCertificatePersistence() {
		return certificatePersistence;
	}

	/**
	 * Sets the certificate persistence.
	 *
	 * @param certificatePersistence the certificate persistence
	 */
	public void setCertificatePersistence(
		CertificatePersistence certificatePersistence) {
		this.certificatePersistence = certificatePersistence;
	}

	/**
	 * Returns the department local service.
	 *
	 * @return the department local service
	 */
	public vn.com.ecopharma.emp.service.DepartmentLocalService getDepartmentLocalService() {
		return departmentLocalService;
	}

	/**
	 * Sets the department local service.
	 *
	 * @param departmentLocalService the department local service
	 */
	public void setDepartmentLocalService(
		vn.com.ecopharma.emp.service.DepartmentLocalService departmentLocalService) {
		this.departmentLocalService = departmentLocalService;
	}

	/**
	 * Returns the department remote service.
	 *
	 * @return the department remote service
	 */
	public vn.com.ecopharma.emp.service.DepartmentService getDepartmentService() {
		return departmentService;
	}

	/**
	 * Sets the department remote service.
	 *
	 * @param departmentService the department remote service
	 */
	public void setDepartmentService(
		vn.com.ecopharma.emp.service.DepartmentService departmentService) {
		this.departmentService = departmentService;
	}

	/**
	 * Returns the department persistence.
	 *
	 * @return the department persistence
	 */
	public DepartmentPersistence getDepartmentPersistence() {
		return departmentPersistence;
	}

	/**
	 * Sets the department persistence.
	 *
	 * @param departmentPersistence the department persistence
	 */
	public void setDepartmentPersistence(
		DepartmentPersistence departmentPersistence) {
		this.departmentPersistence = departmentPersistence;
	}

	/**
	 * Returns the devision local service.
	 *
	 * @return the devision local service
	 */
	public vn.com.ecopharma.emp.service.DevisionLocalService getDevisionLocalService() {
		return devisionLocalService;
	}

	/**
	 * Sets the devision local service.
	 *
	 * @param devisionLocalService the devision local service
	 */
	public void setDevisionLocalService(
		vn.com.ecopharma.emp.service.DevisionLocalService devisionLocalService) {
		this.devisionLocalService = devisionLocalService;
	}

	/**
	 * Returns the devision remote service.
	 *
	 * @return the devision remote service
	 */
	public vn.com.ecopharma.emp.service.DevisionService getDevisionService() {
		return devisionService;
	}

	/**
	 * Sets the devision remote service.
	 *
	 * @param devisionService the devision remote service
	 */
	public void setDevisionService(
		vn.com.ecopharma.emp.service.DevisionService devisionService) {
		this.devisionService = devisionService;
	}

	/**
	 * Returns the devision persistence.
	 *
	 * @return the devision persistence
	 */
	public DevisionPersistence getDevisionPersistence() {
		return devisionPersistence;
	}

	/**
	 * Sets the devision persistence.
	 *
	 * @param devisionPersistence the devision persistence
	 */
	public void setDevisionPersistence(DevisionPersistence devisionPersistence) {
		this.devisionPersistence = devisionPersistence;
	}

	/**
	 * Returns the district local service.
	 *
	 * @return the district local service
	 */
	public vn.com.ecopharma.emp.service.DistrictLocalService getDistrictLocalService() {
		return districtLocalService;
	}

	/**
	 * Sets the district local service.
	 *
	 * @param districtLocalService the district local service
	 */
	public void setDistrictLocalService(
		vn.com.ecopharma.emp.service.DistrictLocalService districtLocalService) {
		this.districtLocalService = districtLocalService;
	}

	/**
	 * Returns the district remote service.
	 *
	 * @return the district remote service
	 */
	public vn.com.ecopharma.emp.service.DistrictService getDistrictService() {
		return districtService;
	}

	/**
	 * Sets the district remote service.
	 *
	 * @param districtService the district remote service
	 */
	public void setDistrictService(
		vn.com.ecopharma.emp.service.DistrictService districtService) {
		this.districtService = districtService;
	}

	/**
	 * Returns the district persistence.
	 *
	 * @return the district persistence
	 */
	public DistrictPersistence getDistrictPersistence() {
		return districtPersistence;
	}

	/**
	 * Sets the district persistence.
	 *
	 * @param districtPersistence the district persistence
	 */
	public void setDistrictPersistence(DistrictPersistence districtPersistence) {
		this.districtPersistence = districtPersistence;
	}

	/**
	 * Returns the emp local service.
	 *
	 * @return the emp local service
	 */
	public vn.com.ecopharma.emp.service.EmpLocalService getEmpLocalService() {
		return empLocalService;
	}

	/**
	 * Sets the emp local service.
	 *
	 * @param empLocalService the emp local service
	 */
	public void setEmpLocalService(
		vn.com.ecopharma.emp.service.EmpLocalService empLocalService) {
		this.empLocalService = empLocalService;
	}

	/**
	 * Returns the emp remote service.
	 *
	 * @return the emp remote service
	 */
	public vn.com.ecopharma.emp.service.EmpService getEmpService() {
		return empService;
	}

	/**
	 * Sets the emp remote service.
	 *
	 * @param empService the emp remote service
	 */
	public void setEmpService(
		vn.com.ecopharma.emp.service.EmpService empService) {
		this.empService = empService;
	}

	/**
	 * Returns the emp persistence.
	 *
	 * @return the emp persistence
	 */
	public EmpPersistence getEmpPersistence() {
		return empPersistence;
	}

	/**
	 * Sets the emp persistence.
	 *
	 * @param empPersistence the emp persistence
	 */
	public void setEmpPersistence(EmpPersistence empPersistence) {
		this.empPersistence = empPersistence;
	}

	/**
	 * Returns the employee titles history local service.
	 *
	 * @return the employee titles history local service
	 */
	public vn.com.ecopharma.emp.service.EmployeeTitlesHistoryLocalService getEmployeeTitlesHistoryLocalService() {
		return employeeTitlesHistoryLocalService;
	}

	/**
	 * Sets the employee titles history local service.
	 *
	 * @param employeeTitlesHistoryLocalService the employee titles history local service
	 */
	public void setEmployeeTitlesHistoryLocalService(
		vn.com.ecopharma.emp.service.EmployeeTitlesHistoryLocalService employeeTitlesHistoryLocalService) {
		this.employeeTitlesHistoryLocalService = employeeTitlesHistoryLocalService;
	}

	/**
	 * Returns the employee titles history remote service.
	 *
	 * @return the employee titles history remote service
	 */
	public vn.com.ecopharma.emp.service.EmployeeTitlesHistoryService getEmployeeTitlesHistoryService() {
		return employeeTitlesHistoryService;
	}

	/**
	 * Sets the employee titles history remote service.
	 *
	 * @param employeeTitlesHistoryService the employee titles history remote service
	 */
	public void setEmployeeTitlesHistoryService(
		vn.com.ecopharma.emp.service.EmployeeTitlesHistoryService employeeTitlesHistoryService) {
		this.employeeTitlesHistoryService = employeeTitlesHistoryService;
	}

	/**
	 * Returns the employee titles history persistence.
	 *
	 * @return the employee titles history persistence
	 */
	public EmployeeTitlesHistoryPersistence getEmployeeTitlesHistoryPersistence() {
		return employeeTitlesHistoryPersistence;
	}

	/**
	 * Sets the employee titles history persistence.
	 *
	 * @param employeeTitlesHistoryPersistence the employee titles history persistence
	 */
	public void setEmployeeTitlesHistoryPersistence(
		EmployeeTitlesHistoryPersistence employeeTitlesHistoryPersistence) {
		this.employeeTitlesHistoryPersistence = employeeTitlesHistoryPersistence;
	}

	/**
	 * Returns the level local service.
	 *
	 * @return the level local service
	 */
	public vn.com.ecopharma.emp.service.LevelLocalService getLevelLocalService() {
		return levelLocalService;
	}

	/**
	 * Sets the level local service.
	 *
	 * @param levelLocalService the level local service
	 */
	public void setLevelLocalService(
		vn.com.ecopharma.emp.service.LevelLocalService levelLocalService) {
		this.levelLocalService = levelLocalService;
	}

	/**
	 * Returns the level remote service.
	 *
	 * @return the level remote service
	 */
	public vn.com.ecopharma.emp.service.LevelService getLevelService() {
		return levelService;
	}

	/**
	 * Sets the level remote service.
	 *
	 * @param levelService the level remote service
	 */
	public void setLevelService(
		vn.com.ecopharma.emp.service.LevelService levelService) {
		this.levelService = levelService;
	}

	/**
	 * Returns the level persistence.
	 *
	 * @return the level persistence
	 */
	public LevelPersistence getLevelPersistence() {
		return levelPersistence;
	}

	/**
	 * Sets the level persistence.
	 *
	 * @param levelPersistence the level persistence
	 */
	public void setLevelPersistence(LevelPersistence levelPersistence) {
		this.levelPersistence = levelPersistence;
	}

	/**
	 * Returns the location local service.
	 *
	 * @return the location local service
	 */
	public vn.com.ecopharma.emp.service.LocationLocalService getLocationLocalService() {
		return locationLocalService;
	}

	/**
	 * Sets the location local service.
	 *
	 * @param locationLocalService the location local service
	 */
	public void setLocationLocalService(
		vn.com.ecopharma.emp.service.LocationLocalService locationLocalService) {
		this.locationLocalService = locationLocalService;
	}

	/**
	 * Returns the location remote service.
	 *
	 * @return the location remote service
	 */
	public vn.com.ecopharma.emp.service.LocationService getLocationService() {
		return locationService;
	}

	/**
	 * Sets the location remote service.
	 *
	 * @param locationService the location remote service
	 */
	public void setLocationService(
		vn.com.ecopharma.emp.service.LocationService locationService) {
		this.locationService = locationService;
	}

	/**
	 * Returns the location persistence.
	 *
	 * @return the location persistence
	 */
	public LocationPersistence getLocationPersistence() {
		return locationPersistence;
	}

	/**
	 * Sets the location persistence.
	 *
	 * @param locationPersistence the location persistence
	 */
	public void setLocationPersistence(LocationPersistence locationPersistence) {
		this.locationPersistence = locationPersistence;
	}

	/**
	 * Returns the promoted history local service.
	 *
	 * @return the promoted history local service
	 */
	public vn.com.ecopharma.emp.service.PromotedHistoryLocalService getPromotedHistoryLocalService() {
		return promotedHistoryLocalService;
	}

	/**
	 * Sets the promoted history local service.
	 *
	 * @param promotedHistoryLocalService the promoted history local service
	 */
	public void setPromotedHistoryLocalService(
		vn.com.ecopharma.emp.service.PromotedHistoryLocalService promotedHistoryLocalService) {
		this.promotedHistoryLocalService = promotedHistoryLocalService;
	}

	/**
	 * Returns the promoted history remote service.
	 *
	 * @return the promoted history remote service
	 */
	public vn.com.ecopharma.emp.service.PromotedHistoryService getPromotedHistoryService() {
		return promotedHistoryService;
	}

	/**
	 * Sets the promoted history remote service.
	 *
	 * @param promotedHistoryService the promoted history remote service
	 */
	public void setPromotedHistoryService(
		vn.com.ecopharma.emp.service.PromotedHistoryService promotedHistoryService) {
		this.promotedHistoryService = promotedHistoryService;
	}

	/**
	 * Returns the promoted history persistence.
	 *
	 * @return the promoted history persistence
	 */
	public PromotedHistoryPersistence getPromotedHistoryPersistence() {
		return promotedHistoryPersistence;
	}

	/**
	 * Sets the promoted history persistence.
	 *
	 * @param promotedHistoryPersistence the promoted history persistence
	 */
	public void setPromotedHistoryPersistence(
		PromotedHistoryPersistence promotedHistoryPersistence) {
		this.promotedHistoryPersistence = promotedHistoryPersistence;
	}

	/**
	 * Returns the resignation history local service.
	 *
	 * @return the resignation history local service
	 */
	public vn.com.ecopharma.emp.service.ResignationHistoryLocalService getResignationHistoryLocalService() {
		return resignationHistoryLocalService;
	}

	/**
	 * Sets the resignation history local service.
	 *
	 * @param resignationHistoryLocalService the resignation history local service
	 */
	public void setResignationHistoryLocalService(
		vn.com.ecopharma.emp.service.ResignationHistoryLocalService resignationHistoryLocalService) {
		this.resignationHistoryLocalService = resignationHistoryLocalService;
	}

	/**
	 * Returns the resignation history remote service.
	 *
	 * @return the resignation history remote service
	 */
	public vn.com.ecopharma.emp.service.ResignationHistoryService getResignationHistoryService() {
		return resignationHistoryService;
	}

	/**
	 * Sets the resignation history remote service.
	 *
	 * @param resignationHistoryService the resignation history remote service
	 */
	public void setResignationHistoryService(
		vn.com.ecopharma.emp.service.ResignationHistoryService resignationHistoryService) {
		this.resignationHistoryService = resignationHistoryService;
	}

	/**
	 * Returns the resignation history persistence.
	 *
	 * @return the resignation history persistence
	 */
	public ResignationHistoryPersistence getResignationHistoryPersistence() {
		return resignationHistoryPersistence;
	}

	/**
	 * Sets the resignation history persistence.
	 *
	 * @param resignationHistoryPersistence the resignation history persistence
	 */
	public void setResignationHistoryPersistence(
		ResignationHistoryPersistence resignationHistoryPersistence) {
		this.resignationHistoryPersistence = resignationHistoryPersistence;
	}

	/**
	 * Returns the resource config local service.
	 *
	 * @return the resource config local service
	 */
	public vn.com.ecopharma.emp.service.ResourceConfigLocalService getResourceConfigLocalService() {
		return resourceConfigLocalService;
	}

	/**
	 * Sets the resource config local service.
	 *
	 * @param resourceConfigLocalService the resource config local service
	 */
	public void setResourceConfigLocalService(
		vn.com.ecopharma.emp.service.ResourceConfigLocalService resourceConfigLocalService) {
		this.resourceConfigLocalService = resourceConfigLocalService;
	}

	/**
	 * Returns the resource config remote service.
	 *
	 * @return the resource config remote service
	 */
	public vn.com.ecopharma.emp.service.ResourceConfigService getResourceConfigService() {
		return resourceConfigService;
	}

	/**
	 * Sets the resource config remote service.
	 *
	 * @param resourceConfigService the resource config remote service
	 */
	public void setResourceConfigService(
		vn.com.ecopharma.emp.service.ResourceConfigService resourceConfigService) {
		this.resourceConfigService = resourceConfigService;
	}

	/**
	 * Returns the resource config persistence.
	 *
	 * @return the resource config persistence
	 */
	public ResourceConfigPersistence getResourceConfigPersistence() {
		return resourceConfigPersistence;
	}

	/**
	 * Sets the resource config persistence.
	 *
	 * @param resourceConfigPersistence the resource config persistence
	 */
	public void setResourceConfigPersistence(
		ResourceConfigPersistence resourceConfigPersistence) {
		this.resourceConfigPersistence = resourceConfigPersistence;
	}

	/**
	 * Returns the titles local service.
	 *
	 * @return the titles local service
	 */
	public vn.com.ecopharma.emp.service.TitlesLocalService getTitlesLocalService() {
		return titlesLocalService;
	}

	/**
	 * Sets the titles local service.
	 *
	 * @param titlesLocalService the titles local service
	 */
	public void setTitlesLocalService(
		vn.com.ecopharma.emp.service.TitlesLocalService titlesLocalService) {
		this.titlesLocalService = titlesLocalService;
	}

	/**
	 * Returns the titles remote service.
	 *
	 * @return the titles remote service
	 */
	public vn.com.ecopharma.emp.service.TitlesService getTitlesService() {
		return titlesService;
	}

	/**
	 * Sets the titles remote service.
	 *
	 * @param titlesService the titles remote service
	 */
	public void setTitlesService(
		vn.com.ecopharma.emp.service.TitlesService titlesService) {
		this.titlesService = titlesService;
	}

	/**
	 * Returns the titles persistence.
	 *
	 * @return the titles persistence
	 */
	public TitlesPersistence getTitlesPersistence() {
		return titlesPersistence;
	}

	/**
	 * Sets the titles persistence.
	 *
	 * @param titlesPersistence the titles persistence
	 */
	public void setTitlesPersistence(TitlesPersistence titlesPersistence) {
		this.titlesPersistence = titlesPersistence;
	}

	/**
	 * Returns the unit local service.
	 *
	 * @return the unit local service
	 */
	public vn.com.ecopharma.emp.service.UnitLocalService getUnitLocalService() {
		return unitLocalService;
	}

	/**
	 * Sets the unit local service.
	 *
	 * @param unitLocalService the unit local service
	 */
	public void setUnitLocalService(
		vn.com.ecopharma.emp.service.UnitLocalService unitLocalService) {
		this.unitLocalService = unitLocalService;
	}

	/**
	 * Returns the unit remote service.
	 *
	 * @return the unit remote service
	 */
	public vn.com.ecopharma.emp.service.UnitService getUnitService() {
		return unitService;
	}

	/**
	 * Sets the unit remote service.
	 *
	 * @param unitService the unit remote service
	 */
	public void setUnitService(
		vn.com.ecopharma.emp.service.UnitService unitService) {
		this.unitService = unitService;
	}

	/**
	 * Returns the unit persistence.
	 *
	 * @return the unit persistence
	 */
	public UnitPersistence getUnitPersistence() {
		return unitPersistence;
	}

	/**
	 * Sets the unit persistence.
	 *
	 * @param unitPersistence the unit persistence
	 */
	public void setUnitPersistence(UnitPersistence unitPersistence) {
		this.unitPersistence = unitPersistence;
	}

	/**
	 * Returns the unit group local service.
	 *
	 * @return the unit group local service
	 */
	public vn.com.ecopharma.emp.service.UnitGroupLocalService getUnitGroupLocalService() {
		return unitGroupLocalService;
	}

	/**
	 * Sets the unit group local service.
	 *
	 * @param unitGroupLocalService the unit group local service
	 */
	public void setUnitGroupLocalService(
		vn.com.ecopharma.emp.service.UnitGroupLocalService unitGroupLocalService) {
		this.unitGroupLocalService = unitGroupLocalService;
	}

	/**
	 * Returns the unit group remote service.
	 *
	 * @return the unit group remote service
	 */
	public vn.com.ecopharma.emp.service.UnitGroupService getUnitGroupService() {
		return unitGroupService;
	}

	/**
	 * Sets the unit group remote service.
	 *
	 * @param unitGroupService the unit group remote service
	 */
	public void setUnitGroupService(
		vn.com.ecopharma.emp.service.UnitGroupService unitGroupService) {
		this.unitGroupService = unitGroupService;
	}

	/**
	 * Returns the unit group persistence.
	 *
	 * @return the unit group persistence
	 */
	public UnitGroupPersistence getUnitGroupPersistence() {
		return unitGroupPersistence;
	}

	/**
	 * Sets the unit group persistence.
	 *
	 * @param unitGroupPersistence the unit group persistence
	 */
	public void setUnitGroupPersistence(
		UnitGroupPersistence unitGroupPersistence) {
		this.unitGroupPersistence = unitGroupPersistence;
	}

	/**
	 * Returns the university local service.
	 *
	 * @return the university local service
	 */
	public vn.com.ecopharma.emp.service.UniversityLocalService getUniversityLocalService() {
		return universityLocalService;
	}

	/**
	 * Sets the university local service.
	 *
	 * @param universityLocalService the university local service
	 */
	public void setUniversityLocalService(
		vn.com.ecopharma.emp.service.UniversityLocalService universityLocalService) {
		this.universityLocalService = universityLocalService;
	}

	/**
	 * Returns the university remote service.
	 *
	 * @return the university remote service
	 */
	public vn.com.ecopharma.emp.service.UniversityService getUniversityService() {
		return universityService;
	}

	/**
	 * Sets the university remote service.
	 *
	 * @param universityService the university remote service
	 */
	public void setUniversityService(
		vn.com.ecopharma.emp.service.UniversityService universityService) {
		this.universityService = universityService;
	}

	/**
	 * Returns the university persistence.
	 *
	 * @return the university persistence
	 */
	public UniversityPersistence getUniversityPersistence() {
		return universityPersistence;
	}

	/**
	 * Sets the university persistence.
	 *
	 * @param universityPersistence the university persistence
	 */
	public void setUniversityPersistence(
		UniversityPersistence universityPersistence) {
		this.universityPersistence = universityPersistence;
	}

	/**
	 * Returns the working location local service.
	 *
	 * @return the working location local service
	 */
	public vn.com.ecopharma.emp.service.WorkingLocationLocalService getWorkingLocationLocalService() {
		return workingLocationLocalService;
	}

	/**
	 * Sets the working location local service.
	 *
	 * @param workingLocationLocalService the working location local service
	 */
	public void setWorkingLocationLocalService(
		vn.com.ecopharma.emp.service.WorkingLocationLocalService workingLocationLocalService) {
		this.workingLocationLocalService = workingLocationLocalService;
	}

	/**
	 * Returns the working location remote service.
	 *
	 * @return the working location remote service
	 */
	public vn.com.ecopharma.emp.service.WorkingLocationService getWorkingLocationService() {
		return workingLocationService;
	}

	/**
	 * Sets the working location remote service.
	 *
	 * @param workingLocationService the working location remote service
	 */
	public void setWorkingLocationService(
		vn.com.ecopharma.emp.service.WorkingLocationService workingLocationService) {
		this.workingLocationService = workingLocationService;
	}

	/**
	 * Returns the working location persistence.
	 *
	 * @return the working location persistence
	 */
	public WorkingLocationPersistence getWorkingLocationPersistence() {
		return workingLocationPersistence;
	}

	/**
	 * Sets the working location persistence.
	 *
	 * @param workingLocationPersistence the working location persistence
	 */
	public void setWorkingLocationPersistence(
		WorkingLocationPersistence workingLocationPersistence) {
		this.workingLocationPersistence = workingLocationPersistence;
	}

	/**
	 * Returns the counter local service.
	 *
	 * @return the counter local service
	 */
	public com.liferay.counter.service.CounterLocalService getCounterLocalService() {
		return counterLocalService;
	}

	/**
	 * Sets the counter local service.
	 *
	 * @param counterLocalService the counter local service
	 */
	public void setCounterLocalService(
		com.liferay.counter.service.CounterLocalService counterLocalService) {
		this.counterLocalService = counterLocalService;
	}

	/**
	 * Returns the resource local service.
	 *
	 * @return the resource local service
	 */
	public com.liferay.portal.service.ResourceLocalService getResourceLocalService() {
		return resourceLocalService;
	}

	/**
	 * Sets the resource local service.
	 *
	 * @param resourceLocalService the resource local service
	 */
	public void setResourceLocalService(
		com.liferay.portal.service.ResourceLocalService resourceLocalService) {
		this.resourceLocalService = resourceLocalService;
	}

	/**
	 * Returns the user local service.
	 *
	 * @return the user local service
	 */
	public com.liferay.portal.service.UserLocalService getUserLocalService() {
		return userLocalService;
	}

	/**
	 * Sets the user local service.
	 *
	 * @param userLocalService the user local service
	 */
	public void setUserLocalService(
		com.liferay.portal.service.UserLocalService userLocalService) {
		this.userLocalService = userLocalService;
	}

	/**
	 * Returns the user remote service.
	 *
	 * @return the user remote service
	 */
	public com.liferay.portal.service.UserService getUserService() {
		return userService;
	}

	/**
	 * Sets the user remote service.
	 *
	 * @param userService the user remote service
	 */
	public void setUserService(
		com.liferay.portal.service.UserService userService) {
		this.userService = userService;
	}

	/**
	 * Returns the user persistence.
	 *
	 * @return the user persistence
	 */
	public UserPersistence getUserPersistence() {
		return userPersistence;
	}

	/**
	 * Sets the user persistence.
	 *
	 * @param userPersistence the user persistence
	 */
	public void setUserPersistence(UserPersistence userPersistence) {
		this.userPersistence = userPersistence;
	}

	public void afterPropertiesSet() {
		Class<?> clazz = getClass();

		_classLoader = clazz.getClassLoader();
	}

	public void destroy() {
	}

	/**
	 * Returns the Spring bean ID for this bean.
	 *
	 * @return the Spring bean ID for this bean
	 */
	@Override
	public String getBeanIdentifier() {
		return _beanIdentifier;
	}

	/**
	 * Sets the Spring bean ID for this bean.
	 *
	 * @param beanIdentifier the Spring bean ID for this bean
	 */
	@Override
	public void setBeanIdentifier(String beanIdentifier) {
		_beanIdentifier = beanIdentifier;
	}

	@Override
	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		Thread currentThread = Thread.currentThread();

		ClassLoader contextClassLoader = currentThread.getContextClassLoader();

		if (contextClassLoader != _classLoader) {
			currentThread.setContextClassLoader(_classLoader);
		}

		try {
			return _clpInvoker.invokeMethod(name, parameterTypes, arguments);
		}
		finally {
			if (contextClassLoader != _classLoader) {
				currentThread.setContextClassLoader(contextClassLoader);
			}
		}
	}

	protected Class<?> getModelClass() {
		return WorkingLocation.class;
	}

	protected String getModelClassName() {
		return WorkingLocation.class.getName();
	}

	/**
	 * Performs an SQL query.
	 *
	 * @param sql the sql query
	 */
	protected void runSQL(String sql) throws SystemException {
		try {
			DataSource dataSource = workingLocationPersistence.getDataSource();

			SqlUpdate sqlUpdate = SqlUpdateFactoryUtil.getSqlUpdate(dataSource,
					sql, new int[0]);

			sqlUpdate.update();
		}
		catch (Exception e) {
			throw new SystemException(e);
		}
	}

	@BeanReference(type = vn.com.ecopharma.emp.service.CertificateLocalService.class)
	protected vn.com.ecopharma.emp.service.CertificateLocalService certificateLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.CertificateService.class)
	protected vn.com.ecopharma.emp.service.CertificateService certificateService;
	@BeanReference(type = CertificatePersistence.class)
	protected CertificatePersistence certificatePersistence;
	@BeanReference(type = vn.com.ecopharma.emp.service.DepartmentLocalService.class)
	protected vn.com.ecopharma.emp.service.DepartmentLocalService departmentLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.DepartmentService.class)
	protected vn.com.ecopharma.emp.service.DepartmentService departmentService;
	@BeanReference(type = DepartmentPersistence.class)
	protected DepartmentPersistence departmentPersistence;
	@BeanReference(type = vn.com.ecopharma.emp.service.DevisionLocalService.class)
	protected vn.com.ecopharma.emp.service.DevisionLocalService devisionLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.DevisionService.class)
	protected vn.com.ecopharma.emp.service.DevisionService devisionService;
	@BeanReference(type = DevisionPersistence.class)
	protected DevisionPersistence devisionPersistence;
	@BeanReference(type = vn.com.ecopharma.emp.service.DistrictLocalService.class)
	protected vn.com.ecopharma.emp.service.DistrictLocalService districtLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.DistrictService.class)
	protected vn.com.ecopharma.emp.service.DistrictService districtService;
	@BeanReference(type = DistrictPersistence.class)
	protected DistrictPersistence districtPersistence;
	@BeanReference(type = vn.com.ecopharma.emp.service.EmpLocalService.class)
	protected vn.com.ecopharma.emp.service.EmpLocalService empLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.EmpService.class)
	protected vn.com.ecopharma.emp.service.EmpService empService;
	@BeanReference(type = EmpPersistence.class)
	protected EmpPersistence empPersistence;
	@BeanReference(type = vn.com.ecopharma.emp.service.EmployeeTitlesHistoryLocalService.class)
	protected vn.com.ecopharma.emp.service.EmployeeTitlesHistoryLocalService employeeTitlesHistoryLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.EmployeeTitlesHistoryService.class)
	protected vn.com.ecopharma.emp.service.EmployeeTitlesHistoryService employeeTitlesHistoryService;
	@BeanReference(type = EmployeeTitlesHistoryPersistence.class)
	protected EmployeeTitlesHistoryPersistence employeeTitlesHistoryPersistence;
	@BeanReference(type = vn.com.ecopharma.emp.service.LevelLocalService.class)
	protected vn.com.ecopharma.emp.service.LevelLocalService levelLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.LevelService.class)
	protected vn.com.ecopharma.emp.service.LevelService levelService;
	@BeanReference(type = LevelPersistence.class)
	protected LevelPersistence levelPersistence;
	@BeanReference(type = vn.com.ecopharma.emp.service.LocationLocalService.class)
	protected vn.com.ecopharma.emp.service.LocationLocalService locationLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.LocationService.class)
	protected vn.com.ecopharma.emp.service.LocationService locationService;
	@BeanReference(type = LocationPersistence.class)
	protected LocationPersistence locationPersistence;
	@BeanReference(type = vn.com.ecopharma.emp.service.PromotedHistoryLocalService.class)
	protected vn.com.ecopharma.emp.service.PromotedHistoryLocalService promotedHistoryLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.PromotedHistoryService.class)
	protected vn.com.ecopharma.emp.service.PromotedHistoryService promotedHistoryService;
	@BeanReference(type = PromotedHistoryPersistence.class)
	protected PromotedHistoryPersistence promotedHistoryPersistence;
	@BeanReference(type = vn.com.ecopharma.emp.service.ResignationHistoryLocalService.class)
	protected vn.com.ecopharma.emp.service.ResignationHistoryLocalService resignationHistoryLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.ResignationHistoryService.class)
	protected vn.com.ecopharma.emp.service.ResignationHistoryService resignationHistoryService;
	@BeanReference(type = ResignationHistoryPersistence.class)
	protected ResignationHistoryPersistence resignationHistoryPersistence;
	@BeanReference(type = vn.com.ecopharma.emp.service.ResourceConfigLocalService.class)
	protected vn.com.ecopharma.emp.service.ResourceConfigLocalService resourceConfigLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.ResourceConfigService.class)
	protected vn.com.ecopharma.emp.service.ResourceConfigService resourceConfigService;
	@BeanReference(type = ResourceConfigPersistence.class)
	protected ResourceConfigPersistence resourceConfigPersistence;
	@BeanReference(type = vn.com.ecopharma.emp.service.TitlesLocalService.class)
	protected vn.com.ecopharma.emp.service.TitlesLocalService titlesLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.TitlesService.class)
	protected vn.com.ecopharma.emp.service.TitlesService titlesService;
	@BeanReference(type = TitlesPersistence.class)
	protected TitlesPersistence titlesPersistence;
	@BeanReference(type = vn.com.ecopharma.emp.service.UnitLocalService.class)
	protected vn.com.ecopharma.emp.service.UnitLocalService unitLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.UnitService.class)
	protected vn.com.ecopharma.emp.service.UnitService unitService;
	@BeanReference(type = UnitPersistence.class)
	protected UnitPersistence unitPersistence;
	@BeanReference(type = vn.com.ecopharma.emp.service.UnitGroupLocalService.class)
	protected vn.com.ecopharma.emp.service.UnitGroupLocalService unitGroupLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.UnitGroupService.class)
	protected vn.com.ecopharma.emp.service.UnitGroupService unitGroupService;
	@BeanReference(type = UnitGroupPersistence.class)
	protected UnitGroupPersistence unitGroupPersistence;
	@BeanReference(type = vn.com.ecopharma.emp.service.UniversityLocalService.class)
	protected vn.com.ecopharma.emp.service.UniversityLocalService universityLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.UniversityService.class)
	protected vn.com.ecopharma.emp.service.UniversityService universityService;
	@BeanReference(type = UniversityPersistence.class)
	protected UniversityPersistence universityPersistence;
	@BeanReference(type = vn.com.ecopharma.emp.service.WorkingLocationLocalService.class)
	protected vn.com.ecopharma.emp.service.WorkingLocationLocalService workingLocationLocalService;
	@BeanReference(type = vn.com.ecopharma.emp.service.WorkingLocationService.class)
	protected vn.com.ecopharma.emp.service.WorkingLocationService workingLocationService;
	@BeanReference(type = WorkingLocationPersistence.class)
	protected WorkingLocationPersistence workingLocationPersistence;
	@BeanReference(type = com.liferay.counter.service.CounterLocalService.class)
	protected com.liferay.counter.service.CounterLocalService counterLocalService;
	@BeanReference(type = com.liferay.portal.service.ResourceLocalService.class)
	protected com.liferay.portal.service.ResourceLocalService resourceLocalService;
	@BeanReference(type = com.liferay.portal.service.UserLocalService.class)
	protected com.liferay.portal.service.UserLocalService userLocalService;
	@BeanReference(type = com.liferay.portal.service.UserService.class)
	protected com.liferay.portal.service.UserService userService;
	@BeanReference(type = UserPersistence.class)
	protected UserPersistence userPersistence;
	private String _beanIdentifier;
	private ClassLoader _classLoader;
	private WorkingLocationServiceClpInvoker _clpInvoker = new WorkingLocationServiceClpInvoker();
}