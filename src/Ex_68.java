/*�� ���� ������ �־����� ��, �� ������ �հ� ����� ���ϰ�, �տ��� ����� �� ���� ���ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� �� ���� a, b, c�� ������ �ΰ� �־����ϴ�.
��, a, b, c�� ���� 3�� ������� �����Ͽ��� �����ϴ�.
1 �� a, b, c �� 100 
ù ��° �ٿ��� ���� ����մϴ�.
�� ��° �ٿ��� ����� ����մϴ�.
�� ��° �ٿ��� �տ��� ����� �� ���� ����մϴ�.*/

import java.util.Scanner;

public class Ex_68 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�Է�:");
		
		int a ,b, c, z;
	    a = scanner.nextInt();
	    b = scanner.nextInt();
	    c = scanner.nextInt();
	    z = a+b+c;
	    
	    System.out.println("���:");
	    System.out.println(z);
	    System.out.printf("%d%n", (z)/3);
	    System.out.printf("%d%n", z-z/3);
	    //System.out.printf("%d%n", (a+b+c)-(a+b+c)/3);
	}

}
