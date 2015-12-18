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
 * The base model interface for the Unit service. Represents a row in the &quot;eco_em_portlet_Unit&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.emp.model.impl.UnitModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.emp.model.impl.UnitImpl}.
 * </p>
 *
 * @author tvt
 * @see Unit
 * @see vn.com.ecopharma.emp.model.impl.UnitImpl
 * @see vn.com.ecopharma.emp.model.impl.UnitModelImpl
 * @generated
 */
public interface UnitModel extends BaseModel<Unit>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a unit model instance should use the {@link Unit} interface instead.
	 */

	/**
	 * Returns the primary key of this unit.
	 *
	 * @return the primary key of this unit
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this unit.
	 *
	 * @param primaryKey the primary key of this unit
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the unit ID of this unit.
	 *
	 * @return the unit ID of this unit
	 */
	public long getUnitId();

	/**
	 * Sets the unit ID of this unit.
	 *
	 * @param unitId the unit ID of this unit
	 */
	public void setUnitId(long unitId);

	/**
	 * Returns the name of this unit.
	 *
	 * @return the name of this unit
	 */
	@AutoEscape
	public String getName();

	/**
	 * Sets the name of this unit.
	 *
	 * @param name the name of this unit
	 */
	public void setName(String name);

	/**
	 * Returns the department ID of this unit.
	 *
	 * @return the department ID of this unit
	 */
	public long getDepartmentId();

	/**
	 * Sets the department ID of this unit.
	 *
	 * @param departmentId the department ID of this unit
	 */
	public void setDepartmentId(long departmentId);

	/**
	 * Returns the group ID of this unit.
	 *
	 * @return the group ID of this unit
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this unit.
	 *
	 * @param groupId the group ID of this unit
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this unit.
	 *
	 * @return the company ID of this unit
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this unit.
	 *
	 * @param companyId the company ID of this unit
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this unit.
	 *
	 * @return the user ID of this unit
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this unit.
	 *
	 * @param userId the user ID of this unit
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this unit.
	 *
	 * @return the user uuid of this unit
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this unit.
	 *
	 * @param userUuid the user uuid of this unit
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this unit.
	 *
	 * @return the user name of this unit
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this unit.
	 *
	 * @param userName the user name of this unit
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this unit.
	 *
	 * @return the create date of this unit
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this unit.
	 *
	 * @param createDate the create date of this unit
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this unit.
	 *
	 * @return the modified date of this unit
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this unit.
	 *
	 * @param modifiedDate the modified date of this unit
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
	public int compareTo(Unit unit);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Unit> toCacheModel();

	@Override
	public Unit toEscapedModel();

	@Override
	public Unit toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}