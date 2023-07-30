package pattern;

import java.util.Scanner;

public class pattern_10 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         print
         1
         AB
         123
         ABCD
         12345
         */
        for(int i = 1; i<=n;i++){
            for(int j =1; j<=i; j++){
                if(i%2 == 0){
                    int d = j+64;
                    char ch = (char)d;
                    System.out.print(ch);
                }
                else{
                    System.out.print(j);
                }
            }
            System.out.println();
        }
    }
    
}
