package pattern;

import java.util.Scanner;

public class pattern_9 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /* 
         print
         A
         AB
         ABC 
         ABCD
         */
        for(int i = 1; i<=n; i++){
            for (int j = 1; j<=i; j++){
                int a = j+64;
                char ch = (char)a;

                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
}
