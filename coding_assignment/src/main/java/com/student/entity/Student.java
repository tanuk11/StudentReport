package com.student.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.elasticsearch.annotations.Document;


import lombok.Data;

@Data
@Document(indexName = "student")
public class Student {
	
	@Id
	private Integer roll;
	private String name;
	private String semester;
	private Integer englishMarks;
	private Integer mathMarks;
	private Integer scienceMarks;
	@Override
	public String toString() {
		return "Student [roll=" + roll + ", name=" + name + ", semester=" + semester + ", englishMarks=" + englishMarks
				+ ", mathMarks=" + mathMarks + ", scienceMarks=" + scienceMarks + "]";
	}
	

}
