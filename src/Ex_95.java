/*A�� B�� ���а� ������ ������ �Է¹޾� ���� �� ������ ���ϴ� ���α׷��� �ۼ����ּ���.
ù��° �ٿ� A�� ���а� ���������� ������ ���̿� �ΰ� �־����ϴ�.
�ι�° �ٿ� B�� ���а� ���������� ������ ���̿� �ΰ� �־����ϴ�.
1 �� �Է����� �־����� ���� �� 100
A�� B���� ������ ������ ũ�� ������ ������ ũ�� 1, �׷��� ������ 0�� ����մϴ�. */

import java.util.Scanner;

public class Ex_95 {
	public static void main(String[] args) {
		System.out.println("A�� B�� ���а� ���� ������ �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int am, ae, bm, be;
		am = scanner.nextInt();	
		ae = scanner.nextInt();	
		bm = scanner.nextInt();	
		be = scanner.nextInt();		
		
		if (am > bm && ae > be) {
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}