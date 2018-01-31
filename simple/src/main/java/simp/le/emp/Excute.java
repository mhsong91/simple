package simp.le.emp;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

public class Excute {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("emp/ioc.xml");
		EmpDAO edao=(EmpDAO)ac.getBean("edao");
		edao.test();
		System.out.println(edao);
		
//		System.out.println(edao.selectEmpList());
		for(Emp e:edao.selectEmpList()) {
			System.out.println(e);
		}
		System.out.println(edao.selectEmpList(2));
//		edao.insertEmpList("잠만보",100);//삽입
//		edao.deletEmpList(6);//삭제
//		edao.updateEmpList("ㅋㅋ^ㅗ^",151,4);
	}
}
