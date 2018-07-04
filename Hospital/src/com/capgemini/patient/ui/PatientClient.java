package com.capgemini.patient.ui;


import java.util.Date;
import java.util.Random;
import java.util.Scanner;

import com.capgemini.patient.bean.PatientDetails;
import com.capgemini.patient.exception.PatientException;
import com.capgemini.patient.service.PatientHelper;
import com.capgemini.patient.service.PatientValidator;


public class PatientClient {
static Scanner sc=new Scanner(System.in);
public static void addPatient()
{
	String patientName;
	int patientAge;
	int patientID;
	String mobileNo;
	String patientDesc;
	System.out.println("Enter patientName:");
	 patientName = sc.next();
	 try
	 {
		 if(PatientValidator.validateName(patientName))
		 {
			 System.out.println("Enter mobileNo:");
			  mobileNo=sc.next();
			 if(PatientValidator.validateMobileNumber(mobileNo))
			 {
				System.out.println("Enter validAge:");
				patientAge = sc.nextInt();
				if(PatientValidator.validateAge(patientAge))
				{
					System.out.println("Enter patient Description:");
					patientDesc=sc.next();
					if(PatientValidator.validateDesc(patientDesc))
					{
					Random ran=new Random();
					patientID =ran.nextInt();
					PatientDetails cc=new PatientDetails(patientName, patientAge, patientID, mobileNo, patientDesc, java.time.LocalDate.now());					
					System.out.println("PatientId: " + patientID);
					System.out.println("ConsultationDate: " + java.time.LocalDate.now());
					PatientHelper.addPatientDetails(cc);
					}
				}
			 }
		 }
		 
	 }
catch (PatientException e)
	 {
	System.out.println(e.getMessage());
	 }
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String choice;
		while(true){
			System.out.println("QualityCare \n ************\n 1.Add Patient Information \n 2.Search patient by Id \n 3.Exit");
			System.out.println("\nEnter your choice :");
			choice=sc.nextLine();
			switch(choice)
			{
			case "1":addPatient();break;
			
			case "2":
			System.out.println("Enter the patient ID that you want to search : ");
			int patientId=sc.nextInt();
				PatientHelper.searchPatient(patientId); break;
			case "3":System.out.println("Exiting..");System.exit(0);
			default: System.out.println("Please enter valid choice");break;
			}
			
		}
	}	

}
