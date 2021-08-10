package main1;

public class UserManagerImpl implements UserManager {

	@Override
	public void addUser(String userName, String password) {
		System.out.println("调用了用户新增的方法！");
        System.out.println("传入参数：\nuserName = " + userName +", password = " + password);

	}

	@Override
	public void delUser(String userName) {
		System.out.println("调用了删除的方法！");
        System.out.println("传入参数：\nuserName = "+userName);
		
	}

}
