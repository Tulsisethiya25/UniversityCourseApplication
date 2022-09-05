package com.ucs.universityCourseSelection.controller;


import java.time.LocalDate;



import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ucs.universityCourseSelection.entity.Admission;
import com.ucs.universityCourseSelection.exception.HandlingException;
import com.ucs.universityCourseSelection.service.AdmissionService;

@RestController
public class AdmissionController {

	@Autowired
//    private AdmissionRepository admissionRepo;
    private AdmissionService admissionService;
	
	@PostMapping("/addApplicantAdmission")
    public ResponseEntity<Admission> addApplicantAdmission(@Valid @RequestBody Admission admission) 
    {
//		Admission a = admissionRepo.save(admission);
		Admission ApplicantAddInfo = admissionService.save(admission);
		    
        return new ResponseEntity<Admission>(ApplicantAddInfo ,HttpStatus.CREATED);
       
    }
	@DeleteMapping("/deleteApplicantAdmission")
    public ResponseEntity<Admission> deleteApplicantAdmission(@RequestBody int admissionId) throws HandlingException 
    {
		Admission ApplicantdeleteInfo = admissionService.deleteById(admissionId);
		  
        return new ResponseEntity<Admission>(ApplicantdeleteInfo ,HttpStatus.CREATED);
       
    }

	@PutMapping("/UpdateApplicantAdmission/{applicantId}/{courseId}")
    public ResponseEntity<Admission> updateApplicantAdmission(@PathVariable int applicantId ,@PathVariable int courseId )throws HandlingException
    {
		Admission Applicant = admissionService.updateApplicantCourse(applicantId,courseId);
		   
        return new ResponseEntity<Admission>(Applicant,HttpStatus.ACCEPTED);
       
    }

	
    @GetMapping("/showAllAdmissionByCourseId/{courseId}")
    public List<Admission> findAllByCourseId(@PathVariable int courseId) 
    {
    		
	    List<Admission> admissionList= admissionService.showAllAdmissionByCourseId(courseId);
		   
        return admissionList;
       
    }

    @GetMapping("/showAllAdmissionByAdmissionDate/{admissionDate}")
    public List<Admission> findAllByCourseId(@PathVariable LocalDate admissionDate) 
      {
    		
	    List<Admission> admissionList= admissionService.showAllAdmissionByDate(admissionDate);
		   
        return admissionList;       
    }


}
