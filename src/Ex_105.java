/*�� �������� �Է¹޾�, � ���������� ����ϴ� ���α׷��� �ۼ��غ�����.
3~5���� ��, 6~8���� ����, 9~11���� ����, 12~2���� �ܿ��̶� �����մϴ�.
ù ��° �ٿ� ���� ��Ÿ���� m�� �־����ϴ�.
1 �� m �� 12 
ù ��° �ٿ� � ���������� ����մϴ�.
��, ���� ��쿡�� Spring��,
������ ��쿡�� Summer��,
������ ��쿡�� Fall��,
�ܿ��� ��쿡�� Winter�� ����մϴ�.*/

import java.util.Scanner;

public class Ex_105 {
	public static void main(String[] args) {
		System.out.println("�� ������ �Է����ּ���");
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();	

		if (m == 3 || m == 4 || m == 5 ) {	
			System.out.println("Spring");
	    } else if (m >= 6 && m <= 8) {
			System.out.println("Summer");
		} else if (m == 9 ||m == 10 || m == 11) {
			System.out.println("Fall");
		} else if (m == 12 || m == 1 || m == 2) {
			System.out.println("Winter");
	    }
	  /*if (m >= 12 || m <= 2 ) {	
			System.out.println("Winter");
	    } else if (m >= 9) {
			System.out.println("Fall");
		} else if (m >= 6) {
			System.out.println("Summer");
		} else {
			System.out.println("Spring");
		}	 */ 
	}
}