/*�ڿ��� n�� �Է¹޾� n�� ������ �������� �Ǵ��ϴ� ���α׷��� �ۼ��غ�����.
������ �����̱� ���ؼ��� ���� �� ���� �� �ϳ��� �����ؾ� �մϴ�.
Ȧ���̸鼭 3�� ����� ��
¦���̸鼭 5�� ����� ��
ù ��° �ٿ��� n�� �־����ϴ�.
1 �� n �� 100
�Է¹��� ���ڰ� ������ ���ڶ�� true�� �ƴ϶�� false�� ����մϴ�.*/

import java.util.Scanner;

public class Ex_104 {
	public static void main(String[] args) {
		System.out.println("���� n�� ���� �Է����ּ���");
		Scanner scanner = new Scanner(System.in);
		int n = scanner.nextInt();	

		if ((n % 2 == 1 && n % 3 == 0) || (n % 2 == 0 && n % 5 == 0)) { //�������ڸ� ���� �� ������ ()�� ��������Ѵ�. &&�� ||���� �켱������ �� ���� ������ �Ұ�ȣ�� �켱������ �����ش�.
			System.out.println("true");
	    } else {
			System.out.println("false");
		}
	}
}