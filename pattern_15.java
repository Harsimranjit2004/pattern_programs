package pattern;

import java.util.Scanner;

public class pattern_15 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        /*
         print 
         1
         01
         101
         0101
         */
        for(int i =1 ; i<=n;i++){
            int a;
            if(i%2==0){
                a = 0;
            }
            else{
                a=1;
            }
            for(int j = 1; j<=i;j++){
               System.out.print(a);
               if(a==0){
                 a=1;
               }
               else{
                a=0;
               }
            }
            System.out.println();
        }
    }
    
}
