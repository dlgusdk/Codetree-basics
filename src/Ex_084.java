/*���� �빮�ڸ� �Է¹޾�'S'�̸� Superior, 'A'�̸� Excellent, 'B'�̸� Good, 'C'�̸� Usually,
'D'�̸� Effort, �� �� �����̸� Failure ��� ����ϴ� ���α׷��� �ۼ����ּ���.*/

import java.util.Scanner;

public class Ex_84 {
	public static void main(String[] args) {
		System.out.println("���� �빮�ڸ� �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		char capital = scanner.next().charAt(0);//char ��ȯ ����صα� 
		
		if (capital == 'S') {
			System.out.println("Superior");
		} else if (capital == 'A') {
			System.out.println("Excellent");
		} else if (capital == 'B') {
			System.out.println("Good");
		} else if (capital =='C') {
			System.out.println("Usually");
		} else if (capital =='D') {
			System.out.println("Effort");
		} else {
			System.out.println("Failure");
		}
	}
}
 