package main1;

public class UserManagerImpl implements UserManager {

	@Override
	public void addUser(String userName, String password) {
		System.out.println("�������û������ķ�����");
        System.out.println("���������\nuserName = " + userName +", password = " + password);

	}

	@Override
	public void delUser(String userName) {
		System.out.println("������ɾ���ķ�����");
        System.out.println("���������\nuserName = "+userName);
		
	}

}
