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

import vn.com.ecopharma.hrm.rc.model.CandidateEvaluation;
import vn.com.ecopharma.hrm.rc.model.CandidateEvaluationModel;
import vn.com.ecopharma.hrm.rc.model.CandidateEvaluationSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the CandidateEvaluation service. Represents a row in the &quot;eco_rcp_CandidateEvaluation&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.com.ecopharma.hrm.rc.model.CandidateEvaluationModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link CandidateEvaluationImpl}.
 * </p>
 *
 * @author tvt
 * @see CandidateEvaluationImpl
 * @see vn.com.ecopharma.hrm.rc.model.CandidateEvaluation
 * @see vn.com.ecopharma.hrm.rc.model.CandidateEvaluationModel
 * @generated
 */
@JSON(strict = true)
public class CandidateEvaluationModelImpl extends BaseModelImpl<CandidateEvaluation>
	implements CandidateEvaluationModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a candidate evaluation model instance should use the {@link vn.com.ecopharma.hrm.rc.model.CandidateEvaluation} interface instead.
	 */
	public static final String TABLE_NAME = "eco_rcp_CandidateEvaluation";
	public static final Object[][] TABLE_COLUMNS = {
			{ "candidateEvaluationId", Types.BIGINT },
			{ "candidateId", Types.BIGINT },
			{ "interviewId", Types.BIGINT },
			{ "evaluationCriteriaKeyValueId", Types.BIGINT },
			{ "ratingPoint", Types.INTEGER },
			{ "note", Types.VARCHAR },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table eco_rcp_CandidateEvaluation (candidateEvaluationId LONG not null primary key,candidateId LONG,interviewId LONG,evaluationCriteriaKeyValueId LONG,ratingPoint INTEGER,note VARCHAR(75) null,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table eco_rcp_CandidateEvaluation";
	public static final String ORDER_BY_JPQL = " ORDER BY candidateEvaluation.candidateEvaluationId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY eco_rcp_CandidateEvaluation.candidateEvaluationId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.com.ecopharma.hrm.rc.model.CandidateEvaluation"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.com.ecopharma.hrm.rc.model.CandidateEvaluation"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.com.ecopharma.hrm.rc.model.CandidateEvaluation"),
			true);
	public static long CANDIDATEID_COLUMN_BITMASK = 1L;
	public static long EVALUATIONCRITERIAKEYVALUEID_COLUMN_BITMASK = 2L;
	public static long INTERVIEWID_COLUMN_BITMASK = 4L;
	public static long CANDIDATEEVALUATIONID_COLUMN_BITMASK = 8L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static CandidateEvaluation toModel(CandidateEvaluationSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		CandidateEvaluation model = new CandidateEvaluationImpl();

		model.setCandidateEvaluationId(soapModel.getCandidateEvaluationId());
		model.setCandidateId(soapModel.getCandidateId());
		model.setInterviewId(soapModel.getInterviewId());
		model.setEvaluationCriteriaKeyValueId(soapModel.getEvaluationCriteriaKeyValueId());
		model.setRatingPoint(soapModel.getRatingPoint());
		model.setNote(soapModel.getNote());
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
	public static List<CandidateEvaluation> toModels(
		CandidateEvaluationSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<CandidateEvaluation> models = new ArrayList<CandidateEvaluation>(soapModels.length);

		for (CandidateEvaluationSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.com.ecopharma.hrm.rc.model.CandidateEvaluation"));

	public CandidateEvaluationModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _candidateEvaluationId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setCandidateEvaluationId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _candidateEvaluationId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return CandidateEvaluation.class;
	}

	@Override
	public String getModelClassName() {
		return CandidateEvaluation.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("candidateEvaluationId", getCandidateEvaluationId());
		attributes.put("candidateId", getCandidateId());
		attributes.put("interviewId", getInterviewId());
		attributes.put("evaluationCriteriaKeyValueId",
			getEvaluationCriteriaKeyValueId());
		attributes.put("ratingPoint", getRatingPoint());
		attributes.put("note", getNote());
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
		Long candidateEvaluationId = (Long)attributes.get(
				"candidateEvaluationId");

		if (candidateEvaluationId != null) {
			setCandidateEvaluationId(candidateEvaluationId);
		}

		Long candidateId = (Long)attributes.get("candidateId");

		if (candidateId != null) {
			setCandidateId(candidateId);
		}

		Long interviewId = (Long)attributes.get("interviewId");

		if (interviewId != null) {
			setInterviewId(interviewId);
		}

		Long evaluationCriteriaKeyValueId = (Long)attributes.get(
				"evaluationCriteriaKeyValueId");

		if (evaluationCriteriaKeyValueId != null) {
			setEvaluationCriteriaKeyValueId(evaluationCriteriaKeyValueId);
		}

		Integer ratingPoint = (Integer)attributes.get("ratingPoint");

		if (ratingPoint != null) {
			setRatingPoint(ratingPoint);
		}

		String note = (String)attributes.get("note");

		if (note != null) {
			setNote(note);
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
	public long getCandidateEvaluationId() {
		return _candidateEvaluationId;
	}

	@Override
	public void setCandidateEvaluationId(long candidateEvaluationId) {
		_candidateEvaluationId = candidateEvaluationId;
	}

	@JSON
	@Override
	public long getCandidateId() {
		return _candidateId;
	}

	@Override
	public void setCandidateId(long candidateId) {
		_columnBitmask |= CANDIDATEID_COLUMN_BITMASK;

		if (!_setOriginalCandidateId) {
			_setOriginalCandidateId = true;

			_originalCandidateId = _candidateId;
		}

		_candidateId = candidateId;
	}

	public long getOriginalCandidateId() {
		return _originalCandidateId;
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
	public long getEvaluationCriteriaKeyValueId() {
		return _evaluationCriteriaKeyValueId;
	}

	@Override
	public void setEvaluationCriteriaKeyValueId(
		long evaluationCriteriaKeyValueId) {
		_columnBitmask |= EVALUATIONCRITERIAKEYVALUEID_COLUMN_BITMASK;

		if (!_setOriginalEvaluationCriteriaKeyValueId) {
			_setOriginalEvaluationCriteriaKeyValueId = true;

			_originalEvaluationCriteriaKeyValueId = _evaluationCriteriaKeyValueId;
		}

		_evaluationCriteriaKeyValueId = evaluationCriteriaKeyValueId;
	}

	public long getOriginalEvaluationCriteriaKeyValueId() {
		return _originalEvaluationCriteriaKeyValueId;
	}

	@JSON
	@Override
	public int getRatingPoint() {
		return _ratingPoint;
	}

	@Override
	public void setRatingPoint(int ratingPoint) {
		_ratingPoint = ratingPoint;
	}

	@JSON
	@Override
	public String getNote() {
		if (_note == null) {
			return StringPool.BLANK;
		}
		else {
			return _note;
		}
	}

	@Override
	public void setNote(String note) {
		_note = note;
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
			CandidateEvaluation.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public CandidateEvaluation toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (CandidateEvaluation)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		CandidateEvaluationImpl candidateEvaluationImpl = new CandidateEvaluationImpl();

		candidateEvaluationImpl.setCandidateEvaluationId(getCandidateEvaluationId());
		candidateEvaluationImpl.setCandidateId(getCandidateId());
		candidateEvaluationImpl.setInterviewId(getInterviewId());
		candidateEvaluationImpl.setEvaluationCriteriaKeyValueId(getEvaluationCriteriaKeyValueId());
		candidateEvaluationImpl.setRatingPoint(getRatingPoint());
		candidateEvaluationImpl.setNote(getNote());
		candidateEvaluationImpl.setGroupId(getGroupId());
		candidateEvaluationImpl.setCompanyId(getCompanyId());
		candidateEvaluationImpl.setUserId(getUserId());
		candidateEvaluationImpl.setUserName(getUserName());
		candidateEvaluationImpl.setCreateDate(getCreateDate());
		candidateEvaluationImpl.setModifiedDate(getModifiedDate());

		candidateEvaluationImpl.resetOriginalValues();

		return candidateEvaluationImpl;
	}

	@Override
	public int compareTo(CandidateEvaluation candidateEvaluation) {
		long primaryKey = candidateEvaluation.getPrimaryKey();

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

		if (!(obj instanceof CandidateEvaluation)) {
			return false;
		}

		CandidateEvaluation candidateEvaluation = (CandidateEvaluation)obj;

		long primaryKey = candidateEvaluation.getPrimaryKey();

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
		CandidateEvaluationModelImpl candidateEvaluationModelImpl = this;

		candidateEvaluationModelImpl._originalCandidateId = candidateEvaluationModelImpl._candidateId;

		candidateEvaluationModelImpl._setOriginalCandidateId = false;

		candidateEvaluationModelImpl._originalInterviewId = candidateEvaluationModelImpl._interviewId;

		candidateEvaluationModelImpl._setOriginalInterviewId = false;

		candidateEvaluationModelImpl._originalEvaluationCriteriaKeyValueId = candidateEvaluationModelImpl._evaluationCriteriaKeyValueId;

		candidateEvaluationModelImpl._setOriginalEvaluationCriteriaKeyValueId = false;

		candidateEvaluationModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<CandidateEvaluation> toCacheModel() {
		CandidateEvaluationCacheModel candidateEvaluationCacheModel = new CandidateEvaluationCacheModel();

		candidateEvaluationCacheModel.candidateEvaluationId = getCandidateEvaluationId();

		candidateEvaluationCacheModel.candidateId = getCandidateId();

		candidateEvaluationCacheModel.interviewId = getInterviewId();

		candidateEvaluationCacheModel.evaluationCriteriaKeyValueId = getEvaluationCriteriaKeyValueId();

		candidateEvaluationCacheModel.ratingPoint = getRatingPoint();

		candidateEvaluationCacheModel.note = getNote();

		String note = candidateEvaluationCacheModel.note;

		if ((note != null) && (note.length() == 0)) {
			candidateEvaluationCacheModel.note = null;
		}

		candidateEvaluationCacheModel.groupId = getGroupId();

		candidateEvaluationCacheModel.companyId = getCompanyId();

		candidateEvaluationCacheModel.userId = getUserId();

		candidateEvaluationCacheModel.userName = getUserName();

		String userName = candidateEvaluationCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			candidateEvaluationCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			candidateEvaluationCacheModel.createDate = createDate.getTime();
		}
		else {
			candidateEvaluationCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			candidateEvaluationCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			candidateEvaluationCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return candidateEvaluationCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{candidateEvaluationId=");
		sb.append(getCandidateEvaluationId());
		sb.append(", candidateId=");
		sb.append(getCandidateId());
		sb.append(", interviewId=");
		sb.append(getInterviewId());
		sb.append(", evaluationCriteriaKeyValueId=");
		sb.append(getEvaluationCriteriaKeyValueId());
		sb.append(", ratingPoint=");
		sb.append(getRatingPoint());
		sb.append(", note=");
		sb.append(getNote());
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
		StringBundler sb = new StringBundler(40);

		sb.append("<model><model-name>");
		sb.append("vn.com.ecopharma.hrm.rc.model.CandidateEvaluation");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>candidateEvaluationId</column-name><column-value><![CDATA[");
		sb.append(getCandidateEvaluationId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>candidateId</column-name><column-value><![CDATA[");
		sb.append(getCandidateId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>interviewId</column-name><column-value><![CDATA[");
		sb.append(getInterviewId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluationCriteriaKeyValueId</column-name><column-value><![CDATA[");
		sb.append(getEvaluationCriteriaKeyValueId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>ratingPoint</column-name><column-value><![CDATA[");
		sb.append(getRatingPoint());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>note</column-name><column-value><![CDATA[");
		sb.append(getNote());
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

	private static ClassLoader _classLoader = CandidateEvaluation.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			CandidateEvaluation.class
		};
	private long _candidateEvaluationId;
	private long _candidateId;
	private long _originalCandidateId;
	private boolean _setOriginalCandidateId;
	private long _interviewId;
	private long _originalInterviewId;
	private boolean _setOriginalInterviewId;
	private long _evaluationCriteriaKeyValueId;
	private long _originalEvaluationCriteriaKeyValueId;
	private boolean _setOriginalEvaluationCriteriaKeyValueId;
	private int _ratingPoint;
	private String _note;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _columnBitmask;
	private CandidateEvaluation _escapedModel;
}