import java.util.Scanner;

/*A���� �⼮��ȣ 1���� John, 2���� Tom, 3���� Paul�Դϴ�. ��ȣ�� �Է��ϸ� �ش��ϴ� �л��� �̸��� ����ϴ� ���α׷��� �ۼ��ϼ���.
ù ��° �ٿ� �⼮��ȣ�� �־����ϴ�.
1 �� �⼮��ȣ �� 100  
�Է¹��� �⼮��ȣ�� �ش��ϴ� �л��� �̸��� ����ϰ�, ���� �ش� �⼮��ȣ�� �ش��ϴ� �л��� ���ٸ� Vacancy ��� ����մϴ�.  */
 
import java.util.Scanner;

public class Ex_82 {
	public static void main(String[] args) {		        
		System.out.println("�⼮��ȣ�� �Է��ϼ���.");
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		
		if (number == 1) {
			System.out.println("John");
		} else if (number == 2) {
			System.out.println("Tom");
		} else if (number == 3) {
			System.out.println("Paul");
		} else {
			System.out.println("Vacancy");
		}		        
	}
}
