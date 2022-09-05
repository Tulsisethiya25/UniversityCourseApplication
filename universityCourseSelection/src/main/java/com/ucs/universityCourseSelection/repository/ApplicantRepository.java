package com.ucs.universityCourseSelection.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ucs.universityCourseSelection.entity.Applicant;
@Repository
public interface ApplicantRepository extends CrudRepository<Applicant, Integer> {
	Applicant save(Applicant applicant);
    Applicant findByApplicantId(int applicantId);
    void deleteByApplicantId(int ApplicantId);

}
