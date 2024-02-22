//use of try catch in java
import java.util.*;

public class try_catch1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.println("Enter the value: ");
            int num = sc.nextInt();
            // check number is even or odd
            if (num % 2 == 0) {
                System.out.println("Even");
            } else {
                System.out.println("odd");
            }

        } catch (java.util.InputMismatchException e) {
            System.out.println("Invalid input");
        }
    }
}