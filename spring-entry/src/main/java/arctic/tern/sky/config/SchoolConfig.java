package arctic.tern.sky.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by wushaofeng on 2020/1/18.
 */
@Configuration
@ComponentScan("arctic.tern.sky")
public class SchoolConfig {
	String name;

	public String getName() {
		return name;
	}

	public void f(){
		String a = getName();

	}
}
