/*�ڿ��� y�� �Է¹޾� y���� ���������� �Ǵ��ϴ� ���α׷��� �ۼ��غ�����. ������ ������ ������ �����ϴ�.
4�� ������ �����Դϴ�.
4�� ����̸鼭 100�� ������ ������ �ƴմϴ�.
4�� ����̸鼭 100�� ������� ���� 400�� ������ �����Դϴ�.
������ ��쿡�� ������ �ƴմϴ�.
ù ��° �ٿ��� y�� �־����ϴ�.
�Է¹��� ������ �����̶�� true�� �ƴ϶�� false�� ����մϴ�.
1 �� y �� 2222 */

import java.util.Scanner;

public class Ex_110 {
	public static void main(String[] args) {
		System.out.println("�� �⵵ �Դϱ�?");
		Scanner sc = new Scanner(System.in); //sc == scanner
       	int year = sc.nextInt();
         
        if(year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) { //if((y % 4 == 0 && y % 100 != 0) || y % 400 == 0)
          System.out.println("true");
        } else {
          System.out.println("false");  
        }
    }
}