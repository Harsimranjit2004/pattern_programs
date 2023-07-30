package pattern;

import java.util.Scanner;



public class pattern_36 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int nst = n;
        int nsp = 0;
        for(int i =1; i<=n;i++){
            for(int j = 1; j<=nsp ; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=nst;k++){
                if(i>1 && i<n/2 && k>1 && k<nst){
                    System.out.print(" ");
                }
                else{
                    System.out.print("*");
                }
            }
                if(i<=n/2){
                    nsp++;
                    nst-=2;
                }
                else{
                    nsp--;
                    nst+=2;
                }
                System.out.println();

        }
    }
}
