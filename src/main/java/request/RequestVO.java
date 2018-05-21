package main.java.request;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

public class RequestVO implements Serializable{
	
	private String requestName;
	
	private String sendTo;
	
	private String startFrom;
	
	private String endBy;

	public String getRequestName() {
		return requestName;
	}

	public void setRequestName(String requestName) {
		this.requestName = requestName;
	}

	public String getSendTo() {
		return sendTo;
	}

	public void setSendTo(String sendTo) {
		this.sendTo = sendTo;
	}

	public String getStartFrom() {
		return startFrom;
	}

	public void setStartFrom(String startFrom) {
		this.startFrom = startFrom;
	}

	public String getEndBy() {
		return endBy;
	}

	public void setEndBy(String endBy) {
		this.endBy = endBy;
	}
	
}
