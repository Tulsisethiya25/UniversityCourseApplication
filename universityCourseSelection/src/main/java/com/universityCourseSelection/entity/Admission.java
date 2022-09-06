package com.universityCourseSelection.entity;

import java.time.LocalDate;


import javax.persistence.Entity;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity // annotation specifies that the class is an entity and is mapped to a database table

public class Admission {
	@Id // annotation specifies the primary key of an entity
    @GeneratedValue(strategy = GenerationType.AUTO) // annotation provides for the specification of generation strategies for the values of primary keys
	private int admissionId;
	private int applicantId;
	private int courseId;
    @NotNull(message = "Enter admission date")
    private LocalDate admissionDate;
    @NotNull(message = "Enter Status")
    private AdmissionStatus status;
	

	public int getAdmissionId() {
		return admissionId;
	}

	public void setAdmissionId(int admissionId) {
		this.admissionId = admissionId;
	}

	public int getApplicantId() {
		return applicantId;
	}

	public void setApplicantId(int applicantId) {
		this.applicantId = applicantId;
	}

	public int getCourseId() {
		return courseId;
	}

	public void setCourseId(int courseId) {
		this.courseId = courseId;
	}

	public LocalDate getAdmissionDate() {
		return admissionDate;
	}

	public void setAdmissionDate(LocalDate admissionDate) {
		this.admissionDate = admissionDate;
	}

	public AdmissionStatus getStatus() {
		return status;
	}

	public void setStatus(AdmissionStatus status) {
		this.status = status;
	}
   
	}
