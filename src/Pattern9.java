/*
     *
    * *
   * * *
  * * * *
 * * * * *
 */

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :" );
        int n = sc.nextInt();
        for(int i =1;i <=n;i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");

            }
            for (int k = 1; k <= i; k++) {
                System.out.print(" *");

            }
            System.out.println();

        }

    }
}

/*
 for(int i =1;i <=n;i++) {
            for (int j = n; j >= 1; j--) {
                if(j>i)
                {
                    System.out.print("");
                }else{
                    System.out.print(" *");
                }
                    System.out.println();

            }
 */