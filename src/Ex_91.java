/*���� a�� 3�� ������ YES��, �ƴ϶�� NO�� ����ϰ�, �� 5�� ������ YES��, �ƴ϶�� NO ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� ���� a�� �־����ϴ�.
1 �� a �� 100
ù ��° �ٿ� ���� a�� 3�� ������ YES��, �ƴ϶�� NO�� ����մϴ�.
�� ��° �ٿ� ���� a�� 5�� ������ YES��, �ƴ϶�� NO ����մϴ�.*/

import java.util.Scanner;

public class Ex_91 {
	public static void main(String[] args) {
		System.out.println("���� a, b�� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		
		if(a % 3 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
		
		if(b % 5 == 0) {
			System.out.println("YES");
		} else {
			System.out.println("NO");
		}
	}
}