/*���� a�� �Է� �޾� a�� 10�̻� 20 ������ �������� �Ǵ��ϴ� ���α׷��� �ۼ��غ�����
ù ��° �ٿ� a�� �־����ϴ�.
1 �� a �� 100
ù ��° �ٿ� ���� a�� ���� ������ ����մϴ�. a�� 10 �̻� 20 ������ ����� yes��, �ƴ϶�� no�� ����մϴ�. */

import java.util.Scanner;

public class Ex_96 {
	public static void main(String[] args) {
		System.out.println("���� a�� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();	
		
		if (a >= 10 && a <= 20) {   //&&�� ||�� 2�� �̻��� ������ ���� �� ����. 10 <= a <= 20��� �� �� x
			System.out.println("yes");
		} else {
			System.out.println("no");
		}		
	}
}