/*mm-dd-yyyy ����� ��¥ ������ �Է¹޾� yyyy.mm.dd �������� ����ϴ� ���α׷��� �ۼ��غ�����.
 ù ��° �ٿ� ��¥ ������ mm-dd-yyyy ���·� �־����ϴ�. yyyy�� ������, mm�� ����, dd�� ���� �ǹ��մϴ�.
1 �� yyyy �� 2021
1 �� mm �� 12
1 �� dd �� 28
�Է¹��� ��¥�� yyyy.mm.dd �������� �ٲپ� ����մϴ�.*/

import java.util.Scanner;

public class Ex_55 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�Է�:");
		
		scanner.useDelimiter("-");
		int m, d, y;
		m = scanner.nextInt();
		d = scanner.nextInt();
		y = scanner.nextInt();
		
		System.out.println("���:");
		System.out.printf("%d.%d.%d", y, m, d);
	}

}
