/*�� ���� a, b�� �Է¹޾� ���� ������ ���� ����ؼ� ����ϴ� ���α׷��� �ۼ��غ�����.
�� ������ ������ ���� ���
a���� b�� ���� ���� ���
a�� b�� �������� ���� ��
a�� b�� �������� ���� ������
ù ��° �ٿ� ���� a, b�� ������ ���̿� �ΰ� �־����ϴ�.
ù ��° �ٿ��� �� ������ ������ ���� ���,
�� ��° �ٿ��� a���� b�� ���� ���� ���,
�� ��° �ٿ��� a�� b�� �������� ���� ��,
�� ��° �ٿ��� a�� b�� �������� ���� �������� ����մϴ�.
1 �� a, b �� 100 */

import java.util.Scanner;

public class Ex_59 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("�Է�:");
        
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        
        System.out.println("���:");
        System.out.println(a+b);
        System.out.println(a-b);
        System.out.println(a/b);
        System.out.println(a%b);
    }
}