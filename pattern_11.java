package pattern;

import java.util.Scanner;

public class pattern_11 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         print
          *  
          *
      * * * * *
          *
          *  
         */
        int middle = n/2+1;

        for(int i = 1; i<=n; i++){
            for(int j = 1; j<=n; j++){
                if(i==middle || j == middle ){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
}
