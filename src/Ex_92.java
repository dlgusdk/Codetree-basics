/*�� ���� a, b�� �Է¹޾� ���� ���ǵ��� ���� ������ ���������� �Ǵ��ϴ� ���α׷��� �ۼ��غ�����.
a�� b���� ���ų� ū��?
a�� b���� ū��?
b�� a���� ���ų� ū��?
b�� a���� ū��?
a�� b�� ������?
a�� b�� �ٸ���?
ù ��° �ٿ� ���� a, b�� ������ ���̿� �ΰ� �־����ϴ�. ������ ��쿡 ���� ���̶�� 1��, �����̶�� 0�� ����մϴ�.
1 �� a, b �� 100  */

import java.util.Scanner;

public class Ex_92 {
	public static void main(String[] args) {
		System.out.println("���� a, b�� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int a, b;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		
		if (a >= b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (a > b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		if (a <= b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}

		if (a < b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (a == b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
		
		if (a != b) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}