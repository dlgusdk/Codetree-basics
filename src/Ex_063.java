/*���� 2���� �Է¹޾Ƽ� ù ��° ������ 87�� �������� �����ϰ� �� ��° ���� 10���� ���� �������� ������ �� �� ���� ���ʷ� ����ϴ� ���α׷��� �ۼ��غ�����.
�� �ٿ� �ϳ��� �� ���� a, b�� �־����ϴ�.
ù ��° �ٿ��� ���� a�� 87������Ų ����,
�� ��° �ٿ��� ���� b�� 10���� ���� �������� ���� ����մϴ�.
1 �� a, b �� 500 */

import java.util.Scanner;

public class Ex_63 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("�Է�:");
        
        int a, b;
        a = scanner.nextInt();
        b = scanner.nextInt();
        a += 87;
        b %= 10;   

        System.out.println("���:");
        System.out.println(a);
        System.out.println(b);
    }
}