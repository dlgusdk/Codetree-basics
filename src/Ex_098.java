/*3���� ������ �Է� �޾� ù ��° ���� �� ������ �ּڰ��� ��ġ�Ѵٸ� 1 �ƴϸ� 0�� ����ϰ�, �� ���� ���� ��� ������ 1 �ƴϸ� 0 �� ����ϴ� ���α׷��� �ۼ����ּ���.
ù ��° �ٿ� ���� a, b, c�� ������ ���̿� �ΰ� �־����ϴ�.
1 �� a, b, c �� 100
����� ���� �� ���� ������ ���̿� �ΰ� ����մϴ�.*/

import java.util.Scanner;

public class Ex_98 {
	public static void main(String[] args) {
		System.out.println("���� a, b, c�� ���� �Է����ּ���.");
		Scanner scanner = new Scanner(System.in);
		int a, b, c;
		a = scanner.nextInt();	
		b = scanner.nextInt();	
		c = scanner.nextInt();	
		
		if (a <= b && a <= c) { // ���� 1 1 1 �̾ �ּҰ��̱� ���� <=
			System.out.println("1 "); // ������ ���̿� ���� �� ���� ����ϴ� �� " "�� +���ְų� "1 1"ó�� �߰��� ������ �д�
		} else {
			System.out.println("0 ");
		}			
		
		if (a == b && b == c){
			System.out.println("1");
		} else {
			System.out.println("0");
		}
	}
}