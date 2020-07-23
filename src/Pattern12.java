import java.util.Scanner;

public class Pattern12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your number :" );
        int n = sc.nextInt();
        for(int i = 1; i<=n; i++){
            for(int j=1 ; j<=i;j++){
                System.out.print(" ");
            }
            for(int k=n+5 ;k>(i*2); k--){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
