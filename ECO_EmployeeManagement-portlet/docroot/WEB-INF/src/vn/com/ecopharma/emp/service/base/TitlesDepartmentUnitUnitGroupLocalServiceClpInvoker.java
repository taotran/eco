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

package vn.com.ecopharma.emp.service.base;

import vn.com.ecopharma.emp.service.TitlesDepartmentUnitUnitGroupLocalServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class TitlesDepartmentUnitUnitGroupLocalServiceClpInvoker {
	public TitlesDepartmentUnitUnitGroupLocalServiceClpInvoker() {
		_methodName0 = "addTitlesDepartmentUnitUnitGroup";

		_methodParameterTypes0 = new String[] {
				"vn.com.ecopharma.emp.model.TitlesDepartmentUnitUnitGroup"
			};

		_methodName1 = "createTitlesDepartmentUnitUnitGroup";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteTitlesDepartmentUnitUnitGroup";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteTitlesDepartmentUnitUnitGroup";

		_methodParameterTypes3 = new String[] {
				"vn.com.ecopharma.emp.model.TitlesDepartmentUnitUnitGroup"
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

		_methodName10 = "fetchTitlesDepartmentUnitUnitGroup";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getTitlesDepartmentUnitUnitGroup";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getTitlesDepartmentUnitUnitGroups";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getTitlesDepartmentUnitUnitGroupsCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateTitlesDepartmentUnitUnitGroup";

		_methodParameterTypes15 = new String[] {
				"vn.com.ecopharma.emp.model.TitlesDepartmentUnitUnitGroup"
			};

		_methodName162 = "getBeanIdentifier";

		_methodParameterTypes162 = new String[] {  };

		_methodName163 = "setBeanIdentifier";

		_methodParameterTypes163 = new String[] { "java.lang.String" };

		_methodName168 = "findAll";

		_methodParameterTypes168 = new String[] {  };

		_methodName169 = "findAll";

		_methodParameterTypes169 = new String[] { "int", "int" };

		_methodName170 = "findAll";

		_methodParameterTypes170 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName171 = "findByDepartment";

		_methodParameterTypes171 = new String[] { "long" };

		_methodName172 = "findByUnit";

		_methodParameterTypes172 = new String[] { "long" };

		_methodName173 = "addTitlesDepartmentUnitUnitGroup";

		_methodParameterTypes173 = new String[] {
				"long", "long", "long", "long",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName174 = "addTitlesDepartmentUnitUnitGroup";

		_methodParameterTypes174 = new String[] {
				"vn.com.ecopharma.emp.model.Titles",
				"vn.com.ecopharma.emp.model.Department",
				"vn.com.ecopharma.emp.model.Unit",
				"vn.com.ecopharma.emp.model.UnitGroup",
				"com.liferay.portal.service.ServiceContext"
			};

		_methodName175 = "findByTitlesDepartmentUnitUnitGroup";

		_methodParameterTypes175 = new String[] { "long", "long", "long", "long" };

		_methodName176 = "findByTitlesDepartmentUnitUnitGroup";

		_methodParameterTypes176 = new String[] {
				"vn.com.ecopharma.emp.model.Titles",
				"vn.com.ecopharma.emp.model.Department",
				"vn.com.ecopharma.emp.model.Unit",
				"vn.com.ecopharma.emp.model.UnitGroup"
			};

		_methodName177 = "findByDepartmentUnitUnitGroup";

		_methodParameterTypes177 = new String[] { "long", "long", "long" };

		_methodName178 = "findByUnitUnitGroup";

		_methodParameterTypes178 = new String[] { "long", "long" };

		_methodName179 = "findByUnitGroup";

		_methodParameterTypes179 = new String[] { "long" };

		_methodName180 = "findByTitlesDepartmentUnitNoneUnitGroup";

		_methodParameterTypes180 = new String[] { "long", "long", "long" };

		_methodName181 = "completelyRemoveAll";

		_methodParameterTypes181 = new String[] {  };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.addTitlesDepartmentUnitUnitGroup((vn.com.ecopharma.emp.model.TitlesDepartmentUnitUnitGroup)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.createTitlesDepartmentUnitUnitGroup(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.deleteTitlesDepartmentUnitUnitGroup(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.deleteTitlesDepartmentUnitUnitGroup((vn.com.ecopharma.emp.model.TitlesDepartmentUnitUnitGroup)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.fetchTitlesDepartmentUnitUnitGroup(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.getTitlesDepartmentUnitUnitGroup(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.getTitlesDepartmentUnitUnitGroups(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.getTitlesDepartmentUnitUnitGroupsCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.updateTitlesDepartmentUnitUnitGroup((vn.com.ecopharma.emp.model.TitlesDepartmentUnitUnitGroup)arguments[0]);
		}

		if (_methodName162.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes162, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName163.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes163, parameterTypes)) {
			TitlesDepartmentUnitUnitGroupLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName168.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes168, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.findAll();
		}

		if (_methodName169.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes169, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.findAll(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName170.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes170, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.findAll(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName171.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes171, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.findByDepartment(((Long)arguments[0]).longValue());
		}

		if (_methodName172.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes172, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.findByUnit(((Long)arguments[0]).longValue());
		}

		if (_methodName173.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes173, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.addTitlesDepartmentUnitUnitGroup(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue(),
				(com.liferay.portal.service.ServiceContext)arguments[4]);
		}

		if (_methodName174.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes174, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.addTitlesDepartmentUnitUnitGroup((vn.com.ecopharma.emp.model.Titles)arguments[0],
				(vn.com.ecopharma.emp.model.Department)arguments[1],
				(vn.com.ecopharma.emp.model.Unit)arguments[2],
				(vn.com.ecopharma.emp.model.UnitGroup)arguments[3],
				(com.liferay.portal.service.ServiceContext)arguments[4]);
		}

		if (_methodName175.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes175, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.findByTitlesDepartmentUnitUnitGroup(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue(),
				((Long)arguments[3]).longValue());
		}

		if (_methodName176.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes176, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.findByTitlesDepartmentUnitUnitGroup((vn.com.ecopharma.emp.model.Titles)arguments[0],
				(vn.com.ecopharma.emp.model.Department)arguments[1],
				(vn.com.ecopharma.emp.model.Unit)arguments[2],
				(vn.com.ecopharma.emp.model.UnitGroup)arguments[3]);
		}

		if (_methodName177.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes177, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.findByDepartmentUnitUnitGroup(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName178.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes178, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.findByUnitUnitGroup(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName179.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes179, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.findByUnitGroup(((Long)arguments[0]).longValue());
		}

		if (_methodName180.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes180, parameterTypes)) {
			return TitlesDepartmentUnitUnitGroupLocalServiceUtil.findByTitlesDepartmentUnitNoneUnitGroup(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Long)arguments[2]).longValue());
		}

		if (_methodName181.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes181, parameterTypes)) {
			TitlesDepartmentUnitUnitGroupLocalServiceUtil.completelyRemoveAll();

			return null;
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
	private String _methodName162;
	private String[] _methodParameterTypes162;
	private String _methodName163;
	private String[] _methodParameterTypes163;
	private String _methodName168;
	private String[] _methodParameterTypes168;
	private String _methodName169;
	private String[] _methodParameterTypes169;
	private String _methodName170;
	private String[] _methodParameterTypes170;
	private String _methodName171;
	private String[] _methodParameterTypes171;
	private String _methodName172;
	private String[] _methodParameterTypes172;
	private String _methodName173;
	private String[] _methodParameterTypes173;
	private String _methodName174;
	private String[] _methodParameterTypes174;
	private String _methodName175;
	private String[] _methodParameterTypes175;
	private String _methodName176;
	private String[] _methodParameterTypes176;
	private String _methodName177;
	private String[] _methodParameterTypes177;
	private String _methodName178;
	private String[] _methodParameterTypes178;
	private String _methodName179;
	private String[] _methodParameterTypes179;
	private String _methodName180;
	private String[] _methodParameterTypes180;
	private String _methodName181;
	private String[] _methodParameterTypes181;
}