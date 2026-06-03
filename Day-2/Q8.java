import java.util.Scanner;
public class Q8 {
    public static void main(String[] args) {
        System.out.print("Enter a number:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n ;
        int rev = 0 ;
        while(n > 0){
            rev = rev*10 + n%10 ;
            n = n/10 ;
        } 
        if(original==rev){
            System.out.println("The given number is a palindrome");
        }
        else{
            System.out.println("The given number is not a palindrome");
        }
    } 
}
