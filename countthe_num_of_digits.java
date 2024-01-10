import java.util.*;

public class countthe_num_of_digits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        while (n > 0) {
            n = n / 10;
            counter++;
        }
        System.out.println(counter);
    }
}
