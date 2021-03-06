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
 * The base model interface for the EmpConcurrentTitles service. Represents a row in the &quot;eco_em_portlet_EmpConcurrentTitles&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.emp.model.impl.EmpConcurrentTitlesModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.emp.model.impl.EmpConcurrentTitlesImpl}.
 * </p>
 *
 * @author tvt
 * @see EmpConcurrentTitles
 * @see vn.com.ecopharma.emp.model.impl.EmpConcurrentTitlesImpl
 * @see vn.com.ecopharma.emp.model.impl.EmpConcurrentTitlesModelImpl
 * @generated
 */
public interface EmpConcurrentTitlesModel extends BaseModel<EmpConcurrentTitles>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a emp concurrent titles model instance should use the {@link EmpConcurrentTitles} interface instead.
	 */

	/**
	 * Returns the primary key of this emp concurrent titles.
	 *
	 * @return the primary key of this emp concurrent titles
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this emp concurrent titles.
	 *
	 * @param primaryKey the primary key of this emp concurrent titles
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the emp concurrent titles ID of this emp concurrent titles.
	 *
	 * @return the emp concurrent titles ID of this emp concurrent titles
	 */
	public long getEmpConcurrentTitlesId();

	/**
	 * Sets the emp concurrent titles ID of this emp concurrent titles.
	 *
	 * @param empConcurrentTitlesId the emp concurrent titles ID of this emp concurrent titles
	 */
	public void setEmpConcurrentTitlesId(long empConcurrentTitlesId);

	/**
	 * Returns the emp ID of this emp concurrent titles.
	 *
	 * @return the emp ID of this emp concurrent titles
	 */
	public long getEmpId();

	/**
	 * Sets the emp ID of this emp concurrent titles.
	 *
	 * @param empId the emp ID of this emp concurrent titles
	 */
	public void setEmpId(long empId);

	/**
	 * Returns the titles ID of this emp concurrent titles.
	 *
	 * @return the titles ID of this emp concurrent titles
	 */
	public long getTitlesId();

	/**
	 * Sets the titles ID of this emp concurrent titles.
	 *
	 * @param titlesId the titles ID of this emp concurrent titles
	 */
	public void setTitlesId(long titlesId);

	/**
	 * Returns the unit group ID of this emp concurrent titles.
	 *
	 * @return the unit group ID of this emp concurrent titles
	 */
	public long getUnitGroupId();

	/**
	 * Sets the unit group ID of this emp concurrent titles.
	 *
	 * @param unitGroupId the unit group ID of this emp concurrent titles
	 */
	public void setUnitGroupId(long unitGroupId);

	/**
	 * Returns the unit ID of this emp concurrent titles.
	 *
	 * @return the unit ID of this emp concurrent titles
	 */
	public long getUnitId();

	/**
	 * Sets the unit ID of this emp concurrent titles.
	 *
	 * @param unitId the unit ID of this emp concurrent titles
	 */
	public void setUnitId(long unitId);

	/**
	 * Returns the department ID of this emp concurrent titles.
	 *
	 * @return the department ID of this emp concurrent titles
	 */
	public long getDepartmentId();

	/**
	 * Sets the department ID of this emp concurrent titles.
	 *
	 * @param departmentId the department ID of this emp concurrent titles
	 */
	public void setDepartmentId(long departmentId);

	/**
	 * Returns the group ID of this emp concurrent titles.
	 *
	 * @return the group ID of this emp concurrent titles
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this emp concurrent titles.
	 *
	 * @param groupId the group ID of this emp concurrent titles
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this emp concurrent titles.
	 *
	 * @return the company ID of this emp concurrent titles
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this emp concurrent titles.
	 *
	 * @param companyId the company ID of this emp concurrent titles
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this emp concurrent titles.
	 *
	 * @return the user ID of this emp concurrent titles
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this emp concurrent titles.
	 *
	 * @param userId the user ID of this emp concurrent titles
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this emp concurrent titles.
	 *
	 * @return the user uuid of this emp concurrent titles
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this emp concurrent titles.
	 *
	 * @param userUuid the user uuid of this emp concurrent titles
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this emp concurrent titles.
	 *
	 * @return the user name of this emp concurrent titles
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this emp concurrent titles.
	 *
	 * @param userName the user name of this emp concurrent titles
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this emp concurrent titles.
	 *
	 * @return the create date of this emp concurrent titles
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this emp concurrent titles.
	 *
	 * @param createDate the create date of this emp concurrent titles
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this emp concurrent titles.
	 *
	 * @return the modified date of this emp concurrent titles
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this emp concurrent titles.
	 *
	 * @param modifiedDate the modified date of this emp concurrent titles
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
	public int compareTo(EmpConcurrentTitles empConcurrentTitles);

	@Override
	public int hashCode();

	@Override
	public CacheModel<EmpConcurrentTitles> toCacheModel();

	@Override
	public EmpConcurrentTitles toEscapedModel();

	@Override
	public EmpConcurrentTitles toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}