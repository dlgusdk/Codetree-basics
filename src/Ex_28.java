/*���� a�� �� 3�� �ְ�, ���� b�� �� 5�� ���� ��, �� ���� ��ȯ�Ͽ� a, b�� ������� �� ���� 5, 3�� ������� �������� �ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ��� ���� a�� ����մϴ�. �� ��° �ٿ��� ���� b�� ����մϴ�. */

public class Ex_28 {

	public static void main(String[] args) {
		int a =3, b = 5;

		int tmp;
		tmp = a;
		a = b;
		b = tmp;

		System.out.println(a);
		System.out.println(b);  
		//System.out.printf("%d%n%d", a, b); 
		//System.out.println(a + "\n" +b);

	}

}
