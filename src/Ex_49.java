/*���� a, b, c�� �Է¹ް�, a�� b�� c�� ���ʴ�� ����ϴ� ���α׷��� �ۼ��ϼ���.
ù ��° �ٿ� ���� a�� b�� ������ ���̿� �ΰ� �־����ϴ�.
�� ��° �ٿ� ���� c�� �־����ϴ�.
1 �� a, b, c �� 100 
ù ��° �ٿ� a�� b�� c�� ������ �ΰ� ������� ����մϴ�.*/

import java.util.Scanner;

public class Ex_49 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("a��, b�� �Է�:");
		System.out.println("c�� �Է�:"); 

		int a, b, c;                 
		a = scanner.nextInt();	  
		b = scanner.nextInt();      
		c = scanner.nextInt();     
		
		System.out.print("���:" );
		System.out.printf("%d %d %d", a, b, c);
      
	}
}