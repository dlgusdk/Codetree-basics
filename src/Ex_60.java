/*���簢���� ���ο� ������ ���̸� ������ ������ �Է¹��� �� ������ ���̴� 8 ������Ű�� ������ ���̴� 3���Ͽ� ������ �� ������ ����, ������ ����, ���̸� ���ʷ� ����ϴ� ���α׷��� �ۼ����ּ���.
ù ��° �ٿ� ���ο� ������ ���̰� ������ ���̿� �ΰ� �־����ϴ�.
1 �� ������ ����, ������ ���� �� 100 
�� �ٿ� �ϳ��� ������ ����, ������ ����, ���̸� ����մϴ�.*/

import java.util.Scanner;

public class Ex_60 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       
        System.out.println("�Է�:");
        
        int w, h;
        w = scanner.nextInt();
        h = scanner.nextInt();
        w += 8;  //w = w + 8;
        h *= 3;  //h = h * 8;

        System.out.println("���:");
        System.out.println(w);
        System.out.println(h);
        System.out.println(w*h);
    }
}