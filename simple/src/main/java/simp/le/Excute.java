package simp.le;

import java.sql.SQLException;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import simp.le.service.UserService;

public class Excute {
						
						
	public static void main(String[] args) throws SQLException {
		ApplicationContext ac=new ClassPathXmlApplicationContext("ioc.xml");
		BasicDataSource bdc=(BasicDataSource)ac.getBean("ds");
		System.out.println(bdc.getConnection());
		UserService us=(UserService)ac.getBean("userService");
		System.out.println(us.getUser());
		
	}
}
