/*2���� ������ �Է� �޾� ù ��° ���� �� ������ 1 �ƴϸ� 0�� ����ϰ�, �� ���� ���� ������ 1 �ƴϸ� 0 �� ����ϴ� ���α׷��� �ۼ����ּ���.
ù ��° �ٿ� ���� a, b�� ������ ���̿� �ΰ� �־����ϴ�.
1 �� a, b �� 100 
����� ���� �� ���� ������ ���̿� �ΰ� ����մϴ�. */

import java.util.Scanner;

public class Ex_90 {
	public static void main(String[] args) {
		System.out.println("���� a, b�� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		
		if(a < b) {
            System.out.print("1 ");
		} else {
            System.out.print("0 ");
		}
		
        if(a == b) {
            System.out.println("1");
        } else  {
            System.out.println("0");
		}
	}
}