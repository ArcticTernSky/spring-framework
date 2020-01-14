package org.springframework;

import org.springframework.config.SchoolConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by wushaofeng on 2020/1/14.
 */
public class Hello {
	public void test(){
		ApplicationContext context = new AnnotationConfigApplicationContext(
				SchoolConfig.class
		);
		//context.getBean(Student.class);
	}
}
