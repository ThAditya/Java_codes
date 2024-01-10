import java.util.*;

public class series_of_nums {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int counter = 0;
        for (int i = 0; i <= n; i++) {
            counter = 3 * i + 2;
         
           System.out.println(counter);
        }
    }
}
