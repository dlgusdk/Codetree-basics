/*���� �µ��� ������ �Է¹޾� 0�� �̸��ϰ�쿣 ice, 100�� �̻��϶���vapor, �� �����϶��� water ��� ����ϴ� ���α׷��� �ۼ����ּ���.
ù ��° �ٿ��� ���� �µ��� ���� n�� �־����ϴ�.
-200 �� n �� 200  
���� �µ��� ���� ���� ���¸� ���ڿ��� ������ּ���. */
 
import java.util.Scanner;

public class Ex_79 {
	public static void main(String[] args) {		        
		System.out.println("���� �µ��� �Է��� �ּ���.");
		Scanner scanner = new Scanner(System.in);
		int temp = scanner.nextInt();
		
		if (temp < 0) {
			System.out.println("ice");
		} else if (temp >= 100) {
			System.out.println("vapor");
		} else {
			System.out.println("water");
		}		        
	}
}