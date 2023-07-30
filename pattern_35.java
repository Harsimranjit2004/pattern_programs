package pattern;

import java.util.Scanner;

import javax.swing.plaf.synth.SynthRootPaneUI;

public class pattern_35 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = 1;
        int nsp = n/2;

        for(int i =1 ; i<=n;i++){
            for(int j = 1;j<=nsp;j++){
                if(i==n/2+1){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            for(int k = 1; k<=nst; k++){
                System.out.print("*");
            }
            if(i<=n/2){
                nst++;
            }
            else{
                nst--;
            }
            System.out.println();
        }
    }
    
}
