/*���ڿ� s�� ���ڿ� t�� �Է¹޾� ������ �ٲپ� ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� ���ڿ� s��, �� ��° �ٿ� ���ڿ� t�� ���ʴ�� �־����ϴ�. ��, ���ڿ� s�� t�� ���ĺ� �ҹ��ڷθ� �̷�����ִٰ� �����ص� �����ϴ�
1 �� ���ڿ� s�� ����, ���ڿ� t�� ���� �� 10*/


import java.util.Scanner;

public class Ex_53 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�Է�:");
		
		//String s, t;
		String s = scanner.next();
		String t = scanner.next();
		
		String tmp;
		tmp = s;
		s = t;
		t = tmp;

		System.out.println("���:");
		System.out.println(s);
		System.out.println(t);
	}

}
