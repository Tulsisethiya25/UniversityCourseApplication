package com.universityCourseSelection.entity;

import javax.persistence.CascadeType;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Applicant {
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private int applicantId;
	private String studentname;
    private String contactNumber;
    private String studentDegree;
    private int studentGraduationPercent;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="admissionId")
    private Admission admission;

    
    public Admission getAdmission() {
		return admission;
	}
	public void setAdmission(Admission admission) {
		this.admission = admission;
	}
	public int getApplicantId() {
		return applicantId;
	}
	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}
	
		public String getStudentname() {
		return studentname;
	}
	public void setStudentname(String studentname) {
		this.studentname = studentname;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getStudentDegree() { 
		return studentDegree;
	}
	public void setStudentDegree(String studentDegree) {
		this.studentDegree = studentDegree;
	}
	public int getStudentGraduationPercent() {
		return studentGraduationPercent;
	}
	public void setStudentGraduationPercent(int studentGraduationPercent) {
		this.studentGraduationPercent = studentGraduationPercent;
	}
	
}
