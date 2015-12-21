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

import vn.com.ecopharma.hrm.rc.service.VacancyCandidateLocalServiceUtil;

import java.util.Arrays;

/**
 * @author tvt
 * @generated
 */
public class VacancyCandidateLocalServiceClpInvoker {
	public VacancyCandidateLocalServiceClpInvoker() {
		_methodName0 = "addVacancyCandidate";

		_methodParameterTypes0 = new String[] {
				"vn.com.ecopharma.hrm.rc.model.VacancyCandidate"
			};

		_methodName1 = "createVacancyCandidate";

		_methodParameterTypes1 = new String[] { "long" };

		_methodName2 = "deleteVacancyCandidate";

		_methodParameterTypes2 = new String[] { "long" };

		_methodName3 = "deleteVacancyCandidate";

		_methodParameterTypes3 = new String[] {
				"vn.com.ecopharma.hrm.rc.model.VacancyCandidate"
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

		_methodName10 = "fetchVacancyCandidate";

		_methodParameterTypes10 = new String[] { "long" };

		_methodName11 = "getVacancyCandidate";

		_methodParameterTypes11 = new String[] { "long" };

		_methodName12 = "getPersistedModel";

		_methodParameterTypes12 = new String[] { "java.io.Serializable" };

		_methodName13 = "getVacancyCandidates";

		_methodParameterTypes13 = new String[] { "int", "int" };

		_methodName14 = "getVacancyCandidatesCount";

		_methodParameterTypes14 = new String[] {  };

		_methodName15 = "updateVacancyCandidate";

		_methodParameterTypes15 = new String[] {
				"vn.com.ecopharma.hrm.rc.model.VacancyCandidate"
			};

		_methodName116 = "getBeanIdentifier";

		_methodParameterTypes116 = new String[] {  };

		_methodName117 = "setBeanIdentifier";

		_methodParameterTypes117 = new String[] { "java.lang.String" };

		_methodName122 = "findAll";

		_methodParameterTypes122 = new String[] {  };

		_methodName123 = "findAll";

		_methodParameterTypes123 = new String[] { "int", "int" };

		_methodName124 = "findAll";

		_methodParameterTypes124 = new String[] {
				"int", "int", "com.liferay.portal.kernel.util.OrderByComparator"
			};

		_methodName125 = "createPrePersitedVacancyCandidate";

		_methodParameterTypes125 = new String[] {  };

		_methodName126 = "addVacancyCandidate";

		_methodParameterTypes126 = new String[] { "long", "long", "int" };

		_methodName127 = "addVacancyCandidate";

		_methodParameterTypes127 = new String[] {
				"long", "long", "java.lang.String"
			};

		_methodName128 = "setInActivatedByCandidate";

		_methodParameterTypes128 = new String[] { "long" };

		_methodName129 = "findByVacancyAndCandidate";

		_methodParameterTypes129 = new String[] { "long", "long" };

		_methodName130 = "findByCandidateAndActiveStatus";

		_methodParameterTypes130 = new String[] { "long" };

		_methodName131 = "findByVacancy";

		_methodParameterTypes131 = new String[] { "long" };

		_methodName132 = "findByCandidate";

		_methodParameterTypes132 = new String[] { "long" };

		_methodName133 = "findByCandidateAndType";

		_methodParameterTypes133 = new String[] { "long", "java.lang.String" };
	}

	public Object invokeMethod(String name, String[] parameterTypes,
		Object[] arguments) throws Throwable {
		if (_methodName0.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes0, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.addVacancyCandidate((vn.com.ecopharma.hrm.rc.model.VacancyCandidate)arguments[0]);
		}

		if (_methodName1.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes1, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.createVacancyCandidate(((Long)arguments[0]).longValue());
		}

		if (_methodName2.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes2, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.deleteVacancyCandidate(((Long)arguments[0]).longValue());
		}

		if (_methodName3.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes3, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.deleteVacancyCandidate((vn.com.ecopharma.hrm.rc.model.VacancyCandidate)arguments[0]);
		}

		if (_methodName4.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes4, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.dynamicQuery();
		}

		if (_methodName5.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes5, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName6.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes6, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName7.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes7, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.dynamicQuery((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				((Integer)arguments[1]).intValue(),
				((Integer)arguments[2]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[3]);
		}

		if (_methodName8.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes8, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0]);
		}

		if (_methodName9.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes9, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.dynamicQueryCount((com.liferay.portal.kernel.dao.orm.DynamicQuery)arguments[0],
				(com.liferay.portal.kernel.dao.orm.Projection)arguments[1]);
		}

		if (_methodName10.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes10, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.fetchVacancyCandidate(((Long)arguments[0]).longValue());
		}

		if (_methodName11.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes11, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.getVacancyCandidate(((Long)arguments[0]).longValue());
		}

		if (_methodName12.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes12, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.getPersistedModel((java.io.Serializable)arguments[0]);
		}

		if (_methodName13.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes13, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.getVacancyCandidates(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName14.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes14, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.getVacancyCandidatesCount();
		}

		if (_methodName15.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes15, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.updateVacancyCandidate((vn.com.ecopharma.hrm.rc.model.VacancyCandidate)arguments[0]);
		}

		if (_methodName116.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes116, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.getBeanIdentifier();
		}

		if (_methodName117.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes117, parameterTypes)) {
			VacancyCandidateLocalServiceUtil.setBeanIdentifier((java.lang.String)arguments[0]);

			return null;
		}

		if (_methodName122.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes122, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.findAll();
		}

		if (_methodName123.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes123, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.findAll(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue());
		}

		if (_methodName124.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes124, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.findAll(((Integer)arguments[0]).intValue(),
				((Integer)arguments[1]).intValue(),
				(com.liferay.portal.kernel.util.OrderByComparator)arguments[2]);
		}

		if (_methodName125.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes125, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.createPrePersitedVacancyCandidate();
		}

		if (_methodName126.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes126, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.addVacancyCandidate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(),
				((Integer)arguments[2]).intValue());
		}

		if (_methodName127.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes127, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.addVacancyCandidate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue(), (java.lang.String)arguments[2]);
		}

