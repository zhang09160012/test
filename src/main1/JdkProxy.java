package main1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JdkProxy implements InvocationHandler {
	private Object targetObject;  //��Ҫ�����Ŀ�����
		
	//�����ȡ�������ķ�������Ŀ���������д���
	public Object JdkProxy(Object targetObject) {
		//ΪĿ�����target��ֵ
        this.targetObject = targetObject;
        //JDK��̬����ֻ�����ʵ���˽ӿڵ�����д���newProxyInstance ������������Ϳɿ���
        Object proxyObject = Proxy.newProxyInstance(targetObject.getClass().getClassLoader(),targetObject.getClass().getInterfaces(),this);
        //���ش������
        return proxyObject;

		
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("JDK��̬����������ʼ��");
        // ����invoke������result�洢�÷����ķ���ֵ
        Object result = method.invoke(targetObject,args);
        System.out.println("JDK��̬��������������");
        return result;
        
	
	}

}
