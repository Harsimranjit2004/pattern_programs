package pattern;

import java.util.Scanner;

import javax.print.event.PrintEvent;

public class pattern_21 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc. nextInt();

        /*
         print 
            1
           121
          12321
         */
        
        for(int i = 1; i<=n; i++){
            int a= i-1;
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=i; k++){
                System.out.print(k);
                
            }
            for(int l = 1; l<=i-1;l++){
                System.out.print(a);
                a--;
            }
            
            
            System.out.println();
        }
    }
}
