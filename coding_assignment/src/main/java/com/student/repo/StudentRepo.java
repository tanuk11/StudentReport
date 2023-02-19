package com.student.repo;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

import com.student.entity.Student;


public interface StudentRepo extends ElasticsearchRepository<Student, Integer>{
	
	

}