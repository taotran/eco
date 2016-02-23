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

import com.liferay.portal.kernel.cache.CacheRegistryUtil;
import com.liferay.portal.kernel.dao.orm.EntityCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderCacheUtil;
import com.liferay.portal.kernel.dao.orm.FinderPath;
import com.liferay.portal.kernel.dao.orm.Query;
import com.liferay.portal.kernel.dao.orm.QueryPos;
import com.liferay.portal.kernel.dao.orm.QueryUtil;
import com.liferay.portal.kernel.dao.orm.Session;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.InstanceFactory;
import com.liferay.portal.kernel.util.OrderByComparator;
import com.liferay.portal.kernel.util.PropsKeys;
import com.liferay.portal.kernel.util.PropsUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.kernel.util.StringUtil;
import com.liferay.portal.kernel.util.UnmodifiableList;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.ModelListener;
import com.liferay.portal.service.persistence.impl.BasePersistenceImpl;

import vn.com.ecopharma.emp.NoSuchDocumentException;
import vn.com.ecopharma.emp.model.Document;
import vn.com.ecopharma.emp.model.impl.DocumentImpl;
import vn.com.ecopharma.emp.model.impl.DocumentModelImpl;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * The persistence implementation for the document service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author tvt
 * @see DocumentPersistence
 * @see DocumentUtil
 * @generated
 */
