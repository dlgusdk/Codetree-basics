/*�̹� �߰���翡�� ����� ������ Ư���� �� ��������ϴ�. �л� A�� B�� ������ ������ ������ �켱������ �������� �մϴ�. ���� ������ ������� ���� ������ ���ٸ� �� ���� �л��� �̸��� ����ϰ�, ���� ���� ������ ���ٸ� ���� ������ �� ���� �л��� �̸��� ����Ϸ��� �մϴ�. �� �л��� ���� ������ ���� ������ �־��� ��, ���� ������ �����ϴ� �л��� �̸��� ����ϴ� ���α׷��� �ۼ��غ�����. (��, ���� ������ ���� ������ �� �� �����ϰ� �־����� ���� ���ٰ� �����ص� �����ϴ�.)
ù ��° �ٿ� A �л��� ���� ������ ���� ������ ������ ���̿� �ΰ� �־����ϴ�.
�� ��° �ٿ� B �л��� ���� ������ ���� ������ ������ ���̿� �ΰ� �־����ϴ�.
0 �� ����, ���� ���� �� 100  ù ��° �ٿ� �켱������ �� ���� �л��� �̸��� ����մϴ�.*/

import java.util.Scanner;

public class Ex_107 {
	public static void main(String[] args) {
		System.out.println("A�� B�� ���� ������ ���� ������ �Է����ּ���");
		Scanner scanner = new Scanner(System.in);
		int Am, Ae, Bm, Be;   //int a_math, a_eng; int b_math, b_eng;
		Am = scanner.nextInt();	
		Ae = scanner.nextInt();	
		Bm = scanner.nextInt();	
		Be = scanner.nextInt();	

		if (Am > Bm) { 
			System.out.println("A");
	    } else if (Am < Bm) {
			System.out.println("B");
		} else if (Am == Bm && Ae > Be) {
			System.out.println("A");
		} else if (Am == Bm && Ae < Be) {
			System.out.println("B");
		} 
     /* if(a_math > b_math || (a_math == b_math && a_eng > b_eng)) {
        System.out.println("A");
        } else {
        System.out.println("B");
        }                               */
	}
}