package main.java.response;

import java.io.Serializable;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ErrorVO implements Serializable {
	
	private static final long serialVersionUID = -5158089345856788786L;

	private String code;
	

	private SourceVO source;

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public SourceVO getSource() {
		return source;
	}

	public void setSource(SourceVO source) {
		this.source = source;
	}
	
	
}
