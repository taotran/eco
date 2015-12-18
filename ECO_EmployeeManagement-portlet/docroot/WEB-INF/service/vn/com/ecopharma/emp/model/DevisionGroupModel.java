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
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the DevisionGroup service. Represents a row in the &quot;eco_em_portlet_DevisionGroup&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.emp.model.impl.DevisionGroupModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.emp.model.impl.DevisionGroupImpl}.
 * </p>
 *
 * @author tvt
 * @see DevisionGroup
 * @see vn.com.ecopharma.emp.model.impl.DevisionGroupImpl
 * @see vn.com.ecopharma.emp.model.impl.DevisionGroupModelImpl
 * @generated
 */
public interface DevisionGroupModel extends BaseModel<DevisionGroup>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a devision group model instance should use the {@link DevisionGroup} interface instead.
	 */

	/**
	 * Returns the primary key of this devision group.
	 *
	 * @return the primary key of this devision group
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this devision group.
	 *
	 * @param primaryKey the primary key of this devision group
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the devision group ID of this devision group.
	 *
	 * @return the devision group ID of this devision group
	 */
	public long getDevisionGroupId();

	/**
	 * Sets the devision group ID of this devision group.
	 *
	 * @param devisionGroupId the devision group ID of this devision group
	 */
	public void setDevisionGroupId(long devisionGroupId);

	/**
	 * Returns the name of this devision group.
	 *
	 * @return the name of this devision group
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this devision group.
	 *
	 * @param name the name of this devision group
	 */
	public void setName(String name);

	/**
	 * Returns the devision ID of this devision group.
	 *
	 * @return the devision ID of this devision group
	 */
	public long getDevisionId();

	/**
	 * Sets the devision ID of this devision group.
	 *
	 * @param devisionId the devision ID of this devision group
	 */
	public void setDevisionId(long devisionId);

	/**
	 * Returns the group ID of this devision group.
	 *
	 * @return the group ID of this devision group
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this devision group.
	 *
	 * @param groupId the group ID of this devision group
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this devision group.
	 *
	 * @return the company ID of this devision group
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this devision group.
	 *
	 * @param companyId the company ID of this devision group
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this devision group.
	 *
	 * @return the user ID of this devision group
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this devision group.
	 *
	 * @param userId the user ID of this devision group
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this devision group.
	 *
	 * @return the user uuid of this devision group
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this devision group.
	 *
	 * @param userUuid the user uuid of this devision group
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this devision group.
	 *
	 * @return the user name of this devision group
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this devision group.
	 *
	 * @param userName the user name of this devision group
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this devision group.
	 *
	 * @return the create date of this devision group
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this devision group.
	 *
	 * @param createDate the create date of this devision group
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this devision group.
	 *
	 * @return the modified date of this devision group
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this devision group.
	 *
	 * @param modifiedDate the modified date of this devision group
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

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
	public int compareTo(DevisionGroup devisionGroup);

	@Override
	public int hashCode();

	@Override
	public CacheModel<DevisionGroup> toCacheModel();

	@Override
	public DevisionGroup toEscapedModel();

	@Override
	public DevisionGroup toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}