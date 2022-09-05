package com.ucs.universityCourseSelection.service;


import java.time.LocalDate;

import java.util.List;

import com.ucs.universityCourseSelection.entity.Admission;
import com.ucs.universityCourseSelection.exception.HandlingException;

public interface AdmissionService {
	public Admission save(Admission admission);
	public Admission deleteById(int admissionId) throws HandlingException;
	public Admission updateApplicantCourse(int applicantId,int courseId) throws HandlingException;
	public List<Admission> showAllAdmissionByCourseId(int courseId);
	public List<Admission> showAllAdmissionByDate(LocalDate courseId);
	
}
