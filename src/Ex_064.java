/*2���� ���� a, b�� �Է¹޾� b�� a�� ���� ��, �ٽ� a�� b�� ���� ���� ����� ����ϴ� ���α׷��� �ۼ��غ�����.
���� ��� a = 1, b = 3�̾��ٸ� b�� a�� ���ϰ� �Ǿ� a = 4, b = 3 �� �ǰ�
�� ���� a�� b�� ���ϰ� �Ǿ� a = 4, b = 7�� �˴ϴ�.
ù ��° �ٿ� ���� a, b�� ������ ���̿� �ΰ� �־����ϴ�.
ù ��° �ٿ� ���ϴ� ���� ������ ���� a, b�� ����ִ� ���� ���� ������ ���̿� �ΰ� ����մϴ�.
1 �� a, b �� 1,000*/

import java.util.Scanner;

public class Ex_64 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("�Է�:");
        
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        a += b;
        b += a;

        System.out.println("���:");
        System.out.printf("%d %d", a, b);
        
    }
}