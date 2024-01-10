import java.util.*;

public class prime_by_for_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int counter = 0;
        if (a != 1) {
            for (int i = 0; i <= a; i++) {
                if (a % i == 0) {
                    counter = counter + 1;
                }
            }
            if (counter > 2) {
                System.out.println("not a prime no.");
            } else {
                System.out.println("prime no.");
            }
        } else {
            System.out.println("not a prime no.");
        }
    }
}
