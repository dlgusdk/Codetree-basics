/*h:m ����� �ð��� ������ �̷���� �ִ� �ð��� �Է¹޾� 1�ð� ���� �ð��� ����ϴ� ���α׷��� �ۼ��غ�����.
 �Է¹��� �ð����κ��� 1�ð� ���� �ð��� �Է°� ������ ���� h:m�� ���� ����մϴ�.
 ù ��° �ٿ� ���� �ð��� h:m ���·� �־����ϴ�. h�� �ð���, m�� ���� ��Ÿ���ϴ�.
 1 �� h �� 22, 0 �� m < 60*/

import java.util.Scanner;

public class Ex_54 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("�Է�:");
		
		scanner.useDelimiter(":");// : �������� �߶� �Է� �ްڴٴ� ��
		int h = scanner.nextInt(); // : ��ȣ�� ������ ������ �Է� ����
		int m = scanner.nextInt(); // : ��ȣ�� ������ �� or �Է��� ������ �κб��� ����
		
		System.out.println("���:");
		System.out.printf("%d:%d", h+1, m);
       // System.out.println((h + 1) + ":" + m);
	}

}
