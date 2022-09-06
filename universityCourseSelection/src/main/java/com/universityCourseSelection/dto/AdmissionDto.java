package com.universityCourseSelection.dto;

import java.time.LocalDate;

import javax.validation.constraints.NotNull;

import com.universityCourseSelection.entity.AdmissionStatus;

public class AdmissionDto {
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
