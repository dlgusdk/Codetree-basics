/*�Ǽ� a �� �Է¹޾� a�� 1.5�� ���� ���� �Ҽ��� �Ʒ� ��°�ڸ����� ����ϴ� ���α׷��� �ۼ��غ�����.
 1 �� a �� 100
 ù ��° �ٿ� �Ǽ� a�� 1.5�� ���� ���� �Ҽ��� �Ʒ� ��°�ڸ����� ����մϴ�.*/

import java.util.Scanner;

public class Ex_40 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	   System.out.println("�Է�:");
	   //double a = scanner.nextDouble();
	   //String input = scanner.nextLine();
	   //Double a = Double.parseDouble(input);
	   String input = scanner.nextLine();
	   float a = Float.parseFloat(input);
	   
	   System.out.println("���:");
       System.out.printf("%.2f", a+1.5);
	}

}
