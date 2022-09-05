package com.ucs.universityCourseSelection.repository;

import java.time.LocalDate;
import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ucs.universityCourseSelection.entity.Admission;
@Repository
public interface AdmissionRepository extends CrudRepository<Admission, Integer> {
	List<Admission> findAllByCourseId(int courseId);
	List<Admission> findAllByAdmissionDate(LocalDate admissionDate);
	 Admission findByApplicantId (int ApplicantId);
	 Admission findByAdmissionId (int admissionId);
}
