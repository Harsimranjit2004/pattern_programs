package pattern;

import java.util.Scanner;

public class pattern_18 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         print 
           A
          AB
         ABC
         */
        for(int i =1 ; i<=n;i++){
            for(int j= 1;j<=n-i; j++){
                System.out.print(" ");
                
            }
            for(int k = 1; k<=i;k++){
                int  d = k+64;
                char ch = (char)d;
                System.out.print(ch);
                
            }
            System.out.println();
        }
    }
    
}
