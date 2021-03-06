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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import vn.com.ecopharma.hrm.rc.service.CandidateLocalServiceUtil;
import vn.com.ecopharma.hrm.rc.service.ClpSerializer;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tvt
 */
public class CandidateClp extends BaseModelImpl<Candidate> implements Candidate {
	public CandidateClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return Candidate.class;
	}

	@Override
	public String getModelClassName() {
		return Candidate.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _candidateId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCandidateId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _candidateId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("candidateId", getCandidateId());
		attributes.put("candidateCode", getCandidateCode());
		attributes.put("fullName", getFullName());
		attributes.put("emailAddress", getEmailAddress());
		attributes.put("contactNumber", getContactNumber());
		attributes.put("dateOfBirth", getDateOfBirth());
		attributes.put("placeOfBirth", getPlaceOfBirth());
		attributes.put("gender", getGender());
		attributes.put("identityCardNo", getIdentityCardNo());
		attributes.put("issuedDate", getIssuedDate());
		attributes.put("issuedPlace", getIssuedPlace());
		attributes.put("maritalStatus", getMaritalStatus());
		attributes.put("numberOfChild", getNumberOfChild());
		attributes.put("nationalityId", getNationalityId());
		attributes.put("ethnic", getEthnic());
		attributes.put("religion", getReligion());
		attributes.put("applicationDate", getApplicationDate());
		attributes.put("status", getStatus());
		attributes.put("deleted", getDeleted());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("description", getDescription());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long candidateId = (Long)attributes.get("candidateId");

		if (candidateId != null) {
			setCandidateId(candidateId);
		}

		String candidateCode = (String)attributes.get("candidateCode");

		if (candidateCode != null) {
			setCandidateCode(candidateCode);
		}

		String fullName = (String)attributes.get("fullName");

		if (fullName != null) {
			setFullName(fullName);
		}

		String emailAddress = (String)attributes.get("emailAddress");

		if (emailAddress != null) {
			setEmailAddress(emailAddress);
		}

		String contactNumber = (String)attributes.get("contactNumber");

		if (contactNumber != null) {
			setContactNumber(contactNumber);
		}

		Date dateOfBirth = (Date)attributes.get("dateOfBirth");

		if (dateOfBirth != null) {
			setDateOfBirth(dateOfBirth);
		}

		String placeOfBirth = (String)attributes.get("placeOfBirth");

		if (placeOfBirth != null) {
			setPlaceOfBirth(placeOfBirth);
		}

		String gender = (String)attributes.get("gender");

		if (gender != null) {
			setGender(gender);
		}

		String identityCardNo = (String)attributes.get("identityCardNo");

		if (identityCardNo != null) {
			setIdentityCardNo(identityCardNo);
		}

		Date issuedDate = (Date)attributes.get("issuedDate");

		if (issuedDate != null) {
			setIssuedDate(issuedDate);
		}

		String issuedPlace = (String)attributes.get("issuedPlace");

		if (issuedPlace != null) {
			setIssuedPlace(issuedPlace);
		}

		String maritalStatus = (String)attributes.get("maritalStatus");

		if (maritalStatus != null) {
			setMaritalStatus(maritalStatus);
		}

		Integer numberOfChild = (Integer)attributes.get("numberOfChild");

		if (numberOfChild != null) {
			setNumberOfChild(numberOfChild);
		}

		Long nationalityId = (Long)attributes.get("nationalityId");

		if (nationalityId != null) {
			setNationalityId(nationalityId);
		}

		String ethnic = (String)attributes.get("ethnic");

		if (ethnic != null) {
			setEthnic(ethnic);
		}

		String religion = (String)attributes.get("religion");

		if (religion != null) {
			setReligion(religion);
		}

		Date applicationDate = (Date)attributes.get("applicationDate");

		if (applicationDate != null) {
			setApplicationDate(applicationDate);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Boolean deleted = (Boolean)attributes.get("deleted");

		if (deleted != null) {
			setDeleted(deleted);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}
	}

	@Override
	public long getCandidateId() {
		return _candidateId;
	}

	@Override
	public void setCandidateId(long candidateId) {
		_candidateId = candidateId;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setCandidateId", long.class);

				method.invoke(_candidateRemoteModel, candidateId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getCandidateCode() {
		return _candidateCode;
	}

	@Override
	public void setCandidateCode(String candidateCode) {
		_candidateCode = candidateCode;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setCandidateCode", String.class);

				method.invoke(_candidateRemoteModel, candidateCode);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getFullName() {
		return _fullName;
	}

	@Override
	public void setFullName(String fullName) {
		_fullName = fullName;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setFullName", String.class);

				method.invoke(_candidateRemoteModel, fullName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEmailAddress() {
		return _emailAddress;
	}

	@Override
	public void setEmailAddress(String emailAddress) {
		_emailAddress = emailAddress;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setEmailAddress", String.class);

				method.invoke(_candidateRemoteModel, emailAddress);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getContactNumber() {
		return _contactNumber;
	}

	@Override
	public void setContactNumber(String contactNumber) {
		_contactNumber = contactNumber;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setContactNumber", String.class);

				method.invoke(_candidateRemoteModel, contactNumber);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getDateOfBirth() {
		return _dateOfBirth;
	}

	@Override
	public void setDateOfBirth(Date dateOfBirth) {
		_dateOfBirth = dateOfBirth;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setDateOfBirth", Date.class);

				method.invoke(_candidateRemoteModel, dateOfBirth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getPlaceOfBirth() {
		return _placeOfBirth;
	}

	@Override
	public void setPlaceOfBirth(String placeOfBirth) {
		_placeOfBirth = placeOfBirth;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setPlaceOfBirth", String.class);

				method.invoke(_candidateRemoteModel, placeOfBirth);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getGender() {
		return _gender;
	}

	@Override
	public void setGender(String gender) {
		_gender = gender;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setGender", String.class);

				method.invoke(_candidateRemoteModel, gender);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIdentityCardNo() {
		return _identityCardNo;
	}

	@Override
	public void setIdentityCardNo(String identityCardNo) {
		_identityCardNo = identityCardNo;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setIdentityCardNo",
						String.class);

				method.invoke(_candidateRemoteModel, identityCardNo);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getIssuedDate() {
		return _issuedDate;
	}

	@Override
	public void setIssuedDate(Date issuedDate) {
		_issuedDate = issuedDate;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setIssuedDate", Date.class);

				method.invoke(_candidateRemoteModel, issuedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getIssuedPlace() {
		return _issuedPlace;
	}

	@Override
	public void setIssuedPlace(String issuedPlace) {
		_issuedPlace = issuedPlace;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setIssuedPlace", String.class);

				method.invoke(_candidateRemoteModel, issuedPlace);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getMaritalStatus() {
		return _maritalStatus;
	}

	@Override
	public void setMaritalStatus(String maritalStatus) {
		_maritalStatus = maritalStatus;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setMaritalStatus", String.class);

				method.invoke(_candidateRemoteModel, maritalStatus);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getNumberOfChild() {
		return _numberOfChild;
	}

	@Override
	public void setNumberOfChild(int numberOfChild) {
		_numberOfChild = numberOfChild;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setNumberOfChild", int.class);

				method.invoke(_candidateRemoteModel, numberOfChild);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getNationalityId() {
		return _nationalityId;
	}

	@Override
	public void setNationalityId(long nationalityId) {
		_nationalityId = nationalityId;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setNationalityId", long.class);

				method.invoke(_candidateRemoteModel, nationalityId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getEthnic() {
		return _ethnic;
	}

	@Override
	public void setEthnic(String ethnic) {
		_ethnic = ethnic;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setEthnic", String.class);

				method.invoke(_candidateRemoteModel, ethnic);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getReligion() {
		return _religion;
	}

	@Override
	public void setReligion(String religion) {
		_religion = religion;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setReligion", String.class);

				method.invoke(_candidateRemoteModel, religion);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getApplicationDate() {
		return _applicationDate;
	}

	@Override
	public void setApplicationDate(Date applicationDate) {
		_applicationDate = applicationDate;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setApplicationDate", Date.class);

				method.invoke(_candidateRemoteModel, applicationDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getStatus() {
		return _status;
	}

	@Override
	public void setStatus(String status) {
		_status = status;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setStatus", String.class);

				method.invoke(_candidateRemoteModel, status);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public boolean getDeleted() {
		return _deleted;
	}

	@Override
	public boolean isDeleted() {
		return _deleted;
	}

	@Override
	public void setDeleted(boolean deleted) {
		_deleted = deleted;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setDeleted", boolean.class);

				method.invoke(_candidateRemoteModel, deleted);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_candidateRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_candidateRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_candidateRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_candidateRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_candidateRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_candidateRemoteModel, modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getDescription() {
		return _description;
	}

	@Override
	public void setDescription(String description) {
		_description = description;

		if (_candidateRemoteModel != null) {
			try {
				Class<?> clazz = _candidateRemoteModel.getClass();

				Method method = clazz.getMethod("setDescription", String.class);

				method.invoke(_candidateRemoteModel, description);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getCandidateRemoteModel() {
		return _candidateRemoteModel;
	}

	public void setCandidateRemoteModel(BaseModel<?> candidateRemoteModel) {
		_candidateRemoteModel = candidateRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _candidateRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_candidateRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			CandidateLocalServiceUtil.addCandidate(this);
		}
		else {
			CandidateLocalServiceUtil.updateCandidate(this);
		}
	}

	@Override
	public Candidate toEscapedModel() {
		return (Candidate)ProxyUtil.newProxyInstance(Candidate.class.getClassLoader(),
			new Class[] { Candidate.class }, new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		CandidateClp clone = new CandidateClp();

		clone.setCandidateId(getCandidateId());
		clone.setCandidateCode(getCandidateCode());
		clone.setFullName(getFullName());
		clone.setEmailAddress(getEmailAddress());
		clone.setContactNumber(getContactNumber());
		clone.setDateOfBirth(getDateOfBirth());
		clone.setPlaceOfBirth(getPlaceOfBirth());
		clone.setGender(getGender());
		clone.setIdentityCardNo(getIdentityCardNo());
		clone.setIssuedDate(getIssuedDate());
		clone.setIssuedPlace(getIssuedPlace());
		clone.setMaritalStatus(getMaritalStatus());
		clone.setNumberOfChild(getNumberOfChild());
		clone.setNationalityId(getNationalityId());
		clone.setEthnic(getEthnic());
		clone.setReligion(getReligion());
		clone.setApplicationDate(getApplicationDate());
		clone.setStatus(getStatus());
		clone.setDeleted(getDeleted());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());
		clone.setDescription(getDescription());

		return clone;
	}

	@Override
	public int compareTo(Candidate candidate) {
		long primaryKey = candidate.getPrimaryKey();

		if (getPrimaryKey() < primaryKey) {
			return -1;
		}
		else if (getPrimaryKey() > primaryKey) {
			return 1;
		}
		else {
			return 0;
		}
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof CandidateClp)) {
			return false;
		}

		CandidateClp candidate = (CandidateClp)obj;

		long primaryKey = candidate.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(53);

		sb.append("{candidateId=");
		sb.append(getCandidateId());
		sb.append(", candidateCode=");
		sb.append(getCandidateCode());
		sb.append(", fullName=");
		sb.append(getFullName());
		sb.append(", emailAddress=");
		sb.append(getEmailAddress());
		sb.append(", contactNumber=");
		sb.append(getContactNumber());
		sb.append(", dateOfBirth=");
		sb.append(getDateOfBirth());
		sb.append(", placeOfBirth=");
		sb.append(getPlaceOfBirth());
		sb.append(", gender=");
		sb.append(getGender());
		sb.append(", identityCardNo=");
		sb.append(getIdentityCardNo());
		sb.append(", issuedDate=");
		sb.append(getIssuedDate());
		sb.append(", issuedPlace=");
		sb.append(getIssuedPlace());
		sb.append(", maritalStatus=");
		sb.append(getMaritalStatus());
		sb.append(", numberOfChild=");
		sb.append(getNumberOfChild());
		sb.append(", nationalityId=");
		sb.append(getNationalityId());
		sb.append(", ethnic=");
		sb.append(getEthnic());
		sb.append(", religion=");
		sb.append(getReligion());
		sb.append(", applicationDate=");
		sb.append(getApplicationDate());
		sb.append(", status=");
		sb.append(getStatus());
		sb.append(", deleted=");
		sb.append(getDeleted());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", userName=");
		sb.append(getUserName());
		sb.append(", createDate=");
		sb.append(getCreateDate());
		sb.append(", modifiedDate=");
		sb.append(getModifiedDate());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(82);

		sb.append("<model><model-name>");
		sb.append("vn.com.ecopharma.hrm.rc.model.Candidate");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>candidateId</column-name><column-value><![CDATA[");
		sb.append(getCandidateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>candidateCode</column-name><column-value><![CDATA[");
		sb.append(getCandidateCode());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>fullName</column-name><column-value><![CDATA[");
		sb.append(getFullName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>emailAddress</column-name><column-value><![CDATA[");
		sb.append(getEmailAddress());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>contactNumber</column-name><column-value><![CDATA[");
		sb.append(getContactNumber());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>dateOfBirth</column-name><column-value><![CDATA[");
		sb.append(getDateOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>placeOfBirth</column-name><column-value><![CDATA[");
		sb.append(getPlaceOfBirth());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>gender</column-name><column-value><![CDATA[");
		sb.append(getGender());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>identityCardNo</column-name><column-value><![CDATA[");
		sb.append(getIdentityCardNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issuedDate</column-name><column-value><![CDATA[");
		sb.append(getIssuedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>issuedPlace</column-name><column-value><![CDATA[");
		sb.append(getIssuedPlace());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>maritalStatus</column-name><column-value><![CDATA[");
		sb.append(getMaritalStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>numberOfChild</column-name><column-value><![CDATA[");
		sb.append(getNumberOfChild());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>nationalityId</column-name><column-value><![CDATA[");
		sb.append(getNationalityId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ethnic</column-name><column-value><![CDATA[");
		sb.append(getEthnic());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>religion</column-name><column-value><![CDATA[");
		sb.append(getReligion());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>applicationDate</column-name><column-value><![CDATA[");
		sb.append(getApplicationDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deleted</column-name><column-value><![CDATA[");
		sb.append(getDeleted());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userName</column-name><column-value><![CDATA[");
		sb.append(getUserName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>createDate</column-name><column-value><![CDATA[");
		sb.append(getCreateDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>modifiedDate</column-name><column-value><![CDATA[");
		sb.append(getModifiedDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private long _candidateId;
	private String _candidateCode;
	private String _fullName;
	private String _emailAddress;
	private String _contactNumber;
	private Date _dateOfBirth;
	private String _placeOfBirth;
	private String _gender;
	private String _identityCardNo;
	private Date _issuedDate;
	private String _issuedPlace;
	private String _maritalStatus;
	private int _numberOfChild;
	private long _nationalityId;
	private String _ethnic;
	private String _religion;
	private Date _applicationDate;
	private String _status;
	private boolean _deleted;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private String _description;
	private BaseModel<?> _candidateRemoteModel;
	private Class<?> _clpSerializerClass = vn.com.ecopharma.hrm.rc.service.ClpSerializer.class;
}