/*yyyy.mm.dd ����� ��¥ ������ �Է¹޾� mm-dd-yyyy �������� ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� ��¥ ������ yyyy.mm.dd ���·� �־����ϴ�. yyyy�� ������, mm�� ����, dd�� ���� �ǹ��մϴ�.
1 �� yyyy �� 2021
1 �� mm �� 12
1 �� dd �� 28
�Է¹��� ��¥�� mm-dd-yyyy �������� �ٲپ� ����մϴ�. */

import java.util.Scanner;

public class Ex_57 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("�Է�:");
		
		scanner.useDelimiter("\\."); 
		//useDelimiter ���� ���� ���� ǥ������ ���µ�, ���� ǥ���Ŀ��� "."�� '��� �ܾ�' �� ���� �ǹ̸� ������ �־� ������ �߻�
		//���� ǥ���Ŀ����� ".", "^", "$", "*" �� ���� ���ڴ� �ٸ� ���� ������ �ִ�. �̷� ���ڷ� ���� ������ "." ��� "\\."����, "^" ��� "\\^" ���� ����� ����� ������
		int m, d, y;
		y = scanner.nextInt();
		m = scanner.nextInt();
		d = scanner.nextInt();
		
		System.out.println("���:");
		System.out.printf("%d-%d-%d", m, d, y);
		//System.out.println(m + "-" + d + "-" + y);
	}

}
