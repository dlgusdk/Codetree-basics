/*�� ���� ������ �Է¹޾Ƽ� 4���� ���迬������ ����� ����ϴ� ���α׷��� �ۼ����ּ���.
ù ��° �ٿ� ���� a, b�� ������ ���̿� �ΰ� �־����ϴ�.
1 �� a, b �� 10 
������ ��쿡 ���� ���̶�� 1��, �����̶�� 0�� ����մϴ�.
ù ��° �ٿ��� a�� b���� ���ų� ū��,
�� ��° �ٿ��� a�� b���� ū��,
�� ��° �ٿ��� b�� a���� ���ų� ū��,
�� ��° �ٿ��� b�� a���� ū���� ���� ����� ����մϴ�.*/

import java.util.Scanner;

public class Ex_93 {
	public static void main(String[] args) {
		System.out.println("���� a, b�� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		
		if (a >= b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (a > b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		if (a <= b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		if (a < b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
	}
}