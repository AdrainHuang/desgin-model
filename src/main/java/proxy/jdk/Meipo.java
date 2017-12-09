package proxy.jdk;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * Created by AdrainHuang on 2017/12/3.
 * 媒婆
 */
public class Meipo implements InvocationHandler{

	private Person target;

	//获取到被代理人个人资料。
	public  Object getInstance(Person target) throws Exception{
		this.target = target;
		Class clazz = target.getClass();
		System.out.println("被代理对象： "+clazz.getName());
		return Proxy.newProxyInstance(clazz.getClassLoader(),clazz.getInterfaces(),this);
	}
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("你的性别是：要给你找个异性");
		System.out.println("开始海选。。。。。。");
		System.out.println("---------");
		this.target.findLove();
		System.out.println("---------");
		System.out.println("合适就开始办事");
		return target;
	}
}
