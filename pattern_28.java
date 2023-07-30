package pattern;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthSeparatorUI;

public class pattern_28 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         print 
         *** ***
         **   **
         *     *
         **   ** 
         *** ***
         */
        int  nst = n/2 + 1;
        int nsp = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=nst;j++){
                System.out.print("*");
            }
            for(int k = 1; k<=nsp;k++){
                System.out.print(" ");
            }
            for(int j = 1; j<=nst;j++){
                System.out.print("*");
            }
            if(i<n/2+1){
                nsp+=2;
                nst--;
            }
            else{
                nsp-=2;
                nst++;
            }
            System.out.println();
        }
    }
    
}
