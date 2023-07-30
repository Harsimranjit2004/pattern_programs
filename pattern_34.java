package pattern;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class pattern_34 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
    
        int nsp = 2*n -3;
        int nst  = 1;
        /**
         *
         */
        for(int i = 1; i<=n;i++){
            int val = 1;
            for(int j = 1 ;j<=nst;j++){
                System.out.print(val);
                val++;
            }
          
            for(int k = 1; k<=nsp;k++){
                System.out.print(" ");
            }
            if(i==n){
                nst--;
                val--;
            }
            for(int j = 1 ;j<=nst;j++){
                val--;
                System.out.print(val);
                
            }
            
            
            
            nsp-=2;
            nst++;
            System.out.println();
            
    
        }
        
        
    }

    
}
