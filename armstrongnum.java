import java.util.*;

public class armstrongnum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            double sum = 0;
            int copy = n;

            while (n > 0) {
                int r = (n % 10);// 151, 151%10 = 1
                sum = sum + r * r * r; // 0 + 1*1*1 = 1, 1+ 5*5*5 = 1+125 = 126, 126 + 3*3*3 = 126 + 27 = 153
                n = n / 10;// 153, 153/10= 15
            }
            n = copy;
            if (n == sum) {
                System.out.println("it is armstrong no.");
            } else {
                System.out.println("it isn't a armstrong no. ");
            }
        }
    }
}
