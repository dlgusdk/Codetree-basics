/*3���� ������ �Է¹޾� ���ǿ����ڸ� �̿��Ͽ� �Է¹��� �� �� �ּڰ��� ����ϴ� ���α׷��� �ۼ����ּ���.
ù ��° �ٿ� ���� a, b, c�� ������ ���̿� �ΰ� �־����ϴ�.
-100 �� a, b, c �� 100
�Է¹��� 3���� ���� �� �ּڰ��� ����մϴ�.*/

import java.util.Scanner;

public class Ex_99 {
	public static void main(String[] args) {
		System.out.println("���� a, b, c�� ���� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		c = scanner.nextInt();	
		
		if (a <= b && a <= c) {
			System.out.println(a);
		} else if (b <= a && b <= c) {
			System.out.println(b);
		} else {
			System.out.println(c);
		}
	}
}