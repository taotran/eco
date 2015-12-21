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

package vn.com.ecopharma.hrm.rc.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.hrm.rc.model.Candidate;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Candidate in entity cache.
 *
 * @author tvt
 * @see Candidate
 * @generated
 */
public class CandidateCacheModel implements CacheModel<Candidate>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(37);

		sb.append("{candidateId=");
		sb.append(candidateId);
		sb.append(", candidateCode=");
		sb.append(candidateCode);
		sb.append(", fullName=");
		sb.append(fullName);
		sb.append(", emailAddress=");
		sb.append(emailAddress);
		sb.append(", contactNumber=");
		sb.append(contactNumber);
		sb.append(", dateOfBirth=");
		sb.append(dateOfBirth);
		sb.append(", identityCardNo=");
		sb.append(identityCardNo);
		sb.append(", applicationDate=");
		sb.append(applicationDate);
		sb.append(", status=");
		sb.append(status);
		sb.append(", locationId=");
		sb.append(locationId);
		sb.append(", deleted=");
		sb.append(deleted);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", description=");
		sb.append(description);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Candidate toEntityModel() {
		CandidateImpl candidateImpl = new CandidateImpl();

		candidateImpl.setCandidateId(candidateId);

		if (candidateCode == null) {
			candidateImpl.setCandidateCode(StringPool.BLANK);
		}
		else {
			candidateImpl.setCandidateCode(candidateCode);
		}

		if (fullName == null) {
			candidateImpl.setFullName(StringPool.BLANK);
		}
		else {
			candidateImpl.setFullName(fullName);
		}

		if (emailAddress == null) {
			candidateImpl.setEmailAddress(StringPool.BLANK);
		}
		else {
			candidateImpl.setEmailAddress(emailAddress);
		}

		if (contactNumber == null) {
			candidateImpl.setContactNumber(StringPool.BLANK);
		}
		else {
			candidateImpl.setContactNumber(contactNumber);
		}

		if (dateOfBirth == Long.MIN_VALUE) {
			candidateImpl.setDateOfBirth(null);
		}
		else {
			candidateImpl.setDateOfBirth(new Date(dateOfBirth));
		}

		if (identityCardNo == null) {
			candidateImpl.setIdentityCardNo(StringPool.BLANK);
		}
		else {
			candidateImpl.setIdentityCardNo(identityCardNo);
		}

		if (applicationDate == Long.MIN_VALUE) {
			candidateImpl.setApplicationDate(null);
		}
		else {
			candidateImpl.setApplicationDate(new Date(applicationDate));
		}

		if (status == null) {
			candidateImpl.setStatus(StringPool.BLANK);
		}
		else {
			candidateImpl.setStatus(status);
		}

		candidateImpl.setLocationId(locationId);
		candidateImpl.setDeleted(deleted);
		candidateImpl.setGroupId(groupId);
		candidateImpl.setCompanyId(companyId);
		candidateImpl.setUserId(userId);

		if (userName == null) {
			candidateImpl.setUserName(StringPool.BLANK);
		}
		else {
			candidateImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			candidateImpl.setCreateDate(null);
		}
		else {
			candidateImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			candidateImpl.setModifiedDate(null);
		}
		else {
			candidateImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (description == null) {
			candidateImpl.setDescription(StringPool.BLANK);
		}
		else {
			candidateImpl.setDescription(description);
		}

		candidateImpl.resetOriginalValues();

		return candidateImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		candidateId = objectInput.readLong();
		candidateCode = objectInput.readUTF();
		fullName = objectInput.readUTF();
		emailAddress = objectInput.readUTF();
		contactNumber = objectInput.readUTF();
		dateOfBirth = objectInput.readLong();
		identityCardNo = objectInput.readUTF();
		applicationDate = objectInput.readLong();
		status = objectInput.readUTF();
		locationId = objectInput.readLong();
		deleted = objectInput.readBoolean();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		description = objectInput.readUTF();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(candidateId);

		if (candidateCode == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(candidateCode);
		}

		if (fullName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(fullName);
		}

		if (emailAddress == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(emailAddress);
		}

		if (contactNumber == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(contactNumber);
		}

		objectOutput.writeLong(dateOfBirth);

		if (identityCardNo == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(identityCardNo);
		}

		objectOutput.writeLong(applicationDate);

		if (status == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(status);
		}

		objectOutput.writeLong(locationId);
		objectOutput.writeBoolean(deleted);
		objectOutput.writeLong(groupId);
		objectOutput.writeLong(companyId);
		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);

		if (description == null) {
			objectOutput.writeUTF(StringPool.BLANK);
		}
		else {
			objectOutput.writeUTF(description);
		}
	}

	public long candidateId;
	public String candidateCode;
	public String fullName;
	public String emailAddress;
	public String contactNumber;
	public long dateOfBirth;
	public String identityCardNo;
	public long applicationDate;
	public String status;
	public long locationId;
	public boolean deleted;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public String description;
}