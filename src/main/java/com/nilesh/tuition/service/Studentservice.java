package com.nilesh.tuition.service;

import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilesh.tuition.model.Student;
import com.nilesh.tuition.model.Studentauth;
import com.nilesh.tuition.model.Studentrepo;
@Service
public class Studentservice {
	@Autowired
	Studentrepo Studentrepoobj;
	
	public List<Student> getStudents()
	{
		List<Student> ls=new ArrayList<Student>();
		Iterable<Student> iterable=Studentrepoobj.findAll();
		Iterator<Student> iterator=iterable.iterator();
		while(iterator.hasNext())
		{
			ls.add(iterator.next());
		}
		return ls;
	}
	public Student getStudent(String id)
	{
		Student s=new Student();
		Optional<Student> op=Studentrepoobj.findById(id);
		if(op.isPresent())
		{
			s=op.get();
		}
		return s;
	}
	
	public void addStudent(Student student)
	{
		Studentrepoobj.save(student);
	}
	
	public boolean isAuth(Studentauth s)
	{
		String id=s.getLoginid();
		String pass=s.getPassword();
		//System.out.println(id);
		//System.out.println(pass);
		Student st;
		Optional<Student> op=Studentrepoobj.findById(id);
		//System.out.println(op);
		if(op.isPresent())
		{
			st=op.get();
			if(st.getPassword().equals(pass))
				return true;
			else
				return false;
		}
		
		return false;
	}

}
