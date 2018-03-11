package proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * Created by AdrainHuang on 2018/03/11.
 */
public class RealEstateAgentCGLIB implements MethodInterceptor {

	public Object getInstance(Class className) throws ClassNotFoundException {
		Enhancer h = new Enhancer();
		h.setSuperclass(className);
		h.setCallback(this);
		return h.create();
	}

	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("----------");
		System.out.println("请问你要什么样的房子");
		methodProxy.invokeSuper(o,objects);
		System.out.println("我去帮你查找");
		System.out.println("----------");
		return null;
	}
}
