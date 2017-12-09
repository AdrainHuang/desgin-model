package proxy.custom;

import java.lang.reflect.Method;

/**
 * Created by AdrainHuang on 2017/12/4.
 */
public interface MyInvocationHandler {
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable;
}
