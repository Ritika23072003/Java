import java.util.*;

public class switch_con {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        switch(n){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Namaste");
            break;
            case 3: System.out.println("Bonjor");
            break;
            default : System.out.println("Invalid statment");
        }
    }
}
