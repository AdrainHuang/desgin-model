package proxy.custom;

import proxy.jdk.Person;

import java.lang.reflect.Method;

/**
 * Created by AdrainHuang on 2017/12/4.
 */
public class MyMeiPo implements MyInvocationHandler{

	private Person target;

	//获取到被代理人个人资料。
	public  Object getInstance(Person target) throws Exception{
		this.target = target;
		Class clazz = target.getClass();
		System.out.println("Be proxyed Obj is : "+clazz.getName());
		return MyProxy.newProxyInstance(new MyClassLoader(),clazz.getInterfaces(),this);
	}

	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("Begin TO find Your lovers");
		System.out.println("------------");
		method.invoke(this.target, args);
		System.out.println("------------");
		System.out.println("if fit,Be together");
		return null;
	}
}
