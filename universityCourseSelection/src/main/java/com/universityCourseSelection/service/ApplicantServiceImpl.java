package com.universityCourseSelection.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universityCourseSelection.entity.Applicant;
import com.universityCourseSelection.exception.HandlingException;
import com.universityCourseSelection.repository.ApplicantRepository;
@Service
public class ApplicantServiceImpl implements ApplicantService {
	private static final Logger log = LoggerFactory.getLogger(AdmissionServicelmpl.class);
	
	@Autowired
	private ApplicantRepository applicantRepo; 
	
	@Override
	public Applicant addApplicant(Applicant applicant) {
		log.info("enter ApplicantServiceImpl :: addAplicant()");
		
		return applicantRepo.save(applicant);
	}

	
	@Override
	public Applicant deleteApplicantByApplicantId(int applicantId) throws HandlingException {
		 Applicant applicant=applicantRepo.findByApplicantId(applicantId);
		 if(applicant!=null)
		 {
			 applicantRepo.deleteById(applicantId);
		return applicant ;
		 }
		else
			throw new HandlingException("please enter valid applicantId");
	}

	@Override
	public Applicant viewApplicantByApplicantId(int applicantId) throws HandlingException {
		Applicant applicant=applicantRepo.findByApplicantId(applicantId);
		 if(applicant!=null)
		 {
		return applicant ;
		 }
		else
			throw new HandlingException("please enter valid applicantId");
	}


	public ApplicantServiceImpl() {
		super();
		}


	public ApplicantServiceImpl(ApplicantRepository applicantRepo) {
		super();
		this.applicantRepo = applicantRepo;
	}
	

}
