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
        //��������в����ⷽ��,����÷�����ʱ
		System.out.println("����ִ��" +method.getName() + "����");  
        MonitorUtil.start();
        Object result = method.invoke(target, args);
        MonitorUtil.finish(method.getName());

       return result;
	}

}
