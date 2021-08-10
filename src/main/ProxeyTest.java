package main;

import java.lang.reflect.Proxy;

public class ProxeyTest {
	public static void main(String[] args) {
		Person stu = new Student("ÕÅÈýn");
		StuProHandler<Person> stup = new StuProHandler<Person>(stu);
		System.out.println("stup=" + stup);
		Person stuProxy = (Person) Proxy.newProxyInstance(Person.class.getClassLoader(), 
										new Class<?>[]{Person.class}, stup);
		stuProxy.giveMoney();
		
	}
	
	
}
