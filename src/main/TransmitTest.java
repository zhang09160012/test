package main;


	public class TransmitTest {
		 
	    public static void main(String[] args) {
	 
	        String a = "hello"; //String �����������ͣ����� pass ������ b ��ֵû�иı䣬���� hello
	        int b = 1; //int �����������ͣ����� pass ������ a ��ֵû�иı�,���� 1
	 
	        User user = new User(); //new Class �������ͣ����� pass ������ name �� age ��ֵ�ı���
	        user.setName("main"); // ���� pass ��name Ϊ pass ��
	        user.setAge(2); //���� pass ��age Ϊ 4 ��
	 
	        pass(user, a, b); //pass ��������
	 
	        System.out.println("main ���� user �ǣ�" + user.toString());
	        System.out.println("main ���� a ��ֵ�ǣ�" + a + " --- b ��ֵ�ǣ�" + b);
	        System.out.println();
	    }
	 
	    public static void pass(User user, String a, int b) {
	    	System.out.println(b);
	 
	        a = "���";
	        b = 3;
	        User u = user ; 
	        u.setName("pass");
	        u.setAge(4);
	 
	        System.out.println("pass ���� user �ǣ�" + user.toString());
	        System.out.println("pass ���� a ��ֵ�ǣ�" + a + " --- b ��ֵ�ǣ�" + b);
	    }
	}
	 
	class User {
	 
	    String name;
	    int age;
	 
	    public String getName() {
	        return name;
	    }
	 
	    public void setName(String name) {
	        this.name = name;
	    }
	 
	    public int getAge() {
	        return age;
	    }
	 
	    public void setAge(int age) {
	        this.age = age;
	    }
	 
	    @Override
	    public String toString() {
	        return "name = " + name + " --- age = " + age;
	    }
	}
