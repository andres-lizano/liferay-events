/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
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

package com.rivetlogic.event.model.impl;

import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.util.DateUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.util.StringBundler;
import com.liferay.portal.kernel.util.StringPool;
import com.liferay.portal.model.CacheModel;
import com.liferay.portal.model.impl.BaseModelImpl;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.util.PortalUtil;

import com.liferay.portlet.expando.model.ExpandoBridge;
import com.liferay.portlet.expando.util.ExpandoBridgeFactoryUtil;

import com.rivetlogic.event.model.Event;
import com.rivetlogic.event.model.EventModel;

import java.io.Serializable;

import java.sql.Types;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * The base model implementation for the Event service. Represents a row in the &quot;rivetlogic_event_Event&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface {@link com.rivetlogic.event.model.EventModel} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link EventImpl}.
 * </p>
 *
 * @author juancarrillo
 * @see EventImpl
 * @see com.rivetlogic.event.model.Event
 * @see com.rivetlogic.event.model.EventModel
 * @generated
 */
public class EventModelImpl extends BaseModelImpl<Event> implements EventModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a event model instance should use the {@link com.rivetlogic.event.model.Event} interface instead.
	 */
	public static final String TABLE_NAME = "rivetlogic_event_Event";
	public static final Object[][] TABLE_COLUMNS = {
			{ "uuid_", Types.VARCHAR },
			{ "eventId", Types.BIGINT },
			{ "groupId", Types.BIGINT },
			{ "companyId", Types.BIGINT },
			{ "userId", Types.BIGINT },
			{ "name", Types.VARCHAR },
			{ "location", Types.VARCHAR },
			{ "description", Types.VARCHAR },
			{ "eventDate", Types.TIMESTAMP },
			{ "privateEvent", Types.BOOLEAN }
		};
	public static final String TABLE_SQL_CREATE = "create table rivetlogic_event_Event (uuid_ VARCHAR(75) null,eventId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,name VARCHAR(400) null,location STRING null,description STRING null,eventDate DATE null,privateEvent BOOLEAN)";
	public static final String TABLE_SQL_DROP = "drop table rivetlogic_event_Event";
	public static final String ORDER_BY_JPQL = " ORDER BY event.eventDate ASC, event.name ASC";
	public static final String ORDER_BY_SQL = " ORDER BY rivetlogic_event_Event.eventDate ASC, rivetlogic_event_Event.name ASC";
	public static final String DATA_SOURCE = "liferayDataSource";
	public static final String SESSION_FACTORY = "liferaySessionFactory";
	public static final String TX_MANAGER = "liferayTransactionManager";
	public static final boolean ENTITY_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.entity.cache.enabled.com.rivetlogic.event.model.Event"),
			true);
	public static final boolean FINDER_CACHE_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.finder.cache.enabled.com.rivetlogic.event.model.Event"),
			true);
	public static final boolean COLUMN_BITMASK_ENABLED = GetterUtil.getBoolean(com.liferay.util.service.ServiceProps.get(
				"value.object.column.bitmask.enabled.com.rivetlogic.event.model.Event"),
			true);
	public static long COMPANYID_COLUMN_BITMASK = 1L;
	public static long GROUPID_COLUMN_BITMASK = 2L;
	public static long UUID_COLUMN_BITMASK = 4L;
	public static long EVENTDATE_COLUMN_BITMASK = 8L;
	public static long NAME_COLUMN_BITMASK = 16L;
	public static final long LOCK_EXPIRATION_TIME = GetterUtil.getLong(com.liferay.util.service.ServiceProps.get(
				"lock.expiration.time.com.rivetlogic.event.model.Event"));

	public EventModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _eventId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setEventId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _eventId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Event.class;
	}

	@Override
	public String getModelClassName() {
		return Event.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("eventId", getEventId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("name", getName());
		attributes.put("location", getLocation());
		attributes.put("description", getDescription());
		attributes.put("eventDate", getEventDate());
		attributes.put("privateEvent", getPrivateEvent());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long eventId = (Long)attributes.get("eventId");

		if (eventId != null) {
			setEventId(eventId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String name = (String)attributes.get("name");

		if (name != null) {
			setName(name);
		}

		String location = (String)attributes.get("location");

		if (location != null) {
			setLocation(location);
		}

		String description = (String)attributes.get("description");

		if (description != null) {
			setDescription(description);
		}

		Date eventDate = (Date)attributes.get("eventDate");

		if (eventDate != null) {
			setEventDate(eventDate);
		}

		Boolean privateEvent = (Boolean)attributes.get("privateEvent");

		if (privateEvent != null) {
			setPrivateEvent(privateEvent);
		}
	}

	@Override
	public String getUuid() {
		if (_uuid == null) {
			return StringPool.BLANK;
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@Override
	public long getEventId() {
		return _eventId;
	}

	@Override
	public void setEventId(long eventId) {
		_eventId = eventId;
	}

	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_userId = userId;
	}

	@Override
	public String getUserUuid() throws SystemException {
		return PortalUtil.getUserValue(getUserId(), "uuid", _userUuid);
	}

	@Override
	public void setUserUuid(String userUuid) {
		_userUuid = userUuid;
	}

	@Override
	public String getName() {
		if (_name == null) {
			return StringPool.BLANK;
		}
		else {
			return _name;
		}
	}

	@Override
	public void setName(String name) {
		_columnBitmask = -1L;

		_name = name;
	}

	@Override
	public String getLocation() {
		if (_location == null) {
			return StringPool.BLANK;
		}
		else {
			return _location;
		}
	}

	@Override
	public void setLocation(String location) {
		_location = location;
	}

	@Override
	public String getDescription() {
		if (_description == null) {
			return StringPool.BLANK;
		}
		else {
			return _description;
		}
	}

	@Override
	public void setDescription(String description) {
		_description = description;
	}

	@Override
	public Date getEventDate() {
		return _eventDate;
	}

	@Override
	public void setEventDate(Date eventDate) {
		_columnBitmask = -1L;

		_eventDate = eventDate;
	}

	@Override
	public boolean getPrivateEvent() {
		return _privateEvent;
	}

	@Override
	public boolean isPrivateEvent() {
		return _privateEvent;
	}

	@Override
	public void setPrivateEvent(boolean privateEvent) {
		_privateEvent = privateEvent;
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(getCompanyId(),
			Event.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Event toEscapedModel() {
		if (_escapedModel == null) {
			_escapedModel = (Event)ProxyUtil.newProxyInstance(_classLoader,
					_escapedModelInterfaces, new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		EventImpl eventImpl = new EventImpl();

		eventImpl.setUuid(getUuid());
		eventImpl.setEventId(getEventId());
		eventImpl.setGroupId(getGroupId());
		eventImpl.setCompanyId(getCompanyId());
		eventImpl.setUserId(getUserId());
		eventImpl.setName(getName());
		eventImpl.setLocation(getLocation());
		eventImpl.setDescription(getDescription());
		eventImpl.setEventDate(getEventDate());
		eventImpl.setPrivateEvent(getPrivateEvent());

		eventImpl.resetOriginalValues();

		return eventImpl;
	}

	@Override
	public int compareTo(Event event) {
		int value = 0;

		value = DateUtil.compareTo(getEventDate(), event.getEventDate());

		if (value != 0) {
			return value;
		}

		value = getName().compareToIgnoreCase(event.getName());

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Event)) {
			return false;
		}

		Event event = (Event)obj;

		long primaryKey = event.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public void resetOriginalValues() {
		EventModelImpl eventModelImpl = this;

		eventModelImpl._originalUuid = eventModelImpl._uuid;

		eventModelImpl._originalGroupId = eventModelImpl._groupId;

		eventModelImpl._setOriginalGroupId = false;

		eventModelImpl._originalCompanyId = eventModelImpl._companyId;

		eventModelImpl._setOriginalCompanyId = false;

		eventModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Event> toCacheModel() {
		EventCacheModel eventCacheModel = new EventCacheModel();

		eventCacheModel.uuid = getUuid();

		String uuid = eventCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			eventCacheModel.uuid = null;
		}

		eventCacheModel.eventId = getEventId();

		eventCacheModel.groupId = getGroupId();

		eventCacheModel.companyId = getCompanyId();

		eventCacheModel.userId = getUserId();

		eventCacheModel.name = getName();

		String name = eventCacheModel.name;

		if ((name != null) && (name.length() == 0)) {
			eventCacheModel.name = null;
		}

		eventCacheModel.location = getLocation();

		String location = eventCacheModel.location;

		if ((location != null) && (location.length() == 0)) {
			eventCacheModel.location = null;
		}

		eventCacheModel.description = getDescription();

		String description = eventCacheModel.description;

		if ((description != null) && (description.length() == 0)) {
			eventCacheModel.description = null;
		}

		Date eventDate = getEventDate();

		if (eventDate != null) {
			eventCacheModel.eventDate = eventDate.getTime();
		}
		else {
			eventCacheModel.eventDate = Long.MIN_VALUE;
		}

		eventCacheModel.privateEvent = getPrivateEvent();

		return eventCacheModel;
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(getUuid());
		sb.append(", eventId=");
		sb.append(getEventId());
		sb.append(", groupId=");
		sb.append(getGroupId());
		sb.append(", companyId=");
		sb.append(getCompanyId());
		sb.append(", userId=");
		sb.append(getUserId());
		sb.append(", name=");
		sb.append(getName());
		sb.append(", location=");
		sb.append(getLocation());
		sb.append(", description=");
		sb.append(getDescription());
		sb.append(", eventDate=");
		sb.append(getEventDate());
		sb.append(", privateEvent=");
		sb.append(getPrivateEvent());
		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		StringBundler sb = new StringBundler(34);

		sb.append("<model><model-name>");
		sb.append("com.rivetlogic.event.model.Event");
		sb.append("</model-name>");

		sb.append(
			"<column><column-name>uuid</column-name><column-value><![CDATA[");
		sb.append(getUuid());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventId</column-name><column-value><![CDATA[");
		sb.append(getEventId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>groupId</column-name><column-value><![CDATA[");
		sb.append(getGroupId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>companyId</column-name><column-value><![CDATA[");
		sb.append(getCompanyId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>userId</column-name><column-value><![CDATA[");
		sb.append(getUserId());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>name</column-name><column-value><![CDATA[");
		sb.append(getName());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>location</column-name><column-value><![CDATA[");
		sb.append(getLocation());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>description</column-name><column-value><![CDATA[");
		sb.append(getDescription());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>eventDate</column-name><column-value><![CDATA[");
		sb.append(getEventDate());
		sb.append("]]></column-value></column>");
		sb.append(
			"<column><column-name>privateEvent</column-name><column-value><![CDATA[");
		sb.append(getPrivateEvent());
		sb.append("]]></column-value></column>");

		sb.append("</model>");

		return sb.toString();
	}

	private static ClassLoader _classLoader = Event.class.getClassLoader();
	private static Class<?>[] _escapedModelInterfaces = new Class[] { Event.class };
	private String _uuid;
	private String _originalUuid;
	private long _eventId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private String _userUuid;
	private String _name;
	private String _location;
	private String _description;
	private Date _eventDate;
	private boolean _privateEvent;
	private long _columnBitmask;
	private Event _escapedModel;
}