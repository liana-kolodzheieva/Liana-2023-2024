package videowork.less3;

import java.util.Scanner;

public class Conpany {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Місячна зарплата першої особи: ");
        double p1 = scanner.nextDouble();
        System.out.println("Місячна зарплата другої особи: ");
        double p2 = scanner.nextDouble();
        System.out.println("Місячна зарплата третьої особи: ");
        double p3 = scanner.nextDouble();
        System.out.println("введіть процент налогу: ");
        Double tax = scanner.nextDouble();
        System.out.println("За скільки років зарплата: ");
        int year = scanner.nextInt();
        int month = 12;
        int years = month * year;


    }

    public static int SalaryCalculation(int salary){
        return 1;


    }
}
