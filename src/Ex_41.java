/*���� a, b�� �Է¹ް�, a�� b�� ������ ���� ����ϴ� ���α׷��� �ۼ��غ�����.
1 �� a, b �� 100 */

import java.util.Scanner;

public class Ex_41 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("a, b�� �Է�:" );

		int a = scanner.nextInt();	    
		int b = scanner.nextInt();

		System.out.print("���:" );
		System.out.printf("%d", a*b);

	}
}