/*
 *****
  ****
   ***
    **
     *
 */
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int n = sc.nextInt();
        for (int i = n; i >= 1; i--)
        {
            for (int j = n-1; j >=i; j--)
            {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++)
            {

                System.out.print("*");
            }
            System.out.println("");

        }
    }
}
