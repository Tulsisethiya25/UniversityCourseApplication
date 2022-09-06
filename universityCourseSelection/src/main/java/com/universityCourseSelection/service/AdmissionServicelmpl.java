package com.universityCourseSelection.service;

import java.time.LocalDate;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.universityCourseSelection.entity.Admission;
import com.universityCourseSelection.exception.HandlingException;
import com.universityCourseSelection.repository.AdmissionRepository;

@Service
public class AdmissionServicelmpl implements AdmissionService {
	private static final Logger log = LoggerFactory.getLogger(AdmissionServicelmpl.class);
	@Autowired
	private AdmissionRepository admissionRepository ; 
	
	@Override
	public Admission save(Admission admission) {
		log.info("enter in add Admission");
		return admissionRepository.save(admission);
	}
	@Override
	public Admission deleteById(int admissionId) throws HandlingException{
		 Admission admission=admissionRepository.findByAdmissionId(admissionId);
		 if(admission!=null)
		 {
			 admissionRepository.deleteById(admissionId);
			 log.info("given admissionId data delete successfully");
		return admission ;
		 }
		else
		{
			log.error("admissionId is not Correct");
			throw new HandlingException("please enter valid admissionId");
		}	
	}
	@Override
	public Admission updateApplicantCourse(int applicantId,int courseId) throws HandlingException {
		 Admission admission = admissionRepository.findByApplicantId(applicantId);
		 if(admission!=null)
		 {
		 admission.setCourseId(courseId);
		 admissionRepository.save(admission);
		return admission;
		 }
		 else
		 {
			 log.error("ApplicantId is not Correct");
			 throw new HandlingException("please enter valid ApplicantId");
	}
	}
	@Override
	
	public List<Admission> showAllAdmissionByCourseId(int courseId) 
	{
		 List<Admission> admission = admissionRepository.findAllByCourseId(courseId);
		 log.info("this is ouput of showAll Admission By CourseId");
			return admission;
		
	}
	public List<Admission> showAllAdmissionByDate(LocalDate admissionDate) 
	{
		 return admissionRepository.findAllByAdmissionDate(admissionDate);
	
		
	}
	public AdmissionServicelmpl(AdmissionRepository admissionRepository) {
		super();
		this.admissionRepository = admissionRepository;
	}
	public AdmissionServicelmpl() {
		super();
		}
	

}
