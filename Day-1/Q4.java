 import java.util.Scanner;
 public class Q4 {
    public static void main(String[] args) {
        System.out.print("Enter a number :") ;
        Scanner sc = new Scanner(System.in) ;
        int n = sc.nextInt() ;
        int count = 0 ;
        while(n > 0){
             n = n / 10 ;
            count++;
        }
        System.out.println("The number of digits in the given number is " + count);
    }
}
