/*�� ���� a, b �� �Է¹ް�, a + b �� a - b ���� ���� ���� �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����ϴ� ���α׷��� �ۼ��غ�����.
ù ��° �ٿ� �� ���� a, b�� ������ �ΰ� �־����ϴ�.
1 �� b < a �� 1,000
ù ��° �ٿ� a + b �� a - b�� ���� ���� �ݿø��Ͽ� �Ҽ��� ��° �ڸ����� ����մϴ�.*/

import java.util.Scanner;

public class Ex_65 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("�Է�:");
        
        int a, b, z;
        a = scanner.nextInt();
        b = scanner.nextInt();
        z = a + b; 
        
        System.out.println("���:");
        System.out.printf("%.2f", (float)z/(a-b));
    }
}