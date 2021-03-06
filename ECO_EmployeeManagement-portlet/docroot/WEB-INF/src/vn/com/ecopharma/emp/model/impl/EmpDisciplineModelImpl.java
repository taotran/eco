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

import vn.com.ecopharma.emp.model.EmpDiscipline;
import vn.com.ecopharma.emp.model.EmpDisciplineModel;
import vn.com.ecopharma.emp.model.EmpDisciplineSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the EmpDiscipline service. Represents a row in the &quot;eco_em_portlet_EmpDiscipline&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.com.ecopharma.emp.model.EmpDisciplineModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmpDisciplineImpl}.
 * </p>
 *
 * @author tvt
 * @see EmpDisciplineImpl
 * @see vn.com.ecopharma.emp.model.EmpDiscipline
 * @see vn.com.ecopharma.emp.model.EmpDisciplineModel
 * @generated
 */
@JSON(strict = true)
public class EmpDisciplineModelImpl extends BaseModelImpl<EmpDiscipline>
	implements EmpDisciplineModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a emp discipline model instance should use the {@link vn.com.ecopharma.emp.model.EmpDiscipline} interface instead.
	 */
	public static final String TABLE_NAME = "eco_em_portlet_EmpDiscipline";
	public static final Object[][] TABLE_COLUMNS = {
			{ "empDisciplineId", Types.BIGINT },
			{ "empId", Types.BIGINT },
			{ "decisionNo", Types.VARCHAR },
			{ "content", Types.VARCHAR },
			{ "disciplineType", Types.VARCHAR },
			{ "effectiveDate", Types.TIMESTAMP },
			{ "additionalDisciplineType", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP },
			{ "deleted", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table eco_em_portlet_EmpDiscipline (empDisciplineId LONG not null primary key,empId LONG,decisionNo VARCHAR(75) null,content VARCHAR(1000) null,disciplineType VARCHAR(75) null,effectiveDate DATE null,additionalDisciplineType VARCHAR(75) null,description VARCHAR(75) null,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,deleted BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table eco_em_portlet_EmpDiscipline";
	public static final String ORDER_BY_JPQL = " ORDER BY empDiscipline.empDisciplineId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY eco_em_portlet_EmpDiscipline.empDisciplineId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.com.ecopharma.emp.model.EmpDiscipline"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.com.ecopharma.emp.model.EmpDiscipline"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = false;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static EmpDiscipline toModel(EmpDisciplineSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		EmpDiscipline model = new EmpDisciplineImpl();

		model.setEmpDisciplineId(soapModel.getEmpDisciplineId());
		model.setEmpId(soapModel.getEmpId());
		model.setDecisionNo(soapModel.getDecisionNo());
		model.setContent(soapModel.getContent());
		model.setDisciplineType(soapModel.getDisciplineType());
		model.setEffectiveDate(soapModel.getEffectiveDate());
		model.setAdditionalDisciplineType(soapModel.getAdditionalDisciplineType());
		model.setDescription(soapModel.getDescription());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setDeleted(soapModel.getDeleted());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<EmpDiscipline> toModels(EmpDisciplineSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<EmpDiscipline> models = new ArrayList<EmpDiscipline>(soapModels.length);

		for (EmpDisciplineSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.com.ecopharma.emp.model.EmpDiscipline"));

	public EmpDisciplineModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _empDisciplineId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmpDisciplineId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _empDisciplineId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return EmpDiscipline.class;
	}

	@Override
	public String getModelClassName() {
		return EmpDiscipline.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("empDisciplineId", getEmpDisciplineId());
		attributes.put("empId", getEmpId());
		attributes.put("decisionNo", getDecisionNo());
		attributes.put("content", getContent());
		attributes.put("disciplineType", getDisciplineType());
		attributes.put("effectiveDate", getEffectiveDate());
		attributes.put("additionalDisciplineType", getAdditionalDisciplineType());
		attributes.put("description", getDescription());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("deleted", getDeleted());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Long empDisciplineId = (Long)attributes.get("empDisciplineId");

		if (empDisciplineId != null) {
			setEmpDisciplineId(empDisciplineId);
		}

		Long empId = (Long)attributes.get("empId");

		if (empId != null) {
			setEmpId(empId);
		}

		String decisionNo = (String)attributes.get("decisionNo");

		if (decisionNo != null) {
			setDecisionNo(decisionNo);
		}

		String content = (String)attributes.get("content");

		if (content != null) {
			setContent(content);
		}

		String disciplineType = (String)attributes.get("disciplineType");

		if (disciplineType != null) {
			setDisciplineType(disciplineType);
		}

		Date effectiveDate = (Date)attributes.get("effectiveDate");

		if (effectiveDate != null) {
			setEffectiveDate(effectiveDate);
		}

		String additionalDisciplineType = (String)attributes.get(
				"additionalDisciplineType");

		if (additionalDisciplineType != null) {
			setAdditionalDisciplineType(additionalDisciplineType);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
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

		Boolean deleted = (Boolean)attributes.get("deleted");

		if (deleted != null) {
			setDeleted(deleted);
		}
	}

	@JSON
	@Override
	public long getEmpDisciplineId() {
		return _empDisciplineId;
	}

	@Override
	public void setEmpDisciplineId(long empDisciplineId) {
		_empDisciplineId = empDisciplineId;
	}

	@JSON
	@Override
	public long getEmpId() {
		return _empId;
	}

	@Override
	public void setEmpId(long empId) {
		_empId = empId;
	}

	@JSON
	@Override
	public String getDecisionNo() {
		if (_decisionNo == null) {
			return StringPool.BLANK;
		}
		else {
			return _decisionNo;
		}
	}

	@Override
	public void setDecisionNo(String decisionNo) {
		_decisionNo = decisionNo;
	}

	@JSON
	@Override
	public String getContent() {
		if (_content == null) {
			return StringPool.BLANK;
		}
		else {
			return _content;
		}
	}

	@Override
	public void setContent(String content) {
		_content = content;
	}

	@JSON
	@Override
	public String getDisciplineType() {
		if (_disciplineType == null) {
			return StringPool.BLANK;
		}
		else {
			return _disciplineType;
		}
	}

	@Override
	public void setDisciplineType(String disciplineType) {
		_disciplineType = disciplineType;
	}

	@JSON
	@Override
	public Date getEffectiveDate() {
		return _effectiveDate;
	}

	@Override
	public void setEffectiveDate(Date effectiveDate) {
		_effectiveDate = effectiveDate;
	}

	@JSON
	@Override
	public String getAdditionalDisciplineType() {
		if (_additionalDisciplineType == null) {
			return StringPool.BLANK;
		}
		else {
			return _additionalDisciplineType;
		}
	}

	@Override
	public void setAdditionalDisciplineType(String additionalDisciplineType) {
		_additionalDisciplineType = additionalDisciplineType;
	}

	@JSON
	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
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

	@JSON
	@Override
	public boolean getDeleted() {
		return _deleted;
	}

	@Override
	public boolean isDeleted() {
		return _deleted;
	}

	@Override
	public void setDeleted(boolean deleted) {
		_deleted = deleted;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			EmpDiscipline.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EmpDiscipline toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EmpDiscipline)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmpDisciplineImpl empDisciplineImpl = new EmpDisciplineImpl();

		empDisciplineImpl.setEmpDisciplineId(getEmpDisciplineId());
		empDisciplineImpl.setEmpId(getEmpId());
		empDisciplineImpl.setDecisionNo(getDecisionNo());
		empDisciplineImpl.setContent(getContent());
		empDisciplineImpl.setDisciplineType(getDisciplineType());
		empDisciplineImpl.setEffectiveDate(getEffectiveDate());
		empDisciplineImpl.setAdditionalDisciplineType(getAdditionalDisciplineType());
		empDisciplineImpl.setDescription(getDescription());
		empDisciplineImpl.setGroupId(getGroupId());
		empDisciplineImpl.setCompanyId(getCompanyId());
		empDisciplineImpl.setUserId(getUserId());
		empDisciplineImpl.setUserName(getUserName());
		empDisciplineImpl.setCreateDate(getCreateDate());
		empDisciplineImpl.setModifiedDate(getModifiedDate());
		empDisciplineImpl.setDeleted(getDeleted());

		empDisciplineImpl.resetOriginalValues();

		return empDisciplineImpl;
	}

	@Override
	public int compareTo(EmpDiscipline empDiscipline) {
		long primaryKey = empDiscipline.getPrimaryKey();

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

		if (!(obj instanceof EmpDiscipline)) {
			return false;
		}

		EmpDiscipline empDiscipline = (EmpDiscipline)obj;

		long primaryKey = empDiscipline.getPrimaryKey();

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
	}

	@Override
	public CacheModel<EmpDiscipline> toCacheModel() {
		EmpDisciplineCacheModel empDisciplineCacheModel = new EmpDisciplineCacheModel();

		empDisciplineCacheModel.empDisciplineId = getEmpDisciplineId();

		empDisciplineCacheModel.empId = getEmpId();

		empDisciplineCacheModel.decisionNo = getDecisionNo();

		String decisionNo = empDisciplineCacheModel.decisionNo;

		if ((decisionNo != null) && (decisionNo.length() == 0)) {
			empDisciplineCacheModel.decisionNo = null;
		}

		empDisciplineCacheModel.content = getContent();

		String content = empDisciplineCacheModel.content;

		if ((content != null) && (content.length() == 0)) {
			empDisciplineCacheModel.content = null;
		}

		empDisciplineCacheModel.disciplineType = getDisciplineType();

		String disciplineType = empDisciplineCacheModel.disciplineType;

		if ((disciplineType != null) && (disciplineType.length() == 0)) {
			empDisciplineCacheModel.disciplineType = null;
		}

		Date effectiveDate = getEffectiveDate();

		if (effectiveDate != null) {
			empDisciplineCacheModel.effectiveDate = effectiveDate.getTime();
		}
		else {
			empDisciplineCacheModel.effectiveDate = Long.MIN_VALUE;
		}

		empDisciplineCacheModel.additionalDisciplineType = getAdditionalDisciplineType();

		String additionalDisciplineType = empDisciplineCacheModel.additionalDisciplineType;

		if ((additionalDisciplineType != null) &&
				(additionalDisciplineType.length() == 0)) {
			empDisciplineCacheModel.additionalDisciplineType = null;
		}

		empDisciplineCacheModel.description = getDescription();

		String description = empDisciplineCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			empDisciplineCacheModel.description = null;
		}

		empDisciplineCacheModel.groupId = getGroupId();

		empDisciplineCacheModel.companyId = getCompanyId();

		empDisciplineCacheModel.userId = getUserId();

		empDisciplineCacheModel.userName = getUserName();

		String userName = empDisciplineCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			empDisciplineCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			empDisciplineCacheModel.createDate = createDate.getTime();
		}
		else {
			empDisciplineCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			empDisciplineCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			empDisciplineCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		empDisciplineCacheModel.deleted = getDeleted();

		return empDisciplineCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(31);

		sb.append("{empDisciplineId=");
		sb.append(getEmpDisciplineId());
		sb.append(", empId=");
		sb.append(getEmpId());
		sb.append(", decisionNo=");
		sb.append(getDecisionNo());
		sb.append(", content=");
		sb.append(getContent());
		sb.append(", disciplineType=");
		sb.append(getDisciplineType());
		sb.append(", effectiveDate=");
		sb.append(getEffectiveDate());
		sb.append(", additionalDisciplineType=");
		sb.append(getAdditionalDisciplineType());
		sb.append(", description=");
		sb.append(getDescription());
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
		sb.append(", deleted=");
		sb.append(getDeleted());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(49);

		sb.append("<model><model-name>");
		sb.append("vn.com.ecopharma.emp.model.EmpDiscipline");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>empDisciplineId</column-name><column-value><![CDATA[");
		sb.append(getEmpDisciplineId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>empId</column-name><column-value><![CDATA[");
		sb.append(getEmpId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>decisionNo</column-name><column-value><![CDATA[");
		sb.append(getDecisionNo());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>content</column-name><column-value><![CDATA[");
		sb.append(getContent());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>disciplineType</column-name><column-value><![CDATA[");
		sb.append(getDisciplineType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>effectiveDate</column-name><column-value><![CDATA[");
		sb.append(getEffectiveDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>additionalDisciplineType</column-name><column-value><![CDATA[");
		sb.append(getAdditionalDisciplineType());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
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
		sb.append(
			"<column><column-name>deleted</column-name><column-value><![CDATA[");
		sb.append(getDeleted());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = EmpDiscipline.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EmpDiscipline.class
		};
	private long _empDisciplineId;
	private long _empId;
	private String _decisionNo;
	private String _content;
	private String _disciplineType;
	private Date _effectiveDate;
	private String _additionalDisciplineType;
	private String _description;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _deleted;
	private EmpDiscipline _escapedModel;
}