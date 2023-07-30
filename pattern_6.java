package pattern;

import java.util.Scanner;

public class pattern_6 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         print
         1234
         123
         12 
         1
         */
        for(int i=1; i<=n;i++){
            for(int j = 1; j<=n-i+1;j++){
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
}
