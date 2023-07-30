package pattern;

import java.util.Scanner;

public class pattern_7 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         print 
         1
         13
         135
         1357
         */
        for(int i = 1; i<=n; i++){
            int a = 1;
            for(int  j = 1; j<=i;j++){
                System.out.print(a);
                a+=2;
            }
            System.out.println();
        }
    }
    
}
