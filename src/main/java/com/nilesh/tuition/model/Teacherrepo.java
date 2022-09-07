package com.nilesh.tuition.model;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface Teacherrepo extends CrudRepository<Teacher,String> {
	
	public List<Teacher> findByLocality(String l);
	
	public List<Teacher> findByLanguage(String l);
	
	public List<Teacher> findByName(String l); 
	
	public List<Teacher> findByMinclassLessThanEqualAndMaxclassGreaterThanEqual(int min,int max);

}
