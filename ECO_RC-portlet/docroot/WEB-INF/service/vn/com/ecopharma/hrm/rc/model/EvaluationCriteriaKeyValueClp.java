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

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.util.PortalUtil;

import vn.com.ecopharma.hrm.rc.service.ClpSerializer;
import vn.com.ecopharma.hrm.rc.service.EvaluationCriteriaKeyValueLocalServiceUtil;

import java.io.Serializable;

import java.lang.reflect.Method;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * @author tvt
 */
public class EvaluationCriteriaKeyValueClp extends BaseModelImpl<EvaluationCriteriaKeyValue>
	implements EvaluationCriteriaKeyValue {
	public EvaluationCriteriaKeyValueClp() {
	}

	@Override
	public Class<?> getModelClass() {
		return EvaluationCriteriaKeyValue.class;
	}

	@Override
	public String getModelClassName() {
		return EvaluationCriteriaKeyValue.class.getName();
	}

	@Override
	public long getPrimaryKey() {
		return _evaluationCriteriaKeyValueId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEvaluationCriteriaKeyValueId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _evaluationCriteriaKeyValueId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("evaluationCriteriaKeyValueId",
			getEvaluationCriteriaKeyValueId());
		attributes.put("evaluationCriteriaId", getEvaluationCriteriaId());
		attributes.put("key", getKey());
		attributes.put("value", getValue());
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
		Long evaluationCriteriaKeyValueId = (Long)attributes.get(
				"evaluationCriteriaKeyValueId");

		if (evaluationCriteriaKeyValueId != null) {
			setEvaluationCriteriaKeyValueId(evaluationCriteriaKeyValueId);
		}

		Long evaluationCriteriaId = (Long)attributes.get("evaluationCriteriaId");

		if (evaluationCriteriaId != null) {
			setEvaluationCriteriaId(evaluationCriteriaId);
		}

		String key = (String)attributes.get("key");

		if (key != null) {
			setKey(key);
		}

		Integer value = (Integer)attributes.get("value");

		if (value != null) {
			setValue(value);
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

	@Override
	public long getEvaluationCriteriaKeyValueId() {
		return _evaluationCriteriaKeyValueId;
	}

	@Override
	public void setEvaluationCriteriaKeyValueId(
		long evaluationCriteriaKeyValueId) {
		_evaluationCriteriaKeyValueId = evaluationCriteriaKeyValueId;

		if (_evaluationCriteriaKeyValueRemoteModel != null) {
			try {
				Class<?> clazz = _evaluationCriteriaKeyValueRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluationCriteriaKeyValueId",
						long.class);

				method.invoke(_evaluationCriteriaKeyValueRemoteModel,
					evaluationCriteriaKeyValueId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getEvaluationCriteriaId() {
		return _evaluationCriteriaId;
	}

	@Override
	public void setEvaluationCriteriaId(long evaluationCriteriaId) {
		_evaluationCriteriaId = evaluationCriteriaId;

		if (_evaluationCriteriaKeyValueRemoteModel != null) {
			try {
				Class<?> clazz = _evaluationCriteriaKeyValueRemoteModel.getClass();

				Method method = clazz.getMethod("setEvaluationCriteriaId",
						long.class);

				method.invoke(_evaluationCriteriaKeyValueRemoteModel,
					evaluationCriteriaId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getKey() {
		return _key;
	}

	@Override
	public void setKey(String key) {
		_key = key;

		if (_evaluationCriteriaKeyValueRemoteModel != null) {
			try {
				Class<?> clazz = _evaluationCriteriaKeyValueRemoteModel.getClass();

				Method method = clazz.getMethod("setKey", String.class);

				method.invoke(_evaluationCriteriaKeyValueRemoteModel, key);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public int getValue() {
		return _value;
	}

	@Override
	public void setValue(int value) {
		_value = value;

		if (_evaluationCriteriaKeyValueRemoteModel != null) {
			try {
				Class<?> clazz = _evaluationCriteriaKeyValueRemoteModel.getClass();

				Method method = clazz.getMethod("setValue", int.class);

				method.invoke(_evaluationCriteriaKeyValueRemoteModel, value);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_groupId = groupId;

		if (_evaluationCriteriaKeyValueRemoteModel != null) {
			try {
				Class<?> clazz = _evaluationCriteriaKeyValueRemoteModel.getClass();

				Method method = clazz.getMethod("setGroupId", long.class);

				method.invoke(_evaluationCriteriaKeyValueRemoteModel, groupId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_companyId = companyId;

		if (_evaluationCriteriaKeyValueRemoteModel != null) {
			try {
				Class<?> clazz = _evaluationCriteriaKeyValueRemoteModel.getClass();

				Method method = clazz.getMethod("setCompanyId", long.class);

				method.invoke(_evaluationCriteriaKeyValueRemoteModel, companyId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;

		if (_evaluationCriteriaKeyValueRemoteModel != null) {
			try {
				Class<?> clazz = _evaluationCriteriaKeyValueRemoteModel.getClass();

				Method method = clazz.getMethod("setUserId", long.class);

				method.invoke(_evaluationCriteriaKeyValueRemoteModel, userId);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getUserName() {
		return _userName;
	}

	@Override
	public void setUserName(String userName) {
		_userName = userName;

		if (_evaluationCriteriaKeyValueRemoteModel != null) {
			try {
				Class<?> clazz = _evaluationCriteriaKeyValueRemoteModel.getClass();

				Method method = clazz.getMethod("setUserName", String.class);

				method.invoke(_evaluationCriteriaKeyValueRemoteModel, userName);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;

		if (_evaluationCriteriaKeyValueRemoteModel != null) {
			try {
				Class<?> clazz = _evaluationCriteriaKeyValueRemoteModel.getClass();

				Method method = clazz.getMethod("setCreateDate", Date.class);

				method.invoke(_evaluationCriteriaKeyValueRemoteModel, createDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;

		if (_evaluationCriteriaKeyValueRemoteModel != null) {
			try {
				Class<?> clazz = _evaluationCriteriaKeyValueRemoteModel.getClass();

				Method method = clazz.getMethod("setModifiedDate", Date.class);

				method.invoke(_evaluationCriteriaKeyValueRemoteModel,
					modifiedDate);
			}
			catch (Exception e) {
				throw new UnsupportedOperationException(e);
			}
		}
	}

	public BaseModel<?> getEvaluationCriteriaKeyValueRemoteModel() {
		return _evaluationCriteriaKeyValueRemoteModel;
	}

	public void setEvaluationCriteriaKeyValueRemoteModel(
		BaseModel<?> evaluationCriteriaKeyValueRemoteModel) {
		_evaluationCriteriaKeyValueRemoteModel = evaluationCriteriaKeyValueRemoteModel;
	}

	public Object invokeOnRemoteModel(String methodName,
		Class<?>[] parameterTypes, Object[] parameterValues)
		throws Exception {
		Object[] remoteParameterValues = new Object[parameterValues.length];

		for (int i = 0; i < parameterValues.length; i++) {
			if (parameterValues[i] != null) {
				remoteParameterValues[i] = ClpSerializer.translateInput(parameterValues[i]);
			}
		}

		Class<?> remoteModelClass = _evaluationCriteriaKeyValueRemoteModel.getClass();

		ClassLoader remoteModelClassLoader = remoteModelClass.getClassLoader();

		Class<?>[] remoteParameterTypes = new Class[parameterTypes.length];

		for (int i = 0; i < parameterTypes.length; i++) {
			if (parameterTypes[i].isPrimitive()) {
				remoteParameterTypes[i] = parameterTypes[i];
			}
			else {
				String parameterTypeName = parameterTypes[i].getName();

				remoteParameterTypes[i] = remoteModelClassLoader.loadClass(parameterTypeName);
			}
		}

		Method method = remoteModelClass.getMethod(methodName,
				remoteParameterTypes);

		Object returnValue = method.invoke(_evaluationCriteriaKeyValueRemoteModel,
				remoteParameterValues);

		if (returnValue != null) {
			returnValue = ClpSerializer.translateOutput(returnValue);
		}

		return returnValue;
	}

	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			EvaluationCriteriaKeyValueLocalServiceUtil.addEvaluationCriteriaKeyValue(this);
		}
		else {
			EvaluationCriteriaKeyValueLocalServiceUtil.updateEvaluationCriteriaKeyValue(this);
		}
	}

	@Override
	public EvaluationCriteriaKeyValue toEscapedModel() {
		return (EvaluationCriteriaKeyValue)ProxyUtil.newProxyInstance(EvaluationCriteriaKeyValue.class.getClassLoader(),
			new Class[] { EvaluationCriteriaKeyValue.class },
			new AutoEscapeBeanHandler(this));
	}

	@Override
	public Object clone() {
		EvaluationCriteriaKeyValueClp clone = new EvaluationCriteriaKeyValueClp();

		clone.setEvaluationCriteriaKeyValueId(getEvaluationCriteriaKeyValueId());
		clone.setEvaluationCriteriaId(getEvaluationCriteriaId());
		clone.setKey(getKey());
		clone.setValue(getValue());
		clone.setGroupId(getGroupId());
		clone.setCompanyId(getCompanyId());
		clone.setUserId(getUserId());
		clone.setUserName(getUserName());
		clone.setCreateDate(getCreateDate());
		clone.setModifiedDate(getModifiedDate());

		return clone;
	}

	@Override
	public int compareTo(EvaluationCriteriaKeyValue evaluationCriteriaKeyValue) {
		long primaryKey = evaluationCriteriaKeyValue.getPrimaryKey();

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

		if (!(obj instanceof EvaluationCriteriaKeyValueClp)) {
			return false;
		}

		EvaluationCriteriaKeyValueClp evaluationCriteriaKeyValue = (EvaluationCriteriaKeyValueClp)obj;

		long primaryKey = evaluationCriteriaKeyValue.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	public Class<?> getClpSerializerClass() {
		return _clpSerializerClass;
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{evaluationCriteriaKeyValueId=");
		sb.append(getEvaluationCriteriaKeyValueId());
		sb.append(", evaluationCriteriaId=");
		sb.append(getEvaluationCriteriaId());
		sb.append(", key=");
		sb.append(getKey());
		sb.append(", value=");
		sb.append(getValue());
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
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("vn.com.ecopharma.hrm.rc.model.EvaluationCriteriaKeyValue");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>evaluationCriteriaKeyValueId</column-name><column-value><![CDATA[");
		sb.append(getEvaluationCriteriaKeyValueId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>evaluationCriteriaId</column-name><column-value><![CDATA[");
		sb.append(getEvaluationCriteriaId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>key</column-name><column-value><![CDATA[");
		sb.append(getKey());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>value</column-name><column-value><![CDATA[");
		sb.append(getValue());
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

	private long _evaluationCriteriaKeyValueId;
	private long _evaluationCriteriaId;
	private String _key;
	private int _value;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userUuid;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private BaseModel<?> _evaluationCriteriaKeyValueRemoteModel;
	private Class<?> _clpSerializerClass = vn.com.ecopharma.hrm.rc.service.ClpSerializer.class;
}