/*���������� ���� �����90�� �̻��� A, 80�� �̻��� B, 70�� �̻��� C, 60�� �̻��� D,
60�� �̸��� F��� �մϴ�. ������ �Է¹޾� ����� ����ϴ� ���α׷��� �ۼ����ּ���.
ù ��° �ٿ��� ���� n�� �־����ϴ�.
0 �� n �� 100 */

import java.util.Scanner;

public class Ex_83 {
	public static void main(String[] args) {
		System.out.println("���������� �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		
		if (score >= 90) {
			System.out.println("A");
		} else if (score >= 80) {
			System.out.println("B");
		} else if (score >= 70) {
			System.out.println("C");
		} else if (score >= 60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
	}
}