
public class LoginMain {

	public static void main(String[] args) {
		LoginMember loginMember = new LoginMember("highland0", "1234");
		int i = loginMember.login(args[0],args[1]);
		if(i == 1) {
			System.out.println("�α��εǾ����ϴ�.");
			loginMember.logout(args[0]);
		}else if(i == 0) {
			System.out.println("��й�ȣ�� Ʋ�Ƚ��ϴ�.");
		}else if(i == -1) {
			System.out.println("�����ϴ� ���̵� �����ϴ�.");
		}
	}

}
