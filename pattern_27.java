package pattern;

import java.util.Scanner;

public class pattern_27 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         print 
         *****
          ****
           ***
            ** 
             *
         */
        int nsp = 0; // spaces
        int nst = n;
        for(int i = 1;i<=n; i++){
            for(int j = 1; j<=nsp;j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=nst; k++){
                System.out.print("*");
            }
            nsp++;
            nst--;
            System.out.println();
        }
    }
}
