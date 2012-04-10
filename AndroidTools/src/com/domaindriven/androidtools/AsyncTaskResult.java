package com.domaindriven.androidtools;

public class AsyncTaskResult<T> {
	private T result;
	private String message;
	private Exception error;

	public T getResult() {
	    return result;
	}
	public Exception getError() {
	    return error;
	}

	public String getMessage() {
		return message;
	}

	public AsyncTaskResult(T result) {
	    super();
	    this.result = result;
	}
	
	public AsyncTaskResult(T result, String message) {
		this(result);
		this.message = message;
	}

	public AsyncTaskResult(Exception error) {
	    super();
	    this.error = error;
	}
	
	public AsyncTaskResult(Exception error, String message) {
		this(error);
		this.message = message;
	}
}
