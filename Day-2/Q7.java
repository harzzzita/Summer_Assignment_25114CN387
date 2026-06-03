import java.util.Scanner;
public class Q7 {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int product = 1;
        while(n>0){
            product *= n%10 ;
            n = n/10 ;
        }
        System.out.println("The product of the digits in the given number is " + product);
    }
    
}
