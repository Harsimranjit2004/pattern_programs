package pattern;

import java.util.Scanner;

public class pattern_33 {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        /*
         print 
         pyramid square
         */
        int a= 1;
        int nsp = n/2;
        int nst = 1;
        int middle = n/2 + 1;
        int val = 1;
       
        for(int i =1; i<=n;i++){
            for(int j= 1;j<=nsp; j++){
                System.out.print(" ");
            }
            int cval = val;
            for(int k = 1; k<=nst; k++){
                System.out.print(cval);
                if(k<=nst/2){
                    cval++;
                }else{
                    cval--;
                }
            }
            
            
            if(i<middle){
                nsp--;
                nst+=2;
                val++;
            }
            else{
                nsp++;
                nst-=2;
                val--;
            }
           
            System.out.println();
        
        }
    }
}
