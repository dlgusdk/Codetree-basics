/*�� ���� a, b�� �Է¹޾� �� ������ �հ� ����� ���� ����ϴ� ���α׷��� �ۼ��غ�����
ù ��° �ٿ� ���� a, b�� ������ ���̿� �ΰ� �־����ϴ�.
1 �� a, b �� 100
ù ��° �ٿ� �հ� ����� ������ ���̿� �ΰ� ����մϴ�. ��հ��� �Ҽ� ù°�ڸ����� ����մϴ�. */

import java.util.Scanner;

public class Ex_66 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�Է�:");
		
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();
		
		System.out.println("���:");
		System.out.printf("%d %.1f%n", a+b, (double)a+b/2);
		// System.out.printf("%d %.1f", a + b, (double)(a + b) / 2);
	}

}  
  