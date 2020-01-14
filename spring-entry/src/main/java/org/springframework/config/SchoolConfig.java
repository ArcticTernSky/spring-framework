package org.springframework.config;

import org.springframework.bo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wushaofeng on 2020/1/14.
 */
@Configuration
public class SchoolConfig {
	@Bean
	public Student getStudent(long id, String name){
		return new Student(id, name);
	}
}
