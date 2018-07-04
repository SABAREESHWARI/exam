package com.capgemini.patient.exception;

public class PatientException extends Exception {
 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
public PatientException()
 {
	 super();
 }
 public PatientException(String message, Throwable cause,
			boolean enableSuppression, boolean writableStackTrace)
			{
	 super(message, cause, enableSuppression, writableStackTrace);
			}
 public PatientException(String message, Throwable cause)
 {
	 super(message, cause);
 }
 public PatientException(String message) 
	{
		super(message);			
	}
	public PatientException(Throwable cause) 
	{
		super(cause);			
	}
}
