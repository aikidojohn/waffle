/*
 * Copyright (c) Application Security Inc., 2010
 * All Rights Reserved
 * Eclipse Public License (EPLv1)
 * http://waffle.codeplex.com/license
 */
package waffle.tomcat.catalina;

import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import javax.servlet.http.HttpSessionContext;

/**
 * Simple Http Session
 * @author dblock[at]dblock[dot]org
 */
@SuppressWarnings("deprecation")
public class SimpleHttpSession implements HttpSession {

	private Map<String, Object> _attributes = new HashMap<String, Object>();
	
	@Override
	public Object getAttribute(String attributeName) {
		return _attributes.get(attributeName);
	}

	@SuppressWarnings("unchecked")
	@Override
	public Enumeration getAttributeNames() {
		return null;
	}

	@Override
	public long getCreationTime() {
		return 0;
	}

	@Override
	public String getId() {
		return null;
	}

	@Override
	public long getLastAccessedTime() {
		return 0;
	}

	@Override
	public int getMaxInactiveInterval() {
		return 0;
	}

	@Override
	public ServletContext getServletContext() {
		return null;
	}

	@Override
	public HttpSessionContext getSessionContext() {
		return null;
	}

	@Override
	public Object getValue(String arg0) {
		return null;
	}

	@Override
	public String[] getValueNames() {
		return null;
	}

	@Override
	public void invalidate() {
		
	}

	@Override
	public boolean isNew() {
		return false;
	}

	@Override
	public void putValue(String arg0, Object arg1) {
	}

	@Override
	public void removeAttribute(String attributeName) {
		_attributes.remove(attributeName);
	}

	@Override
	public void removeValue(String arg0) {
		
	}

	@Override
	public void setAttribute(String attributeName, Object attributeValue) {
		_attributes.put(attributeName, attributeValue);
	}

	@Override
	public void setMaxInactiveInterval(int arg0) {
		
	}
}
