import java.util.*;

public class prime_by_whole_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        if (a != 1) {
            int counter = 0;
            for (int i = 1; i <= a; i++) {
                if (a % i == 0) {
                    counter = counter++;
                }
            }
            if (counter > 2) {
                System.out.println("not a prime");
            }
        }

    }
}
