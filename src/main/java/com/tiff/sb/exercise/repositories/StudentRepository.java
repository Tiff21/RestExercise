package com.tiff.sb.exercise.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.tiff.sb.exercise.domain.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Long> {
	Student findByStudentId(Long studentId);
} // interface
