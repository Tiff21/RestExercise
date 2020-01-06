package com.tiff.sb.exercise.domain;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Student {
	
	@Id
	@Column(nullable=false)
	private long studentId;
	
	@Column(nullable=false)
	private String studentFirstName;
	
	@Column(nullable=false)
	private String studentLastName;
	
	@Column(nullable=false)
	private String studentClass;
	
	@ManyToMany(cascade = {CascadeType.MERGE})
	@JoinTable(name = "students_subjects",
				joinColumns = {@JoinColumn(name = "student_id")},
				inverseJoinColumns = {@JoinColumn(name = "subject_id")})
	private List<Subject> subjects = new ArrayList<>();

	
	public Student() {
		super();
	}

	public Student(long studentId, String studentFirstName, String studentLastName, String studentClass, List<Subject> subjects) {
		super();
		this.studentId = studentId;
		this.studentFirstName = studentFirstName;
		this.studentLastName = studentLastName;
		this.studentClass = studentClass;
		this.subjects = subjects;
	}

	public long getStudentId() {
		return studentId;
	}

	public void setStudentId(long studentId) {
		this.studentId = studentId;
	}

	public String getStudentFirstName() {
		return studentFirstName;
	}

	public void setStudentFirstName(String studentFirstName) {
		this.studentFirstName = studentFirstName;
	}

	public String getStudentLastName() {
		return studentLastName;
	}

	public void setStudentLastName(String studentLastName) {
		this.studentLastName = studentLastName;
	}

	public String getStudentClass() {
		return studentClass;
	}

	public void setStudentClass(String studentClass) {
		this.studentClass = studentClass;
	}
	

	public List<Subject> getSubjects() {
		return subjects;
	}

	public void setSubjects(List<Subject> subjects) {
		this.subjects = subjects;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentFirstName=" + studentFirstName + ", studentLastName="
				+ studentLastName + ", studentClass=" + studentClass + "]";
	}
	
	
}
