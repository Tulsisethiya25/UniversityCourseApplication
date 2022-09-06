package com.universityCourseSelection.service;



import org.springframework.stereotype.Service;

import com.universityCourseSelection.entity.Applicant;
import com.universityCourseSelection.exception.HandlingException;
@Service
public interface ApplicantService {
	public Applicant addApplicant(Applicant applicant );
	public Applicant deleteApplicantByApplicantId(int applicantId) throws HandlingException;
	public Applicant viewApplicantByApplicantId(int applicantId) throws HandlingException;

	

}
