package com.capgemini.patient.service;

import java.util.regex.Pattern;

import com.capgemini.patient.exception.PatientException;

public class PatientValidator {
 public static boolean validateName(String patientName) throws PatientException{
	 String patientNamePattern="[A-Za-z]{5,15}";
	if(Pattern.matches(patientNamePattern, patientName))	
	 return true;
	else
		throw new PatientException("Patient name should be minimum 5 and maximum 15");
	}
public static	boolean validateMobileNumber(String mobileNo) throws PatientException{
	String patientNumber="[0-9]{10}";
	if(Pattern.matches(patientNumber, mobileNo))
	return true;
	else
		throw new PatientException("Patient mobile number should be only 10");
		}
public static	boolean validateAge(int patientAge) throws PatientException
	{
		if(patientAge>1 || patientAge<100)
			return true;
		else
			throw new PatientException("Patient Age must be in between 1 and 100");
	}
public static	boolean validateDesc(String patientDesc) throws PatientException{
	String descPattern="[A-Za-z]{1,40}";
	if(Pattern.matches(descPattern, patientDesc))
		return true;
	else
		throw new PatientException("Patient description can allow a maximum of 40 characters");
	}
}
