/*������ �ƴ� �ؿ� n������ �� ���� �ִ����� ����ϴ� ���α׷��� �ۼ��ϼ���. ������ �ƴ� ���� 2���� 28�ϱ��� �ֽ��ϴ�.
ù ��° �ٿ� n�� �־����ϴ�.
1 �� n �� 12 */

import java.util.Scanner;

public class Ex_111 {
	public static void main(String[] args) {
		System.out.println("�� �� �Դϱ�?");
		Scanner sc = new Scanner(System.in); 
       	int n = sc.nextInt();
         
        if (n % 2 == 1 && n <= 7 || n % 2 == 0 && n >= 8) { 
           System.out.println("31");
        } else if (n == 2) {
           System.out.println("28");
        } else {
           System.out.println("30");
        }
     /* if(n == 2)
            System.out.println("28");
        else if(n <= 7) {  //7���� �������� 7������ ������ Ȧ�� ���� 31�� �̻��̸� 30���� �ȴ�.
            if(n % 2 == 1)
                System.out.println("31");
            else
                System.out.println("30");
        }
        else {
            if(n % 2 == 0)
                System.out.println("31");
            else
                System.out.println("30");
        }     */
    }
}