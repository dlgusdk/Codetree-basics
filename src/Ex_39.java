/*1��Ʈ(ft)�� 30.48cm�Դϴ�.
�Ǽ��� ��Ʈ(ft)�� �Է¹޾� cm�� ȯ���Ͽ� ���� �ݿø��Ͽ� ù°�ڸ����� ����ϴ� ���α׷��� �ۼ����ּ���
0 �� n �� 100 �Է¹��� �Ǽ����� ȯ���ϰ� �ݿø��Ͽ� ù°�ڸ����� ����մϴ�.*/

import java.util.Scanner;

public class Ex_39 {

	public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	
	   System.out.println("�Է�:");
	   //double n = scanner.nextDouble();
	   String input = scanner.nextLine();
	   Double n = Double.parseDouble(input);
	   
	   System.out.println("���:");
       System.out.printf("%.1f", n*30.48);
	}

}
