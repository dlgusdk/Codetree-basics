/*�� ����� ���� ������ ���̿� ������ �־����ϴ�. �� ��� �� �� ����̶� 19���̻��̸鼭 ���ڶ�� 1�� ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� ù ��° ����� ������ ���̿� ������ ������ �ΰ� �־����ϴ�.
�� ��° �ٿ� �� ��° ����� ������ ���̿� ������ ������ �ΰ� �־����ϴ�.
�� ������, ���̴� ������ �־����� ������ ���ڶ�� M ���ڶ�� W �� �־����ϴ�.
1 �� ���� �� 100 
ù ��° �ٿ� �� ��� �� �� ����̶� 19���̻��̸鼭 ���ڶ�� 1�� ����մϴ�.
������ ���ǿ� �ش����� �ʴ´ٸ� 0�� ����մϴ�.*/

import java.util.Scanner;

public class Ex_108 {
	public static void main(String[] args) {
		System.out.println("A�� B�� ���̿� ����(W, M)�� �Է����ּ���");
		Scanner scanner = new Scanner(System.in);
		
		int A_age = scanner.nextInt();	
		String A_gender = scanner.next().toString(); //String ��ȯ  - String ������ = scanner.next().toString();
		int B_age = scanner.nextInt();	
		String B_gender = scanner.next().toString();
     
	/*	int a_age, b_age;
        char a_gen, b_gen;
        a_age = sc.nextInt();
        a_gen = sc.next().charAt(0);
        b_age = sc.nextInt();
        b_gen = sc.next().charAt(0);   //char ��ȯ���� �� ���� equals ��� x*/
		
		if ((A_age >= 19 && A_gender.equals("M")) || (B_age >= 19 && B_gender.equalsIgnoreCase("M"))) { //���ڿ��� ���� ���� ������.equals("����") ���. equalsIgnoreCase()�� ��ҹ��� ���о��ϰ� ���� �� ���. 
			System.out.println("1");
	    } else {
			System.out.println("0");
		}
	}
}  