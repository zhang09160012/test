package main1;

public class ClientTest {
	public static void main(String[] args) {
		JdkProxy jdkProxy = new JdkProxy();  //实例化JDKProxy对象
        UserManager userJdk = (UserManager) jdkProxy.JdkProxy(new UserManagerImpl());//获取代理对象
        userJdk.addUser("admin","123456");

	}
}
