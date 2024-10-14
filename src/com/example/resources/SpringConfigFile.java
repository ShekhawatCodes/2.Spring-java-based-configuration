package com.example.resources;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.beans.Student;

@Configuration
public class SpringConfigFile {
	
	@Bean
	public Student stdId() {
		Student std = new Student();
		std.setName("sumit");
		std.setEmailId("sumo@hotmail.com");
		std.setRollNo(145);
		return std;
	}

}
