/*�� �Ǽ� a, b �� �Է¹޾� ���� ���Ͽ� �Ҽ��� �Ʒ� ��°�ڸ����� ����ϴ� ���α׷��� �ۼ��غ�����.
 ù ��° �ٿ� �Ǽ� a�� �Ǽ� b�� ���� �Ҽ��� �Ʒ� ��°�ڸ����� ����մϴ�.
 ù ��° �ٿ� �Ǽ� a�� �־����ϴ�. �� ��° �ٿ� �Ǽ� b�� �־����ϴ�.
 ù ��° �ٿ� �Ǽ� a�� �Ǽ� b�� ���� �Ҽ��� �Ʒ� ��°�ڸ����� ����մϴ�.
 1 �� a, b �� 100 */

import java.util.Scanner;

public class Ex_47 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("a���� b�� �Է�:");
		
		float a, b;                 //double a, b;
		a = scanner.nextFloat();	// a = scanner.nextDouble(); 
		b = scanner.nextFloat();    // b = scanner.nextDouble();
       
		
		System.out.print("���:" );
		System.out.printf("%.2f", a+b);
      
	}
}