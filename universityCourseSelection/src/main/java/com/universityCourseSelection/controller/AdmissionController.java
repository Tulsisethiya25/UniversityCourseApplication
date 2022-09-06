package com.universityCourseSelection.controller;


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

import com.universityCourseSelection.entity.Admission;
import com.universityCourseSelection.exception.HandlingException;
import com.universityCourseSelection.service.AdmissionService;

@RestController
public class AdmissionController {

	@Autowired
    private AdmissionService admissionService;
	
	@PostMapping("/addApplicantAdmission") // Annotation for mapping HTTP POST requests onto specific handler methods.
    public ResponseEntity<Admission> addApplicantAdmission(@Valid @RequestBody Admission admission) 
    {
		Admission Applicantaddinfo = admissionService.save(admission);
		    
        return new ResponseEntity<>(Applicantaddinfo ,HttpStatus.CREATED);
       
    }
	@DeleteMapping("/deleteApplicantAdmission")// Annotation for mapping HTTP DELETE requests onto specific handler methods.
    public ResponseEntity<Admission> deleteApplicantAdmission(@RequestBody int admissionId) throws HandlingException 
    {
		Admission ApplicantDeleteInfo= admissionService.deleteById(admissionId);
		  
        return new ResponseEntity<>(ApplicantDeleteInfo ,HttpStatus.CREATED);
       
    }

	@PutMapping("/UpdateApplicantAdmission/{applicantId}/{courseId}")// Annotation for mapping HTTP PUT  requests onto specific handler methods.
    public ResponseEntity<Admission> updateApplicantAdmission(@PathVariable int applicantId ,@PathVariable int courseId )throws HandlingException
    {
		Admission Applicant = admissionService.updateApplicantCourse(applicantId,courseId);
		   
        return new ResponseEntity<>(Applicant,HttpStatus.ACCEPTED);
       
    }

	
    @GetMapping("/showAllAdmissionByCourseId/{courseId}")// Annotation for mapping HTTP GET requests onto specific handler methods.
    public List<Admission> findAllByCourseId(@PathVariable int courseId) 
    {
    		
	    return admissionService.showAllAdmissionByCourseId(courseId);
		   
       
    }

    @GetMapping("/showAllAdmissionByAdmissionDate/{admissionDate}")
    public List<Admission> findAllByCourseId(@PathVariable LocalDate admissionDate) 
      {
    		
	    return admissionService.showAllAdmissionByDate(admissionDate);
		   
        }

}
