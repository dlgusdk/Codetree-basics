/*���� �� �÷��� ��հ��� �Ǽ�(real number)�� �Է¹޾� 1.0 �̻��̸� High, 0.5 �̻��̸� Middle, �ƴϸ� Low��� ����ϴ� ���α׷��� �ۼ����ּ���.
ù ��° �ٿ� �Ǽ� a�� �־����ϴ�.
0 �� a �� 5  
��°��� �ش��ϴ� ���ڿ��� ����մϴ�.*/
 
import java.util.Scanner;

public class Ex_80 {
	public static void main(String[] args) {		        
		System.out.println("���� �� �÷��� ��հ��� �����ּ���.");
		Scanner scanner = new Scanner(System.in);
		double sight = scanner.nextDouble();
		
		if (sight >= 1.0) {
			System.out.println("High");
		} else if (sight >= 0.5) {
			System.out.println("Middle");
		} else {
			System.out.println("Low");
		}		        
	}
}