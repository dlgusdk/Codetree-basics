/*정수 a에 값 2를 넣고, 정수 b에 값 6을 넣은 뒤, 다시 b의 값을 a에 넣어줍니다. 이 과정을 거친 이후 a, b의 값을 출력하는 프로그램을 작성해보세요.
 첫 번째 줄에는 정수 a를 출력합니다. 두 번째 줄에는 정수 b를 출력합니다.*/

public class Ex_25 {

	public static void main(String[] args) {
		int a = 2, b = 6;
        a = b;

        System.out.printf("%d%n%d", a, b);
        //System.out.println(a);
        //System.out.println(b);

	}

}
