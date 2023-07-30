package pattern;

import java.util.Scanner;

public class pattern_30 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int os = n/2;
        int is = -1;

        for(int i = 1; i<=n;i++){
            for(int j = 1; j<=os;j++){
                System.out.print(" ");
            }
            System.out.print("*");
            for(int k = 1; k<=is;k++){
                System.out.print(" ");
            }
            if(i<=n/2){
                os--;
                is+=2;
            }
            else{
                os++;
                is-=2;
            }
            if(i>1 && i<n){
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
