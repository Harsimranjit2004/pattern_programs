package pattern;

import java.util.Scanner;

public class pattern_14 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         print
         1
         23
         456
         78910
         */
        int a = 1;
        for(int i= 1; i<=n;i++){
            for(int j =1; j<=i;j++){
                System.out.print(a);
                a = a+1;
            }
            System.out.println();
        }
    }
    
}
