package main;

public class Student implements Person {
	private String name;
	public Student(String name) {
		this.name=name;
	}
	@Override
	public void giveMoney() {
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name + "½»°à·Ñ50");
	}

}
