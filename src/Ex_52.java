/*����c�� �Ǽ� a,b�� �Է¹޾� ����ϵ� �Ǽ��� �ݿø��Ͽ� �Ҽ� ��°�ڸ����� ����ϴ� ���α׷��� �ۼ����ּ���.
(C++, Java �� ��� �Ǽ��� "double"�� �����ϼ���.)
ù ��° �ٿ��� �Է¹��� ���� c
�� ��° �ٿ��� �ݿø��� �Ǽ� a�� ��
�� ��° �ٿ��� �ݿø��� �Ǽ� b�� ���� ����մϴ�.*/

import java.util.Scanner;

public class Ex_52 {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
       /*char a;
        double b, c;*/
        String s = scanner.next();
        char x = s.charAt(0);
       // char x = scanner.next().charAt(0);
        
        double y = scanner.nextDouble();
        double z = scanner.nextDouble();
       
        System.out.println(x);
        System.out.printf("%.2f%n", y);
        System.out.printf("%.2f%n", z); 
        
	}

}
