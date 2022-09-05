package com.ucs.universityCourseSelection.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.ucs.universityCourseSelection.entity.Applicant;
import com.ucs.universityCourseSelection.exception.HandlingException;
import com.ucs.universityCourseSelection.repository.ApplicantRepository;
@Service
public class ApplicantServiceImpl implements ApplicantService {
	@Autowired
	private ApplicantRepository applicantRepo; 
	
	@Override
	public Applicant addApplicant(Applicant applicant) {
//	applicant.setAdmission(applicant.getAdmission());
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
		// TODO Auto-generated constructor stub
	}


	public ApplicantServiceImpl(ApplicantRepository applicantRepo) {
		super();
		this.applicantRepo = applicantRepo;
	}
	

}
