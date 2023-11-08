package less2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class Snowman {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("введіть радіус першого шару сніговика: ");
        double r = scan.nextDouble();
        double r1 =r ;
        System.out.println("введіть радіус другого шару сніговика: ");
        double r4 = scan.nextDouble();
        double r2 = r4;
        System.out.println("введіть радіус третього шару сніговика: ");
        double r5 = scan.nextDouble();
        double r3 = r5;
        double degree = 3;
        double pi = Math.PI;
        double number = 3.0 / 4.0;
        System.out.println("вкажіть коэффициент плотности снежных шаров в м3: ");
        double p1 = scan.nextDouble();
        double p = p1;


        //1
        double V1 = (number * pi * (Math.pow(r1, degree)));
        System.out.println(" ");
        System.out.println("зназодимо значення V1: V = 4/3πR^3  = 3 : 3 * π * " + r1 + "^3 = " + V1);
        //2
        double V2 = (number * pi * (Math.pow(r2, degree)));
        System.out.println("зназодимо значення V2: V = 4/3πR^3  = 3 : 3 * π * " + r2 + " ^3 = " + V2);
        //3
        double V3 = (number * pi * (Math.pow(r3, degree)));
        System.out.println("зназодmимо значення V3: V = 4/3πR^3  = 3 :3 * π * " + r3 + " ^3 = " + V3);
        System.out.println(" ");

        double m1 = (p * V1);
        System.out.println("знаxoимо масу першого кола: m = pV = " + p + " * " + V1 + " = " + m1);

        double m2 = (p * V2);
        System.out.println("знаxoимо масу другого кола: m = pV = " + p + " * " + V2 + " = " + m2);

        double m3 = (p * V3);
        System.out.println("знаxoимо масу третього кола: m = pV = " + p + " * " + V3 + " = " + m3);
        System.out.println(" ");

        double m123 = (m1 + m2 + m3);
        System.out.println("знаходимо массу усього сніговика: ms = m1+m2+m3 = " + m1 + " + " + m2 + " + " + m3 + " = " + m123);
        System.out.println(" ");
        MathContext context = new MathContext(4, RoundingMode.HALF_UP);
        double ms = m123;
        BigDecimal result = new BigDecimal(ms, context);
        System.out.println("маса сніговика: " + m123 + " ≈ " + result);

}}
