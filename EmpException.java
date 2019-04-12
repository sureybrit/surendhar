package com.empdetails.exception;

public class EmpException extends Exception {
	private static final long serialVersionUID = 1L;
	public EmpException()
	{
		super();
	}
	public EmpException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) 
	{
		super(message, cause, enableSuppression, writableStackTrace);
	}
	public EmpException(String message, Throwable cause) 
	{
		super(message, cause);
	}
	public EmpException(String message) 
	{
		super(message);			
	}
	public EmpException(Throwable cause) 
	{
		super(cause);			
	}
}
