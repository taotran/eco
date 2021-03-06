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

package vn.com.ecopharma.emp.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the EcoEmployee service. Represents a row in the &quot;eco_em_portlet_EcoEmployee&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.emp.model.impl.EcoEmployeeModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.emp.model.impl.EcoEmployeeImpl}.
 * </p>
 *
 * @author tvt
 * @see EcoEmployee
 * @see vn.com.ecopharma.emp.model.impl.EcoEmployeeImpl
 * @see vn.com.ecopharma.emp.model.impl.EcoEmployeeModelImpl
 * @generated
 */
public interface EcoEmployeeModel extends BaseModel<EcoEmployee> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a eco employee model instance should use the {@link EcoEmployee} interface instead.
	 */

	/**
	 * Returns the primary key of this eco employee.
	 *
	 * @return the primary key of this eco employee
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this eco employee.
	 *
	 * @param primaryKey the primary key of this eco employee
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the eco employee ID of this eco employee.
	 *
	 * @return the eco employee ID of this eco employee
	 */
	public long getEcoEmployeeId();

	/**
	 * Sets the eco employee ID of this eco employee.
	 *
	 * @param ecoEmployeeId the eco employee ID of this eco employee
	 */
	public void setEcoEmployeeId(long ecoEmployeeId);

	/**
	 * Returns the employee code of this eco employee.
	 *
	 * @return the employee code of this eco employee
	 */
	@AutoEscape
	public String getEmployeeCode();

	/**
	 * Sets the employee code of this eco employee.
	 *
	 * @param employeeCode the employee code of this eco employee
	 */
	public void setEmployeeCode(String employeeCode);

	/**
	 * Returns the contact number of this eco employee.
	 *
	 * @return the contact number of this eco employee
	 */
	@AutoEscape
	public String getContactNumber();

	/**
	 * Sets the contact number of this eco employee.
	 *
	 * @param contactNumber the contact number of this eco employee
	 */
	public void setContactNumber(String contactNumber);

	/**
	 * Returns the birthday of this eco employee.
	 *
	 * @return the birthday of this eco employee
	 */
	public Date getBirthday();

	/**
	 * Sets the birthday of this eco employee.
	 *
	 * @param birthday the birthday of this eco employee
	 */
	public void setBirthday(Date birthday);

	/**
	 * Returns the joined date of this eco employee.
	 *
	 * @return the joined date of this eco employee
	 */
	public Date getJoinedDate();

	/**
	 * Sets the joined date of this eco employee.
	 *
	 * @param joinedDate the joined date of this eco employee
	 */
	public void setJoinedDate(Date joinedDate);

	/**
	 * Returns the sub unit ID of this eco employee.
	 *
	 * @return the sub unit ID of this eco employee
	 */
	public long getSubUnitId();

	/**
	 * Sets the sub unit ID of this eco employee.
	 *
	 * @param subUnitId the sub unit ID of this eco employee
	 */
	public void setSubUnitId(long subUnitId);

	/**
	 * Returns the titles ID of this eco employee.
	 *
	 * @return the titles ID of this eco employee
	 */
	public long getTitlesId();

	/**
	 * Sets the titles ID of this eco employee.
	 *
	 * @param titlesId the titles ID of this eco employee
	 */
	public void setTitlesId(long titlesId);

	/**
	 * Returns the level ID of this eco employee.
	 *
	 * @return the level ID of this eco employee
	 */
	public long getLevelId();

	/**
	 * Sets the level ID of this eco employee.
	 *
	 * @param levelId the level ID of this eco employee
	 */
	public void setLevelId(long levelId);

	/**
	 * Returns the promoted date of this eco employee.
	 *
	 * @return the promoted date of this eco employee
	 */
	public Date getPromotedDate();

	/**
	 * Sets the promoted date of this eco employee.
	 *
	 * @param promotedDate the promoted date of this eco employee
	 */
	public void setPromotedDate(Date promotedDate);

	/**
	 * Returns the labor contract signed date of this eco employee.
	 *
	 * @return the labor contract signed date of this eco employee
	 */
	public Date getLaborContractSignedDate();

	/**
	 * Sets the labor contract signed date of this eco employee.
	 *
	 * @param laborContractSignedDate the labor contract signed date of this eco employee
	 */
	public void setLaborContractSignedDate(Date laborContractSignedDate);

	/**
	 * Returns the labor contract expired date of this eco employee.
	 *
	 * @return the labor contract expired date of this eco employee
	 */
	public Date getLaborContractExpiredDate();

	/**
	 * Sets the labor contract expired date of this eco employee.
	 *
	 * @param laborContractExpiredDate the labor contract expired date of this eco employee
	 */
	public void setLaborContractExpiredDate(Date laborContractExpiredDate);

	/**
	 * Returns the labor contract type of this eco employee.
	 *
	 * @return the labor contract type of this eco employee
	 */
	@AutoEscape
	public String getLaborContractType();

	/**
	 * Sets the labor contract type of this eco employee.
	 *
	 * @param laborContractType the labor contract type of this eco employee
	 */
	public void setLaborContractType(String laborContractType);

	/**
	 * Returns the gender of this eco employee.
	 *
	 * @return the gender of this eco employee
	 */
	@AutoEscape
	public String getGender();

	/**
	 * Sets the gender of this eco employee.
	 *
	 * @param gender the gender of this eco employee
	 */
	public void setGender(String gender);

	/**
	 * Returns the place of birth of this eco employee.
	 *
	 * @return the place of birth of this eco employee
	 */
	@AutoEscape
	public String getPlaceOfBirth();

	/**
	 * Sets the place of birth of this eco employee.
	 *
	 * @param placeOfBirth the place of birth of this eco employee
	 */
	public void setPlaceOfBirth(String placeOfBirth);

	/**
	 * Returns the education of this eco employee.
	 *
	 * @return the education of this eco employee
	 */
	@AutoEscape
	public String getEducation();

	/**
	 * Sets the education of this eco employee.
	 *
	 * @param education the education of this eco employee
	 */
	public void setEducation(String education);

	/**
	 * Returns the education specialize of this eco employee.
	 *
	 * @return the education specialize of this eco employee
	 */
	@AutoEscape
	public String getEducationSpecialize();

	/**
	 * Sets the education specialize of this eco employee.
	 *
	 * @param educationSpecialize the education specialize of this eco employee
	 */
	public void setEducationSpecialize(String educationSpecialize);

	/**
	 * Returns the university ID of this eco employee.
	 *
	 * @return the university ID of this eco employee
	 */
	public long getUniversityId();

	/**
	 * Sets the university ID of this eco employee.
	 *
	 * @param universityId the university ID of this eco employee
	 */
	public void setUniversityId(long universityId);

	/**
	 * Returns the marital status of this eco employee.
	 *
	 * @return the marital status of this eco employee
	 */
	@AutoEscape
	public String getMaritalStatus();

	/**
	 * Sets the marital status of this eco employee.
	 *
	 * @param maritalStatus the marital status of this eco employee
	 */
	public void setMaritalStatus(String maritalStatus);

	/**
	 * Returns the identity card no of this eco employee.
	 *
	 * @return the identity card no of this eco employee
	 */
	@AutoEscape
	public String getIdentityCardNo();

	/**
	 * Sets the identity card no of this eco employee.
	 *
	 * @param identityCardNo the identity card no of this eco employee
	 */
	public void setIdentityCardNo(String identityCardNo);

	/**
	 * Returns the issued date of this eco employee.
	 *
	 * @return the issued date of this eco employee
	 */
	public Date getIssuedDate();

	/**
	 * Sets the issued date of this eco employee.
	 *
	 * @param issuedDate the issued date of this eco employee
	 */
	public void setIssuedDate(Date issuedDate);

	/**
	 * Returns the issued place of this eco employee.
	 *
	 * @return the issued place of this eco employee
	 */
	@AutoEscape
	public String getIssuedPlace();

	/**
	 * Sets the issued place of this eco employee.
	 *
	 * @param issuedPlace the issued place of this eco employee
	 */
	public void setIssuedPlace(String issuedPlace);

	/**
	 * Returns the address ID of this eco employee.
	 *
	 * @return the address ID of this eco employee
	 */
	public long getAddressId();

	/**
	 * Sets the address ID of this eco employee.
	 *
	 * @param addressId the address ID of this eco employee
	 */
	public void setAddressId(long addressId);

	/**
	 * Returns the company email of this eco employee.
	 *
	 * @return the company email of this eco employee
	 */
	@AutoEscape
	public String getCompanyEmail();

	/**
	 * Sets the company email of this eco employee.
	 *
	 * @param companyEmail the company email of this eco employee
	 */
	public void setCompanyEmail(String companyEmail);

	/**
	 * Returns the personal tax code of this eco employee.
	 *
	 * @return the personal tax code of this eco employee
	 */
	@AutoEscape
	public String getPersonalTaxCode();

	/**
	 * Sets the personal tax code of this eco employee.
	 *
	 * @param personalTaxCode the personal tax code of this eco employee
	 */
	public void setPersonalTaxCode(String personalTaxCode);

	/**
	 * Returns the number of dependents of this eco employee.
	 *
	 * @return the number of dependents of this eco employee
	 */
	public int getNumberOfDependents();

	/**
	 * Sets the number of dependents of this eco employee.
	 *
	 * @param numberOfDependents the number of dependents of this eco employee
	 */
	public void setNumberOfDependents(int numberOfDependents);

	/**
	 * Returns the dependent names of this eco employee.
	 *
	 * @return the dependent names of this eco employee
	 */
	@AutoEscape
	public String getDependentNames();

	/**
	 * Sets the dependent names of this eco employee.
	 *
	 * @param dependentNames the dependent names of this eco employee
	 */
	public void setDependentNames(String dependentNames);

	/**
	 * Returns the social insurance no of this eco employee.
	 *
	 * @return the social insurance no of this eco employee
	 */
	@AutoEscape
	public String getSocialInsuranceNo();

	/**
	 * Sets the social insurance no of this eco employee.
	 *
	 * @param socialInsuranceNo the social insurance no of this eco employee
	 */
	public void setSocialInsuranceNo(String socialInsuranceNo);

	/**
	 * Returns the health insurance no of this eco employee.
	 *
	 * @return the health insurance no of this eco employee
	 */
	@AutoEscape
	public String getHealthInsuranceNo();

	/**
	 * Sets the health insurance no of this eco employee.
	 *
	 * @param healthInsuranceNo the health insurance no of this eco employee
	 */
	public void setHealthInsuranceNo(String healthInsuranceNo);

	/**
	 * Returns the bank account no of this eco employee.
	 *
	 * @return the bank account no of this eco employee
	 */
	@AutoEscape
	public String getBankAccountNo();

	/**
	 * Sets the bank account no of this eco employee.
	 *
	 * @param bankAccountNo the bank account no of this eco employee
	 */
	public void setBankAccountNo(String bankAccountNo);

	/**
	 * Returns the bank branch name of this eco employee.
	 *
	 * @return the bank branch name of this eco employee
	 */
	@AutoEscape
	public String getBankBranchName();

	/**
	 * Sets the bank branch name of this eco employee.
	 *
	 * @param bankBranchName the bank branch name of this eco employee
	 */
	public void setBankBranchName(String bankBranchName);

	/**
	 * Returns the base wage rates of this eco employee.
	 *
	 * @return the base wage rates of this eco employee
	 */
	public double getBaseWageRates();

	/**
	 * Sets the base wage rates of this eco employee.
	 *
	 * @param baseWageRates the base wage rates of this eco employee
	 */
	public void setBaseWageRates(double baseWageRates);

	/**
	 * Returns the position wage rates of this eco employee.
	 *
	 * @return the position wage rates of this eco employee
	 */
	public double getPositionWageRates();

	/**
	 * Sets the position wage rates of this eco employee.
	 *
	 * @param positionWageRates the position wage rates of this eco employee
	 */
	public void setPositionWageRates(double positionWageRates);

	/**
	 * Returns the capacity salary of this eco employee.
	 *
	 * @return the capacity salary of this eco employee
	 */
	public double getCapacitySalary();

	/**
	 * Sets the capacity salary of this eco employee.
	 *
	 * @param capacitySalary the capacity salary of this eco employee
	 */
	public void setCapacitySalary(double capacitySalary);

	/**
	 * Returns the total salary of this eco employee.
	 *
	 * @return the total salary of this eco employee
	 */
	public double getTotalSalary();

	/**
	 * Sets the total salary of this eco employee.
	 *
	 * @param totalSalary the total salary of this eco employee
	 */
	public void setTotalSalary(double totalSalary);

	/**
	 * Returns the bonus of this eco employee.
	 *
	 * @return the bonus of this eco employee
	 */
	public double getBonus();

	/**
	 * Sets the bonus of this eco employee.
	 *
	 * @param bonus the bonus of this eco employee
	 */
	public void setBonus(double bonus);

	/**
	 * Returns the resigned date of this eco employee.
	 *
	 * @return the resigned date of this eco employee
	 */
	public Date getResignedDate();

	/**
	 * Sets the resigned date of this eco employee.
	 *
	 * @param resignedDate the resigned date of this eco employee
	 */
	public void setResignedDate(Date resignedDate);

	/**
	 * Returns the employee user ID of this eco employee.
	 *
	 * @return the employee user ID of this eco employee
	 */
	public long getEmployeeUserId();

	/**
	 * Sets the employee user ID of this eco employee.
	 *
	 * @param employeeUserId the employee user ID of this eco employee
	 */
	public void setEmployeeUserId(long employeeUserId);

	/**
	 * Returns the employee user uuid of this eco employee.
	 *
	 * @return the employee user uuid of this eco employee
	 * @throws SystemException if a system exception occurred
	 */
	public String getEmployeeUserUuid() throws SystemException;

	/**
	 * Sets the employee user uuid of this eco employee.
	 *
	 * @param employeeUserUuid the employee user uuid of this eco employee
	 */
	public void setEmployeeUserUuid(String employeeUserUuid);

	/**
	 * Returns the group ID of this eco employee.
	 *
	 * @return the group ID of this eco employee
	 */
	public long getGroupId();

	/**
	 * Sets the group ID of this eco employee.
	 *
	 * @param groupId the group ID of this eco employee
	 */
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this eco employee.
	 *
	 * @return the company ID of this eco employee
	 */
	public long getCompanyId();

	/**
	 * Sets the company ID of this eco employee.
	 *
	 * @param companyId the company ID of this eco employee
	 */
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this eco employee.
	 *
	 * @return the user ID of this eco employee
	 */
	public long getUserId();

	/**
	 * Sets the user ID of this eco employee.
	 *
	 * @param userId the user ID of this eco employee
	 */
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this eco employee.
	 *
	 * @return the user uuid of this eco employee
	 * @throws SystemException if a system exception occurred
	 */
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this eco employee.
	 *
	 * @param userUuid the user uuid of this eco employee
	 */
	public void setUserUuid(String userUuid);

	/**
	 * Returns the create date of this eco employee.
	 *
	 * @return the create date of this eco employee
	 */
	public Date getCreateDate();

	/**
	 * Sets the create date of this eco employee.
	 *
	 * @param createDate the create date of this eco employee
	 */
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this eco employee.
	 *
	 * @return the modified date of this eco employee
	 */
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this eco employee.
	 *
	 * @param modifiedDate the modified date of this eco employee
	 */
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the deleted of this eco employee.
	 *
	 * @return the deleted of this eco employee
	 */
	public boolean getDeleted();

	/**
	 * Returns <code>true</code> if this eco employee is deleted.
	 *
	 * @return <code>true</code> if this eco employee is deleted; <code>false</code> otherwise
	 */
	public boolean isDeleted();

	/**
	 * Sets whether this eco employee is deleted.
	 *
	 * @param deleted the deleted of this eco employee
	 */
	public void setDeleted(boolean deleted);

	/**
	 * Returns the company email address of this eco employee.
	 *
	 * @return the company email address of this eco employee
	 */
	@AutoEscape
	public String getCompanyEmailAddress();

	/**
	 * Sets the company email address of this eco employee.
	 *
	 * @param companyEmailAddress the company email address of this eco employee
	 */
	public void setCompanyEmailAddress(String companyEmailAddress);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(EcoEmployee ecoEmployee);

	@Override
	public int hashCode();

	@Override
	public CacheModel<EcoEmployee> toCacheModel();

	@Override
	public EcoEmployee toEscapedModel();

	@Override
	public EcoEmployee toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}