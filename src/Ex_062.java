/*�� ������ �Է¹޾Ƽ� ���� ��� �������� ����ϴ� ���α׷��� �ۼ����ּ���.
ù ��° �ٿ� ���� a, b�� ������ ���̿� �ΰ� �־����ϴ�.
1 �� a, b �� 100 
�� ������ ��� �������� ������� ����ϵ� ���̿� "..."�� �����մϴ�.*/

import java.util.Scanner;

public class Ex_62 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�Է�:");
		
		int a, b;
		a = scanner.nextInt();
		b = scanner.nextInt();

		System.out.println("���:");
		System.out.printf("%d...%d%n", a/b, a%b);
		// System.out.println(a / b + "..." + a % b);
	}
}