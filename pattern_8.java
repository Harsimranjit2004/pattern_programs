package pattern;

import java.util.Scanner;

public class pattern_8 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         print
         ABCD
         ABCD
         ABCD 
         ABCD
         */
        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                int d = j+ 64; // for ascii value as A starts from 65
                char ch = (char)d;
                System.out.print(ch);
            }
            System.out.println();
        }
    }
    
}
