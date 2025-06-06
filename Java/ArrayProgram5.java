package Java;
import java.util.Scanner;
public class ArrayProgram5 {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       System.out.print("Enter the number of elements in the array: ");
       int n = sc.nextInt();
         int[] arr = new int[n];
         for (int i = 0; i < n; i++) {
           arr[i] = sc.nextInt();
       }
       System.out.print("You entered: ");
       for (int i = 0; i < n; i++) {
           System.out.print(arr[i] + " ");
       }
         System.out.println();
    }
}