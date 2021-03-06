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
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

/**
 * The base model interface for the EmpNotifyEmail service. Represents a row in the &quot;eco_em_portlet_EmpNotifyEmail&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.emp.model.impl.EmpNotifyEmailModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.emp.model.impl.EmpNotifyEmailImpl}.
 * </p>
 *
 * @author tvt
 * @see EmpNotifyEmail
 * @see vn.com.ecopharma.emp.model.impl.EmpNotifyEmailImpl
 * @see vn.com.ecopharma.emp.model.impl.EmpNotifyEmailModelImpl
 * @generated
 */
public interface EmpNotifyEmailModel extends BaseModel<EmpNotifyEmail> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a emp notify email model instance should use the {@link EmpNotifyEmail} interface instead.
	 */

	/**
	 * Returns the primary key of this emp notify email.
	 *
	 * @return the primary key of this emp notify email
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this emp notify email.
	 *
	 * @param primaryKey the primary key of this emp notify email
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the emp notify email ID of this emp notify email.
	 *
	 * @return the emp notify email ID of this emp notify email
	 */
	public long getEmpNotifyEmailId();

	/**
	 * Sets the emp notify email ID of this emp notify email.
	 *
	 * @param empNotifyEmailId the emp notify email ID of this emp notify email
	 */
	public void setEmpNotifyEmailId(long empNotifyEmailId);

	/**
	 * Returns the emp ID of this emp notify email.
	 *
	 * @return the emp ID of this emp notify email
	 */
	public long getEmpId();

	/**
	 * Sets the emp ID of this emp notify email.
	 *
	 * @param empId the emp ID of this emp notify email
	 */
	public void setEmpId(long empId);

	/**
	 * Returns the notify type of this emp notify email.
	 *
	 * @return the notify type of this emp notify email
	 */
	@AutoEscape
	public String getNotifyType();

	/**
	 * Sets the notify type of this emp notify email.
	 *
	 * @param notifyType the notify type of this emp notify email
	 */
	public void setNotifyType(String notifyType);

	/**
	 * Returns the status of this emp notify email.
	 *
	 * @return the status of this emp notify email
	 */
	@AutoEscape
	public String getStatus();

	/**
	 * Sets the status of this emp notify email.
	 *
	 * @param status the status of this emp notify email
	 */
	public void setStatus(String status);

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
	public int compareTo(EmpNotifyEmail empNotifyEmail);

	@Override
	public int hashCode();

	@Override
	public CacheModel<EmpNotifyEmail> toCacheModel();

	@Override
	public EmpNotifyEmail toEscapedModel();

	@Override
	public EmpNotifyEmail toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}