package com.ucs.universityCourseSelection.service;

import java.time.LocalDate;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ucs.universityCourseSelection.entity.Admission;
import com.ucs.universityCourseSelection.exception.HandlingException;
import com.ucs.universityCourseSelection.repository.AdmissionRepository;

@Service
public class AdmissionServicelmpl implements AdmissionService {
	@Autowired
	private AdmissionRepository admissionRepository ; 
	
	@Override
	public Admission save(Admission admission) {
		return admissionRepository.save(admission);
	}
	@Override
	public Admission deleteById(int admissionId) throws HandlingException{
		 Admission admission=admissionRepository.findByAdmissionId(admissionId);
		 if(admission!=null)
		 {
			 admissionRepository.deleteById(admissionId);
		return admission ;
		 }
		else
			throw new HandlingException("please enter valid admissionId");
			
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
			 throw new HandlingException("please enter valid studentId");
	}
	
	@Override
	
	public List<Admission> showAllAdmissionByCourseId(int courseId) 
	{
		 List<Admission> admission = admissionRepository.findAllByCourseId(courseId);
			return admission;
		
	}
	public List<Admission> showAllAdmissionByDate(LocalDate admissionDate) 
	{
		 List<Admission> admission = admissionRepository.findAllByAdmissionDate(admissionDate);
			return admission;
		
	}
	public AdmissionServicelmpl(AdmissionRepository admissionRepository) {
		super();
		this.admissionRepository = admissionRepository;
	}
	public AdmissionServicelmpl() {
		super();
		// TODO Auto-generated constructor stub
	}
	

}
