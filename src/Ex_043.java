/*���� a, b�� �Է¹ް�, a�� b�� ��ġ�� ��ȯ�� �� ����ϴ� ���α׷��� �ۼ��ϼ���.
ù ��° �ٿ� ���� a, b�� ������ ���̿� �ΰ� �־����ϴ�.(������ ���̿� �ΰ� = ���ε��� ������ ���� ����)
1 �� a, b �� 100
 */
import java.util.Scanner;

public class Ex_43 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.print("a, b�� �Է�:" );

		int a = scanner.nextInt();	    
		int b = scanner.nextInt();

		int tmp;
		tmp = a;
		a = b;
		b = tmp;

		System.out.print("���:" );
		System.out.printf("%d %d", a, b);

	}
}