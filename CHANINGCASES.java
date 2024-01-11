import java.util.*;

public class CHANINGCASES {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String ans = "";
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (Character.isLowerCase(ch)) {
                char newch = Character.toUpperCase(ch);
                ans = ans + newch + str.substring(i);
            } else {
                ans = ans + ch;
            }
        }
    }
}
