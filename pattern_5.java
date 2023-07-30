package pattern;

import java.util.Scanner;

public class pattern_5 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
         print
         1
         12
         123
         1234
         */

         for(int i = 1; i<=n; i++){
            for(int j = 1; j<=i; j++){
                System.err.print(j);
            }
            System.out.println();
         }
    }
    
}
