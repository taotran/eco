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

import vn.com.ecopharma.emp.model.EmpOrgRelationship;
import vn.com.ecopharma.emp.model.EmpOrgRelationshipModel;
import vn.com.ecopharma.emp.model.EmpOrgRelationshipSoap;

import java.io.Serializable;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * The base model implementation for the EmpOrgRelationship service. Represents a row in the &quot;eco_em_portlet_EmpOrgRelationship&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link vn.com.ecopharma.emp.model.EmpOrgRelationshipModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EmpOrgRelationshipImpl}.
 * </p>
 *
 * @author tvt
 * @see EmpOrgRelationshipImpl
 * @see vn.com.ecopharma.emp.model.EmpOrgRelationship
 * @see vn.com.ecopharma.emp.model.EmpOrgRelationshipModel
 * @generated
 */
@JSON(strict = true)
public class EmpOrgRelationshipModelImpl extends BaseModelImpl<EmpOrgRelationship>
	implements EmpOrgRelationshipModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a emp org relationship model instance should use the {@link vn.com.ecopharma.emp.model.EmpOrgRelationship} interface instead.
	 */
	public static final String TABLE_NAME = "eco_em_portlet_EmpOrgRelationship";
	public static final Object[][] TABLE_COLUMNS = {
			{ "empOrgRelationshipId", Types.BIGINT },
			{ "empId", Types.BIGINT },
			{ "orgClassName", Types.VARCHAR },
			{ "orgClassPK", Types.BIGINT },
			{ "headOfOrg", Types.BOOLEAN },
			{ "deputyOfOrg", Types.BOOLEAN },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "userName", Types.VARCHAR },
			{ "createDate", Types.TIMESTAMP },
			{ "modifiedDate", Types.TIMESTAMP }
		};
	public static final String TABLE_SQL_CREATE = "create table eco_em_portlet_EmpOrgRelationship (empOrgRelationshipId LONG not null primary key,empId LONG,orgClassName VARCHAR(75) null,orgClassPK LONG,headOfOrg BOOLEAN,deputyOfOrg BOOLEAN,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null)";
	public static final String TABLE_SQL_DROP = "drop table eco_em_portlet_EmpOrgRelationship";
	public static final String ORDER_BY_JPQL = " ORDER BY empOrgRelationship.empOrgRelationshipId ASC";
	public static final String ORDER_BY_SQL = " ORDER BY eco_em_portlet_EmpOrgRelationship.empOrgRelationshipId ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.vn.com.ecopharma.emp.model.EmpOrgRelationship"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.vn.com.ecopharma.emp.model.EmpOrgRelationship"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.vn.com.ecopharma.emp.model.EmpOrgRelationship"),
			true);
	public static long DEPUTYOFORG_COLUMN_BITMASK = 1L;
	public static long EMPID_COLUMN_BITMASK = 2L;
	public static long HEADOFORG_COLUMN_BITMASK = 4L;
	public static long ORGCLASSNAME_COLUMN_BITMASK = 8L;
	public static long ORGCLASSPK_COLUMN_BITMASK = 16L;
	public static long EMPORGRELATIONSHIPID_COLUMN_BITMASK = 32L;

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static EmpOrgRelationship toModel(EmpOrgRelationshipSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		EmpOrgRelationship model = new EmpOrgRelationshipImpl();

		model.setEmpOrgRelationshipId(soapModel.getEmpOrgRelationshipId());
		model.setEmpId(soapModel.getEmpId());
		model.setOrgClassName(soapModel.getOrgClassName());
		model.setOrgClassPK(soapModel.getOrgClassPK());
		model.setHeadOfOrg(soapModel.getHeadOfOrg());
		model.setDeputyOfOrg(soapModel.getDeputyOfOrg());
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
	public static List<EmpOrgRelationship> toModels(
		EmpOrgRelationshipSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<EmpOrgRelationship> models = new ArrayList<EmpOrgRelationship>(soapModels.length);

		for (EmpOrgRelationshipSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.vn.com.ecopharma.emp.model.EmpOrgRelationship"));

	public EmpOrgRelationshipModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _empOrgRelationshipId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEmpOrgRelationshipId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _empOrgRelationshipId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return EmpOrgRelationship.class;
	}

	@Override
	public String getModelClassName() {
		return EmpOrgRelationship.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("empOrgRelationshipId", getEmpOrgRelationshipId());
		attributes.put("empId", getEmpId());
		attributes.put("orgClassName", getOrgClassName());
		attributes.put("orgClassPK", getOrgClassPK());
		attributes.put("headOfOrg", getHeadOfOrg());
		attributes.put("deputyOfOrg", getDeputyOfOrg());
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
		Long empOrgRelationshipId = (Long)attributes.get("empOrgRelationshipId");

		if (empOrgRelationshipId != null) {
			setEmpOrgRelationshipId(empOrgRelationshipId);
		}

		Long empId = (Long)attributes.get("empId");

		if (empId != null) {
			setEmpId(empId);
		}

		String orgClassName = (String)attributes.get("orgClassName");

		if (orgClassName != null) {
			setOrgClassName(orgClassName);
		}

		Long orgClassPK = (Long)attributes.get("orgClassPK");

		if (orgClassPK != null) {
			setOrgClassPK(orgClassPK);
		}

		Boolean headOfOrg = (Boolean)attributes.get("headOfOrg");

		if (headOfOrg != null) {
			setHeadOfOrg(headOfOrg);
		}

		Boolean deputyOfOrg = (Boolean)attributes.get("deputyOfOrg");

		if (deputyOfOrg != null) {
			setDeputyOfOrg(deputyOfOrg);
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
	public long getEmpOrgRelationshipId() {
		return _empOrgRelationshipId;
	}

	@Override
	public void setEmpOrgRelationshipId(long empOrgRelationshipId) {
		_empOrgRelationshipId = empOrgRelationshipId;
	}

	@JSON
	@Override
	public long getEmpId() {
		return _empId;
	}

	@Override
	public void setEmpId(long empId) {
		_columnBitmask |= EMPID_COLUMN_BITMASK;

		if (!_setOriginalEmpId) {
			_setOriginalEmpId = true;

			_originalEmpId = _empId;
		}

		_empId = empId;
	}

	public long getOriginalEmpId() {
		return _originalEmpId;
	}

	@JSON
	@Override
	public String getOrgClassName() {
		if (_orgClassName == null) {
			return StringPool.BLANK;
		}
		else {
			return _orgClassName;
		}
	}

	@Override
	public void setOrgClassName(String orgClassName) {
		_columnBitmask |= ORGCLASSNAME_COLUMN_BITMASK;

		if (_originalOrgClassName == null) {
			_originalOrgClassName = _orgClassName;
		}

		_orgClassName = orgClassName;
	}

	public String getOriginalOrgClassName() {
		return GetterUtil.getString(_originalOrgClassName);
	}

	@JSON
	@Override
	public long getOrgClassPK() {
		return _orgClassPK;
	}

	@Override
	public void setOrgClassPK(long orgClassPK) {
		_columnBitmask |= ORGCLASSPK_COLUMN_BITMASK;

		if (!_setOriginalOrgClassPK) {
			_setOriginalOrgClassPK = true;

			_originalOrgClassPK = _orgClassPK;
		}

		_orgClassPK = orgClassPK;
	}

	public long getOriginalOrgClassPK() {
		return _originalOrgClassPK;
	}

	@JSON
	@Override
	public boolean getHeadOfOrg() {
		return _headOfOrg;
	}

	@Override
	public boolean isHeadOfOrg() {
		return _headOfOrg;
	}

	@Override
	public void setHeadOfOrg(boolean headOfOrg) {
		_columnBitmask |= HEADOFORG_COLUMN_BITMASK;

		if (!_setOriginalHeadOfOrg) {
			_setOriginalHeadOfOrg = true;

			_originalHeadOfOrg = _headOfOrg;
		}

		_headOfOrg = headOfOrg;
	}

	public boolean getOriginalHeadOfOrg() {
		return _originalHeadOfOrg;
	}

	@JSON
	@Override
	public boolean getDeputyOfOrg() {
		return _deputyOfOrg;
	}

	@Override
	public boolean isDeputyOfOrg() {
		return _deputyOfOrg;
	}

	@Override
	public void setDeputyOfOrg(boolean deputyOfOrg) {
		_columnBitmask |= DEPUTYOFORG_COLUMN_BITMASK;

		if (!_setOriginalDeputyOfOrg) {
			_setOriginalDeputyOfOrg = true;

			_originalDeputyOfOrg = _deputyOfOrg;
		}

		_deputyOfOrg = deputyOfOrg;
	}

	public boolean getOriginalDeputyOfOrg() {
		return _originalDeputyOfOrg;
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
			EmpOrgRelationship.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public EmpOrgRelationship toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (EmpOrgRelationship)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EmpOrgRelationshipImpl empOrgRelationshipImpl = new EmpOrgRelationshipImpl();

		empOrgRelationshipImpl.setEmpOrgRelationshipId(getEmpOrgRelationshipId());
		empOrgRelationshipImpl.setEmpId(getEmpId());
		empOrgRelationshipImpl.setOrgClassName(getOrgClassName());
		empOrgRelationshipImpl.setOrgClassPK(getOrgClassPK());
		empOrgRelationshipImpl.setHeadOfOrg(getHeadOfOrg());
		empOrgRelationshipImpl.setDeputyOfOrg(getDeputyOfOrg());
		empOrgRelationshipImpl.setGroupId(getGroupId());
		empOrgRelationshipImpl.setCompanyId(getCompanyId());
		empOrgRelationshipImpl.setUserId(getUserId());
		empOrgRelationshipImpl.setUserName(getUserName());
		empOrgRelationshipImpl.setCreateDate(getCreateDate());
		empOrgRelationshipImpl.setModifiedDate(getModifiedDate());

		empOrgRelationshipImpl.resetOriginalValues();

		return empOrgRelationshipImpl;
	}

	@Override
	public int compareTo(EmpOrgRelationship empOrgRelationship) {
		long primaryKey = empOrgRelationship.getPrimaryKey();

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

		if (!(obj instanceof EmpOrgRelationship)) {
			return false;
		}

		EmpOrgRelationship empOrgRelationship = (EmpOrgRelationship)obj;

		long primaryKey = empOrgRelationship.getPrimaryKey();

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
		EmpOrgRelationshipModelImpl empOrgRelationshipModelImpl = this;

		empOrgRelationshipModelImpl._originalEmpId = empOrgRelationshipModelImpl._empId;

		empOrgRelationshipModelImpl._setOriginalEmpId = false;

		empOrgRelationshipModelImpl._originalOrgClassName = empOrgRelationshipModelImpl._orgClassName;

		empOrgRelationshipModelImpl._originalOrgClassPK = empOrgRelationshipModelImpl._orgClassPK;

		empOrgRelationshipModelImpl._setOriginalOrgClassPK = false;

		empOrgRelationshipModelImpl._originalHeadOfOrg = empOrgRelationshipModelImpl._headOfOrg;

		empOrgRelationshipModelImpl._setOriginalHeadOfOrg = false;

		empOrgRelationshipModelImpl._originalDeputyOfOrg = empOrgRelationshipModelImpl._deputyOfOrg;

		empOrgRelationshipModelImpl._setOriginalDeputyOfOrg = false;

		empOrgRelationshipModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<EmpOrgRelationship> toCacheModel() {
		EmpOrgRelationshipCacheModel empOrgRelationshipCacheModel = new EmpOrgRelationshipCacheModel();

		empOrgRelationshipCacheModel.empOrgRelationshipId = getEmpOrgRelationshipId();

		empOrgRelationshipCacheModel.empId = getEmpId();

		empOrgRelationshipCacheModel.orgClassName = getOrgClassName();

		String orgClassName = empOrgRelationshipCacheModel.orgClassName;

		if ((orgClassName != null) && (orgClassName.length() == 0)) {
			empOrgRelationshipCacheModel.orgClassName = null;
		}

		empOrgRelationshipCacheModel.orgClassPK = getOrgClassPK();

		empOrgRelationshipCacheModel.headOfOrg = getHeadOfOrg();

		empOrgRelationshipCacheModel.deputyOfOrg = getDeputyOfOrg();

		empOrgRelationshipCacheModel.groupId = getGroupId();

		empOrgRelationshipCacheModel.companyId = getCompanyId();

		empOrgRelationshipCacheModel.userId = getUserId();

		empOrgRelationshipCacheModel.userName = getUserName();

		String userName = empOrgRelationshipCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			empOrgRelationshipCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			empOrgRelationshipCacheModel.createDate = createDate.getTime();
		}
		else {
			empOrgRelationshipCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			empOrgRelationshipCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			empOrgRelationshipCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		return empOrgRelationshipCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(25);

		sb.append("{empOrgRelationshipId=");
		sb.append(getEmpOrgRelationshipId());
		sb.append(", empId=");
		sb.append(getEmpId());
		sb.append(", orgClassName=");
		sb.append(getOrgClassName());
		sb.append(", orgClassPK=");
		sb.append(getOrgClassPK());
		sb.append(", headOfOrg=");
		sb.append(getHeadOfOrg());
		sb.append(", deputyOfOrg=");
		sb.append(getDeputyOfOrg());
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
		sb.append("vn.com.ecopharma.emp.model.EmpOrgRelationship");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>empOrgRelationshipId</column-name><column-value><![CDATA[");
		sb.append(getEmpOrgRelationshipId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>empId</column-name><column-value><![CDATA[");
		sb.append(getEmpId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orgClassName</column-name><column-value><![CDATA[");
		sb.append(getOrgClassName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>orgClassPK</column-name><column-value><![CDATA[");
		sb.append(getOrgClassPK());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>headOfOrg</column-name><column-value><![CDATA[");
		sb.append(getHeadOfOrg());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>deputyOfOrg</column-name><column-value><![CDATA[");
		sb.append(getDeputyOfOrg());
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

	private static ClassLoader _classLoader = EmpOrgRelationship.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] {
			EmpOrgRelationship.class
		};
	private long _empOrgRelationshipId;
	private long _empId;
	private long _originalEmpId;
	private boolean _setOriginalEmpId;
	private String _orgClassName;
	private String _originalOrgClassName;
	private long _orgClassPK;
	private long _originalOrgClassPK;
	private boolean _setOriginalOrgClassPK;
	private boolean _headOfOrg;
	private boolean _originalHeadOfOrg;
	private boolean _setOriginalHeadOfOrg;
	private boolean _deputyOfOrg;
	private boolean _originalDeputyOfOrg;
	private boolean _setOriginalDeputyOfOrg;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private long _columnBitmask;
	private EmpOrgRelationship _escapedModel;
}