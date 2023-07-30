package pattern;

import java.util.Scanner;

public class pattern_20 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         print
         pyramid of number 
           1
          123 
         12345
         */
        int nst = 1;
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n-i;j++){
                System.out.print(" ");
            }
            for(int k = 1; k<=nst; k++){
                System.out.print(k);
                
            }
            nst = nst +2;
            System.out.println();
        }
    }
    
}
