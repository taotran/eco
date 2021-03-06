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

package vn.com.ecopharma.emp.service;

import com.liferay.portal.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link EmployeeTitlesHistoryLocalService}.
 *
 * @author tvt
 * @see EmployeeTitlesHistoryLocalService
 * @generated
 */
public class EmployeeTitlesHistoryLocalServiceWrapper
	implements EmployeeTitlesHistoryLocalService,
		ServiceWrapper<EmployeeTitlesHistoryLocalService> {
	public EmployeeTitlesHistoryLocalServiceWrapper(
		EmployeeTitlesHistoryLocalService employeeTitlesHistoryLocalService) {
		_employeeTitlesHistoryLocalService = employeeTitlesHistoryLocalService;
	}

	/**
	* Adds the employee titles history to the database. Also notifies the appropriate model listeners.
	*
	* @param employeeTitlesHistory the employee titles history
	* @return the employee titles history that was added
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.com.ecopharma.emp.model.EmployeeTitlesHistory addEmployeeTitlesHistory(
		vn.com.ecopharma.emp.model.EmployeeTitlesHistory employeeTitlesHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeTitlesHistoryLocalService.addEmployeeTitlesHistory(employeeTitlesHistory);
	}

	/**
	* Creates a new employee titles history with the primary key. Does not add the employee titles history to the database.
	*
	* @param employeeTitlesHistoryId the primary key for the new employee titles history
	* @return the new employee titles history
	*/
	@Override
	public vn.com.ecopharma.emp.model.EmployeeTitlesHistory createEmployeeTitlesHistory(
		long employeeTitlesHistoryId) {
		return _employeeTitlesHistoryLocalService.createEmployeeTitlesHistory(employeeTitlesHistoryId);
	}

	/**
	* Deletes the employee titles history with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeTitlesHistoryId the primary key of the employee titles history
	* @return the employee titles history that was removed
	* @throws PortalException if a employee titles history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.com.ecopharma.emp.model.EmployeeTitlesHistory deleteEmployeeTitlesHistory(
		long employeeTitlesHistoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeTitlesHistoryLocalService.deleteEmployeeTitlesHistory(employeeTitlesHistoryId);
	}

	/**
	* Deletes the employee titles history from the database. Also notifies the appropriate model listeners.
	*
	* @param employeeTitlesHistory the employee titles history
	* @return the employee titles history that was removed
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.com.ecopharma.emp.model.EmployeeTitlesHistory deleteEmployeeTitlesHistory(
		vn.com.ecopharma.emp.model.EmployeeTitlesHistory employeeTitlesHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeTitlesHistoryLocalService.deleteEmployeeTitlesHistory(employeeTitlesHistory);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _employeeTitlesHistoryLocalService.dynamicQuery();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeTitlesHistoryLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.EmployeeTitlesHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeTitlesHistoryLocalService.dynamicQuery(dynamicQuery,
			start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.EmployeeTitlesHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	* @throws SystemException if a system exception occurred
	*/
	@Override
	@SuppressWarnings("rawtypes")
	public java.util.List dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeTitlesHistoryLocalService.dynamicQuery(dynamicQuery,
			start, end, orderByComparator);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeTitlesHistoryLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows that match the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows that match the dynamic query
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeTitlesHistoryLocalService.dynamicQueryCount(dynamicQuery,
			projection);
	}

	@Override
	public vn.com.ecopharma.emp.model.EmployeeTitlesHistory fetchEmployeeTitlesHistory(
		long employeeTitlesHistoryId)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeTitlesHistoryLocalService.fetchEmployeeTitlesHistory(employeeTitlesHistoryId);
	}

	/**
	* Returns the employee titles history with the primary key.
	*
	* @param employeeTitlesHistoryId the primary key of the employee titles history
	* @return the employee titles history
	* @throws PortalException if a employee titles history with the primary key could not be found
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.com.ecopharma.emp.model.EmployeeTitlesHistory getEmployeeTitlesHistory(
		long employeeTitlesHistoryId)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeTitlesHistoryLocalService.getEmployeeTitlesHistory(employeeTitlesHistoryId);
	}

	@Override
	public com.liferay.portal.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException,
			com.liferay.portal.kernel.exception.SystemException {
		return _employeeTitlesHistoryLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns a range of all the employee titles histories.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.EmployeeTitlesHistoryModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of employee titles histories
	* @param end the upper bound of the range of employee titles histories (not inclusive)
	* @return the range of employee titles histories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public java.util.List<vn.com.ecopharma.emp.model.EmployeeTitlesHistory> getEmployeeTitlesHistories(
		int start, int end)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeTitlesHistoryLocalService.getEmployeeTitlesHistories(start,
			end);
	}

	/**
	* Returns the number of employee titles histories.
	*
	* @return the number of employee titles histories
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public int getEmployeeTitlesHistoriesCount()
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeTitlesHistoryLocalService.getEmployeeTitlesHistoriesCount();
	}

	/**
	* Updates the employee titles history in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param employeeTitlesHistory the employee titles history
	* @return the employee titles history that was updated
	* @throws SystemException if a system exception occurred
	*/
	@Override
	public vn.com.ecopharma.emp.model.EmployeeTitlesHistory updateEmployeeTitlesHistory(
		vn.com.ecopharma.emp.model.EmployeeTitlesHistory employeeTitlesHistory)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeTitlesHistoryLocalService.updateEmployeeTitlesHistory(employeeTitlesHistory);
	}

	/**
	* Returns the Spring bean ID for this bean.
	*
	* @return the Spring bean ID for this bean
	*/
	@Override
	public java.lang.String getBeanIdentifier() {
		return _employeeTitlesHistoryLocalService.getBeanIdentifier();
	}

	/**
	* Sets the Spring bean ID for this bean.
	*
	* @param beanIdentifier the Spring bean ID for this bean
	*/
	@Override
	public void setBeanIdentifier(java.lang.String beanIdentifier) {
		_employeeTitlesHistoryLocalService.setBeanIdentifier(beanIdentifier);
	}

	@Override
	public java.lang.Object invokeMethod(java.lang.String name,
		java.lang.String[] parameterTypes, java.lang.Object[] arguments)
		throws java.lang.Throwable {
		return _employeeTitlesHistoryLocalService.invokeMethod(name,
			parameterTypes, arguments);
	}

	@Override
	public java.util.List<vn.com.ecopharma.emp.model.EmployeeTitlesHistory> findAll() {
		return _employeeTitlesHistoryLocalService.findAll();
	}

	@Override
	public java.util.List<vn.com.ecopharma.emp.model.EmployeeTitlesHistory> findAll(
		int start, int end) {
		return _employeeTitlesHistoryLocalService.findAll(start, end);
	}

	@Override
	public java.util.List<vn.com.ecopharma.emp.model.EmployeeTitlesHistory> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator orderByComparator) {
		return _employeeTitlesHistoryLocalService.findAll(start, end,
			orderByComparator);
	}

	@Override
	public vn.com.ecopharma.emp.model.EmployeeTitlesHistory addEmployeeTitlesHistory(
		long employeeId, long titlesId, java.lang.String note,
		java.util.Date set_date,
		com.liferay.portal.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.SystemException {
		return _employeeTitlesHistoryLocalService.addEmployeeTitlesHistory(employeeId,
			titlesId, note, set_date, serviceContext);
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #getWrappedService}
	 */
	public EmployeeTitlesHistoryLocalService getWrappedEmployeeTitlesHistoryLocalService() {
		return _employeeTitlesHistoryLocalService;
	}

	/**
	 * @deprecated As of 6.1.0, replaced by {@link #setWrappedService}
	 */
	public void setWrappedEmployeeTitlesHistoryLocalService(
		EmployeeTitlesHistoryLocalService employeeTitlesHistoryLocalService) {
		_employeeTitlesHistoryLocalService = employeeTitlesHistoryLocalService;
	}

	@Override
	public EmployeeTitlesHistoryLocalService getWrappedService() {
		return _employeeTitlesHistoryLocalService;
	}

	@Override
	public void setWrappedService(
		EmployeeTitlesHistoryLocalService employeeTitlesHistoryLocalService) {
		_employeeTitlesHistoryLocalService = employeeTitlesHistoryLocalService;
	}

	private EmployeeTitlesHistoryLocalService _employeeTitlesHistoryLocalService;
}