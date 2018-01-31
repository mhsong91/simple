package simp.le.method;

import org.apache.commons.dbcp2.BasicDataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class methodExcute {

	
	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("method/method.xml");
		Test t=(Test)ac.getBean("t");
		t.doWork();
		
	}
}
