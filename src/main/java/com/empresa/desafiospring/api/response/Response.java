package com.empresa.desafiospring.api.response;

import java.util.List;

public class Response<T> {

	private T data;
	private List<String> status;

	public Response() {
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}


	public List<String> getStatus() {
		return status;
	}

	public void setStatus(List<String> status) {
		this.status = status;
	}

	
}
