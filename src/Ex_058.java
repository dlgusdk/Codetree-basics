/*010-xxxx-yyyy ������ ��ȭ��ȣ�� �Է¹޾� �� 4�ڸ��� �� 4�ڸ��� �ٲپ� ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� ��ȭ��ȣ�� 010-xxxx-yyyy�� ���·� �־����ϴ�. xxxx�� yyyy�� 0���� ���۵��� ������ �����ص� �����ϴ�.
1 �� x, y �� 9 
�Է¹��� ��ȭ��ȣ�� 010-yyyy-xxxx�� ���·� ����մϴ�.*/

import java.util.Scanner;

public class Ex_58 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�Է�:");

		scanner.useDelimiter("-");
		int z, x, y, tmp;
		z = scanner.nextInt();  //���� z���� 010�� ����Ǵµ� 010�� ���� ü�迡�� ���ǵ� �� ���� ���̹Ƿ� 10�� ��µȴ�.
		x = scanner.nextInt();
		y = scanner.nextInt();

		tmp = x;
		x = y;
		y = tmp;

		System.out.println("���:");
		System.out.printf("010-%d-%d", x, y);
        // System.out.print(a + "-" + c + "-" + b);
	}

}
