/*���� a�� �Է¹޾��� �� a�� ���� 5�� ��쿣 A��, 2�� ����� ��쿣 B�� ����ϴ� ���α׷��� �ۼ��غ�����. �� �� �ش����� �ʴ� ��쿡�� �ƹ� ���� ������� �ʽ��ϴ�.
ù ��° �ٿ� ���� a�� �־����ϴ�.
1 �� a �� 1,000 */

import java.util.Scanner;

public class Ex_87 {
	public static void main(String[] args) {
		System.out.println("���� a�� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		
		if (a == 5) {
			System.out.print("A");
		} 
		
		if (a % 2 == 0) {
			System.out.print("B");
		}
	}
}