import java.util.Scanner;

public class Q20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int largest = -1;

        for (int i = 2; i * i <= n; i++) {
            while (n % i == 0) {
                largest = i;
                n /= i;
            }
        }
        if (n > 1) {
            largest = n;
        }
        System.out.println("Largest Prime Factor = " + largest);
    }
}
