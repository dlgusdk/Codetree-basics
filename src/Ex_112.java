/*3���� ���� a, b, c�� �Է¹޾��� ��, �ִ��� ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� ���� a, b, c�� ������ ���̿� �ΰ� �־����ϴ�.
-100 �� a, b, c �� 100 a, b, c �� ���� �� ���� ū �� �ϳ��� ����մϴ�.*/

import java.util.Scanner;

public class Ex_112 {
	public static void main(String[] args) {
		System.out.println("�� ���� a, b, c�� �Է��� �ּ���.");
		Scanner sc = new Scanner(System.in); 
		int a ,b ,c;
		a = sc.nextInt();
		b = sc.nextInt();
		c = sc.nextInt();

		if (a >= b) { 
         if (a >= c) {
			System.out.println(a);
         } else {
            System.out.println(c);
         }
       	 
		} else {
		   if (b >= c) {
			   System.out.println(b);
		   } else {
			   System.out.println(c);
		   }
		}
	}
}
		
	   	
