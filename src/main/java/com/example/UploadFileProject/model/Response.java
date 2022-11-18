package com.example.UploadFileProject.model;

import java.util.Date;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonInclude.Include;

public class Response<T> {
	private int status;
	private String message;
	@JsonInclude(value = Include.NON_NULL)
	private T data;
	private Date timestamp;

	public static final Response<?> SUCCESS = new Response<>(200, "success");
	public static final Response<?> CREATED = new Response<>(201, "created");
	public static final Response<?> FAILURE = new Response<>(205, "failure");
	public static final Response<?> BAD_REQUEST = new Response<>(400, "badrequest");
	public static final Response<?> NOT_FOUND = new Response<>(404, "not_found");
	public static final Response<?> SERVER_ERROR = new Response<>(500, "server_error");

	public Response(int statusCode, String message, T data) {
		super();
		this.status = statusCode;
		this.message = message;
		this.data = data;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

	public Response(T data) {
		this(200, "Success");
		this.data = data;
	}

	@Override
	public String toString() {
		return "Response [statusCode=" + status + ", message=" + message + ", data=" + data + "]";
	}

	public int getStatus() {
		return status;
	}

	public void setStatus(int status) {
		this.status = status;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Response(int status, String message) {
		super();
		this.status = status;
		this.message = message;
	}

	public Date getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}

	public Response(Date timestamp) {
		super();
		this.timestamp = timestamp;
	}

}
