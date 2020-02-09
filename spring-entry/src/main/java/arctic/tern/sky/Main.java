package arctic.tern.sky;

import arctic.tern.sky.config.SchoolConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import arctic.tern.sky.service.IndexService;

/**
 * Created by wushaofeng on 2020/1/17.
 */
public class Main {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(
				SchoolConfig.class
		);
		System.out.println("-------");

		IndexService service = context.getBean(IndexService.class);
		System.out.println(service);
	}
}
