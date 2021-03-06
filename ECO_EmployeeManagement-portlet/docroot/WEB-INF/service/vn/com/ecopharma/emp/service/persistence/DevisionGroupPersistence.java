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

import vn.com.ecopharma.emp.model.DevisionGroup;

/**
 * The persistence interface for the devision group service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see DevisionGroupPersistenceImpl
 * @see DevisionGroupUtil
 * @generated
 */
public interface DevisionGroupPersistence extends BasePersistence<DevisionGroup> {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link DevisionGroupUtil} to access the devision group persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	* Returns all the devision groups where devisionId = &#63;.
	*
	* @param devisionId the devision ID
	* @return the matching devision groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.DevisionGroup> findByDevision(
		long devisionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the devision groups where devisionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.DevisionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param devisionId the devision ID
	* @param start the lower bound of the range of devision groups
	* @param end the upper bound of the range of devision groups (not inclusive)
	* @return the range of matching devision groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.DevisionGroup> findByDevision(
		long devisionId, int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the devision groups where devisionId = &#63;.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.DevisionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param devisionId the devision ID
	* @param start the lower bound of the range of devision groups
	* @param end the upper bound of the range of devision groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching devision groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.DevisionGroup> findByDevision(
		long devisionId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the first devision group in the ordered set where devisionId = &#63;.
	*
	* @param devisionId the devision ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching devision group
	* @throws vn.com.ecopharma.emp.NoSuchDevisionGroupException if a matching devision group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.DevisionGroup findByDevision_First(
		long devisionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchDevisionGroupException;

	/**
	* Returns the first devision group in the ordered set where devisionId = &#63;.
	*
	* @param devisionId the devision ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the first matching devision group, or <code>null</code> if a matching devision group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.DevisionGroup fetchByDevision_First(
		long devisionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the last devision group in the ordered set where devisionId = &#63;.
	*
	* @param devisionId the devision ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching devision group
	* @throws vn.com.ecopharma.emp.NoSuchDevisionGroupException if a matching devision group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.DevisionGroup findByDevision_Last(
		long devisionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchDevisionGroupException;

	/**
	* Returns the last devision group in the ordered set where devisionId = &#63;.
	*
	* @param devisionId the devision ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the last matching devision group, or <code>null</code> if a matching devision group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.DevisionGroup fetchByDevision_Last(
		long devisionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the devision groups before and after the current devision group in the ordered set where devisionId = &#63;.
	*
	* @param devisionGroupId the primary key of the current devision group
	* @param devisionId the devision ID
	* @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	* @return the previous, current, and next devision group
	* @throws vn.com.ecopharma.emp.NoSuchDevisionGroupException if a devision group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.DevisionGroup[] findByDevision_PrevAndNext(
		long devisionGroupId, long devisionId,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchDevisionGroupException;

	/**
	* Removes all the devision groups where devisionId = &#63; from the database.
	*
	* @param devisionId the devision ID
	* @throws SystemException if a system exception occurred
	*/
	public void removeByDevision(long devisionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of devision groups where devisionId = &#63;.
	*
	* @param devisionId the devision ID
	* @return the number of matching devision groups
	* @throws SystemException if a system exception occurred
	*/
	public int countByDevision(long devisionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the devision group where name = &#63; and devisionId = &#63; or throws a {@link vn.com.ecopharma.emp.NoSuchDevisionGroupException} if it could not be found.
	*
	* @param name the name
	* @param devisionId the devision ID
	* @return the matching devision group
	* @throws vn.com.ecopharma.emp.NoSuchDevisionGroupException if a matching devision group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.DevisionGroup findByNameAndDevision(
		java.lang.String name, long devisionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchDevisionGroupException;

	/**
	* Returns the devision group where name = &#63; and devisionId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	*
	* @param name the name
	* @param devisionId the devision ID
	* @return the matching devision group, or <code>null</code> if a matching devision group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.DevisionGroup fetchByNameAndDevision(
		java.lang.String name, long devisionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the devision group where name = &#63; and devisionId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	*
	* @param name the name
	* @param devisionId the devision ID
	* @param retrieveFromCache whether to use the finder cache
	* @return the matching devision group, or <code>null</code> if a matching devision group could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.DevisionGroup fetchByNameAndDevision(
		java.lang.String name, long devisionId, boolean retrieveFromCache)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes the devision group where name = &#63; and devisionId = &#63; from the database.
	*
	* @param name the name
	* @param devisionId the devision ID
	* @return the devision group that was removed
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.DevisionGroup removeByNameAndDevision(
		java.lang.String name, long devisionId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchDevisionGroupException;

	/**
	* Returns the number of devision groups where name = &#63; and devisionId = &#63;.
	*
	* @param name the name
	* @param devisionId the devision ID
	* @return the number of matching devision groups
	* @throws SystemException if a system exception occurred
	*/
	public int countByNameAndDevision(java.lang.String name, long devisionId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Caches the devision group in the entity cache if it is enabled.
	*
	* @param devisionGroup the devision group
	*/
	public void cacheResult(
		vn.com.ecopharma.emp.model.DevisionGroup devisionGroup);

	/**
	* Caches the devision groups in the entity cache if it is enabled.
	*
	* @param devisionGroups the devision groups
	*/
	public void cacheResult(
		java.util.List<vn.com.ecopharma.emp.model.DevisionGroup> devisionGroups);

	/**
	* Creates a new devision group with the primary key. Does not add the devision group to the database.
	*
	* @param devisionGroupId the primary key for the new devision group
	* @return the new devision group
	*/
	public vn.com.ecopharma.emp.model.DevisionGroup create(long devisionGroupId);

	/**
	* Removes the devision group with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param devisionGroupId the primary key of the devision group
	* @return the devision group that was removed
	* @throws vn.com.ecopharma.emp.NoSuchDevisionGroupException if a devision group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.DevisionGroup remove(long devisionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchDevisionGroupException;

	public vn.com.ecopharma.emp.model.DevisionGroup updateImpl(
		vn.com.ecopharma.emp.model.DevisionGroup devisionGroup)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the devision group with the primary key or throws a {@link vn.com.ecopharma.emp.NoSuchDevisionGroupException} if it could not be found.
	*
	* @param devisionGroupId the primary key of the devision group
	* @return the devision group
	* @throws vn.com.ecopharma.emp.NoSuchDevisionGroupException if a devision group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.DevisionGroup findByPrimaryKey(
		long devisionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException,
			vn.com.ecopharma.emp.NoSuchDevisionGroupException;

	/**
	* Returns the devision group with the primary key or returns <code>null</code> if it could not be found.
	*
	* @param devisionGroupId the primary key of the devision group
	* @return the devision group, or <code>null</code> if a devision group with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	public vn.com.ecopharma.emp.model.DevisionGroup fetchByPrimaryKey(
		long devisionGroupId)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns all the devision groups.
	*
	* @return the devision groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.DevisionGroup> findAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns a range of all the devision groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.DevisionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of devision groups
	* @param end the upper bound of the range of devision groups (not inclusive)
	* @return the range of devision groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.DevisionGroup> findAll(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns an ordered range of all the devision groups.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.DevisionGroupModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of devision groups
	* @param end the upper bound of the range of devision groups (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of devision groups
	* @throws SystemException if a system exception occurred
	*/
	public java.util.List<vn.com.ecopharma.emp.model.DevisionGroup> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Removes all the devision groups from the database.
	*
	* @throws SystemException if a system exception occurred
	*/
	public void removeAll()
		throws com.liferay.portal.kernel.exception.SystemException;

	/**
	* Returns the number of devision groups.
	*
	* @return the number of devision groups
	* @throws SystemException if a system exception occurred
	*/
	public int countAll()
		throws com.liferay.portal.kernel.exception.SystemException;
}