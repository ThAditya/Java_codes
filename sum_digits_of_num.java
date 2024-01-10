import java.util.*;

public class sum_digits_of_num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        while (n > 0) {
            int r = n % 10;
            counter = counter + (r);
            n = n / 10;
        }
        System.out.println(counter);
    }
}
