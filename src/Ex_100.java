/*�� �� a, b, c�� ���� �־����� ��, b�� a���� ũ�� c���� �۴ٸ� 1��, �׷��� �ʴٸ� 0�� ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� a, b, c ���� ������� ������ �ΰ� �־����ϴ�.
1 �� a, b, c �� 100 
b�� a���� ũ�� c���� �۴ٸ� 1��, �׷��� �ʴٸ� 0�� ����ϴ� ���α׷��� �ۼ��غ�����. */

import java.util.Scanner;

public class Ex_100 {
	public static void main(String[] args) {
		System.out.println("���� a, b, c�� ���� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		c = scanner.nextInt();	
		
		if (a < b && b < c) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}