/*���� a�� �־����� ��, a�� Ȧ����� 3�� �����ݴϴ�.
����, ���������� a�� 3�� ������ 3���� �������ݴϴ�.
���� ������ �� ������� ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� ���� a�� �־����ϴ�.
1 �� a �� 100 */

import java.util.Scanner;

public class Ex_88 {
	public static void main(String[] args) {
		System.out.println("���� a�� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		if (a % 2 == 1) {
			a += 3;
		}
		
		if (a % 3 ==0 ) {
			a /= 3;
		}
		System.out.println(a);
	}
}