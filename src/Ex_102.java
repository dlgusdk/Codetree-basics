/*���� a�� �Է¹޾��� �� 13�� ����̰ų� 19�� ����� ���� True, �� ���� ���� False�� ����ϴ� ���α׷��� �ۼ����ּ���.
ù ��° �ٿ� ���� a�� �־����ϴ�.
1 �� a �� 1,000  ù ��° �ٿ��� a�� ���� ����� ���� ����մϴ�.*/

import java.util.Scanner;

public class Ex_102 {
	public static void main(String[] args) {
		System.out.println("���� a�� ���� �Է����ּ���");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();	

		if (a % 13 == 0 || a % 19 == 0) {
			System.out.println("True");
	    } else {
			System.out.println("False");
		}
	}
}