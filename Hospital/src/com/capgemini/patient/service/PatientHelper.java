package com.capgemini.patient.service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;
import com.capgemini.patient.bean.PatientDetails;

public class PatientHelper {


	private  static ArrayList<PatientDetails> patientList=null;
	static
	{                    //HashSet
		patientList=new ArrayList<PatientDetails>();
		PatientDetails pDetails1=new PatientDetails("hary",20,8882,"897463210","viral fever",LocalDate.now());
		PatientDetails pDetails2=new PatientDetails("Stars",50,8863,"1203654789","Cancer",LocalDate.now());
		
		patientList.add(pDetails1);
		patientList.add(pDetails2);
	}
	
	public PatientHelper(){}
	public static void addPatientDetails(PatientDetails patientdetails)
	{
		patientList.add(patientdetails);
	}
	public static ArrayList<PatientDetails> gePatientList(){
		return patientList;
	}
	public static void setPatientList(ArrayList<PatientDetails> patientList)
	{
		PatientHelper.patientList=patientList;
	}
	public static void searchPatient(int patientID){
		Iterator<PatientDetails> patientIt=patientList.iterator();
		PatientDetails temppat=null;
		while(patientIt.hasNext())
		{
			temppat=patientIt.next();
			if(temppat.getPatientID()==patientID)
				System.out.println(temppat);
				else
				System.out.println("Enter valid ID");
		}	
	
	}
	
}
