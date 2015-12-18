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

import com.liferay.portal.kernel.exception.SystemException;

import vn.com.ecopharma.emp.model.Location;
import vn.com.ecopharma.emp.service.LocationLocalServiceUtil;

/**
 * The extended model base implementation for the Location service. Represents a row in the &quot;eco_em_portlet_Location&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link LocationImpl}.
 * </p>
 *
 * @author tvt
 * @see LocationImpl
 * @see vn.com.ecopharma.emp.model.Location
 * @generated
 */
public abstract class LocationBaseImpl extends LocationModelImpl
	implements Location {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a location model instance should use the {@link Location} interface instead.
	 */
	@Override
	public void persist() throws SystemException {
		if (this.isNew()) {
			LocationLocalServiceUtil.addLocation(this);
		}
		else {
			LocationLocalServiceUtil.updateLocation(this);
		}
	}
}