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

package vn.com.ecopharma.emp.model.impl;

import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;

import vn.com.ecopharma.emp.model.TitlesUnitUnitGroup;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing TitlesUnitUnitGroup in entity cache.
 *
 * @author tvt
 * @see TitlesUnitUnitGroup
 * @generated
 */
public class TitlesUnitUnitGroupCacheModel implements CacheModel<TitlesUnitUnitGroup>,
	Externalizable {
	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{titlesUnitUnitGroupId=");
		sb.append(titlesUnitUnitGroupId);
		sb.append(", titlesId=");
		sb.append(titlesId);
		sb.append(", unitId=");
		sb.append(unitId);
		sb.append(", unitGroupId=");
		sb.append(unitGroupId);
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public TitlesUnitUnitGroup toEntityModel() {
		TitlesUnitUnitGroupImpl titlesUnitUnitGroupImpl = new TitlesUnitUnitGroupImpl();

		titlesUnitUnitGroupImpl.setTitlesUnitUnitGroupId(titlesUnitUnitGroupId);
		titlesUnitUnitGroupImpl.setTitlesId(titlesId);
		titlesUnitUnitGroupImpl.setUnitId(unitId);
		titlesUnitUnitGroupImpl.setUnitGroupId(unitGroupId);
		titlesUnitUnitGroupImpl.setGroupId(groupId);
		titlesUnitUnitGroupImpl.setCompanyId(companyId);
		titlesUnitUnitGroupImpl.setUserId(userId);

		if (userName == null) {
			titlesUnitUnitGroupImpl.setUserName(StringPool.BLANK);
		}
		else {
			titlesUnitUnitGroupImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			titlesUnitUnitGroupImpl.setCreateDate(null);
		}
		else {
			titlesUnitUnitGroupImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			titlesUnitUnitGroupImpl.setModifiedDate(null);
		}
		else {
			titlesUnitUnitGroupImpl.setModifiedDate(new Date(modifiedDate));
		}

		titlesUnitUnitGroupImpl.resetOriginalValues();

		return titlesUnitUnitGroupImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		titlesUnitUnitGroupId = objectInput.readLong();
		titlesId = objectInput.readLong();
		unitId = objectInput.readLong();
		unitGroupId = objectInput.readLong();
		groupId = objectInput.readLong();
		companyId = objectInput.readLong();
		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput)
		throws IOException {
		objectOutput.writeLong(titlesUnitUnitGroupId);
		objectOutput.writeLong(titlesId);
		objectOutput.writeLong(unitId);
		objectOutput.writeLong(unitGroupId);
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
	}

	public long titlesUnitUnitGroupId;
	public long titlesId;
	public long unitId;
	public long unitGroupId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
}