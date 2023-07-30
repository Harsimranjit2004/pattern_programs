package pattern;

import java.util.Scanner;

public class pattern_32 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i = 0; i<n; i++){
            int val = 1;
            for(int j = 0; j<=i;j++){
                System.out.print(val);
                int tempval = extracted(val, i, j);
                val  = tempval;
            }
            System.out.println();
        }
    }

    private static int extracted(int val, int i, int j) {
        return (val * (i-j))/ (j+1);
    }
    
}
