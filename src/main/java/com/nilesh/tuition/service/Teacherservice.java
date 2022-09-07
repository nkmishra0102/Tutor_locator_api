package com.nilesh.tuition.service;

import java.util.*;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nilesh.tuition.model.Teacher;
import com.nilesh.tuition.model.Teacherauth;
import com.nilesh.tuition.model.Teacherrepo;
@Service
public class Teacherservice {
	
	@Autowired
	Teacherrepo teacherrepoobj;
	
	public List<Teacher> getTeachers()
	{
		List<Teacher> ls=new ArrayList<Teacher>();
		Iterable<Teacher> iterable=teacherrepoobj.findAll();
		Iterator<Teacher> iterator=iterable.iterator();
		while(iterator.hasNext())
		{
			ls.add(iterator.next());
		}
		return ls;
	}
	
	public Teacher getTeacher(String id)
	{
		Teacher t=new Teacher();
		Optional<Teacher> op=teacherrepoobj.findById(id);
		if(op.isPresent())
		{
			t=op.get();
			
		}
		return t;
	}

	public void addTeacher(Teacher t)
	{
		teacherrepoobj.save(t);
	}
	
	public void incUpvote(String s)
	{
		Teacher t;
		Optional<Teacher> op=teacherrepoobj.findById(s);
		if(op.isPresent())
		{
			t=op.get();
			int votes=t.getUpvotes();
			t.setUpvotes(votes+1);
		}
	}
	
	public boolean isAuth(Teacherauth t)
	{
		Teacher tt;
		String id=t.getLoginid();
		String pass=t.getPassword();
		Optional<Teacher> op=teacherrepoobj.findById(id);
		if(op.isPresent())
		{
			tt=op.get();
			if(tt.getPassword().equals(pass))
				return true;
			else
				return false;
		}
		
		return false;
	}
	
	public List<Teacher> filterLocality(String l)
	{
		//List<Teacher> t=new ArrayList<Teacher>();
		return teacherrepoobj.findByLocality(l);
		
	}
	
	public List<Teacher> filterLanguage(String l)
	{
		//List<Teacher> t=new ArrayList<Teacher>();
		return teacherrepoobj.findByLanguage(l);
		
	}
	
	public List<Teacher> filterName(String l)
	{
		//List<Teacher> t=new ArrayList<Teacher>();
		return teacherrepoobj.findByName(l);
		
	}
	
	public List<Teacher> filterClass(int min,int max)
	{
		//List<Teacher> t=new ArrayList<Teacher>();
		return teacherrepoobj.findByMinclassLessThanEqualAndMaxclassGreaterThanEqual(min,max);
		
	}
}
