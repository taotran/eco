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

package vn.com.ecopharma.emp.model;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.model.BaseModel;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.GroupedModel;
import com.liferay.portal.service.ServiceContext;

import com.liferay.portlet.expando.model.ExpandoBridge;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Document service. Represents a row in the &quot;eco_em_portlet_Document&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link vn.com.ecopharma.emp.model.impl.DocumentModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link vn.com.ecopharma.emp.model.impl.DocumentImpl}.
 * </p>
 *
 * @author tvt
 * @see Document
 * @see vn.com.ecopharma.emp.model.impl.DocumentImpl
 * @see vn.com.ecopharma.emp.model.impl.DocumentModelImpl
 * @generated
 */
public interface DocumentModel extends BaseModel<Document>, GroupedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a document model instance should use the {@link Document} interface instead.
	 */

	/**
	 * Returns the primary key of this document.
	 *
	 * @return the primary key of this document
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this document.
	 *
	 * @param primaryKey the primary key of this document
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the document ID of this document.
	 *
	 * @return the document ID of this document
	 */
	public long getDocumentId();

	/**
	 * Sets the document ID of this document.
	 *
	 * @param documentId the document ID of this document
	 */
	public void setDocumentId(long documentId);

	/**
	 * Returns the class name of this document.
	 *
	 * @return the class name of this document
	 */
	@AutoEscape
	public String getClassName();

	/**
	 * Sets the class name of this document.
	 *
	 * @param className the class name of this document
	 */
	public void setClassName(String className);

	/**
	 * Returns the class p k of this document.
	 *
	 * @return the class p k of this document
	 */
	public long getClassPK();

	/**
	 * Sets the class p k of this document.
	 *
	 * @param classPK the class p k of this document
	 */
	public void setClassPK(long classPK);

	/**
	 * Returns the file entry ID of this document.
	 *
	 * @return the file entry ID of this document
	 */
	public long getFileEntryId();

	/**
	 * Sets the file entry ID of this document.
	 *
	 * @param fileEntryId the file entry ID of this document
	 */
	public void setFileEntryId(long fileEntryId);

	/**
	 * Returns the document type of this document.
	 *
	 * @return the document type of this document
	 */
	@AutoEscape
	public String getDocumentType();

	/**
	 * Sets the document type of this document.
	 *
	 * @param documentType the document type of this document
	 */
	public void setDocumentType(String documentType);

	/**
	 * Returns the group ID of this document.
	 *
	 * @return the group ID of this document
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this document.
	 *
	 * @param groupId the group ID of this document
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this document.
	 *
	 * @return the company ID of this document
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this document.
	 *
	 * @param companyId the company ID of this document
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this document.
	 *
	 * @return the user ID of this document
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this document.
	 *
	 * @param userId the user ID of this document
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this document.
	 *
	 * @return the user uuid of this document
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public String getUserUuid() throws SystemException;

	/**
	 * Sets the user uuid of this document.
	 *
	 * @param userUuid the user uuid of this document
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this document.
	 *
	 * @return the user name of this document
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this document.
	 *
	 * @param userName the user name of this document
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this document.
	 *
	 * @return the create date of this document
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this document.
	 *
	 * @param createDate the create date of this document
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this document.
	 *
	 * @return the modified date of this document
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this document.
	 *
	 * @param modifiedDate the modified date of this document
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Document document);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Document> toCacheModel();

	@Override
	public Document toEscapedModel();

	@Override
	public Document toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}