public class DocumentPersistenceImpl extends BasePersistenceImpl<Document>
	implements DocumentPersistence {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. Always use {@link DocumentUtil} to access the document persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static final String FINDER_CLASS_NAME_ENTITY = DocumentImpl.class.getName();
	public static final String FINDER_CLASS_NAME_LIST_WITH_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List1";
	public static final String FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION = FINDER_CLASS_NAME_ENTITY +
		".List2";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_ALL = new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, DocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL = new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, DocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findAll", new String[0]);
	public static final FinderPath FINDER_PATH_COUNT_ALL = new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countAll", new String[0]);
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CLASSNAMECLASSPKANDTYPE =
		new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, DocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByClassNameClassPKAndType",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLASSNAMECLASSPKANDTYPE =
		new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, DocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByClassNameClassPKAndType",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName()
			},
			DocumentModelImpl.CLASSNAME_COLUMN_BITMASK |
			DocumentModelImpl.CLASSPK_COLUMN_BITMASK |
			DocumentModelImpl.DOCUMENTTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CLASSNAMECLASSPKANDTYPE = new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByClassNameClassPKAndType",
			new String[] {
				String.class.getName(), Long.class.getName(),
				String.class.getName()
			});

	/**
	 * Returns all the documents where className = &#63; and classPK = &#63; and documentType = &#63;.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param documentType the document type
	 * @return the matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Document> findByClassNameClassPKAndType(String className,
		long classPK, String documentType) throws SystemException {
		return findByClassNameClassPKAndType(className, classPK, documentType,
			QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the documents where className = &#63; and classPK = &#63; and documentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.DocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param documentType the document type
	 * @param start the lower bound of the range of documents
	 * @param end the upper bound of the range of documents (not inclusive)
	 * @return the range of matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Document> findByClassNameClassPKAndType(String className,
		long classPK, String documentType, int start, int end)
		throws SystemException {
		return findByClassNameClassPKAndType(className, classPK, documentType,
			start, end, null);
	}

	/**
	 * Returns an ordered range of all the documents where className = &#63; and classPK = &#63; and documentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.DocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param documentType the document type
	 * @param start the lower bound of the range of documents
	 * @param end the upper bound of the range of documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Document> findByClassNameClassPKAndType(String className,
		long classPK, String documentType, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLASSNAMECLASSPKANDTYPE;
			finderArgs = new Object[] { className, classPK, documentType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CLASSNAMECLASSPKANDTYPE;
			finderArgs = new Object[] {
					className, classPK, documentType,
					
					start, end, orderByComparator
				};
		}

		List<Document> list = (List<Document>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Document document : list) {
				if (!Validator.equals(className, document.getClassName()) ||
						(classPK != document.getClassPK()) ||
						!Validator.equals(documentType,
							document.getDocumentType())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(5 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(5);
			}

			query.append(_SQL_SELECT_DOCUMENT_WHERE);

			boolean bindClassName = false;

			if (className == null) {
				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSNAME_1);
			}
			else if (className.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSNAME_3);
			}
			else {
				bindClassName = true;

				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSNAME_2);
			}

			query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSPK_2);

			boolean bindDocumentType = false;

			if (documentType == null) {
				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_DOCUMENTTYPE_1);
			}
			else if (documentType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_DOCUMENTTYPE_3);
			}
			else {
				bindDocumentType = true;

				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_DOCUMENTTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindClassName) {
					qPos.add(className);
				}

				qPos.add(classPK);

				if (bindDocumentType) {
					qPos.add(documentType);
				}

				if (!pagination) {
					list = (List<Document>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Document>(list);
				}
				else {
					list = (List<Document>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first document in the ordered set where className = &#63; and classPK = &#63; and documentType = &#63;.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document findByClassNameClassPKAndType_First(String className,
		long classPK, String documentType, OrderByComparator orderByComparator)
		throws NoSuchDocumentException, SystemException {
		Document document = fetchByClassNameClassPKAndType_First(className,
				classPK, documentType, orderByComparator);

		if (document != null) {
			return document;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("className=");
		msg.append(className);

		msg.append(", classPK=");
		msg.append(classPK);

		msg.append(", documentType=");
		msg.append(documentType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentException(msg.toString());
	}

	/**
	 * Returns the first document in the ordered set where className = &#63; and classPK = &#63; and documentType = &#63;.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document, or <code>null</code> if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document fetchByClassNameClassPKAndType_First(String className,
		long classPK, String documentType, OrderByComparator orderByComparator)
		throws SystemException {
		List<Document> list = findByClassNameClassPKAndType(className, classPK,
				documentType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document in the ordered set where className = &#63; and classPK = &#63; and documentType = &#63;.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document findByClassNameClassPKAndType_Last(String className,
		long classPK, String documentType, OrderByComparator orderByComparator)
		throws NoSuchDocumentException, SystemException {
		Document document = fetchByClassNameClassPKAndType_Last(className,
				classPK, documentType, orderByComparator);

		if (document != null) {
			return document;
		}

		StringBundler msg = new StringBundler(8);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("className=");
		msg.append(className);

		msg.append(", classPK=");
		msg.append(classPK);

		msg.append(", documentType=");
		msg.append(documentType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentException(msg.toString());
	}

	/**
	 * Returns the last document in the ordered set where className = &#63; and classPK = &#63; and documentType = &#63;.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document, or <code>null</code> if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document fetchByClassNameClassPKAndType_Last(String className,
		long classPK, String documentType, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByClassNameClassPKAndType(className, classPK,
				documentType);

		if (count == 0) {
			return null;
		}

		List<Document> list = findByClassNameClassPKAndType(className, classPK,
				documentType, count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the documents before and after the current document in the ordered set where className = &#63; and classPK = &#63; and documentType = &#63;.
	 *
	 * @param documentId the primary key of the current document
	 * @param className the class name
	 * @param classPK the class p k
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document[] findByClassNameClassPKAndType_PrevAndNext(
		long documentId, String className, long classPK, String documentType,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentException, SystemException {
		Document document = findByPrimaryKey(documentId);

		Session session = null;

		try {
			session = openSession();

			Document[] array = new DocumentImpl[3];

			array[0] = getByClassNameClassPKAndType_PrevAndNext(session,
					document, className, classPK, documentType,
					orderByComparator, true);

			array[1] = document;

			array[2] = getByClassNameClassPKAndType_PrevAndNext(session,
					document, className, classPK, documentType,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Document getByClassNameClassPKAndType_PrevAndNext(
		Session session, Document document, String className, long classPK,
		String documentType, OrderByComparator orderByComparator,
		boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENT_WHERE);

		boolean bindClassName = false;

		if (className == null) {
			query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSNAME_1);
		}
		else if (className.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSNAME_3);
		}
		else {
			bindClassName = true;

			query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSNAME_2);
		}

		query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSPK_2);

		boolean bindDocumentType = false;

		if (documentType == null) {
			query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_DOCUMENTTYPE_1);
		}
		else if (documentType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_DOCUMENTTYPE_3);
		}
		else {
			bindDocumentType = true;

			query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_DOCUMENTTYPE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindClassName) {
			qPos.add(className);
		}

		qPos.add(classPK);

		if (bindDocumentType) {
			qPos.add(documentType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(document);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Document> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the documents where className = &#63; and classPK = &#63; and documentType = &#63; from the database.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param documentType the document type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByClassNameClassPKAndType(String className, long classPK,
		String documentType) throws SystemException {
		for (Document document : findByClassNameClassPKAndType(className,
				classPK, documentType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
				null)) {
			remove(document);
		}
	}

	/**
	 * Returns the number of documents where className = &#63; and classPK = &#63; and documentType = &#63;.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param documentType the document type
	 * @return the number of matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByClassNameClassPKAndType(String className, long classPK,
		String documentType) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CLASSNAMECLASSPKANDTYPE;

		Object[] finderArgs = new Object[] { className, classPK, documentType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DOCUMENT_WHERE);

			boolean bindClassName = false;

			if (className == null) {
				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSNAME_1);
			}
			else if (className.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSNAME_3);
			}
			else {
				bindClassName = true;

				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSNAME_2);
			}

			query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSPK_2);

			boolean bindDocumentType = false;

			if (documentType == null) {
				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_DOCUMENTTYPE_1);
			}
			else if (documentType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_DOCUMENTTYPE_3);
			}
			else {
				bindDocumentType = true;

				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_DOCUMENTTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindClassName) {
					qPos.add(className);
				}

				qPos.add(classPK);

				if (bindDocumentType) {
					qPos.add(documentType);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSNAME_1 =
		"document.className IS NULL AND ";
	private static final String _FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSNAME_2 =
		"document.className = ? AND ";
	private static final String _FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSNAME_3 =
		"(document.className IS NULL OR document.className = '') AND ";
	private static final String _FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_CLASSPK_2 =
		"document.classPK = ? AND ";
	private static final String _FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_DOCUMENTTYPE_1 =
		"document.documentType IS NULL";
	private static final String _FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_DOCUMENTTYPE_2 =
		"document.documentType = ?";
	private static final String _FINDER_COLUMN_CLASSNAMECLASSPKANDTYPE_DOCUMENTTYPE_3 =
		"(document.documentType IS NULL OR document.documentType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_CLASSNAMEANDCLASSPK =
		new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, DocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION,
			"findByClassNameAndClassPK",
			new String[] {
				String.class.getName(), Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLASSNAMEANDCLASSPK =
		new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, DocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"findByClassNameAndClassPK",
			new String[] { String.class.getName(), Long.class.getName() },
			DocumentModelImpl.CLASSNAME_COLUMN_BITMASK |
			DocumentModelImpl.CLASSPK_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CLASSNAMEANDCLASSPK = new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByClassNameAndClassPK",
			new String[] { String.class.getName(), Long.class.getName() });

	/**
	 * Returns all the documents where className = &#63; and classPK = &#63;.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @return the matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Document> findByClassNameAndClassPK(String className,
		long classPK) throws SystemException {
		return findByClassNameAndClassPK(className, classPK, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the documents where className = &#63; and classPK = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.DocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param start the lower bound of the range of documents
	 * @param end the upper bound of the range of documents (not inclusive)
	 * @return the range of matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Document> findByClassNameAndClassPK(String className,
		long classPK, int start, int end) throws SystemException {
		return findByClassNameAndClassPK(className, classPK, start, end, null);
	}

	/**
	 * Returns an ordered range of all the documents where className = &#63; and classPK = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.DocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param start the lower bound of the range of documents
	 * @param end the upper bound of the range of documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Document> findByClassNameAndClassPK(String className,
		long classPK, int start, int end, OrderByComparator orderByComparator)
		throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLASSNAMEANDCLASSPK;
			finderArgs = new Object[] { className, classPK };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_CLASSNAMEANDCLASSPK;
			finderArgs = new Object[] {
					className, classPK,
					
					start, end, orderByComparator
				};
		}

		List<Document> list = (List<Document>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Document document : list) {
				if (!Validator.equals(className, document.getClassName()) ||
						(classPK != document.getClassPK())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(4 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(4);
			}

			query.append(_SQL_SELECT_DOCUMENT_WHERE);

			boolean bindClassName = false;

			if (className == null) {
				query.append(_FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSNAME_1);
			}
			else if (className.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSNAME_3);
			}
			else {
				bindClassName = true;

				query.append(_FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSNAME_2);
			}

			query.append(_FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSPK_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindClassName) {
					qPos.add(className);
				}

				qPos.add(classPK);

				if (!pagination) {
					list = (List<Document>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Document>(list);
				}
				else {
					list = (List<Document>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first document in the ordered set where className = &#63; and classPK = &#63;.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document findByClassNameAndClassPK_First(String className,
		long classPK, OrderByComparator orderByComparator)
		throws NoSuchDocumentException, SystemException {
		Document document = fetchByClassNameAndClassPK_First(className,
				classPK, orderByComparator);

		if (document != null) {
			return document;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("className=");
		msg.append(className);

		msg.append(", classPK=");
		msg.append(classPK);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentException(msg.toString());
	}

	/**
	 * Returns the first document in the ordered set where className = &#63; and classPK = &#63;.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document, or <code>null</code> if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document fetchByClassNameAndClassPK_First(String className,
		long classPK, OrderByComparator orderByComparator)
		throws SystemException {
		List<Document> list = findByClassNameAndClassPK(className, classPK, 0,
				1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document in the ordered set where className = &#63; and classPK = &#63;.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document findByClassNameAndClassPK_Last(String className,
		long classPK, OrderByComparator orderByComparator)
		throws NoSuchDocumentException, SystemException {
		Document document = fetchByClassNameAndClassPK_Last(className, classPK,
				orderByComparator);

		if (document != null) {
			return document;
		}

		StringBundler msg = new StringBundler(6);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("className=");
		msg.append(className);

		msg.append(", classPK=");
		msg.append(classPK);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentException(msg.toString());
	}

	/**
	 * Returns the last document in the ordered set where className = &#63; and classPK = &#63;.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document, or <code>null</code> if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document fetchByClassNameAndClassPK_Last(String className,
		long classPK, OrderByComparator orderByComparator)
		throws SystemException {
		int count = countByClassNameAndClassPK(className, classPK);

		if (count == 0) {
			return null;
		}

		List<Document> list = findByClassNameAndClassPK(className, classPK,
				count - 1, count, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the documents before and after the current document in the ordered set where className = &#63; and classPK = &#63;.
	 *
	 * @param documentId the primary key of the current document
	 * @param className the class name
	 * @param classPK the class p k
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document[] findByClassNameAndClassPK_PrevAndNext(long documentId,
		String className, long classPK, OrderByComparator orderByComparator)
		throws NoSuchDocumentException, SystemException {
		Document document = findByPrimaryKey(documentId);

		Session session = null;

		try {
			session = openSession();

			Document[] array = new DocumentImpl[3];

			array[0] = getByClassNameAndClassPK_PrevAndNext(session, document,
					className, classPK, orderByComparator, true);

			array[1] = document;

			array[2] = getByClassNameAndClassPK_PrevAndNext(session, document,
					className, classPK, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Document getByClassNameAndClassPK_PrevAndNext(Session session,
		Document document, String className, long classPK,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENT_WHERE);

		boolean bindClassName = false;

		if (className == null) {
			query.append(_FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSNAME_1);
		}
		else if (className.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSNAME_3);
		}
		else {
			bindClassName = true;

			query.append(_FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSNAME_2);
		}

		query.append(_FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSPK_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindClassName) {
			qPos.add(className);
		}

		qPos.add(classPK);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(document);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Document> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the documents where className = &#63; and classPK = &#63; from the database.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByClassNameAndClassPK(String className, long classPK)
		throws SystemException {
		for (Document document : findByClassNameAndClassPK(className, classPK,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(document);
		}
	}

	/**
	 * Returns the number of documents where className = &#63; and classPK = &#63;.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @return the number of matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByClassNameAndClassPK(String className, long classPK)
		throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CLASSNAMEANDCLASSPK;

		Object[] finderArgs = new Object[] { className, classPK };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(3);

			query.append(_SQL_COUNT_DOCUMENT_WHERE);

			boolean bindClassName = false;

			if (className == null) {
				query.append(_FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSNAME_1);
			}
			else if (className.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSNAME_3);
			}
			else {
				bindClassName = true;

				query.append(_FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSNAME_2);
			}

			query.append(_FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSPK_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindClassName) {
					qPos.add(className);
				}

				qPos.add(classPK);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSNAME_1 = "document.className IS NULL AND ";
	private static final String _FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSNAME_2 = "document.className = ? AND ";
	private static final String _FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSNAME_3 = "(document.className IS NULL OR document.className = '') AND ";
	private static final String _FINDER_COLUMN_CLASSNAMEANDCLASSPK_CLASSPK_2 = "document.classPK = ?";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPE = new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, DocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByType",
			new String[] {
				String.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE = new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, DocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByType",
			new String[] { String.class.getName() },
			DocumentModelImpl.DOCUMENTTYPE_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_TYPE = new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByType",
			new String[] { String.class.getName() });

	/**
	 * Returns all the documents where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @return the matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Document> findByType(String documentType)
		throws SystemException {
		return findByType(documentType, QueryUtil.ALL_POS, QueryUtil.ALL_POS,
			null);
	}

	/**
	 * Returns a range of all the documents where documentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.DocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentType the document type
	 * @param start the lower bound of the range of documents
	 * @param end the upper bound of the range of documents (not inclusive)
	 * @return the range of matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Document> findByType(String documentType, int start, int end)
		throws SystemException {
		return findByType(documentType, start, end, null);
	}

	/**
	 * Returns an ordered range of all the documents where documentType = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.DocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param documentType the document type
	 * @param start the lower bound of the range of documents
	 * @param end the upper bound of the range of documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Document> findByType(String documentType, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE;
			finderArgs = new Object[] { documentType };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_TYPE;
			finderArgs = new Object[] {
					documentType,
					
					start, end, orderByComparator
				};
		}

		List<Document> list = (List<Document>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Document document : list) {
				if (!Validator.equals(documentType, document.getDocumentType())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_DOCUMENT_WHERE);

			boolean bindDocumentType = false;

			if (documentType == null) {
				query.append(_FINDER_COLUMN_TYPE_DOCUMENTTYPE_1);
			}
			else if (documentType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TYPE_DOCUMENTTYPE_3);
			}
			else {
				bindDocumentType = true;

				query.append(_FINDER_COLUMN_TYPE_DOCUMENTTYPE_2);
			}

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocumentType) {
					qPos.add(documentType);
				}

				if (!pagination) {
					list = (List<Document>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Document>(list);
				}
				else {
					list = (List<Document>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first document in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document findByType_First(String documentType,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentException, SystemException {
		Document document = fetchByType_First(documentType, orderByComparator);

		if (document != null) {
			return document;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentType=");
		msg.append(documentType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentException(msg.toString());
	}

	/**
	 * Returns the first document in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document, or <code>null</code> if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document fetchByType_First(String documentType,
		OrderByComparator orderByComparator) throws SystemException {
		List<Document> list = findByType(documentType, 0, 1, orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document findByType_Last(String documentType,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentException, SystemException {
		Document document = fetchByType_Last(documentType, orderByComparator);

		if (document != null) {
			return document;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("documentType=");
		msg.append(documentType);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentException(msg.toString());
	}

	/**
	 * Returns the last document in the ordered set where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document, or <code>null</code> if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document fetchByType_Last(String documentType,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByType(documentType);

		if (count == 0) {
			return null;
		}

		List<Document> list = findByType(documentType, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the documents before and after the current document in the ordered set where documentType = &#63;.
	 *
	 * @param documentId the primary key of the current document
	 * @param documentType the document type
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document[] findByType_PrevAndNext(long documentId,
		String documentType, OrderByComparator orderByComparator)
		throws NoSuchDocumentException, SystemException {
		Document document = findByPrimaryKey(documentId);

		Session session = null;

		try {
			session = openSession();

			Document[] array = new DocumentImpl[3];

			array[0] = getByType_PrevAndNext(session, document, documentType,
					orderByComparator, true);

			array[1] = document;

			array[2] = getByType_PrevAndNext(session, document, documentType,
					orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Document getByType_PrevAndNext(Session session,
		Document document, String documentType,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENT_WHERE);

		boolean bindDocumentType = false;

		if (documentType == null) {
			query.append(_FINDER_COLUMN_TYPE_DOCUMENTTYPE_1);
		}
		else if (documentType.equals(StringPool.BLANK)) {
			query.append(_FINDER_COLUMN_TYPE_DOCUMENTTYPE_3);
		}
		else {
			bindDocumentType = true;

			query.append(_FINDER_COLUMN_TYPE_DOCUMENTTYPE_2);
		}

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		if (bindDocumentType) {
			qPos.add(documentType);
		}

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(document);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Document> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the documents where documentType = &#63; from the database.
	 *
	 * @param documentType the document type
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByType(String documentType) throws SystemException {
		for (Document document : findByType(documentType, QueryUtil.ALL_POS,
				QueryUtil.ALL_POS, null)) {
			remove(document);
		}
	}

	/**
	 * Returns the number of documents where documentType = &#63;.
	 *
	 * @param documentType the document type
	 * @return the number of matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByType(String documentType) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_TYPE;

		Object[] finderArgs = new Object[] { documentType };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCUMENT_WHERE);

			boolean bindDocumentType = false;

			if (documentType == null) {
				query.append(_FINDER_COLUMN_TYPE_DOCUMENTTYPE_1);
			}
			else if (documentType.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_TYPE_DOCUMENTTYPE_3);
			}
			else {
				bindDocumentType = true;

				query.append(_FINDER_COLUMN_TYPE_DOCUMENTTYPE_2);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindDocumentType) {
					qPos.add(documentType);
				}

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_TYPE_DOCUMENTTYPE_1 = "document.documentType IS NULL";
	private static final String _FINDER_COLUMN_TYPE_DOCUMENTTYPE_2 = "document.documentType = ?";
	private static final String _FINDER_COLUMN_TYPE_DOCUMENTTYPE_3 = "(document.documentType IS NULL OR document.documentType = '')";
	public static final FinderPath FINDER_PATH_WITH_PAGINATION_FIND_BY_FILEENTRY =
		new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, DocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITH_PAGINATION, "findByFileEntry",
			new String[] {
				Long.class.getName(),
				
			Integer.class.getName(), Integer.class.getName(),
				OrderByComparator.class.getName()
			});
	public static final FinderPath FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEENTRY =
		new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, DocumentImpl.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "findByFileEntry",
			new String[] { Long.class.getName() },
			DocumentModelImpl.FILEENTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_FILEENTRY = new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION, "countByFileEntry",
			new String[] { Long.class.getName() });

	/**
	 * Returns all the documents where fileEntryId = &#63;.
	 *
	 * @param fileEntryId the file entry ID
	 * @return the matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Document> findByFileEntry(long fileEntryId)
		throws SystemException {
		return findByFileEntry(fileEntryId, QueryUtil.ALL_POS,
			QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the documents where fileEntryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.DocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fileEntryId the file entry ID
	 * @param start the lower bound of the range of documents
	 * @param end the upper bound of the range of documents (not inclusive)
	 * @return the range of matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Document> findByFileEntry(long fileEntryId, int start, int end)
		throws SystemException {
		return findByFileEntry(fileEntryId, start, end, null);
	}

	/**
	 * Returns an ordered range of all the documents where fileEntryId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.DocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param fileEntryId the file entry ID
	 * @param start the lower bound of the range of documents
	 * @param end the upper bound of the range of documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Document> findByFileEntry(long fileEntryId, int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEENTRY;
			finderArgs = new Object[] { fileEntryId };
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_BY_FILEENTRY;
			finderArgs = new Object[] { fileEntryId, start, end, orderByComparator };
		}

		List<Document> list = (List<Document>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if ((list != null) && !list.isEmpty()) {
			for (Document document : list) {
				if ((fileEntryId != document.getFileEntryId())) {
					list = null;

					break;
				}
			}
		}

		if (list == null) {
			StringBundler query = null;

			if (orderByComparator != null) {
				query = new StringBundler(3 +
						(orderByComparator.getOrderByFields().length * 3));
			}
			else {
				query = new StringBundler(3);
			}

			query.append(_SQL_SELECT_DOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_FILEENTRY_FILEENTRYID_2);

			if (orderByComparator != null) {
				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);
			}
			else
			 if (pagination) {
				query.append(DocumentModelImpl.ORDER_BY_JPQL);
			}

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fileEntryId);

				if (!pagination) {
					list = (List<Document>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Document>(list);
				}
				else {
					list = (List<Document>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Returns the first document in the ordered set where fileEntryId = &#63;.
	 *
	 * @param fileEntryId the file entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document findByFileEntry_First(long fileEntryId,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentException, SystemException {
		Document document = fetchByFileEntry_First(fileEntryId,
				orderByComparator);

		if (document != null) {
			return document;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fileEntryId=");
		msg.append(fileEntryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentException(msg.toString());
	}

	/**
	 * Returns the first document in the ordered set where fileEntryId = &#63;.
	 *
	 * @param fileEntryId the file entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching document, or <code>null</code> if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document fetchByFileEntry_First(long fileEntryId,
		OrderByComparator orderByComparator) throws SystemException {
		List<Document> list = findByFileEntry(fileEntryId, 0, 1,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the last document in the ordered set where fileEntryId = &#63;.
	 *
	 * @param fileEntryId the file entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document findByFileEntry_Last(long fileEntryId,
		OrderByComparator orderByComparator)
		throws NoSuchDocumentException, SystemException {
		Document document = fetchByFileEntry_Last(fileEntryId, orderByComparator);

		if (document != null) {
			return document;
		}

		StringBundler msg = new StringBundler(4);

		msg.append(_NO_SUCH_ENTITY_WITH_KEY);

		msg.append("fileEntryId=");
		msg.append(fileEntryId);

		msg.append(StringPool.CLOSE_CURLY_BRACE);

		throw new NoSuchDocumentException(msg.toString());
	}

	/**
	 * Returns the last document in the ordered set where fileEntryId = &#63;.
	 *
	 * @param fileEntryId the file entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching document, or <code>null</code> if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document fetchByFileEntry_Last(long fileEntryId,
		OrderByComparator orderByComparator) throws SystemException {
		int count = countByFileEntry(fileEntryId);

		if (count == 0) {
			return null;
		}

		List<Document> list = findByFileEntry(fileEntryId, count - 1, count,
				orderByComparator);

		if (!list.isEmpty()) {
			return list.get(0);
		}

		return null;
	}

	/**
	 * Returns the documents before and after the current document in the ordered set where fileEntryId = &#63;.
	 *
	 * @param documentId the primary key of the current document
	 * @param fileEntryId the file entry ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next document
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document[] findByFileEntry_PrevAndNext(long documentId,
		long fileEntryId, OrderByComparator orderByComparator)
		throws NoSuchDocumentException, SystemException {
		Document document = findByPrimaryKey(documentId);

		Session session = null;

		try {
			session = openSession();

			Document[] array = new DocumentImpl[3];

			array[0] = getByFileEntry_PrevAndNext(session, document,
					fileEntryId, orderByComparator, true);

			array[1] = document;

			array[2] = getByFileEntry_PrevAndNext(session, document,
					fileEntryId, orderByComparator, false);

			return array;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	protected Document getByFileEntry_PrevAndNext(Session session,
		Document document, long fileEntryId,
		OrderByComparator orderByComparator, boolean previous) {
		StringBundler query = null;

		if (orderByComparator != null) {
			query = new StringBundler(6 +
					(orderByComparator.getOrderByFields().length * 6));
		}
		else {
			query = new StringBundler(3);
		}

		query.append(_SQL_SELECT_DOCUMENT_WHERE);

		query.append(_FINDER_COLUMN_FILEENTRY_FILEENTRYID_2);

		if (orderByComparator != null) {
			String[] orderByConditionFields = orderByComparator.getOrderByConditionFields();

			if (orderByConditionFields.length > 0) {
				query.append(WHERE_AND);
			}

			for (int i = 0; i < orderByConditionFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByConditionFields[i]);

				if ((i + 1) < orderByConditionFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN_HAS_NEXT);
					}
					else {
						query.append(WHERE_LESSER_THAN_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(WHERE_GREATER_THAN);
					}
					else {
						query.append(WHERE_LESSER_THAN);
					}
				}
			}

			query.append(ORDER_BY_CLAUSE);

			String[] orderByFields = orderByComparator.getOrderByFields();

			for (int i = 0; i < orderByFields.length; i++) {
				query.append(_ORDER_BY_ENTITY_ALIAS);
				query.append(orderByFields[i]);

				if ((i + 1) < orderByFields.length) {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC_HAS_NEXT);
					}
					else {
						query.append(ORDER_BY_DESC_HAS_NEXT);
					}
				}
				else {
					if (orderByComparator.isAscending() ^ previous) {
						query.append(ORDER_BY_ASC);
					}
					else {
						query.append(ORDER_BY_DESC);
					}
				}
			}
		}
		else {
			query.append(DocumentModelImpl.ORDER_BY_JPQL);
		}

		String sql = query.toString();

		Query q = session.createQuery(sql);

		q.setFirstResult(0);
		q.setMaxResults(2);

		QueryPos qPos = QueryPos.getInstance(q);

		qPos.add(fileEntryId);

		if (orderByComparator != null) {
			Object[] values = orderByComparator.getOrderByConditionValues(document);

			for (Object value : values) {
				qPos.add(value);
			}
		}

		List<Document> list = q.list();

		if (list.size() == 2) {
			return list.get(1);
		}
		else {
			return null;
		}
	}

	/**
	 * Removes all the documents where fileEntryId = &#63; from the database.
	 *
	 * @param fileEntryId the file entry ID
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeByFileEntry(long fileEntryId) throws SystemException {
		for (Document document : findByFileEntry(fileEntryId,
				QueryUtil.ALL_POS, QueryUtil.ALL_POS, null)) {
			remove(document);
		}
	}

	/**
	 * Returns the number of documents where fileEntryId = &#63;.
	 *
	 * @param fileEntryId the file entry ID
	 * @return the number of matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByFileEntry(long fileEntryId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_FILEENTRY;

		Object[] finderArgs = new Object[] { fileEntryId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(2);

			query.append(_SQL_COUNT_DOCUMENT_WHERE);

			query.append(_FINDER_COLUMN_FILEENTRY_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				qPos.add(fileEntryId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_FILEENTRY_FILEENTRYID_2 = "document.fileEntryId = ?";
	public static final FinderPath FINDER_PATH_FETCH_BY_CLASSNAMECLASSPKANDFILEENTRY =
		new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, DocumentImpl.class,
			FINDER_CLASS_NAME_ENTITY, "fetchByClassNameClassPKAndFileEntry",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			},
			DocumentModelImpl.CLASSNAME_COLUMN_BITMASK |
			DocumentModelImpl.CLASSPK_COLUMN_BITMASK |
			DocumentModelImpl.FILEENTRYID_COLUMN_BITMASK);
	public static final FinderPath FINDER_PATH_COUNT_BY_CLASSNAMECLASSPKANDFILEENTRY =
		new FinderPath(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentModelImpl.FINDER_CACHE_ENABLED, Long.class,
			FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION,
			"countByClassNameClassPKAndFileEntry",
			new String[] {
				String.class.getName(), Long.class.getName(),
				Long.class.getName()
			});

	/**
	 * Returns the document where className = &#63; and classPK = &#63; and fileEntryId = &#63; or throws a {@link vn.com.ecopharma.emp.NoSuchDocumentException} if it could not be found.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param fileEntryId the file entry ID
	 * @return the matching document
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document findByClassNameClassPKAndFileEntry(String className,
		long classPK, long fileEntryId)
		throws NoSuchDocumentException, SystemException {
		Document document = fetchByClassNameClassPKAndFileEntry(className,
				classPK, fileEntryId);

		if (document == null) {
			StringBundler msg = new StringBundler(8);

			msg.append(_NO_SUCH_ENTITY_WITH_KEY);

			msg.append("className=");
			msg.append(className);

			msg.append(", classPK=");
			msg.append(classPK);

			msg.append(", fileEntryId=");
			msg.append(fileEntryId);

			msg.append(StringPool.CLOSE_CURLY_BRACE);

			if (_log.isWarnEnabled()) {
				_log.warn(msg.toString());
			}

			throw new NoSuchDocumentException(msg.toString());
		}

		return document;
	}

	/**
	 * Returns the document where className = &#63; and classPK = &#63; and fileEntryId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param fileEntryId the file entry ID
	 * @return the matching document, or <code>null</code> if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document fetchByClassNameClassPKAndFileEntry(String className,
		long classPK, long fileEntryId) throws SystemException {
		return fetchByClassNameClassPKAndFileEntry(className, classPK,
			fileEntryId, true);
	}

	/**
	 * Returns the document where className = &#63; and classPK = &#63; and fileEntryId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param fileEntryId the file entry ID
	 * @param retrieveFromCache whether to use the finder cache
	 * @return the matching document, or <code>null</code> if a matching document could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document fetchByClassNameClassPKAndFileEntry(String className,
		long classPK, long fileEntryId, boolean retrieveFromCache)
		throws SystemException {
		Object[] finderArgs = new Object[] { className, classPK, fileEntryId };

		Object result = null;

		if (retrieveFromCache) {
			result = FinderCacheUtil.getResult(FINDER_PATH_FETCH_BY_CLASSNAMECLASSPKANDFILEENTRY,
					finderArgs, this);
		}

		if (result instanceof Document) {
			Document document = (Document)result;

			if (!Validator.equals(className, document.getClassName()) ||
					(classPK != document.getClassPK()) ||
					(fileEntryId != document.getFileEntryId())) {
				result = null;
			}
		}

		if (result == null) {
			StringBundler query = new StringBundler(5);

			query.append(_SQL_SELECT_DOCUMENT_WHERE);

			boolean bindClassName = false;

			if (className == null) {
				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDFILEENTRY_CLASSNAME_1);
			}
			else if (className.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDFILEENTRY_CLASSNAME_3);
			}
			else {
				bindClassName = true;

				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDFILEENTRY_CLASSNAME_2);
			}

			query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDFILEENTRY_CLASSPK_2);

			query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDFILEENTRY_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindClassName) {
					qPos.add(className);
				}

				qPos.add(classPK);

				qPos.add(fileEntryId);

				List<Document> list = q.list();

				if (list.isEmpty()) {
					FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSNAMECLASSPKANDFILEENTRY,
						finderArgs, list);
				}
				else {
					if ((list.size() > 1) && _log.isWarnEnabled()) {
						_log.warn(
							"DocumentPersistenceImpl.fetchByClassNameClassPKAndFileEntry(String, long, long, boolean) with parameters (" +
							StringUtil.merge(finderArgs) +
							") yields a result set with more than 1 result. This violates the logical unique restriction. There is no order guarantee on which result is returned by this finder.");
					}

					Document document = list.get(0);

					result = document;

					cacheResult(document);

					if ((document.getClassName() == null) ||
							!document.getClassName().equals(className) ||
							(document.getClassPK() != classPK) ||
							(document.getFileEntryId() != fileEntryId)) {
						FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSNAMECLASSPKANDFILEENTRY,
							finderArgs, document);
					}
				}
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSNAMECLASSPKANDFILEENTRY,
					finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		if (result instanceof List<?>) {
			return null;
		}
		else {
			return (Document)result;
		}
	}

	/**
	 * Removes the document where className = &#63; and classPK = &#63; and fileEntryId = &#63; from the database.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param fileEntryId the file entry ID
	 * @return the document that was removed
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document removeByClassNameClassPKAndFileEntry(String className,
		long classPK, long fileEntryId)
		throws NoSuchDocumentException, SystemException {
		Document document = findByClassNameClassPKAndFileEntry(className,
				classPK, fileEntryId);

		return remove(document);
	}

	/**
	 * Returns the number of documents where className = &#63; and classPK = &#63; and fileEntryId = &#63;.
	 *
	 * @param className the class name
	 * @param classPK the class p k
	 * @param fileEntryId the file entry ID
	 * @return the number of matching documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countByClassNameClassPKAndFileEntry(String className,
		long classPK, long fileEntryId) throws SystemException {
		FinderPath finderPath = FINDER_PATH_COUNT_BY_CLASSNAMECLASSPKANDFILEENTRY;

		Object[] finderArgs = new Object[] { className, classPK, fileEntryId };

		Long count = (Long)FinderCacheUtil.getResult(finderPath, finderArgs,
				this);

		if (count == null) {
			StringBundler query = new StringBundler(4);

			query.append(_SQL_COUNT_DOCUMENT_WHERE);

			boolean bindClassName = false;

			if (className == null) {
				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDFILEENTRY_CLASSNAME_1);
			}
			else if (className.equals(StringPool.BLANK)) {
				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDFILEENTRY_CLASSNAME_3);
			}
			else {
				bindClassName = true;

				query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDFILEENTRY_CLASSNAME_2);
			}

			query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDFILEENTRY_CLASSPK_2);

			query.append(_FINDER_COLUMN_CLASSNAMECLASSPKANDFILEENTRY_FILEENTRYID_2);

			String sql = query.toString();

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				QueryPos qPos = QueryPos.getInstance(q);

				if (bindClassName) {
					qPos.add(className);
				}

				qPos.add(classPK);

				qPos.add(fileEntryId);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(finderPath, finderArgs, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	private static final String _FINDER_COLUMN_CLASSNAMECLASSPKANDFILEENTRY_CLASSNAME_1 =
		"document.className IS NULL AND ";
	private static final String _FINDER_COLUMN_CLASSNAMECLASSPKANDFILEENTRY_CLASSNAME_2 =
		"document.className = ? AND ";
	private static final String _FINDER_COLUMN_CLASSNAMECLASSPKANDFILEENTRY_CLASSNAME_3 =
		"(document.className IS NULL OR document.className = '') AND ";
	private static final String _FINDER_COLUMN_CLASSNAMECLASSPKANDFILEENTRY_CLASSPK_2 =
		"document.classPK = ? AND ";
	private static final String _FINDER_COLUMN_CLASSNAMECLASSPKANDFILEENTRY_FILEENTRYID_2 =
		"document.fileEntryId = ?";

	public DocumentPersistenceImpl() {
		setModelClass(Document.class);
	}

	/**
	 * Caches the document in the entity cache if it is enabled.
	 *
	 * @param document the document
	 */
	@Override
	public void cacheResult(Document document) {
		EntityCacheUtil.putResult(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentImpl.class, document.getPrimaryKey(), document);

		FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSNAMECLASSPKANDFILEENTRY,
			new Object[] {
				document.getClassName(), document.getClassPK(),
				document.getFileEntryId()
			}, document);

		document.resetOriginalValues();
	}

	/**
	 * Caches the documents in the entity cache if it is enabled.
	 *
	 * @param documents the documents
	 */
	@Override
	public void cacheResult(List<Document> documents) {
		for (Document document : documents) {
			if (EntityCacheUtil.getResult(
						DocumentModelImpl.ENTITY_CACHE_ENABLED,
						DocumentImpl.class, document.getPrimaryKey()) == null) {
				cacheResult(document);
			}
			else {
				document.resetOriginalValues();
			}
		}
	}

	/**
	 * Clears the cache for all documents.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache() {
		if (_HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE) {
			CacheRegistryUtil.clear(DocumentImpl.class.getName());
		}

		EntityCacheUtil.clearCache(DocumentImpl.class.getName());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	/**
	 * Clears the cache for the document.
	 *
	 * <p>
	 * The {@link com.liferay.portal.kernel.dao.orm.EntityCache} and {@link com.liferay.portal.kernel.dao.orm.FinderCache} are both cleared by this method.
	 * </p>
	 */
	@Override
	public void clearCache(Document document) {
		EntityCacheUtil.removeResult(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentImpl.class, document.getPrimaryKey());

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		clearUniqueFindersCache(document);
	}

	@Override
	public void clearCache(List<Document> documents) {
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);

		for (Document document : documents) {
			EntityCacheUtil.removeResult(DocumentModelImpl.ENTITY_CACHE_ENABLED,
				DocumentImpl.class, document.getPrimaryKey());

			clearUniqueFindersCache(document);
		}
	}

	protected void cacheUniqueFindersCache(Document document) {
		if (document.isNew()) {
			Object[] args = new Object[] {
					document.getClassName(), document.getClassPK(),
					document.getFileEntryId()
				};

			FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CLASSNAMECLASSPKANDFILEENTRY,
				args, Long.valueOf(1));
			FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSNAMECLASSPKANDFILEENTRY,
				args, document);
		}
		else {
			DocumentModelImpl documentModelImpl = (DocumentModelImpl)document;

			if ((documentModelImpl.getColumnBitmask() &
					FINDER_PATH_FETCH_BY_CLASSNAMECLASSPKANDFILEENTRY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						document.getClassName(), document.getClassPK(),
						document.getFileEntryId()
					};

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_BY_CLASSNAMECLASSPKANDFILEENTRY,
					args, Long.valueOf(1));
				FinderCacheUtil.putResult(FINDER_PATH_FETCH_BY_CLASSNAMECLASSPKANDFILEENTRY,
					args, document);
			}
		}
	}

	protected void clearUniqueFindersCache(Document document) {
		DocumentModelImpl documentModelImpl = (DocumentModelImpl)document;

		Object[] args = new Object[] {
				document.getClassName(), document.getClassPK(),
				document.getFileEntryId()
			};

		FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CLASSNAMECLASSPKANDFILEENTRY,
			args);
		FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSNAMECLASSPKANDFILEENTRY,
			args);

		if ((documentModelImpl.getColumnBitmask() &
				FINDER_PATH_FETCH_BY_CLASSNAMECLASSPKANDFILEENTRY.getColumnBitmask()) != 0) {
			args = new Object[] {
					documentModelImpl.getOriginalClassName(),
					documentModelImpl.getOriginalClassPK(),
					documentModelImpl.getOriginalFileEntryId()
				};

			FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CLASSNAMECLASSPKANDFILEENTRY,
				args);
			FinderCacheUtil.removeResult(FINDER_PATH_FETCH_BY_CLASSNAMECLASSPKANDFILEENTRY,
				args);
		}
	}

	/**
	 * Creates a new document with the primary key. Does not add the document to the database.
	 *
	 * @param documentId the primary key for the new document
	 * @return the new document
	 */
	@Override
	public Document create(long documentId) {
		Document document = new DocumentImpl();

		document.setNew(true);
		document.setPrimaryKey(documentId);

		return document;
	}

	/**
	 * Removes the document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param documentId the primary key of the document
	 * @return the document that was removed
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document remove(long documentId)
		throws NoSuchDocumentException, SystemException {
		return remove((Serializable)documentId);
	}

	/**
	 * Removes the document with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param primaryKey the primary key of the document
	 * @return the document that was removed
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document remove(Serializable primaryKey)
		throws NoSuchDocumentException, SystemException {
		Session session = null;

		try {
			session = openSession();

			Document document = (Document)session.get(DocumentImpl.class,
					primaryKey);

			if (document == null) {
				if (_log.isWarnEnabled()) {
					_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
				}

				throw new NoSuchDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
					primaryKey);
			}

			return remove(document);
		}
		catch (NoSuchDocumentException nsee) {
			throw nsee;
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}
	}

	@Override
	protected Document removeImpl(Document document) throws SystemException {
		document = toUnwrappedModel(document);

		Session session = null;

		try {
			session = openSession();

			if (!session.contains(document)) {
				document = (Document)session.get(DocumentImpl.class,
						document.getPrimaryKeyObj());
			}

			if (document != null) {
				session.delete(document);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		if (document != null) {
			clearCache(document);
		}

		return document;
	}

	@Override
	public Document updateImpl(vn.com.ecopharma.emp.model.Document document)
		throws SystemException {
		document = toUnwrappedModel(document);

		boolean isNew = document.isNew();

		DocumentModelImpl documentModelImpl = (DocumentModelImpl)document;

		Session session = null;

		try {
			session = openSession();

			if (document.isNew()) {
				session.save(document);

				document.setNew(false);
			}
			else {
				session.merge(document);
			}
		}
		catch (Exception e) {
			throw processException(e);
		}
		finally {
			closeSession(session);
		}

		FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);

		if (isNew || !DocumentModelImpl.COLUMN_BITMASK_ENABLED) {
			FinderCacheUtil.clearCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
		}

		else {
			if ((documentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLASSNAMECLASSPKANDTYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentModelImpl.getOriginalClassName(),
						documentModelImpl.getOriginalClassPK(),
						documentModelImpl.getOriginalDocumentType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CLASSNAMECLASSPKANDTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLASSNAMECLASSPKANDTYPE,
					args);

				args = new Object[] {
						documentModelImpl.getClassName(),
						documentModelImpl.getClassPK(),
						documentModelImpl.getDocumentType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CLASSNAMECLASSPKANDTYPE,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLASSNAMECLASSPKANDTYPE,
					args);
			}

			if ((documentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLASSNAMEANDCLASSPK.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentModelImpl.getOriginalClassName(),
						documentModelImpl.getOriginalClassPK()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CLASSNAMEANDCLASSPK,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLASSNAMEANDCLASSPK,
					args);

				args = new Object[] {
						documentModelImpl.getClassName(),
						documentModelImpl.getClassPK()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_CLASSNAMEANDCLASSPK,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_CLASSNAMEANDCLASSPK,
					args);
			}

			if ((documentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentModelImpl.getOriginalDocumentType()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE,
					args);

				args = new Object[] { documentModelImpl.getDocumentType() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_TYPE, args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_TYPE,
					args);
			}

			if ((documentModelImpl.getColumnBitmask() &
					FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEENTRY.getColumnBitmask()) != 0) {
				Object[] args = new Object[] {
						documentModelImpl.getOriginalFileEntryId()
					};

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILEENTRY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEENTRY,
					args);

				args = new Object[] { documentModelImpl.getFileEntryId() };

				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_BY_FILEENTRY,
					args);
				FinderCacheUtil.removeResult(FINDER_PATH_WITHOUT_PAGINATION_FIND_BY_FILEENTRY,
					args);
			}
		}

		EntityCacheUtil.putResult(DocumentModelImpl.ENTITY_CACHE_ENABLED,
			DocumentImpl.class, document.getPrimaryKey(), document);

		clearUniqueFindersCache(document);
		cacheUniqueFindersCache(document);

		return document;
	}

	protected Document toUnwrappedModel(Document document) {
		if (document instanceof DocumentImpl) {
			return document;
		}

		DocumentImpl documentImpl = new DocumentImpl();

		documentImpl.setNew(document.isNew());
		documentImpl.setPrimaryKey(document.getPrimaryKey());

		documentImpl.setDocumentId(document.getDocumentId());
		documentImpl.setClassName(document.getClassName());
		documentImpl.setClassPK(document.getClassPK());
		documentImpl.setFileEntryId(document.getFileEntryId());
		documentImpl.setDocumentType(document.getDocumentType());
		documentImpl.setGroupId(document.getGroupId());
		documentImpl.setCompanyId(document.getCompanyId());
		documentImpl.setUserId(document.getUserId());
		documentImpl.setUserName(document.getUserName());
		documentImpl.setCreateDate(document.getCreateDate());
		documentImpl.setModifiedDate(document.getModifiedDate());

		return documentImpl;
	}

	/**
	 * Returns the document with the primary key or throws a {@link com.liferay.portal.NoSuchModelException} if it could not be found.
	 *
	 * @param primaryKey the primary key of the document
	 * @return the document
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document findByPrimaryKey(Serializable primaryKey)
		throws NoSuchDocumentException, SystemException {
		Document document = fetchByPrimaryKey(primaryKey);

		if (document == null) {
			if (_log.isWarnEnabled()) {
				_log.warn(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY + primaryKey);
			}

			throw new NoSuchDocumentException(_NO_SUCH_ENTITY_WITH_PRIMARY_KEY +
				primaryKey);
		}

		return document;
	}

	/**
	 * Returns the document with the primary key or throws a {@link vn.com.ecopharma.emp.NoSuchDocumentException} if it could not be found.
	 *
	 * @param documentId the primary key of the document
	 * @return the document
	 * @throws vn.com.ecopharma.emp.NoSuchDocumentException if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document findByPrimaryKey(long documentId)
		throws NoSuchDocumentException, SystemException {
		return findByPrimaryKey((Serializable)documentId);
	}

	/**
	 * Returns the document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param primaryKey the primary key of the document
	 * @return the document, or <code>null</code> if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document fetchByPrimaryKey(Serializable primaryKey)
		throws SystemException {
		Document document = (Document)EntityCacheUtil.getResult(DocumentModelImpl.ENTITY_CACHE_ENABLED,
				DocumentImpl.class, primaryKey);

		if (document == _nullDocument) {
			return null;
		}

		if (document == null) {
			Session session = null;

			try {
				session = openSession();

				document = (Document)session.get(DocumentImpl.class, primaryKey);

				if (document != null) {
					cacheResult(document);
				}
				else {
					EntityCacheUtil.putResult(DocumentModelImpl.ENTITY_CACHE_ENABLED,
						DocumentImpl.class, primaryKey, _nullDocument);
				}
			}
			catch (Exception e) {
				EntityCacheUtil.removeResult(DocumentModelImpl.ENTITY_CACHE_ENABLED,
					DocumentImpl.class, primaryKey);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return document;
	}

	/**
	 * Returns the document with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param documentId the primary key of the document
	 * @return the document, or <code>null</code> if a document with the primary key could not be found
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public Document fetchByPrimaryKey(long documentId)
		throws SystemException {
		return fetchByPrimaryKey((Serializable)documentId);
	}

	/**
	 * Returns all the documents.
	 *
	 * @return the documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Document> findAll() throws SystemException {
		return findAll(QueryUtil.ALL_POS, QueryUtil.ALL_POS, null);
	}

	/**
	 * Returns a range of all the documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.DocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of documents
	 * @param end the upper bound of the range of documents (not inclusive)
	 * @return the range of documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Document> findAll(int start, int end) throws SystemException {
		return findAll(start, end, null);
	}

	/**
	 * Returns an ordered range of all the documents.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link vn.com.ecopharma.emp.model.impl.DocumentModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	 * </p>
	 *
	 * @param start the lower bound of the range of documents
	 * @param end the upper bound of the range of documents (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public List<Document> findAll(int start, int end,
		OrderByComparator orderByComparator) throws SystemException {
		boolean pagination = true;
		FinderPath finderPath = null;
		Object[] finderArgs = null;

		if ((start == QueryUtil.ALL_POS) && (end == QueryUtil.ALL_POS) &&
				(orderByComparator == null)) {
			pagination = false;
			finderPath = FINDER_PATH_WITHOUT_PAGINATION_FIND_ALL;
			finderArgs = FINDER_ARGS_EMPTY;
		}
		else {
			finderPath = FINDER_PATH_WITH_PAGINATION_FIND_ALL;
			finderArgs = new Object[] { start, end, orderByComparator };
		}

		List<Document> list = (List<Document>)FinderCacheUtil.getResult(finderPath,
				finderArgs, this);

		if (list == null) {
			StringBundler query = null;
			String sql = null;

			if (orderByComparator != null) {
				query = new StringBundler(2 +
						(orderByComparator.getOrderByFields().length * 3));

				query.append(_SQL_SELECT_DOCUMENT);

				appendOrderByComparator(query, _ORDER_BY_ENTITY_ALIAS,
					orderByComparator);

				sql = query.toString();
			}
			else {
				sql = _SQL_SELECT_DOCUMENT;

				if (pagination) {
					sql = sql.concat(DocumentModelImpl.ORDER_BY_JPQL);
				}
			}

			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(sql);

				if (!pagination) {
					list = (List<Document>)QueryUtil.list(q, getDialect(),
							start, end, false);

					Collections.sort(list);

					list = new UnmodifiableList<Document>(list);
				}
				else {
					list = (List<Document>)QueryUtil.list(q, getDialect(),
							start, end);
				}

				cacheResult(list);

				FinderCacheUtil.putResult(finderPath, finderArgs, list);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(finderPath, finderArgs);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return list;
	}

	/**
	 * Removes all the documents from the database.
	 *
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public void removeAll() throws SystemException {
		for (Document document : findAll()) {
			remove(document);
		}
	}

	/**
	 * Returns the number of documents.
	 *
	 * @return the number of documents
	 * @throws SystemException if a system exception occurred
	 */
	@Override
	public int countAll() throws SystemException {
		Long count = (Long)FinderCacheUtil.getResult(FINDER_PATH_COUNT_ALL,
				FINDER_ARGS_EMPTY, this);

		if (count == null) {
			Session session = null;

			try {
				session = openSession();

				Query q = session.createQuery(_SQL_COUNT_DOCUMENT);

				count = (Long)q.uniqueResult();

				FinderCacheUtil.putResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY, count);
			}
			catch (Exception e) {
				FinderCacheUtil.removeResult(FINDER_PATH_COUNT_ALL,
					FINDER_ARGS_EMPTY);

				throw processException(e);
			}
			finally {
				closeSession(session);
			}
		}

		return count.intValue();
	}

	/**
	 * Initializes the document persistence.
	 */
	public void afterPropertiesSet() {
		String[] listenerClassNames = StringUtil.split(GetterUtil.getString(
					com.liferay.util.service.ServiceProps.get(
						"value.object.listener.vn.com.ecopharma.emp.model.Document")));

		if (listenerClassNames.length > 0) {
			try {
				List<ModelListener<Document>> listenersList = new ArrayList<ModelListener<Document>>();

				for (String listenerClassName : listenerClassNames) {
					listenersList.add((ModelListener<Document>)InstanceFactory.newInstance(
							getClassLoader(), listenerClassName));
				}

				listeners = listenersList.toArray(new ModelListener[listenersList.size()]);
			}
			catch (Exception e) {
				_log.error(e);
			}
		}
	}

	public void destroy() {
		EntityCacheUtil.removeCache(DocumentImpl.class.getName());
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_ENTITY);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITH_PAGINATION);
		FinderCacheUtil.removeCache(FINDER_CLASS_NAME_LIST_WITHOUT_PAGINATION);
	}

	private static final String _SQL_SELECT_DOCUMENT = "SELECT document FROM Document document";
	private static final String _SQL_SELECT_DOCUMENT_WHERE = "SELECT document FROM Document document WHERE ";
	private static final String _SQL_COUNT_DOCUMENT = "SELECT COUNT(document) FROM Document document";
	private static final String _SQL_COUNT_DOCUMENT_WHERE = "SELECT COUNT(document) FROM Document document WHERE ";
	private static final String _ORDER_BY_ENTITY_ALIAS = "document.";
	private static final String _NO_SUCH_ENTITY_WITH_PRIMARY_KEY = "No Document exists with the primary key ";
	private static final String _NO_SUCH_ENTITY_WITH_KEY = "No Document exists with the key {";
	private static final boolean _HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE = GetterUtil.getBoolean(PropsUtil.get(
				PropsKeys.HIBERNATE_CACHE_USE_SECOND_LEVEL_CACHE));
	private static Log _log = LogFactoryUtil.getLog(DocumentPersistenceImpl.class);
	private static Document _nullDocument = new DocumentImpl() {
			@Override
			public Object clone() {
				return this;
			}

			@Override
			public CacheModel<Document> toCacheModel() {
				return _nullDocumentCacheModel;
			}
		};

	private static CacheModel<Document> _nullDocumentCacheModel = new CacheModel<Document>() {
			@Override
			public Document toEntityModel() {
				return _nullDocument;
			}
		};
}