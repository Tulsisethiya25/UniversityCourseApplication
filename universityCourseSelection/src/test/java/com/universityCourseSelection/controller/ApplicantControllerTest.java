package com.universityCourseSelection.controller;

import static org.junit.jupiter.api.Assertions.*;

import static org.mockito.Mockito.verify;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.context.SpringBootTest;

import com.universityCourseSelection.entity.Admission;
import com.universityCourseSelection.entity.Applicant;
import com.universityCourseSelection.exception.HandlingException;
import com.universityCourseSelection.repository.ApplicantRepository;
import com.universityCourseSelection.service.ApplicantService;
import com.universityCourseSelection.service.ApplicantServiceImpl;

@SpringBootTest
@ExtendWith(MockitoExtension.class)
class ApplicantControllerTest {

	@Mock
	private ApplicantRepository applicantRepo;
	@InjectMocks
	private ApplicantService applicantService=new ApplicantServiceImpl();

	@BeforeEach 
	void setUp() {
		this.applicantService=new ApplicantServiceImpl(this.applicantRepo);
		Applicant applicant=new Applicant();
		
		applicant.setContactNumber("9425987651");
		applicant.setApplicantId(1);
		applicant.setStudentDegree("MCA");
		applicant.setStudentGraduationPercent(92);
		applicant.setStudentname("Tulsi");
		applicantService.addApplicant(applicant);
		
		}
	@Test
	void testAddApplicantAdmission() {
		Applicant applicant=new Applicant();
		applicant.setContactNumber("9425987651");
		applicant.setStudentDegree("MCA");
		applicant.setStudentGraduationPercent(92);
		applicant.setStudentname("Tulsi");
		applicantService.addApplicant(applicant);
		verify(applicantRepo).save(applicant);
	}
	
	

	
	


}
