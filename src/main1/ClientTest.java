package main1;

public class ClientTest {
	public static void main(String[] args) {
		JdkProxy jdkProxy = new JdkProxy();  //ʵ����JDKProxy����
        UserManager userJdk = (UserManager) jdkProxy.JdkProxy(new UserManagerImpl());//��ȡ�������
        userJdk.addUser("admin","123456");

	}
}
