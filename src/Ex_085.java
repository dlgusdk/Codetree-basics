/*n��ŭ�� ������ �� �� �ִ� ���� �� ���� ��� ������ ����ϴ� ���α׷��� �ۼ��غ�����.

����   ����

book  3000
mask  1000
pen    500

ù ��° �ٿ� ������ �ִ� �� n�� �־����ϴ�.
0 �� n �� 10,000 
����, �ƹ��͵� �� �� ���ٸ� no �� ����մϴ�.*/
 
import java.util.Scanner;

public class Ex_85 {
	public static void main(String[] args) {		        
		System.out.println("������ �ִ� ���� �� ���Դϱ�?");
		Scanner scanner = new Scanner(System.in);
		int money = scanner.nextInt();
		
		if (money >= 3000) {
			System.out.println("book");
		} else if (money >= 1000) {
			System.out.println("mask");
		} else if (money >= 500) {
			System.out.println("pen");
		} else {
			System.out.println("no");
		}		        
	}
}
 