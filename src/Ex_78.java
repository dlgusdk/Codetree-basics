/*���� a�� �־����� ��, a�� 1�̶�� t �� ����ϰ�, 1�� �ƴ϶�� f �� ����ϴ� ���α׷� ���׿����ڸ� ����Ͽ� �ۼ��غ�����.
ù ��° �ٿ� ���� a�� �־����ϴ�.
0 �� a �� 100
ù ��° �ٿ� a�� 1�̶�� t �� ����ϰ�, 1�� �ƴ϶�� f �� ����մϴ�*/

import java.util.Scanner;

public class Ex_78 {
	public static void main(String[] args) {		        
		System.out.println("���ڸ� �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
        String result;
		
		result = (a == 1) ? "t" : "f" ;

		System.out.println(result);	
	}
}   