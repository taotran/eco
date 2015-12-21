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
 * The base model interface for the CandidateActionHistory service. Represents a row in the &quot;eco_rcp_CandidateActionHistory&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.hrm.rc.model.impl.CandidateActionHistoryModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.hrm.rc.model.impl.CandidateActionHistoryImpl}.
 * </p>
 *
 * @author tvt
 * @see CandidateActionHistory
 * @see vn.com.ecopharma.hrm.rc.model.impl.CandidateActionHistoryImpl
 * @see vn.com.ecopharma.hrm.rc.model.impl.CandidateActionHistoryModelImpl
 * @generated
 */
public interface CandidateActionHistoryModel extends BaseModel<CandidateActionHistory>,
	GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a candidate action history model instance should use the {@link CandidateActionHistory} interface instead.
	 */

	/**
	 * Returns the primary key of this candidate action history.
	 *
	 * @return the primary key of this candidate action history
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this candidate action history.
	 *
	 * @param primaryKey the primary key of this candidate action history
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the candidate action history ID of this candidate action history.
	 *
	 * @return the candidate action history ID of this candidate action history
	 */
	public long getCandidateActionHistoryId();

	/**
	 * Sets the candidate action history ID of this candidate action history.
	 *
	 * @param candidateActionHistoryId the candidate action history ID of this candidate action history
	 */
	public void setCandidateActionHistoryId(long candidateActionHistoryId);

	/**
	 * Returns the candidate ID of this candidate action history.
	 *
	 * @return the candidate ID of this candidate action history
	 */
	public long getCandidateId();

	/**
	 * Sets the candidate ID of this candidate action history.
	 *
	 * @param candidateId the candidate ID of this candidate action history
	 */
	public void setCandidateId(long candidateId);

	/**
	 * Returns the action of this candidate action history.
	 *
	 * @return the action of this candidate action history
	 */
	@AutoEscape
	public String getAction();

	/**
	 * Sets the action of this candidate action history.
	 *
	 * @param action the action of this candidate action history
	 */
	public void setAction(String action);

	/**
	 * Returns the action type of this candidate action history.
	 *
	 * @return the action type of this candidate action history
	 */
	@AutoEscape
	public String getActionType();

	/**
	 * Sets the action type of this candidate action history.
	 *
	 * @param actionType the action type of this candidate action history
	 */
	public void setActionType(String actionType);

	/**
	 * Returns the executed by of this candidate action history.
	 *
	 * @return the executed by of this candidate action history
	 */
	public long getExecutedBy();

	/**
	 * Sets the executed by of this candidate action history.
	 *
	 * @param executedBy the executed by of this candidate action history
	 */
	public void setExecutedBy(long executedBy);

	/**
	 * Returns the date of this candidate action history.
	 *
	 * @return the date of this candidate action history
	 */
	public Date getDate();

	/**
	 * Sets the date of this candidate action history.
	 *
	 * @param date the date of this candidate action history
	 */
	public void setDate(Date date);

	/**
	 * Returns the description of this candidate action history.
	 *
	 * @return the description of this candidate action history
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this candidate action history.
	 *
	 * @param description the description of this candidate action history
	 */
	public void setDescription(String description);

	/**
	 * Returns the group ID of this candidate action history.
	 *
	 * @return the group ID of this candidate action history
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this candidate action history.
	 *
	 * @param groupId the group ID of this candidate action history
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this candidate action history.
	 *
	 * @return the company ID of this candidate action history
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this candidate action history.
	 *
	 * @param companyId the company ID of this candidate action history
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this candidate action history.
	 *
	 * @return the user ID of this candidate action history
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this candidate action history.
	 *
	 * @param userId the user ID of this candidate action history
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this candidate action history.
	 *
	 * @return the user uuid of this candidate action history
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this candidate action history.
	 *
	 * @param userUuid the user uuid of this candidate action history
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this candidate action history.
	 *
	 * @return the user name of this candidate action history
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this candidate action history.
	 *
	 * @param userName the user name of this candidate action history
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this candidate action history.
	 *
	 * @return the create date of this candidate action history
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this candidate action history.
	 *
	 * @param createDate the create date of this candidate action history
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this candidate action history.
	 *
	 * @return the modified date of this candidate action history
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this candidate action history.
	 *
	 * @param modifiedDate the modified date of this candidate action history
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
	public int compareTo(CandidateActionHistory candidateActionHistory);

	@Override
	public int hashCode();

	@Override
	public CacheModel<CandidateActionHistory> toCacheModel();

	@Override
	public CandidateActionHistory toEscapedModel();

	@Override
	public CandidateActionHistory toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}