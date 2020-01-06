package com.tiff.sb.exercise.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tiff.sb.exercise.domain.Student;
import com.tiff.sb.exercise.domain.Subject;

@Repository
public interface SubjectRepository extends CrudRepository<Subject, Long>{
	
	Subject findBySubjectId(String subjectId);
	
	@Override
	Iterable<Subject> findAll();
	
	//Iterable<Subject> findAllByStudent(Student student);
}
