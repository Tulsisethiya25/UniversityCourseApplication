package com.ucs.universityCourseSelection.service;



import org.springframework.stereotype.Service;

import com.ucs.universityCourseSelection.entity.Applicant;
import com.ucs.universityCourseSelection.exception.HandlingException;
@Service
public interface ApplicantService {
	public Applicant addApplicant(Applicant applicant );
	public Applicant deleteApplicantByApplicantId(int applicantId) throws HandlingException;
	public Applicant viewApplicantByApplicantId(int applicantId) throws HandlingException;

	

}
