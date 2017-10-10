/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.briangubbins.StudentRegistrationSystem;

/**
 *
 * @author brian
 */
import java.util.ArrayList;

import org.joda.time.*;

public class Student {
	private String name;
	private int age;
	private LocalDate dob;
	private int id;
	private CourseProgramme course;

	public Student(String studentName, int studentAge, LocalDate studentDob, int studentId) {
		this.name = studentName;
		this.age = studentAge;
		this.dob = studentDob;
		this.id = studentId;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public LocalDate getDateOfBirth() {
		return dob;
	}

	public void setDateOfBirth(LocalDate dob) {
		this.dob = dob;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public CourseProgramme getCourse() {
		return this.course;
	}
	
	public void enroll(CourseProgramme course) {
		this.course = course;
	}
        
        public String getUsername() {
		return name + age;
	}
}