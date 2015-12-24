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
 * The base model interface for the PromotedHistory service. Represents a row in the &quot;eco_em_portlet_PromotedHistory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.emp.model.impl.PromotedHistoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.emp.model.impl.PromotedHistoryImpl}.
 * </p>
 *
 * @author tvt
 * @see PromotedHistory
 * @see vn.com.ecopharma.emp.model.impl.PromotedHistoryImpl
 * @see vn.com.ecopharma.emp.model.impl.PromotedHistoryModelImpl
 * @generated
 */
public interface PromotedHistoryModel extends BaseModel<PromotedHistory>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a promoted history model instance should use the {@link PromotedHistory} interface instead.
	 */

	/**
	 * Returns the primary key of this promoted history.
	 *
	 * @return the primary key of this promoted history
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this promoted history.
	 *
	 * @param primaryKey the primary key of this promoted history
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the promoted history ID of this promoted history.
	 *
	 * @return the promoted history ID of this promoted history
	 */
	public long getPromotedHistoryId();

	/**
	 * Sets the promoted history ID of this promoted history.
	 *
	 * @param promotedHistoryId the promoted history ID of this promoted history
	 */
	public void setPromotedHistoryId(long promotedHistoryId);

	/**
	 * Returns the employee ID of this promoted history.
	 *
	 * @return the employee ID of this promoted history
	 */
	public long getEmployeeId();

	/**
	 * Sets the employee ID of this promoted history.
	 *
	 * @param employeeId the employee ID of this promoted history
	 */
	public void setEmployeeId(long employeeId);

	/**
	 * Returns the old titles ID of this promoted history.
	 *
	 * @return the old titles ID of this promoted history
	 */
	public long getOldTitlesId();

	/**
	 * Sets the old titles ID of this promoted history.
	 *
	 * @param oldTitlesId the old titles ID of this promoted history
	 */
	public void setOldTitlesId(long oldTitlesId);

	/**
	 * Returns the new titles ID of this promoted history.
	 *
	 * @return the new titles ID of this promoted history
	 */
	public long getNewTitlesId();

	/**
	 * Sets the new titles ID of this promoted history.
	 *
	 * @param newTitlesId the new titles ID of this promoted history
	 */
	public void setNewTitlesId(long newTitlesId);

	/**
	 * Returns the promoted date of this promoted history.
	 *
	 * @return the promoted date of this promoted history
	 */
	public Date getPromotedDate();

	/**
	 * Sets the promoted date of this promoted history.
	 *
	 * @param promotedDate the promoted date of this promoted history
	 */
	public void setPromotedDate(Date promotedDate);

	/**
	 * Returns the comment of this promoted history.
	 *
	 * @return the comment of this promoted history
	 */
	@AutoEscape
	public String getComment();

	/**
	 * Sets the comment of this promoted history.
	 *
	 * @param comment the comment of this promoted history
	 */
	public void setComment(String comment);

	/**
	 * Returns the group ID of this promoted history.
	 *
	 * @return the group ID of this promoted history
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this promoted history.
	 *
	 * @param groupId the group ID of this promoted history
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this promoted history.
	 *
	 * @return the company ID of this promoted history
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this promoted history.
	 *
	 * @param companyId the company ID of this promoted history
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this promoted history.
	 *
	 * @return the user ID of this promoted history
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this promoted history.
	 *
	 * @param userId the user ID of this promoted history
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this promoted history.
	 *
	 * @return the user uuid of this promoted history
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this promoted history.
	 *
	 * @param userUuid the user uuid of this promoted history
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this promoted history.
	 *
	 * @return the user name of this promoted history
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this promoted history.
	 *
	 * @param userName the user name of this promoted history
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this promoted history.
	 *
	 * @return the create date of this promoted history
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this promoted history.
	 *
	 * @param createDate the create date of this promoted history
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this promoted history.
	 *
	 * @return the modified date of this promoted history
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this promoted history.
	 *
	 * @param modifiedDate the modified date of this promoted history
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the deleted of this promoted history.
	 *
	 * @return the deleted of this promoted history
	 */
	public boolean getDeleted();

	/**
	 * Returns <code>true</code> if this promoted history is deleted.
	 *
	 * @return <code>true</code> if this promoted history is deleted; <code>false</code> otherwise
	 */
	public boolean isDeleted();

	/**
	 * Sets whether this promoted history is deleted.
	 *
	 * @param deleted the deleted of this promoted history
	 */
	public void setDeleted(boolean deleted);

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
	public int compareTo(PromotedHistory promotedHistory);

	@Override
	public int hashCode();

	@Override
	public CacheModel<PromotedHistory> toCacheModel();

	@Override
	public PromotedHistory toEscapedModel();

	@Override
	public PromotedHistory toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}