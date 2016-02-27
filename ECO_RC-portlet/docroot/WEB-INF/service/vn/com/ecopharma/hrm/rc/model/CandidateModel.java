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

package vn.com.ecopharma.hrm.rc.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Candidate service. Represents a row in the &quot;eco_rcp_Candidate&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.hrm.rc.model.impl.CandidateModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.hrm.rc.model.impl.CandidateImpl}.
 * </p>
 *
 * @author tvt
 * @see Candidate
 * @see vn.com.ecopharma.hrm.rc.model.impl.CandidateImpl
 * @see vn.com.ecopharma.hrm.rc.model.impl.CandidateModelImpl
 * @generated
 */
public interface CandidateModel extends BaseModel<Candidate>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a candidate model instance should use the {@link Candidate} interface instead.
	 */

	/**
	 * Returns the primary key of this candidate.
	 *
	 * @return the primary key of this candidate
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this candidate.
	 *
	 * @param primaryKey the primary key of this candidate
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the candidate ID of this candidate.
	 *
	 * @return the candidate ID of this candidate
	 */
	public long getCandidateId();

	/**
	 * Sets the candidate ID of this candidate.
	 *
	 * @param candidateId the candidate ID of this candidate
	 */
	public void setCandidateId(long candidateId);

	/**
	 * Returns the candidate code of this candidate.
	 *
	 * @return the candidate code of this candidate
	 */
	@AutoEscape
	public String getCandidateCode();

	/**
	 * Sets the candidate code of this candidate.
	 *
	 * @param candidateCode the candidate code of this candidate
	 */
	public void setCandidateCode(String candidateCode);

	/**
	 * Returns the full name of this candidate.
	 *
	 * @return the full name of this candidate
	 */
	@AutoEscape
	public String getFullName();

	/**
	 * Sets the full name of this candidate.
	 *
	 * @param fullName the full name of this candidate
	 */
	public void setFullName(String fullName);

	/**
	 * Returns the email address of this candidate.
	 *
	 * @return the email address of this candidate
	 */
	@AutoEscape
	public String getEmailAddress();

	/**
	 * Sets the email address of this candidate.
	 *
	 * @param emailAddress the email address of this candidate
	 */
	public void setEmailAddress(String emailAddress);

	/**
	 * Returns the contact number of this candidate.
	 *
	 * @return the contact number of this candidate
	 */
	@AutoEscape
	public String getContactNumber();

	/**
	 * Sets the contact number of this candidate.
	 *
	 * @param contactNumber the contact number of this candidate
	 */
	public void setContactNumber(String contactNumber);

	/**
	 * Returns the date of birth of this candidate.
	 *
	 * @return the date of birth of this candidate
	 */
	public Date getDateOfBirth();

	/**
	 * Sets the date of birth of this candidate.
	 *
	 * @param dateOfBirth the date of birth of this candidate
	 */
	public void setDateOfBirth(Date dateOfBirth);

	/**
	 * Returns the place of birth of this candidate.
	 *
	 * @return the place of birth of this candidate
	 */
	@AutoEscape
	public String getPlaceOfBirth();

	/**
	 * Sets the place of birth of this candidate.
	 *
	 * @param placeOfBirth the place of birth of this candidate
	 */
	public void setPlaceOfBirth(String placeOfBirth);

	/**
	 * Returns the gender of this candidate.
	 *
	 * @return the gender of this candidate
	 */
	@AutoEscape
	public String getGender();

	/**
	 * Sets the gender of this candidate.
	 *
	 * @param gender the gender of this candidate
	 */
	public void setGender(String gender);

	/**
	 * Returns the identity card no of this candidate.
	 *
	 * @return the identity card no of this candidate
	 */
	@AutoEscape
	public String getIdentityCardNo();

	/**
	 * Sets the identity card no of this candidate.
	 *
	 * @param identityCardNo the identity card no of this candidate
	 */
	public void setIdentityCardNo(String identityCardNo);

	/**
	 * Returns the issued date of this candidate.
	 *
	 * @return the issued date of this candidate
	 */
	public Date getIssuedDate();

	/**
	 * Sets the issued date of this candidate.
	 *
	 * @param issuedDate the issued date of this candidate
	 */
	public void setIssuedDate(Date issuedDate);

	/**
	 * Returns the issued place of this candidate.
	 *
	 * @return the issued place of this candidate
	 */
	@AutoEscape
	public String getIssuedPlace();

	/**
	 * Sets the issued place of this candidate.
	 *
	 * @param issuedPlace the issued place of this candidate
	 */
	public void setIssuedPlace(String issuedPlace);

	/**
	 * Returns the marital status of this candidate.
	 *
	 * @return the marital status of this candidate
	 */
	@AutoEscape
	public String getMaritalStatus();

	/**
	 * Sets the marital status of this candidate.
	 *
	 * @param maritalStatus the marital status of this candidate
	 */
	public void setMaritalStatus(String maritalStatus);

	/**
	 * Returns the number of child of this candidate.
	 *
	 * @return the number of child of this candidate
	 */
	public int getNumberOfChild();

	/**
	 * Sets the number of child of this candidate.
	 *
	 * @param numberOfChild the number of child of this candidate
	 */
	public void setNumberOfChild(int numberOfChild);

	/**
	 * Returns the nationality ID of this candidate.
	 *
	 * @return the nationality ID of this candidate
	 */
	public long getNationalityId();

	/**
	 * Sets the nationality ID of this candidate.
	 *
	 * @param nationalityId the nationality ID of this candidate
	 */
	public void setNationalityId(long nationalityId);

	/**
	 * Returns the ethnic of this candidate.
	 *
	 * @return the ethnic of this candidate
	 */
	@AutoEscape
	public String getEthnic();

	/**
	 * Sets the ethnic of this candidate.
	 *
	 * @param ethnic the ethnic of this candidate
	 */
	public void setEthnic(String ethnic);

	/**
	 * Returns the religion of this candidate.
	 *
	 * @return the religion of this candidate
	 */
	@AutoEscape
	public String getReligion();

	/**
	 * Sets the religion of this candidate.
	 *
	 * @param religion the religion of this candidate
	 */
	public void setReligion(String religion);

	/**
	 * Returns the application date of this candidate.
	 *
	 * @return the application date of this candidate
	 */
	public Date getApplicationDate();

	/**
	 * Sets the application date of this candidate.
	 *
	 * @param applicationDate the application date of this candidate
	 */
	public void setApplicationDate(Date applicationDate);

	/**
	 * Returns the status of this candidate.
	 *
	 * @return the status of this candidate
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this candidate.
	 *
	 * @param status the status of this candidate
	 */
	public void setStatus(String status);

	/**
	 * Returns the location ID of this candidate.
	 *
	 * @return the location ID of this candidate
	 */
	public long getLocationId();

	/**
	 * Sets the location ID of this candidate.
	 *
	 * @param locationId the location ID of this candidate
	 */
	public void setLocationId(long locationId);

	/**
	 * Returns the deleted of this candidate.
	 *
	 * @return the deleted of this candidate
	 */
	public boolean getDeleted();

	/**
	 * Returns <code>true</code> if this candidate is deleted.
	 *
	 * @return <code>true</code> if this candidate is deleted; <code>false</code> otherwise
	 */
	public boolean isDeleted();

	/**
	 * Sets whether this candidate is deleted.
	 *
	 * @param deleted the deleted of this candidate
	 */
	public void setDeleted(boolean deleted);

	/**
	 * Returns the group ID of this candidate.
	 *
	 * @return the group ID of this candidate
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this candidate.
	 *
	 * @param groupId the group ID of this candidate
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this candidate.
	 *
	 * @return the company ID of this candidate
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this candidate.
	 *
	 * @param companyId the company ID of this candidate
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this candidate.
	 *
	 * @return the user ID of this candidate
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this candidate.
	 *
	 * @param userId the user ID of this candidate
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this candidate.
	 *
	 * @return the user uuid of this candidate
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this candidate.
	 *
	 * @param userUuid the user uuid of this candidate
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this candidate.
	 *
	 * @return the user name of this candidate
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this candidate.
	 *
	 * @param userName the user name of this candidate
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this candidate.
	 *
	 * @return the create date of this candidate
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this candidate.
	 *
	 * @param createDate the create date of this candidate
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this candidate.
	 *
	 * @return the modified date of this candidate
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this candidate.
	 *
	 * @param modifiedDate the modified date of this candidate
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the description of this candidate.
	 *
	 * @return the description of this candidate
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this candidate.
	 *
	 * @param description the description of this candidate
	 */
	public void setDescription(String description);

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
	public int compareTo(Candidate candidate);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Candidate> toCacheModel();

	@Override
	public Candidate toEscapedModel();

	@Override
	public Candidate toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}