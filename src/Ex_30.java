/*�� ���� a, b, c �� ���ʴ�� 5, 6, 7�� �ְ�, b���� a���� , c���� b����, a���� c���� �־� ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ��� ���� a�� ����մϴ�.
�� ��° �ٿ��� ���� b�� ����մϴ�.
�� ��° �ٿ��� ���� c�� ����մϴ�.*/

public class Ex_30 {

	public static void main(String[] args) {
		int a = 5, b = 6, c= 7;

        int tmp;
        tmp = b;
        b = a;
        a = c;
        c = tmp; 
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

	}

}
