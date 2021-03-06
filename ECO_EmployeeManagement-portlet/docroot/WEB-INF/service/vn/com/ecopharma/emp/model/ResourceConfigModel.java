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
 * The base model interface for the ResourceConfig service. Represents a row in the &quot;eco_em_portlet_ResourceConfig&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.emp.model.impl.ResourceConfigModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.emp.model.impl.ResourceConfigImpl}.
 * </p>
 *
 * @author tvt
 * @see ResourceConfig
 * @see vn.com.ecopharma.emp.model.impl.ResourceConfigImpl
 * @see vn.com.ecopharma.emp.model.impl.ResourceConfigModelImpl
 * @generated
 */
public interface ResourceConfigModel extends BaseModel<ResourceConfig>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a resource config model instance should use the {@link ResourceConfig} interface instead.
	 */

	/**
	 * Returns the primary key of this resource config.
	 *
	 * @return the primary key of this resource config
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this resource config.
	 *
	 * @param primaryKey the primary key of this resource config
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the resource config ID of this resource config.
	 *
	 * @return the resource config ID of this resource config
	 */
	public long getResourceConfigId();

	/**
	 * Sets the resource config ID of this resource config.
	 *
	 * @param resourceConfigId the resource config ID of this resource config
	 */
	public void setResourceConfigId(long resourceConfigId);

	/**
	 * Returns the key of this resource config.
	 *
	 * @return the key of this resource config
	 */
	@AutoEscape
	public String getKey();

	/**
	 * Sets the key of this resource config.
	 *
	 * @param key the key of this resource config
	 */
	public void setKey(String key);

	/**
	 * Returns the value of this resource config.
	 *
	 * @return the value of this resource config
	 */
	@AutoEscape
	public String getValue();

	/**
	 * Sets the value of this resource config.
	 *
	 * @param value the value of this resource config
	 */
	public void setValue(String value);

	/**
	 * Returns the type of this resource config.
	 *
	 * @return the type of this resource config
	 */
	@AutoEscape
	public String getType();

	/**
	 * Sets the type of this resource config.
	 *
	 * @param type the type of this resource config
	 */
	public void setType(String type);

	/**
	 * Returns the group ID of this resource config.
	 *
	 * @return the group ID of this resource config
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this resource config.
	 *
	 * @param groupId the group ID of this resource config
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this resource config.
	 *
	 * @return the company ID of this resource config
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this resource config.
	 *
	 * @param companyId the company ID of this resource config
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this resource config.
	 *
	 * @return the user ID of this resource config
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this resource config.
	 *
	 * @param userId the user ID of this resource config
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this resource config.
	 *
	 * @return the user uuid of this resource config
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this resource config.
	 *
	 * @param userUuid the user uuid of this resource config
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this resource config.
	 *
	 * @return the user name of this resource config
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this resource config.
	 *
	 * @param userName the user name of this resource config
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this resource config.
	 *
	 * @return the create date of this resource config
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this resource config.
	 *
	 * @param createDate the create date of this resource config
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this resource config.
	 *
	 * @return the modified date of this resource config
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this resource config.
	 *
	 * @param modifiedDate the modified date of this resource config
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
	public int compareTo(ResourceConfig resourceConfig);

	@Override
	public int hashCode();

	@Override
	public CacheModel<ResourceConfig> toCacheModel();

	@Override
	public ResourceConfig toEscapedModel();

	@Override
	public ResourceConfig toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}