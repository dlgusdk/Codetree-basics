/*���ʴ��� �÷��� �Ǽ�(real number)�� �Է¹޾� ��� 1.0 �̻��̸� High, ��� 0.5 �̻��̸� Middle, �ƴϸ� Low��� ����ϴ� ���α׷��� �ۼ����ּ���.
�� �ٿ� �ϳ��� �� �Ǽ� a, b�� �־����ϴ�.
0 �� a, b �� 5
��°��� �ش��ϴ� ���ڿ��� ����մϴ�.*/

import java.util.Scanner;

public class Ex_97 {
	public static void main(String[] args) {
		System.out.println("���� ���� �÷� a, b�� ���� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
	    double a, b;
		a = scanner.nextDouble();	
		b = scanner.nextDouble();	
		
		if (a >= 1.0 && b >= 1.0) {
			System.out.println("High");
		} else if (a >= 0.5 && b >= 0.5) {
			System.out.println("Middle");
		} else {
			System.out.println("Low");
		}
	}
}