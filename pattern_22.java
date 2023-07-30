package pattern;

import java.util.Scanner;

public class pattern_22 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         print 
         pyramid square
         */
        int nsp = n/2;
        int nst = 1;
        int middle = n/2 + 1;
        for(int i =1; i<=n;i++){
            for(int j= 1;j<=nsp; j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=nst; k++){
                System.out.print("*");
            }
            if(i<middle){
                nsp--;
                nst+=2;
            }
            else{
                nsp++;
                nst-=2;
            }
            System.out.println();
        }
    }
    
}
