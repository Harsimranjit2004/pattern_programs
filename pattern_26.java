package pattern;

import java.util.Scanner;

public class pattern_26 {
    /**
     * @param args
     */
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        // special

        for(int i = 1; i<=2*n-1;i++){
            for(int j=1;j<=2*n-1;j++){
                int min;
                int a = i ; 
                if(i>n){
                    a = 2*n-i;
                }
                int b = j;
                if(b>n){
                    b = 2*n-j;
                }
                if(a>b){
                    min = b;
                }else {min = a;}
                System.out.print(n+1-min);
            }
            System.out.println();
        }
    }
}
