package main.java.response;

import java.util.List;



public class GenericResponse {

	private int status;

	private Object data;

	private List<ErrorVO> error;
	
	
	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public List<ErrorVO> getError() {
		return error;
	}

	public void setError(List<ErrorVO> error) {
		this.error = error;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}
	
}