		if (_methodName128.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes128, parameterTypes)) {
			VacancyCandidateLocalServiceUtil.setInActivatedByCandidate(((Long)arguments[0]).longValue());

			return null;
		}

		if (_methodName129.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes129, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.findByVacancyAndCandidate(((Long)arguments[0]).longValue(),
				((Long)arguments[1]).longValue());
		}

		if (_methodName130.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes130, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.findByCandidateAndActiveStatus(((Long)arguments[0]).longValue());
		}

		if (_methodName131.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes131, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.findByVacancy(((Long)arguments[0]).longValue());
		}

		if (_methodName132.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes132, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.findByCandidate(((Long)arguments[0]).longValue());
		}

		if (_methodName133.equals(name) &&
				Arrays.deepEquals(_methodParameterTypes133, parameterTypes)) {
			return VacancyCandidateLocalServiceUtil.findByCandidateAndType(((Long)arguments[0]).longValue(),
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
	private String _methodName116;
	private String[] _methodParameterTypes116;
	private String _methodName117;
	private String[] _methodParameterTypes117;
	private String _methodName122;
	private String[] _methodParameterTypes122;
	private String _methodName123;
	private String[] _methodParameterTypes123;
	private String _methodName124;
	private String[] _methodParameterTypes124;
	private String _methodName125;
	private String[] _methodParameterTypes125;
	private String _methodName126;
	private String[] _methodParameterTypes126;
	private String _methodName127;
	private String[] _methodParameterTypes127;
	private String _methodName128;
	private String[] _methodParameterTypes128;
	private String _methodName129;
	private String[] _methodParameterTypes129;
	private String _methodName130;
	private String[] _methodParameterTypes130;
	private String _methodName131;
	private String[] _methodParameterTypes131;
	private String _methodName132;
	private String[] _methodParameterTypes132;
	private String _methodName133;
	private String[] _methodParameterTypes133;
}