/*�� ���� ������ �Է¹޾Ƽ� �հ�� ����� ����ϴ� ���α׷��� �ۼ����ּ���.
(��, ����� �Ҽ� ���ϸ� �����ϴ�.)
ù ��° �ٿ� ���� a, b, c�� ������ ���̿� �ΰ� �־����ϴ�.
1 �� a, b, c �� 100
ù ��° �ٿ��� ���� ����մϴ�. �� ��° �ٿ��� ����� ����մϴ�.*/

import java.util.Scanner;

public class Ex_67 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�Է�:");
		
	    int a ,b, c;
	    a = scanner.nextInt();
	    b = scanner.nextInt();
	    c = scanner.nextInt();
	    
	    System.out.println("���:");
	    System.out.println(a+b+c);
	    System.out.printf("%d", (a+b+c)/3);
	}

}
