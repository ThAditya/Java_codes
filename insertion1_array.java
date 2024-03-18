
// Program to insert an element at a specified position in an array.
import java.util.*;

public class insertion1_array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array = ");
        int size = sc.nextInt();
        int arr[] = new int[size];
        System.out.println("enter the value of m: ");
        int m = sc.nextInt();
        System.out.println("enter the value of  array: ");
        for (int i = 0; i < m; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element: ");
        int element = sc.nextInt();
        System.out.println("Enter the position:");
        int position = sc.nextInt();

        for (int i = m - 1; i >= position; i--) {
            arr[i + 1] = arr[i];
        }
        arr[position] = element;
        m++;
        for (int i = 0; i < m; i++)
            System.out.print(arr[i] + " ");

    }
}