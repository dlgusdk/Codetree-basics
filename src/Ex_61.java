/*�� ���� ������ �Է¹޾� ���� ���� ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� ���� a, b�� ������ ���̿� �ΰ� �־����ϴ�.
1 �� b �� a �� 500
ù ��° �ٿ��� �� ������ ������ ���� ����� ����,
�� ��° �ٿ��� a���� b�� ������ ���� ����� ���� ����մϴ�. */

import java.util.Scanner;

public class Ex_61 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�Է�:");
		
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();

		System.out.println("���:");
		System.out.printf("%d * %d = %d%n", a, b, a*b);
		System.out.printf("%d / %d = %d", a, b, a/b);
		//System.out.println(a + " * " + b + " = " + a * b);
		//System.out.println(a + " / " + b + " = " + a / b);
	}
}