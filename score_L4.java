import java.util.*;

public class score_L4 {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int i;


        do{
            int markes = sc.nextInt();
            if(markes >= 90){
                System.out.println("This is Good");
            }
            else if(markes >= 60 && markes <= 89){
                System.out.println("This is also Good");
            }
            else if(markes >= 0 && markes <= 59){
                System.err.println("This is Good as well");
            }
            else{
               System.out.println();
            }
            System.out.println("Want to countinue? (yes (1)) or no(0))");
         i = sc.nextInt();
        }while(i == 1);
         
    }
}
