/*�߰���縦 90�� �̻� ���� �ڵ�� ���ؼ�, �⸻��� ������ ���� ���б��� �����ϱ�� �߽��ϴ�. �⸻��� ������ 100�� ������ 95�� �̻��� 10�� ��, 90�� �̻��� 5�� ��, �� �̸� ������ ���� ���մϴ�. �߰�, �⸻��� ������ �Է����� �� ���� �� �ִ� ���б��� ����ϴ� ���α׷��� �ۼ����ּ���.
ù ��° �ٿ� �߰�, �⸻��� ������ ������ ���̿� �ΰ� ���ʴ�� �־����ϴ�. 
������ ������Ű�� ���б��� ������ݴϴ�.
0 �� �߰�, �⸻ ���� �� 100 */

import java.util.Scanner;

public class Ex_106 {
	public static void main(String[] args) {
		System.out.println("�߰�, �⸻��� ������ �Է����ּ���");
		Scanner scanner = new Scanner(System.in);
		int mid = scanner.nextInt();
		int fin = scanner.nextInt();	

	    if (mid >= 90 && fin >= 95) {
			System.out.println("100000");
		} else if (mid >= 90 && fin >= 90) {
			System.out.println("50000");
		} else {
			System.out.println("0");
		}	 
	}
}