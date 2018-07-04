package com.capgemini.patient.bean;

import java.time.LocalDate;
import java.util.Date;

public class PatientDetails {

	
		String patientName;
		int patientAge=0;
		int patientID;
		String mobileNo;
		String patientDesc;
		java.time.LocalDate consultationDate;
		public PatientDetails(){
			}
		public PatientDetails(String patientName, int patientAge, int patientID, String mobileNo, String patientDesc, LocalDate localDate)
		{	
			this.patientName=patientName;
			this.patientAge=patientAge;
			this.patientID=patientID;
			this.mobileNo=mobileNo;
			this.patientDesc=patientDesc;
			this.consultationDate=localDate;
		
}

		public String getPatientName() {
			return patientName;
		}
		public void setPatientName(String patientName) {
			this.patientName = patientName;
		}
		public int getPatientAge() {
			return patientAge;
		}
		public void setPatientAge(int patientAge) {
			this.patientAge = patientAge;
		}
		public int getPatientID() {
			return patientID;
		}
		public void setPatientID(int patientID) {
			this.patientID = patientID;
		}
		public String getMobileNo() {
			return mobileNo;
		}
		public void setMobileNo(String mobileNo) {
			this.mobileNo = mobileNo;
		}
		public String getPatientDesc() {
			return patientDesc;
		}
		public void setPatientDesc(String patientDesc) {
			this.patientDesc = patientDesc;
		}
		public LocalDate getConsultationDate() {
			return consultationDate;
		}
		public void setConsultationDate(Date consultationDate) {
			LocalDate localDate = null;
			this.consultationDate = localDate;
		}
		public String toString() {
			return "Asset [Patient Id=" + patientID + ", Patient Name="
					+ patientName + ", Age =" + patientAge +", Patient Mobile Number=" + mobileNo
					+ ", Entry Date=" + consultationDate +", Patient Description=" + patientDesc + "]";
		}
				}