/*���� a, b�� �Է¹ް�, a�� b�� ������ִ� ���α׷��� �ۼ��ϼ���.
ù ��° �ٿ� ���� a,�� ��° �ٿ� ���� b�� �־����ϴ�.
1 �� a, b �� 100 
ù ��° �ٿ� a�� b�� ������ ���̿� �ΰ� ����մϴ�.*/

import java.util.Scanner;

public class Ex_46 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("a���� b�� �Է�:");
		
		int a, b;
		a = scanner.nextInt();	    
		b = scanner.nextInt();
        //a = sc.nextInt();
        //b = sc.nextInt();
		
		System.out.print("���:" );
		System.out.printf("%d %d", a, b);
        //System.out.println(a + " " + b);
	}
}