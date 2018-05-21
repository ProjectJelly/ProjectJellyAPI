package main.java.controller;

import java.util.Enumeration;

import javax.servlet.http.HttpServletRequest;

import com.google.gson.JsonObject;

public class ControllerHelper {

	public static String getRequestHeaders(HttpServletRequest request) {
		JsonObject headersJson = new JsonObject();
		Enumeration<String> headerNames = request.getHeaderNames();
		while (headerNames.hasMoreElements()) {
			String key = headerNames.nextElement();
			String value = request.getHeader(key);
			headersJson.addProperty(key, value);
		}
		return headersJson.toString();
	}
	
	public static String getRequestParams(HttpServletRequest request) {
		JsonObject paramsJson = new JsonObject();
		Enumeration<String> paramNames = request.getParameterNames();
		while (paramNames.hasMoreElements()) {
			String key = paramNames.nextElement();
			String value = request.getParameter(key);
			paramsJson.addProperty(key, value);
		}
		return paramsJson.toString();
	}
}
