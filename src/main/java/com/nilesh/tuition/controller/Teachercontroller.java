package com.nilesh.tuition.controller;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nilesh.tuition.model.Teacher;
import com.nilesh.tuition.model.Teacherauth;
import com.nilesh.tuition.service.Teacherservice;
@CrossOrigin(origins="http://localhost:3000")
@RestController
public class Teachercontroller {
	
	@Autowired
	Teacherservice teacherserviceobj;
	
	@RequestMapping("/teachers")
	public List<Teacher> getTeachers()
	{
		return teacherserviceobj.getTeachers();
	}
	@RequestMapping(method=RequestMethod.POST,value="/addteacher")
	public void addTeacher(@RequestBody Teacher t)
	{
		teacherserviceobj.addTeacher(t);
	}
	@RequestMapping(method=RequestMethod.POST,value="/incupvotes")
	public void incUpvote(@RequestBody String s)
	{
		teacherserviceobj.incUpvote(s);
	}

	@RequestMapping(method=RequestMethod.POST,value="/isauthteacher")
	public boolean isAuth(@RequestBody Teacherauth t)
	{
		return teacherserviceobj.isAuth(t);
	}
	@RequestMapping("/getteacher/{id}")
	public Teacher getTeacher(@PathVariable("id") String id)
	{
		return teacherserviceobj.getTeacher(id);
	}
	
	@RequestMapping("/filterlocality/{locality}")
	public List<Teacher> filterLocality(@PathVariable("locality") String l)
	{
		return teacherserviceobj.filterLocality(l);
	}
	
	@RequestMapping("/filterlanguage/{language}")
	public List<Teacher> filterLanguage(@PathVariable("language") String l)
	{
		return teacherserviceobj.filterLanguage(l);
	}
	
	@RequestMapping("/filtername/{name}")
	public List<Teacher> filterName(@PathVariable("name") String l)
	{
		return teacherserviceobj.filterName(l);
	}
	 
	@RequestMapping("/filterclass/{min}/{max}")
	public List<Teacher> filterClass(@PathVariable("min") int c,@PathVariable("max") int d)
	{
		return teacherserviceobj.filterClass(c,d);
	}
}
