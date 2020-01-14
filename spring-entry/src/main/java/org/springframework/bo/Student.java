package org.springframework.bo;

/**
 * Created by wushaofeng on 2020/1/14.
 */
public class Student {

	private long id;
	private String name;

	public Student(long id, String name){
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}
}
