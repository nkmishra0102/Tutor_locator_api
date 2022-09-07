package com.nilesh.tuition.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nilesh.tuition.model.Student;
import com.nilesh.tuition.model.Studentauth;
import com.nilesh.tuition.service.Studentservice;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class Studentcontroller {

	@Autowired
	Studentservice Studentserviceobj;
	
	@RequestMapping("/students")
	public List<Student> getStudents()
	{
		return Studentserviceobj.getStudents();
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/addstudent")
	public void addStudent(@RequestBody Student student)
	{
		Studentserviceobj.addStudent(student);
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/isauthstudent")
	public boolean isAuth(@RequestBody Studentauth s)
	{
		return Studentserviceobj.isAuth(s);
	}
	@RequestMapping("/getstudent/{id}")
	public Student getStudent(@PathVariable String id)
	{
		return Studentserviceobj.getStudent(id);
	}
}
