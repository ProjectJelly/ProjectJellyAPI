package main.java.response;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class SourceVO implements Serializable {

	private static final long serialVersionUID = 1842926991682480306L;

	private String pointer;

	private String title;

	public String getPointer() {
		return pointer;
	}

	public void setPointer(String pointer) {
		this.pointer = pointer;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
