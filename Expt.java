package iscluchenia;
import java.util.Date;
public class Expt {
    static class Exept extends Exception {
        private  int  expulsion;
        Date trace = new Date();
        Exept(int а) {
            expulsion = а;
        }
        public String toString(){
            return expulsion + " Моё исключение(все целые, кроме нуля) " + trace;
        }
    }
    public static void exept(int a) throws Expt.Exept {
        if (a > 0 || a < 0) {
            throw new Expt.Exept(a);
        }
    }
}

