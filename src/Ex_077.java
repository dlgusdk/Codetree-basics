/*���� ����� 100���� ��쿡�� 0�����, �� �ܿ� ������ ���� ��� 1~9�� �ο��ϱ�� �ߴ�. ������ ��� 0 �� pass��, ������ ����� ���� ������� ������ failure��� ����ϴ� ���α׷��� ���׿����ڸ� ����Ͽ� �ۼ��غ�����.
ù ��° �ٿ� ���������� �Է¹޽��ϴ�.
0 �� ���� ���� �� 100
������ �´� ����� ���� pass���� failure���� ����Ѵ�.*/

import java.util.Scanner;

public class Ex_77 {
	public static void main(String[] args) {		        
		System.out.println("������ �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		int score = scanner.nextInt();
		String result;
		
		result = (score == 100) ? "pass" : "failure" ;

		System.out.println(result);
	}
}