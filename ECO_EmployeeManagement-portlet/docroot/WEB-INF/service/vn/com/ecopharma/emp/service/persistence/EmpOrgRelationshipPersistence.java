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

package vn.com.ecopharma.emp.service.persistence;

import com.liferay.portal.service.persistence.BasePersistence;

import vn.com.ecopharma.emp.model.EmpOrgRelationship;

/**
 * The persistence interface for the emp org relationship service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see EmpOrgRelationshipPersistenceImpl
 * @see EmpOrgRelationshipUtil
 * @generated
 */
public interface EmpOrgRelationshipPersistence extends BasePersistence<EmpOrgRelationship> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmpOrgRelationshipUtil} to access the emp org relationship persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the emp org relationships where empId = &#63;.
	*
	* @param empId the emp ID
	* @return the matching emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpOrgRelationship> findByEmp(
		long empId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the emp org relationships where empId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.EmpOrgRelationshipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param empId the emp ID
	* @param start the lower bound of the range of emp org relationships
	* @param end the upper bound of the range of emp org relationships (not inclusive)
	* @return the range of matching emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpOrgRelationship> findByEmp(
		long empId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the emp org relationships where empId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.EmpOrgRelationshipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param empId the emp ID
	* @param start the lower bound of the range of emp org relationships
	* @param end the upper bound of the range of emp org relationships (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpOrgRelationship> findByEmp(
		long empId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first emp org relationship in the ordered set where empId = &#63;.
	*
	* @param empId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp org relationship
	* @throws vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship findByEmp_First(
		long empId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Returns the first emp org relationship in the ordered set where empId = &#63;.
	*
	* @param empId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp org relationship, or <code>null</code> if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship fetchByEmp_First(
		long empId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last emp org relationship in the ordered set where empId = &#63;.
	*
	* @param empId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp org relationship
	* @throws vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship findByEmp_Last(
		long empId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Returns the last emp org relationship in the ordered set where empId = &#63;.
	*
	* @param empId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp org relationship, or <code>null</code> if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship fetchByEmp_Last(
		long empId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emp org relationships before and after the current emp org relationship in the ordered set where empId = &#63;.
	*
	* @param empOrgRelationshipId the primary key of the current emp org relationship
	* @param empId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next emp org relationship
	* @throws vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException if a emp org relationship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship[] findByEmp_PrevAndNext(
		long empOrgRelationshipId, long empId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Removes all the emp org relationships where empId = &#63; from the database.
	*
	* @param empId the emp ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEmp(long empId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of emp org relationships where empId = &#63;.
	*
	* @param empId the emp ID
	* @return the number of matching emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public int countByEmp(long empId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the emp org relationships where orgClassName = &#63; and orgClassPK = &#63;.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @return the matching emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpOrgRelationship> findByClassNameClassPK(
		java.lang.String orgClassName, long orgClassPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the emp org relationships where orgClassName = &#63; and orgClassPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.EmpOrgRelationshipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param start the lower bound of the range of emp org relationships
	* @param end the upper bound of the range of emp org relationships (not inclusive)
	* @return the range of matching emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpOrgRelationship> findByClassNameClassPK(
		java.lang.String orgClassName, long orgClassPK, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the emp org relationships where orgClassName = &#63; and orgClassPK = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.EmpOrgRelationshipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param start the lower bound of the range of emp org relationships
	* @param end the upper bound of the range of emp org relationships (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpOrgRelationship> findByClassNameClassPK(
		java.lang.String orgClassName, long orgClassPK, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first emp org relationship in the ordered set where orgClassName = &#63; and orgClassPK = &#63;.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp org relationship
	* @throws vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship findByClassNameClassPK_First(
		java.lang.String orgClassName, long orgClassPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Returns the first emp org relationship in the ordered set where orgClassName = &#63; and orgClassPK = &#63;.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp org relationship, or <code>null</code> if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship fetchByClassNameClassPK_First(
		java.lang.String orgClassName, long orgClassPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last emp org relationship in the ordered set where orgClassName = &#63; and orgClassPK = &#63;.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp org relationship
	* @throws vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship findByClassNameClassPK_Last(
		java.lang.String orgClassName, long orgClassPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Returns the last emp org relationship in the ordered set where orgClassName = &#63; and orgClassPK = &#63;.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp org relationship, or <code>null</code> if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship fetchByClassNameClassPK_Last(
		java.lang.String orgClassName, long orgClassPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emp org relationships before and after the current emp org relationship in the ordered set where orgClassName = &#63; and orgClassPK = &#63;.
	*
	* @param empOrgRelationshipId the primary key of the current emp org relationship
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next emp org relationship
	* @throws vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException if a emp org relationship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship[] findByClassNameClassPK_PrevAndNext(
		long empOrgRelationshipId, java.lang.String orgClassName,
		long orgClassPK,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Removes all the emp org relationships where orgClassName = &#63; and orgClassPK = &#63; from the database.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @throws SystemException if a system exception occurred
	*/
	public void removeByClassNameClassPK(java.lang.String orgClassName,
		long orgClassPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of emp org relationships where orgClassName = &#63; and orgClassPK = &#63;.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @return the number of matching emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public int countByClassNameClassPK(java.lang.String orgClassName,
		long orgClassPK)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emp org relationship where orgClassName = &#63; and orgClassPK = &#63; and headOfOrg = &#63; or throws a {@link vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException} if it could not be found.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param headOfOrg the head of org
	* @return the matching emp org relationship
	* @throws vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship findByClassNameClassPKHeadOfOrg(
		java.lang.String orgClassName, long orgClassPK, boolean headOfOrg)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Returns the emp org relationship where orgClassName = &#63; and orgClassPK = &#63; and headOfOrg = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param headOfOrg the head of org
	* @return the matching emp org relationship, or <code>null</code> if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship fetchByClassNameClassPKHeadOfOrg(
		java.lang.String orgClassName, long orgClassPK, boolean headOfOrg)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emp org relationship where orgClassName = &#63; and orgClassPK = &#63; and headOfOrg = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param headOfOrg the head of org
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching emp org relationship, or <code>null</code> if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship fetchByClassNameClassPKHeadOfOrg(
		java.lang.String orgClassName, long orgClassPK, boolean headOfOrg,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the emp org relationship where orgClassName = &#63; and orgClassPK = &#63; and headOfOrg = &#63; from the database.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param headOfOrg the head of org
	* @return the emp org relationship that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship removeByClassNameClassPKHeadOfOrg(
		java.lang.String orgClassName, long orgClassPK, boolean headOfOrg)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Returns the number of emp org relationships where orgClassName = &#63; and orgClassPK = &#63; and headOfOrg = &#63;.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param headOfOrg the head of org
	* @return the number of matching emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public int countByClassNameClassPKHeadOfOrg(java.lang.String orgClassName,
		long orgClassPK, boolean headOfOrg)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emp org relationship where orgClassName = &#63; and orgClassPK = &#63; and deputyOfOrg = &#63; or throws a {@link vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException} if it could not be found.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param deputyOfOrg the deputy of org
	* @return the matching emp org relationship
	* @throws vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship findByClassNameClassPKDeputyOfOrg(
		java.lang.String orgClassName, long orgClassPK, boolean deputyOfOrg)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Returns the emp org relationship where orgClassName = &#63; and orgClassPK = &#63; and deputyOfOrg = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param deputyOfOrg the deputy of org
	* @return the matching emp org relationship, or <code>null</code> if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship fetchByClassNameClassPKDeputyOfOrg(
		java.lang.String orgClassName, long orgClassPK, boolean deputyOfOrg)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emp org relationship where orgClassName = &#63; and orgClassPK = &#63; and deputyOfOrg = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param deputyOfOrg the deputy of org
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching emp org relationship, or <code>null</code> if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship fetchByClassNameClassPKDeputyOfOrg(
		java.lang.String orgClassName, long orgClassPK, boolean deputyOfOrg,
		boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the emp org relationship where orgClassName = &#63; and orgClassPK = &#63; and deputyOfOrg = &#63; from the database.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param deputyOfOrg the deputy of org
	* @return the emp org relationship that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship removeByClassNameClassPKDeputyOfOrg(
		java.lang.String orgClassName, long orgClassPK, boolean deputyOfOrg)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Returns the number of emp org relationships where orgClassName = &#63; and orgClassPK = &#63; and deputyOfOrg = &#63;.
	*
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param deputyOfOrg the deputy of org
	* @return the number of matching emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public int countByClassNameClassPKDeputyOfOrg(
		java.lang.String orgClassName, long orgClassPK, boolean deputyOfOrg)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emp org relationship where empId = &#63; and orgClassName = &#63; and orgClassPK = &#63; and headOfOrg = &#63; or throws a {@link vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException} if it could not be found.
	*
	* @param empId the emp ID
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param headOfOrg the head of org
	* @return the matching emp org relationship
	* @throws vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship findByEmpClassNameClassPKHeadOfOrg(
		long empId, java.lang.String orgClassName, long orgClassPK,
		boolean headOfOrg)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Returns the emp org relationship where empId = &#63; and orgClassName = &#63; and orgClassPK = &#63; and headOfOrg = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param empId the emp ID
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param headOfOrg the head of org
	* @return the matching emp org relationship, or <code>null</code> if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship fetchByEmpClassNameClassPKHeadOfOrg(
		long empId, java.lang.String orgClassName, long orgClassPK,
		boolean headOfOrg)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emp org relationship where empId = &#63; and orgClassName = &#63; and orgClassPK = &#63; and headOfOrg = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param empId the emp ID
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param headOfOrg the head of org
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching emp org relationship, or <code>null</code> if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship fetchByEmpClassNameClassPKHeadOfOrg(
		long empId, java.lang.String orgClassName, long orgClassPK,
		boolean headOfOrg, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the emp org relationship where empId = &#63; and orgClassName = &#63; and orgClassPK = &#63; and headOfOrg = &#63; from the database.
	*
	* @param empId the emp ID
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param headOfOrg the head of org
	* @return the emp org relationship that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship removeByEmpClassNameClassPKHeadOfOrg(
		long empId, java.lang.String orgClassName, long orgClassPK,
		boolean headOfOrg)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Returns the number of emp org relationships where empId = &#63; and orgClassName = &#63; and orgClassPK = &#63; and headOfOrg = &#63;.
	*
	* @param empId the emp ID
	* @param orgClassName the org class name
	* @param orgClassPK the org class p k
	* @param headOfOrg the head of org
	* @return the number of matching emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public int countByEmpClassNameClassPKHeadOfOrg(long empId,
		java.lang.String orgClassName, long orgClassPK, boolean headOfOrg)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the emp org relationships where empId = &#63; and orgClassName = &#63; and headOfOrg = &#63;.
	*
	* @param empId the emp ID
	* @param orgClassName the org class name
	* @param headOfOrg the head of org
	* @return the matching emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpOrgRelationship> findByEmpClassNameHeadOfOrg(
		long empId, java.lang.String orgClassName, boolean headOfOrg)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the emp org relationships where empId = &#63; and orgClassName = &#63; and headOfOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.EmpOrgRelationshipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param empId the emp ID
	* @param orgClassName the org class name
	* @param headOfOrg the head of org
	* @param start the lower bound of the range of emp org relationships
	* @param end the upper bound of the range of emp org relationships (not inclusive)
	* @return the range of matching emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpOrgRelationship> findByEmpClassNameHeadOfOrg(
		long empId, java.lang.String orgClassName, boolean headOfOrg,
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the emp org relationships where empId = &#63; and orgClassName = &#63; and headOfOrg = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.EmpOrgRelationshipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param empId the emp ID
	* @param orgClassName the org class name
	* @param headOfOrg the head of org
	* @param start the lower bound of the range of emp org relationships
	* @param end the upper bound of the range of emp org relationships (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpOrgRelationship> findByEmpClassNameHeadOfOrg(
		long empId, java.lang.String orgClassName, boolean headOfOrg,
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first emp org relationship in the ordered set where empId = &#63; and orgClassName = &#63; and headOfOrg = &#63;.
	*
	* @param empId the emp ID
	* @param orgClassName the org class name
	* @param headOfOrg the head of org
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp org relationship
	* @throws vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship findByEmpClassNameHeadOfOrg_First(
		long empId, java.lang.String orgClassName, boolean headOfOrg,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Returns the first emp org relationship in the ordered set where empId = &#63; and orgClassName = &#63; and headOfOrg = &#63;.
	*
	* @param empId the emp ID
	* @param orgClassName the org class name
	* @param headOfOrg the head of org
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp org relationship, or <code>null</code> if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship fetchByEmpClassNameHeadOfOrg_First(
		long empId, java.lang.String orgClassName, boolean headOfOrg,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last emp org relationship in the ordered set where empId = &#63; and orgClassName = &#63; and headOfOrg = &#63;.
	*
	* @param empId the emp ID
	* @param orgClassName the org class name
	* @param headOfOrg the head of org
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp org relationship
	* @throws vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship findByEmpClassNameHeadOfOrg_Last(
		long empId, java.lang.String orgClassName, boolean headOfOrg,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Returns the last emp org relationship in the ordered set where empId = &#63; and orgClassName = &#63; and headOfOrg = &#63;.
	*
	* @param empId the emp ID
	* @param orgClassName the org class name
	* @param headOfOrg the head of org
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp org relationship, or <code>null</code> if a matching emp org relationship could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship fetchByEmpClassNameHeadOfOrg_Last(
		long empId, java.lang.String orgClassName, boolean headOfOrg,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emp org relationships before and after the current emp org relationship in the ordered set where empId = &#63; and orgClassName = &#63; and headOfOrg = &#63;.
	*
	* @param empOrgRelationshipId the primary key of the current emp org relationship
	* @param empId the emp ID
	* @param orgClassName the org class name
	* @param headOfOrg the head of org
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next emp org relationship
	* @throws vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException if a emp org relationship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship[] findByEmpClassNameHeadOfOrg_PrevAndNext(
		long empOrgRelationshipId, long empId, java.lang.String orgClassName,
		boolean headOfOrg,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Removes all the emp org relationships where empId = &#63; and orgClassName = &#63; and headOfOrg = &#63; from the database.
	*
	* @param empId the emp ID
	* @param orgClassName the org class name
	* @param headOfOrg the head of org
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEmpClassNameHeadOfOrg(long empId,
		java.lang.String orgClassName, boolean headOfOrg)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of emp org relationships where empId = &#63; and orgClassName = &#63; and headOfOrg = &#63;.
	*
	* @param empId the emp ID
	* @param orgClassName the org class name
	* @param headOfOrg the head of org
	* @return the number of matching emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public int countByEmpClassNameHeadOfOrg(long empId,
		java.lang.String orgClassName, boolean headOfOrg)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the emp org relationship in the entity cache if it is enabled.
	*
	* @param empOrgRelationship the emp org relationship
	*/
	public void cacheResult(
		vn.com.ecopharma.emp.model.EmpOrgRelationship empOrgRelationship);

	/**
	* Caches the emp org relationships in the entity cache if it is enabled.
	*
	* @param empOrgRelationships the emp org relationships
	*/
	public void cacheResult(
		java.util.List<vn.com.ecopharma.emp.model.EmpOrgRelationship> empOrgRelationships);

	/**
	* Creates a new emp org relationship with the primary key. Does not add the emp org relationship to the database.
	*
	* @param empOrgRelationshipId the primary key for the new emp org relationship
	* @return the new emp org relationship
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship create(
		long empOrgRelationshipId);

	/**
	* Removes the emp org relationship with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param empOrgRelationshipId the primary key of the emp org relationship
	* @return the emp org relationship that was removed
	* @throws vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException if a emp org relationship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship remove(
		long empOrgRelationshipId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	public vn.com.ecopharma.emp.model.EmpOrgRelationship updateImpl(
		vn.com.ecopharma.emp.model.EmpOrgRelationship empOrgRelationship)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emp org relationship with the primary key or throws a {@link vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException} if it could not be found.
	*
	* @param empOrgRelationshipId the primary key of the emp org relationship
	* @return the emp org relationship
	* @throws vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException if a emp org relationship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship findByPrimaryKey(
		long empOrgRelationshipId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpOrgRelationshipException;

	/**
	* Returns the emp org relationship with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param empOrgRelationshipId the primary key of the emp org relationship
	* @return the emp org relationship, or <code>null</code> if a emp org relationship with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpOrgRelationship fetchByPrimaryKey(
		long empOrgRelationshipId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the emp org relationships.
	*
	* @return the emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpOrgRelationship> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the emp org relationships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.EmpOrgRelationshipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp org relationships
	* @param end the upper bound of the range of emp org relationships (not inclusive)
	* @return the range of emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpOrgRelationship> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the emp org relationships.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.EmpOrgRelationshipModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp org relationships
	* @param end the upper bound of the range of emp org relationships (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpOrgRelationship> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the emp org relationships from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of emp org relationships.
	*
	* @return the number of emp org relationships
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}