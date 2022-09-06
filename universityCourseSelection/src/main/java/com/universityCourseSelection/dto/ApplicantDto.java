package com.universityCourseSelection.dto;


import com.universityCourseSelection.entity.Admission;

public class ApplicantDto {
	private int applicantId;
	private String studentname;
    private String contactNumber;
    private String studentDegree;
    private int studentGraduationPercent;
    private Admission admission;



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
	public Admission getAdmission() {
		return admission;
	}
	public void setAdmission(Admission admission) {
		this.admission = admission;
	}
	}
