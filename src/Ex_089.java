/*2���� ���� a, b�� �Է¹޾� ù ��° ���� ¦Ȧ ���ο�, �� ��° ���� ¦Ȧ ���θ� ����ϴ� ���α׷��� �ۼ����ּ���.
ù ��° �ٿ� ���� a, b�� ������ ���̿� �ΰ� �־����ϴ�.
1 �� a, b �� 100 
ù ��° �ٿ��� ���� a�� ���� ������ ����մϴ�. a�� ¦����� even��, Ȧ����� odd�� ����մϴ�.
�� ��° �ٿ��� ���� b�� ���� ������ ����մϴ�. b�� ¦����� even��, Ȧ����� odd�� ����մϴ�. */

import java.util.Scanner;

public class Ex_89 {
	public static void main(String[] args) {
		System.out.println("���� a, b�� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		
		if (a % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
		
		if (b % 2 == 0) {
			System.out.println("even");
		} else {
			System.out.println("odd");
		}
	}
}