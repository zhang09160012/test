package main;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class StuProHandler<T> implements InvocationHandler {
	T target;
	public StuProHandler(T target){
		this.target=target;
	}
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        //代理过程中插入监测方法,计算该方法耗时
		System.out.println("代理执行" +method.getName() + "方法");  
        MonitorUtil.start();
        Object result = method.invoke(target, args);
        MonitorUtil.finish(method.getName());

       return result;
	}

}
