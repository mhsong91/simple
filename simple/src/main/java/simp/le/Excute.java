package simp.le;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import simp.le.service.UserService;

public class Excute {
						
						
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("ioc.xml");
		
		UserService us=(UserService)ac.getBean("userService");
		System.out.println(us.getUser());
		System.out.println(us.selectList());
	}
}
