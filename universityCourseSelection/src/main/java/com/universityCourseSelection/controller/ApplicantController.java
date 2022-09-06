package com.universityCourseSelection.controller;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.universityCourseSelection.entity.Applicant;
import com.universityCourseSelection.exception.HandlingException;
import com.universityCourseSelection.service.ApplicantService;
@RestController
public class ApplicantController {
	@Autowired
	ApplicantService applicantService;
	@PostMapping("/addApplicant")
    public Applicant addApplicant(@RequestBody Applicant applicant) 
    {
		 return applicantService.addApplicant(applicant);
		    
       
    }
	@DeleteMapping("/deleteApplicant/{applicantId}")
    public ResponseEntity<Applicant> deleteApplicantByApplicantId(@PathVariable int applicantId) throws HandlingException 
    {
		Applicant ApplicantdeleteInfo = applicantService.deleteApplicantByApplicantId(applicantId);
		  
        return new ResponseEntity<>(ApplicantdeleteInfo ,HttpStatus.OK);
       
    }
	
	  @GetMapping("/viewApplicantByApplicantId/{applicantId}")
	    public Applicant findAllByCourseId(@PathVariable int applicantId) throws HandlingException 
	      {
	    		
		    return applicantService.viewApplicantByApplicantId(applicantId); 
	    }

}
