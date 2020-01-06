package com.tiff.sb.exercise.services;

import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tiff.sb.exercise.domain.Student;
import com.tiff.sb.exercise.domain.Subject;
import com.tiff.sb.exercise.repositories.StudentRepository;
import com.tiff.sb.exercise.repositories.SubjectRepository;

@Service
public class StudentService {
	
	@Autowired 
	private StudentRepository studentRepository;
	
	//@Autowired
	//private SubjectRepository subjectRepo;
	
	public Student saveStudent(Student student) {
		// iterates through subjects of student
		//Iterator<Subject> subjects = student.getSubjects().iterator();
		//Subject subject;
		// if subject does not exist in subject table, create new subject
		/**while(subjects.hasNext()) {
			subject = subjects.next();
			if (subjectRepo.findBySubjectId(subject.getSubjectId()) == null) {
				subjectRepo.save(subject);
			} // if
		}**/
		 
		return studentRepository.save(student);
	}  // saveStudent
	
	public Student findStudentById(long studentId) {
		return studentRepository.findByStudentId(studentId);
	} // findStudentById
}
