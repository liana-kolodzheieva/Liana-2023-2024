package less1;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Homework1 {
    public static void main(String[] args) {
        double a = 10;
        double b = 60;

        System.out.println("a = " + a);
        System.out.println("b = "+ b);

        double b2 = b;
        b = a;
        a = b2;
        System.out.println("a = " + a);
        System.out.println("b = "+ b);
    }
}