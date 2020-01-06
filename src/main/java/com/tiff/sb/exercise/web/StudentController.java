package com.tiff.sb.exercise.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.tiff.sb.exercise.domain.Student;
import com.tiff.sb.exercise.repositories.StudentRepository;
import com.tiff.sb.exercise.repositories.SubjectRepository;
import com.tiff.sb.exercise.services.StudentService;

@RestController
@RequestMapping("/api/student")
public class StudentController {
	
	@Autowired
	private StudentService studentService;
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public Student createStudent(@RequestBody Student student){
		return studentService.saveStudent(student);
	} // create
	
	@GetMapping("/{studentId}")
	@ResponseStatus(HttpStatus.OK)
	public Student getStudent(@PathVariable Long studentId){
		return studentService.findStudentById(studentId);
	} // get
} // class
