package iscluchenia;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
                int a;
                Scanner sc = new Scanner( System.in );
                System.out.print( "Vvedite celoe chislo: " );
                a = sc.nextInt();
        Expt1.Divide(a);
        Expt1.Border(a);
        try { 
            Expt.exept(a);
        }catch (Expt.Exept e) {
            System.out.println("Exception: " + e);
        }
    }
}