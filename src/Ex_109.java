/*������ ���� ���ڴ� ���� 0, ���ڴ� ���� 1�� ��Ÿ����� �ϰ�, 19�� �̻��� �����̶�� �սô�.
����(���� 0 �Ǵ� 1)�� ���̸� �Է¹޾� MAN(���γ���), WOMAN(���ο���), BOY(�̼��Ⳳ��), GIRL(�̼��⿩��)�� �����Ͽ� ����ϴ� ���α׷��� �ۼ����ּ���.
ù ��° �ٿ� ������ �ش��ϴ� ���ڰ� �־�����,
�� ��° �ٿ��� ���̰� �ڿ����� �־����ϴ�.
1 �� ���� �� 100 
���̿� ������ �ش��ϴ� ���ڸ� ����մϴ�.*/

import java.util.Scanner;

public class Ex_109 {
	public static void main(String[] args) {
		System.out.println("���̿� ������ �Է����ּ���");
		Scanner sc = new Scanner(System.in); //sc == scanner
        
		int gender, age;
		gender = sc.nextInt();
        age = sc.nextInt();
        
        if (gender == 1) {
           if (age < 19) {
        	   System.out.println("GIRL");
           } else {
        	   System.out.println("WOMAN");
           }           
        } else {
           	if (age < 19) {
           		System.out.println("BOY");
            } else {
         	   System.out.println("MAN");           
           	}
        }
    }
}