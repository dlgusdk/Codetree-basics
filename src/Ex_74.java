
import java.util.*;

public class Main {
    static int n;
    static int leaderCapacity;
    static int memberCapacity;

    public static int needMember(int customerNum) {
        if(customerNum <= 0) {
            return 0;
        }
        
        if(customerNum % memberCapacity == 0) {
            return customerNum / memberCapacity;
        }
        else {
            return (customerNum / memberCapacity) + 1;
        }
    }

    public static void main(String[] args) {
        long answer = 0;

        Scanner scan = new Scanner(System.in);

        n = scan.nextInt();
        int[] customerArr = new int[1000000];

        for(int i = 0; i < n; i++) {
            customerArr[i] = scan.nextInt();
        }

        leaderCapacity = scan.nextInt();
        memberCapacity = scan.nextInt();

        for(int i = 0; i < n; i++) {
            answer++;

            answer += needMember(customerArr[i] - leaderCapacity);
        }

        System.out.println(answer);
    }
}
