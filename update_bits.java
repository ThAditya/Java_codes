
import java.util.*;

public class update_bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(S ystem.in);
        System.out.println("Enter the operation: ");
        int oper = sc.nextInt() ;//0
        System.out.println("Enter the number: ");
        int n = sc.nextInt();//7  = 0111
        System.out.println("Enter the position: ");
        int pos = sc.nextInt();//2 
        System.out.println("Enter the bitmask: ");
        int bitMask = sc.nextInt();//2= 0010

        if (oper == 1) {
            bitMask = bitMask << pos;
            int newnum = bitMask | n;
            System.out.println("Output after operation 1: " + newnum);
        } else {
            bitMask = bitMask << pos;
            int newbitmask = ~(bitMask);
            int newnum = newbitmask & n;
            System.out.println("Output after operation 0: " + newnum);
        }
    }
}