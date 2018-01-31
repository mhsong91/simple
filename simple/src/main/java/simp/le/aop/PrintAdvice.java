package simp.le.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class PrintAdvice implements MethodInterceptor{

	public Object invoke(MethodInvocation invocation) throws Throwable {
		System.out.println("내가 먼저 실행된다");
		Object obj=invocation.proceed();//proceed:진행
		System.out.println("함수?뭔상관?난나주에실해되.");
		return obj;
	}


}
