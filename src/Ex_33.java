/*���� a, b, c�� ���ʴ�� �� 1, 2, 3 �� �ְ�, �� ������ ���� �� ������ ������ ��, a, b, c�� ���� ���ʷ� ����ϴ� ���α׷��� �ۼ��غ�����.
����� a, b, c�� ������ ���̿� �ΰ� ����մϴ�. */

public class Ex_33 {

	public static void main(String[] args) {
		int a = 1, b = 2, c = 3;
		int z = a + b + c;
		a = z;
		b = z;
        c = z;
        
		System.out.printf("%d %d %d", a, b, c);

	}

}
