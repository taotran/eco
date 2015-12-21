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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import vn.com.ecopharma.hrm.rc.model.InterviewSchedule;
import vn.com.ecopharma.hrm.rc.model.InterviewScheduleModel;
import vn.com.ecopharma.hrm.rc.model.InterviewScheduleSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the InterviewSchedule service. Represents a row in the &quot;eco_rcp_InterviewSchedule&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.com.ecopharma.hrm.rc.model.InterviewScheduleModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link InterviewScheduleImpl}.
 * </p>
 *
 * @author tvt
 * @see InterviewScheduleImpl
 * @see vn.com.ecopharma.hrm.rc.model.InterviewSchedule
 * @see vn.com.ecopharma.hrm.rc.model.InterviewScheduleModel
 * @generated
 */
@JSON(strict = true)
public class InterviewScheduleModelImpl extends BaseModelImpl<InterviewSchedule>
	implements InterviewScheduleModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a interview schedule model instance should use the {@link vn.com.ecopharma.hrm.rc.model.InterviewSchedule} interface instead.
	 */
	public static final String TABLE_NAME = "eco_rcp_InterviewSchedule";
	public static final Object[][] TABLE_COLUMNS = {
			{ "interviewScheduleId", Types.BIGINT },
			{ "vacancyCandidateId", Types.BIGINT },
			{ "interviewId", Types.BIGINT },
			{ "locationId", Types.BIGINT },
			{ "interviewDate", Types.TIMESTAMP },
			{ "interviewTime", Types.VARCHAR },
			{ "status", Types.VARCHAR },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table eco_rcp_InterviewSchedule (interviewScheduleId LONG not null primary key,vacancyCandidateId LONG,interviewId LONG,locationId LONG,interviewDate DATE null,interviewTime VARCHAR(75) null,status VARCHAR(75) null,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table eco_rcp_InterviewSchedule";
	public static final String ORDER_BY_JPQL = " ORDER BY interviewSchedule.interviewScheduleId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY eco_rcp_InterviewSchedule.interviewScheduleId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.com.ecopharma.hrm.rc.model.InterviewSchedule"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.com.ecopharma.hrm.rc.model.InterviewSchedule"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.com.ecopharma.hrm.rc.model.InterviewSchedule"),
			true);
	public static long INTERVIEWID_COLUMN_BITMASK = 1L;
	public static long STATUS_COLUMN_BITMASK = 2L;
	public static long VACANCYCANDIDATEID_COLUMN_BITMASK = 4L;
	public static long INTERVIEWSCHEDULEID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static InterviewSchedule toModel(InterviewScheduleSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		InterviewSchedule model = new InterviewScheduleImpl();

		model.setInterviewScheduleId(soapModel.getInterviewScheduleId());
		model.setVacancyCandidateId(soapModel.getVacancyCandidateId());
		model.setInterviewId(soapModel.getInterviewId());
		model.setLocationId(soapModel.getLocationId());
		model.setInterviewDate(soapModel.getInterviewDate());
		model.setInterviewTime(soapModel.getInterviewTime());
		model.setStatus(soapModel.getStatus());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<InterviewSchedule> toModels(
		InterviewScheduleSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<InterviewSchedule> models = new ArrayList<InterviewSchedule>(soapModels.length);

		for (InterviewScheduleSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.com.ecopharma.hrm.rc.model.InterviewSchedule"));

	public InterviewScheduleModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _interviewScheduleId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setInterviewScheduleId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _interviewScheduleId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return InterviewSchedule.class;
	}

	@Override
	public String getModelClassName() {
		return InterviewSchedule.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("interviewScheduleId", getInterviewScheduleId());
		attributes.put("vacancyCandidateId", getVacancyCandidateId());
		attributes.put("interviewId", getInterviewId());
		attributes.put("locationId", getLocationId());
		attributes.put("interviewDate", getInterviewDate());
		attributes.put("interviewTime", getInterviewTime());
		attributes.put("status", getStatus());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long interviewScheduleId = (Long)attributes.get("interviewScheduleId");

		if (interviewScheduleId != null) {
			setInterviewScheduleId(interviewScheduleId);
		}

		Long vacancyCandidateId = (Long)attributes.get("vacancyCandidateId");

		if (vacancyCandidateId != null) {
			setVacancyCandidateId(vacancyCandidateId);
		}

		Long interviewId = (Long)attributes.get("interviewId");

		if (interviewId != null) {
			setInterviewId(interviewId);
		}

		Long locationId = (Long)attributes.get("locationId");

		if (locationId != null) {
			setLocationId(locationId);
		}

		Date interviewDate = (Date)attributes.get("interviewDate");

		if (interviewDate != null) {
			setInterviewDate(interviewDate);
		}

		String interviewTime = (String)attributes.get("interviewTime");

		if (interviewTime != null) {
			setInterviewTime(interviewTime);
		}

		String status = (String)attributes.get("status");

		if (status != null) {
			setStatus(status);
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
	}

	@JSON
	@Override
	public long getInterviewScheduleId() {
		return _interviewScheduleId;
	}

	@Override
	public void setInterviewScheduleId(long interviewScheduleId) {
		_interviewScheduleId = interviewScheduleId;
	}

	@JSON
	@Override
	public long getVacancyCandidateId() {
		return _vacancyCandidateId;
	}

	@Override
	public void setVacancyCandidateId(long vacancyCandidateId) {
		_columnBitmask |= VACANCYCANDIDATEID_COLUMN_BITMASK;

		if (!_setOriginalVacancyCandidateId) {
			_setOriginalVacancyCandidateId = true;

			_originalVacancyCandidateId = _vacancyCandidateId;
		}

		_vacancyCandidateId = vacancyCandidateId;
	}

	public long getOriginalVacancyCandidateId() {
		return _originalVacancyCandidateId;
	}

	@JSON
	@Override
	public long getInterviewId() {
		return _interviewId;
	}

	@Override
	public void setInterviewId(long interviewId) {
		_columnBitmask |= INTERVIEWID_COLUMN_BITMASK;

		if (!_setOriginalInterviewId) {
			_setOriginalInterviewId = true;

			_originalInterviewId = _interviewId;
		}

		_interviewId = interviewId;
	}

	public long getOriginalInterviewId() {
		return _originalInterviewId;
	}

	@JSON
	@Override
	public long getLocationId() {
		return _locationId;
	}

	@Override
	public void setLocationId(long locationId) {
		_locationId = locationId;
	}

	@JSON
	@Override
	public Date getInterviewDate() {
		return _interviewDate;
	}

	@Override
	public void setInterviewDate(Date interviewDate) {
		_interviewDate = interviewDate;
	}

	@JSON
	@Override
	public String getInterviewTime() {
		if (_interviewTime == null) {
			return StringPool.BLANK;
		}
		else {
			return _interviewTime;
		}
	}

	@Override
	public void setInterviewTime(String interviewTime) {
		_interviewTime = interviewTime;
	}

	@JSON
	@Override
	public String getStatus() {
		if (_status == null) {
			return StringPool.BLANK;
		}
		else {
			return _status;
		}
	}

	@Override
	public void setStatus(String status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (_originalStatus == null) {
			_originalStatus = _status;
		}

		_status = status;
	}

	public String getOriginalStatus() {
		return GetterUtil.getString(_originalStatus);
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return StringPool.BLANK;
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			InterviewSchedule.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public InterviewSchedule toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (InterviewSchedule)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		InterviewScheduleImpl interviewScheduleImpl = new InterviewScheduleImpl();

		interviewScheduleImpl.setInterviewScheduleId(getInterviewScheduleId());
		interviewScheduleImpl.setVacancyCandidateId(getVacancyCandidateId());
		interviewScheduleImpl.setInterviewId(getInterviewId());
		interviewScheduleImpl.setLocationId(getLocationId());
		interviewScheduleImpl.setInterviewDate(getInterviewDate());
		interviewScheduleImpl.setInterviewTime(getInterviewTime());
		interviewScheduleImpl.setStatus(getStatus());
		interviewScheduleImpl.setGroupId(getGroupId());
		interviewScheduleImpl.setCompanyId(getCompanyId());
		interviewScheduleImpl.setUserId(getUserId());
		interviewScheduleImpl.setUserName(getUserName());
		interviewScheduleImpl.setCreateDate(getCreateDate());
		interviewScheduleImpl.setModifiedDate(getModifiedDate());

		interviewScheduleImpl.resetOriginalValues();

		return interviewScheduleImpl;
	}

	@Override
	public int compareTo(InterviewSchedule interviewSchedule) {
		long primaryKey = interviewSchedule.getPrimaryKey();

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

		if (!(obj instanceof InterviewSchedule)) {
			return false;
		}

		InterviewSchedule interviewSchedule = (InterviewSchedule)obj;

		long primaryKey = interviewSchedule.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		InterviewScheduleModelImpl interviewScheduleModelImpl = this;

		interviewScheduleModelImpl._originalVacancyCandidateId = interviewScheduleModelImpl._vacancyCandidateId;

		interviewScheduleModelImpl._setOriginalVacancyCandidateId = false;

		interviewScheduleModelImpl._originalInterviewId = interviewScheduleModelImpl._interviewId;

		interviewScheduleModelImpl._setOriginalInterviewId = false;

		interviewScheduleModelImpl._originalStatus = interviewScheduleModelImpl._status;

		interviewScheduleModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<InterviewSchedule> toCacheModel() {
		InterviewScheduleCacheModel interviewScheduleCacheModel = new InterviewScheduleCacheModel();

		interviewScheduleCacheModel.interviewScheduleId = getInterviewScheduleId();

		interviewScheduleCacheModel.vacancyCandidateId = getVacancyCandidateId();

		interviewScheduleCacheModel.interviewId = getInterviewId();

		interviewScheduleCacheModel.locationId = getLocationId();

		Date interviewDate = getInterviewDate();

		if (interviewDate != null) {
			interviewScheduleCacheModel.interviewDate = interviewDate.getTime();
		}
		else {
			interviewScheduleCacheModel.interviewDate = Long.MIN_VALUE;
		}

		interviewScheduleCacheModel.interviewTime = getInterviewTime();

		String interviewTime = interviewScheduleCacheModel.interviewTime;

		if ((interviewTime != null) && (interviewTime.length() == 0)) {
			interviewScheduleCacheModel.interviewTime = null;
		}

		interviewScheduleCacheModel.status = getStatus();

		String status = interviewScheduleCacheModel.status;

		if ((status != null) && (status.length() == 0)) {
			interviewScheduleCacheModel.status = null;
		}

		interviewScheduleCacheModel.groupId = getGroupId();

		interviewScheduleCacheModel.companyId = getCompanyId();

		interviewScheduleCacheModel.userId = getUserId();

		interviewScheduleCacheModel.userName = getUserName();

		String userName = interviewScheduleCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			interviewScheduleCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			interviewScheduleCacheModel.createDate = createDate.getTime();
		}
		else {
			interviewScheduleCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			interviewScheduleCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			interviewScheduleCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return interviewScheduleCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(27);

		sb.append("{interviewScheduleId=");
		sb.append(getInterviewScheduleId());
		sb.append(", vacancyCandidateId=");
		sb.append(getVacancyCandidateId());
		sb.append(", interviewId=");
		sb.append(getInterviewId());
		sb.append(", locationId=");
		sb.append(getLocationId());
		sb.append(", interviewDate=");
		sb.append(getInterviewDate());
		sb.append(", interviewTime=");
		sb.append(getInterviewTime());
		sb.append(", status=");
		sb.append(getStatus());
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
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(43);

		sb.append("<model><model-name>");
		sb.append("vn.com.ecopharma.hrm.rc.model.InterviewSchedule");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>interviewScheduleId</column-name><column-value><![CDATA[");
		sb.append(getInterviewScheduleId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>vacancyCandidateId</column-name><column-value><![CDATA[");
		sb.append(getVacancyCandidateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>interviewId</column-name><column-value><![CDATA[");
		sb.append(getInterviewId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>locationId</column-name><column-value><![CDATA[");
		sb.append(getLocationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>interviewDate</column-name><column-value><![CDATA[");
		sb.append(getInterviewDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>interviewTime</column-name><column-value><![CDATA[");
		sb.append(getInterviewTime());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>status</column-name><column-value><![CDATA[");
		sb.append(getStatus());
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

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = InterviewSchedule.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			InterviewSchedule.class
		};
	private long _interviewScheduleId;
	private long _vacancyCandidateId;
	private long _originalVacancyCandidateId;
	private boolean _setOriginalVacancyCandidateId;
	private long _interviewId;
	private long _originalInterviewId;
	private boolean _setOriginalInterviewId;
	private long _locationId;
	private Date _interviewDate;
	private String _interviewTime;
	private String _status;
	private String _originalStatus;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _columnBitmask;
	private InterviewSchedule _escapedModel;
}