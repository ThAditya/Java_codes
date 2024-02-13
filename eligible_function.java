
// Write a function that takes in age as input and returns if that person is
// eligible to vote or not. A person of age > 18 is eligible to vote.
import java.util.*;

public class eligible_function {
    public static int eligibleAgeForVote(int age) {
        if (age >= 18) {
            System.out.println("Eligible to vote: ");
        } else {
            System.out.println("not eligible for vote");
        }
        return 0;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age: ");
        int age = sc.nextInt();
        eligibleAgeForVote(age);
    }
}
