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

package vn.com.ecopharma.hrm.rc.service.base;

import vn.com.ecopharma.hrm.rc.service.EvaluationCriteriaKeyValueLocalServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class EvaluationCriteriaKeyValueLocalServiceClpInvoker {
	public EvaluationCriteriaKeyValueLocalServiceClpInvoker() {
		_methodName0 = "addEvaluationCriteriaKeyValue";

		_methodParameterTypes0 = new String[] {
				"vn.com.ecopharma.hrm.rc.model.EvaluationCriteriaKeyValue"
			};

		_methodName1 = "createEvaluationCriteriaKeyValue";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteEvaluationCriteriaKeyValue";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteEvaluationCriteriaKeyValue";

		_methodParameterTypes3 = new String[] {
				"vn.com.ecopharma.hrm.rc.model.EvaluationCriteriaKeyValue"
			};

		_methodName4 = "dynamicQuery";

		_methodParameterTypes4 = new String[] {  };

		_methodName5 = "dynamicQuery";

		_methodParameterTypes5 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName6 = "dynamicQuery";

		_methodParameterTypes6 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int"
			};

		_methodName7 = "dynamicQuery";

		_methodParameterTypes7 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery", "int", "int",
				"com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName8 = "dynamicQueryCount";

		_methodParameterTypes8 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery"
			};

		_methodName9 = "dynamicQueryCount";

		_methodParameterTypes9 = new String[] {
				"com.liferay.portal.kernel.dao.orm.DynamicQuery",
				"com.liferay.portal.kernel.dao.orm.Projection"
			};

		_methodName10 = "fetchEvaluationCriteriaKeyValue";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getEvaluationCriteriaKeyValue";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getEvaluationCriteriaKeyValues";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getEvaluationCriteriaKeyValuesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateEvaluationCriteriaKeyValue";

		_methodParameterTypes15 = new String[] {
				"vn.com.ecopharma.hrm.rc.model.EvaluationCriteriaKeyValue"
			};

		_methodName110 = "getBeanIdentifier";

		_methodParameterTypes110 = new String[] {  };

		_methodName111 = "setBeanIdentifier";

		_methodParameterTypes111 = new String[] { "java.lang.String" };

		_methodName116 = "creatPrePersistedEntity";

		_methodParameterTypes116 = new String[] {
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName117 = "addEvaluationCriteriaKeyValue";

		_methodParameterTypes117 = new String[] {
				"long", "java.lang.String", "int",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName118 = "findByEvaluationCriteria";

		_methodParameterTypes118 = new String[] { "long" };

		_methodName119 = "findByEvaluationCriteriaAndKey";

		_methodParameterTypes119 = new String[] { "long", "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.addEvaluationCriteriaKeyValue((vn.com.ecopharma.hrm.rc.model.EvaluationCriteriaKeyValue)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.createEvaluationCriteriaKeyValue(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.deleteEvaluationCriteriaKeyValue(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.deleteEvaluationCriteriaKeyValue((vn.com.ecopharma.hrm.rc.model.EvaluationCriteriaKeyValue)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.fetchEvaluationCriteriaKeyValue(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.getEvaluationCriteriaKeyValue(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.getEvaluationCriteriaKeyValues(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.getEvaluationCriteriaKeyValuesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.updateEvaluationCriteriaKeyValue((vn.com.ecopharma.hrm.rc.model.EvaluationCriteriaKeyValue)arguments[0]);
		}

		if (_methodName110.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes110, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName111.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes111, parameterTypes)) {
			EvaluationCriteriaKeyValueLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.creatPrePersistedEntity((com.liferay.portal.service.ServiceContext)arguments[0]);
		}

		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.addEvaluationCriteriaKeyValue(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1],
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.service.ServiceContext)arguments[3]);
		}

		if (_methodName118.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes118, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.findByEvaluationCriteria(((Long)arguments[0]).longValue());
		}

		if (_methodName119.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes119, parameterTypes)) {
			return EvaluationCriteriaKeyValueLocalServiceUtil.findByEvaluationCriteriaAndKey(((Long)arguments[0]).longValue(),
				(java.lang.String)arguments[1]);
		}

		throw new UnsupportedOperationException();
	}

	private String _methodName0;
	private String[] _methodParameterTypes0;
	private String _methodName1;
	private String[] _methodParameterTypes1;
	private String _methodName2;
	private String[] _methodParameterTypes2;
	private String _methodName3;
	private String[] _methodParameterTypes3;
	private String _methodName4;
	private String[] _methodParameterTypes4;
	private String _methodName5;
	private String[] _methodParameterTypes5;
	private String _methodName6;
	private String[] _methodParameterTypes6;
	private String _methodName7;
	private String[] _methodParameterTypes7;
	private String _methodName8;
	private String[] _methodParameterTypes8;
	private String _methodName9;
	private String[] _methodParameterTypes9;
	private String _methodName10;
	private String[] _methodParameterTypes10;
	private String _methodName11;
	private String[] _methodParameterTypes11;
	private String _methodName12;
	private String[] _methodParameterTypes12;
	private String _methodName13;
	private String[] _methodParameterTypes13;
	private String _methodName14;
	private String[] _methodParameterTypes14;
	private String _methodName15;
	private String[] _methodParameterTypes15;
	private String _methodName110;
	private String[] _methodParameterTypes110;
	private String _methodName111;
	private String[] _methodParameterTypes111;
	private String _methodName116;
	private String[] _methodParameterTypes116;
	private String _methodName117;
	private String[] _methodParameterTypes117;
	private String _methodName118;
	private String[] _methodParameterTypes118;
	private String _methodName119;
	private String[] _methodParameterTypes119;
}