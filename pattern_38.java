package pattern;

import java.util.Scanner;

import javax.lang.model.util.ElementScanner14;

public class pattern_38 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i<= n;i++){
            for(int j =1; j<=n;j++){
                if(j==1 || j ==n){
                    System.out.print("*");
                }
                else if(i>n/2 && (i ==j || i+j ==n+1)){
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
