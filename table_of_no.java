import java.util.Scanner;

public class table_of_no {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i < 11; i++){
            System.out.println(i*n);
        }
    }
}
