/*�� ���� �Ǽ��� �Է� �޾� �ݿø��Ͽ� �Ҽ� ��° �ڸ����� ����ϴ� ���α׷��� �ۼ����ּ���.
�� �ٿ� �ϳ��� �� �Ǽ� a, b, c�� �־����ϴ�.
�� �ٿ� �ϳ��� �� �Ǽ��� �ݿø��Ͽ� �Ҽ� ��° �ڸ����� ����մϴ�.
1 �� a, b, c �� 1,000 */

import java.util.Scanner;

public class Ex_48 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("a��, b��, c�� �Է�:");
		
		float a, b, c;                 //double a, b, c;
		a = scanner.nextFloat();	   // a = scanner.nextDouble(); 
		b = scanner.nextFloat();       // b = scanner.nextDouble();
		c = scanner.nextFloat();       // c = scanner.nextDouble();
		
		System.out.print("���:" );
		System.out.printf("%.3f%n", a);
		System.out.printf("%.3f%n", b);
		System.out.printf("%.3f%n", c);  
		//System.out.printf("%.3f%n%.3f%n%.3f%n", a, b, c);  
      
	}
}