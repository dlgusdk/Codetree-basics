/*���� a�� ���� ���� b, c, d, e�� ���� �־��� ��, ���� a�� ������������ ���ؼ� ũ�Ⱑ ũ�ٸ� 1��, ũ�� �ʴٸ� 0�� ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� a�� ���� �־����ϴ�.
�� ��° �ٿ� b, c, d, e�� ���� ������� ������ �ΰ� �־����ϴ�.
1 �� a, b, c, d, e �� 100 
ù ��° �ٿ� a�� b���� ũ�ٸ� 1��, ũ�� �ʴٸ� 0�� ����մϴ�.
�� ��° �ٿ� a�� c���� ũ�ٸ� 1��, ũ�� �ʴٸ� 0�� ����մϴ�.
�� ��° �ٿ� a�� d���� ũ�ٸ� 1��, ũ�� �ʴٸ� 0�� ����մϴ�.
�� ��° �ٿ� a�� e���� ũ�ٸ� 1��, ũ�� �ʴٸ� 0�� ����մϴ�. */

import java.util.Scanner;

public class Ex_94 {
	public static void main(String[] args) {
		System.out.println("���� a, b, c ,d ,e�� ���� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int a, b, c, d, e;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		c = scanner.nextInt();	
		d = scanner.nextInt();	
		e = scanner.nextInt();	
		
		if (a > b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (a > c) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (a > d) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		if (a > e) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}