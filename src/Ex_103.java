/*���� a�� �־����� ��, a�� 3�� ����̰ų� 5�� ����� ��쿡�� 1��, �׷��� �ʴٸ� 0�� ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� ���� a�� �־����ϴ�.
1 �� a �� 1,000
ù ��° �ٿ� a�� 3�� ����̰ų� 5�� ����� ��쿡�� 1��, �׷��� �ʴٸ� 0�� ����մϴ� */

import java.util.Scanner;

public class Ex_103 {
	public static void main(String[] args) {
		System.out.println("���� a�� ���� �Է����ּ���");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();	

		if (a % 3 == 0 || a % 5 == 0) {
			System.out.println("1");
	    } else {
			System.out.println("0");
		}
	}
}