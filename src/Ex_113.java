/*���� ������ ������ Y, ���� ������ ������ N���� ��Ÿ����� �ϰ�, ü���� ���� �� ��ġ�� ���� ����Ҹ� �ٸ��� �����Ϸ��� �մϴ�.
���� �ְ� 37�� �̻��� �� A
������ ������ 37�� �̻��� �� B
������ ������ ü���� ������ �� C
�� �� ������ ��쿣 D
�� ���� 3�� �˻��ϴµ� A�� ���� ����� 2�� �̻� ���ö��� ���޻�Ȳ���� �з��մϴ�. ���޻�Ȳ������ �Ǵ��ϴ� ���α׷��� �ۼ��غ�����. 
ù ��° �ٺ��� 3���� �ٿ� ����, 1�ٿ� 1�� �� 3���� ���� ����� ü���� ������ ���̿� �ΰ� �־����ϴ�. ���� ������ �׻� Y �Ǵ� N���� �־����� �����ص� �����ϴ�.
���޻�Ȳ�̶�� E��, �׷��� �ʴٸ� N�� ����մϴ�.
0 �� �־����� ü�� �� 40 */

import java.util.Scanner;

public class Ex_113 {
	public static void main(String[] args) {
		System.out.println("��������� ü���� �����ּ���.");
		Scanner sc = new Scanner(System.in); 

		char sym1 = sc.next().charAt(0);
		int tem1 = sc.nextInt();
		char sym2 = sc.next().charAt(0);
		int tem2 = sc.nextInt();
		char sym3 = sc.next().charAt(0);
		int tem3 = sc.nextInt();


		if(sym1 == 'Y' && tem1 >= 37) { //3�� �� sym1�� Ȯ���̶�� ����
			if(sym2 == 'Y' && tem2 >= 37 || sym3 == 'Y' && tem3 >= 37 ) {
				System.out.println("E");
			} else {
				System.out.println("N");
			}
		} else { //sym1�� �µ��� ���� ��� �����Ƿ� ���� ��� �� �� �ڷγ����߸� E.
			if((sym2 == 'Y' && tem2 >= 37) && (sym3 == 'Y' && tem3 >= 37)) {
				System.out.println("E");
			}else {
				System.out.println("N");
			}
		}
	}
}