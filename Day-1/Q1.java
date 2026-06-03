import java.util.Scanner;
 public class Q1 {
    public static void main(String[] args) {
        System.out.print("Enter a number:"); 
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int sum = 0 ;
        for(int i = 0; i < n; i++) {
            sum += i;
        }
        System.out.println("The required sum is given as " + sum);
    }
} 