package pattern;

import java.util.Scanner;

public class hollow_ptrn {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of n rows and m cloums :");
        int n = sc.nextInt();
        int m = sc.nextInt();
        for(int i=1; i<=n; i++){
            for(int j =1;j<=m;j++){
                if(i == 1 || j == 1 || i == n || j == m){
                    System.out.print("*");
                }else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
