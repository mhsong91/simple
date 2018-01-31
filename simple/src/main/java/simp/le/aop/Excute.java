package simp.le.aop;

import org.springframework.aop.framework.ProxyFactory;

public class Excute {

	public static void main(String[] args) {
		PrintSome ps = new print();
		ProxyFactory pf=new ProxyFactory();//Proxy 중계서버로생각하자종이전화의 실정도
		pf.addAdvice(new PrintAdvice());//pa=new PrintAdvice();같은거
		pf.setTarget(ps);// "나는"+"송명훈"+"이다."
		print p=(print)pf.getProxy();
		p.hello();
		p.myong();
	}
}
