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

import vn.com.ecopharma.emp.model.EmpLaborContract;

/**
 * The persistence interface for the emp labor contract service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see EmpLaborContractPersistenceImpl
 * @see EmpLaborContractUtil
 * @generated
 */
public interface EmpLaborContractPersistence extends BasePersistence<EmpLaborContract> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link EmpLaborContractUtil} to access the emp labor contract persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the emp labor contracts where empId = &#63;.
	*
	* @param empId the emp ID
	* @return the matching emp labor contracts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpLaborContract> findByEmp(
		long empId) throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the emp labor contracts where empId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.EmpLaborContractModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param empId the emp ID
	* @param start the lower bound of the range of emp labor contracts
	* @param end the upper bound of the range of emp labor contracts (not inclusive)
	* @return the range of matching emp labor contracts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpLaborContract> findByEmp(
		long empId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the emp labor contracts where empId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.EmpLaborContractModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param empId the emp ID
	* @param start the lower bound of the range of emp labor contracts
	* @param end the upper bound of the range of emp labor contracts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching emp labor contracts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpLaborContract> findByEmp(
		long empId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first emp labor contract in the ordered set where empId = &#63;.
	*
	* @param empId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp labor contract
	* @throws vn.com.ecopharma.emp.NoSuchEmpLaborContractException if a matching emp labor contract could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpLaborContract findByEmp_First(
		long empId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpLaborContractException;

	/**
	* Returns the first emp labor contract in the ordered set where empId = &#63;.
	*
	* @param empId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching emp labor contract, or <code>null</code> if a matching emp labor contract could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpLaborContract fetchByEmp_First(
		long empId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last emp labor contract in the ordered set where empId = &#63;.
	*
	* @param empId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp labor contract
	* @throws vn.com.ecopharma.emp.NoSuchEmpLaborContractException if a matching emp labor contract could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpLaborContract findByEmp_Last(
		long empId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpLaborContractException;

	/**
	* Returns the last emp labor contract in the ordered set where empId = &#63;.
	*
	* @param empId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching emp labor contract, or <code>null</code> if a matching emp labor contract could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpLaborContract fetchByEmp_Last(
		long empId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emp labor contracts before and after the current emp labor contract in the ordered set where empId = &#63;.
	*
	* @param empLaborContractId the primary key of the current emp labor contract
	* @param empId the emp ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next emp labor contract
	* @throws vn.com.ecopharma.emp.NoSuchEmpLaborContractException if a emp labor contract with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpLaborContract[] findByEmp_PrevAndNext(
		long empLaborContractId, long empId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpLaborContractException;

	/**
	* Removes all the emp labor contracts where empId = &#63; from the database.
	*
	* @param empId the emp ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByEmp(long empId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of emp labor contracts where empId = &#63;.
	*
	* @param empId the emp ID
	* @return the number of matching emp labor contracts
	* @throws SystemException if a system exception occurred
	*/
	public int countByEmp(long empId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the emp labor contract in the entity cache if it is enabled.
	*
	* @param empLaborContract the emp labor contract
	*/
	public void cacheResult(
		vn.com.ecopharma.emp.model.EmpLaborContract empLaborContract);

	/**
	* Caches the emp labor contracts in the entity cache if it is enabled.
	*
	* @param empLaborContracts the emp labor contracts
	*/
	public void cacheResult(
		java.util.List<vn.com.ecopharma.emp.model.EmpLaborContract> empLaborContracts);

	/**
	* Creates a new emp labor contract with the primary key. Does not add the emp labor contract to the database.
	*
	* @param empLaborContractId the primary key for the new emp labor contract
	* @return the new emp labor contract
	*/
	public vn.com.ecopharma.emp.model.EmpLaborContract create(
		long empLaborContractId);

	/**
	* Removes the emp labor contract with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param empLaborContractId the primary key of the emp labor contract
	* @return the emp labor contract that was removed
	* @throws vn.com.ecopharma.emp.NoSuchEmpLaborContractException if a emp labor contract with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpLaborContract remove(
		long empLaborContractId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpLaborContractException;

	public vn.com.ecopharma.emp.model.EmpLaborContract updateImpl(
		vn.com.ecopharma.emp.model.EmpLaborContract empLaborContract)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the emp labor contract with the primary key or throws a {@link vn.com.ecopharma.emp.NoSuchEmpLaborContractException} if it could not be found.
	*
	* @param empLaborContractId the primary key of the emp labor contract
	* @return the emp labor contract
	* @throws vn.com.ecopharma.emp.NoSuchEmpLaborContractException if a emp labor contract with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpLaborContract findByPrimaryKey(
		long empLaborContractId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchEmpLaborContractException;

	/**
	* Returns the emp labor contract with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param empLaborContractId the primary key of the emp labor contract
	* @return the emp labor contract, or <code>null</code> if a emp labor contract with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.EmpLaborContract fetchByPrimaryKey(
		long empLaborContractId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the emp labor contracts.
	*
	* @return the emp labor contracts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpLaborContract> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the emp labor contracts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.EmpLaborContractModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp labor contracts
	* @param end the upper bound of the range of emp labor contracts (not inclusive)
	* @return the range of emp labor contracts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpLaborContract> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the emp labor contracts.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.EmpLaborContractModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of emp labor contracts
	* @param end the upper bound of the range of emp labor contracts (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of emp labor contracts
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.EmpLaborContract> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the emp labor contracts from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of emp labor contracts.
	*
	* @return the number of emp labor contracts
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}