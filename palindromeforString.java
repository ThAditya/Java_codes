import java.util.*;
public class palindromeforString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the String: ");
        String str = sc.next();
        String str1 = str;
        String sum = "";
        for (int i = 0; i < str.length(); i++) {
            char temp = str.charAt(i);
            sum = temp + sum;
        }
        if (sum.equals(str1)) {
            System.out.println("yes " + sum);
        } else {
            System.out.println("No " + sum);
        }
    }
}