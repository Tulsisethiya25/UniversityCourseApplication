package com.universityCourseSelection.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.universityCourseSelection.entity.Applicant;
@Repository
public interface ApplicantRepository extends CrudRepository<Applicant, Integer> {
    Applicant findByApplicantId(int applicantId);
    void deleteByApplicantId(int ApplicantId);

}
