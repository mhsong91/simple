package simp.le.method;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class Desiner implements MethodReplacer{

	public Object reimplement(Object arg0, Method arg1, Object[] arg2) throws Throwable {

		return "디자이너 일중";
	}


}
