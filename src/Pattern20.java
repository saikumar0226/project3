import java.util.Scanner;

public class Pattern20 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int n = sc.nextInt();
        n=n+2;
        for (int i = 1; i <= n; i=i+2) {
            for (int j = i+1; j < n; j++) {
                System.out.print(" ");

            }
            for (int k = 1; k <= i ; k++) {
                System.out.print("* ");

            }
            System.out.println("");

        }
    }
}
