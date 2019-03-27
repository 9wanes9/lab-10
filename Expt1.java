package iscluchenia;

public class Expt1 {
    public static void Divide(int a) {
        int d;
        try {
            d = a /0;
        } catch (ArithmeticException е) {
            System.out.println("Дeлeниe на ноль.");
            System.out.println("Исключения: " + е);
        }
    }
    public static void Border(int a) {
        int[] b = new int[0];
        try {
            b[a] = 0;
        } catch (ArrayIndexOutOfBoundsException е) {
            System.out.println("Запрос элемента за пределами массива.");
            System.out.println("Исключения: " + е);
        }
    }
}
