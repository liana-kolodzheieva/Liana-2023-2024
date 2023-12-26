package videowork.less3;

import java.util.Scanner;

public class Companny {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("введіть процент налогу: ");
        Double tax = scanner.nextDouble();
        System.out.println("Місячна зарплата першої особи: ");
        double p1 = scanner.nextDouble();
        System.out.println("Місячна зарплата другої особи: ");
        double p2 = scanner.nextDouble();
        System.out.println("Місячна зарплата третьої особи: ");
        double p3 = scanner.nextDouble();
        System.out.println("За скільки років зарплата: ");
        int year = scanner.nextInt();

        //1
        System.out.println("    Перша особа особа: ");
        //зарплата за рік
        double salaryForYearP1 = p1 * 12;
        System.out.println("Зарплата першої особи за рік: " + salaryForYearP1);
        //зарплата за ??? років
        double salaryForXYearP1 = salaryForYearP1 * year;
        System.out.println("Зарплата першої особи за " + year + " років/роки: " + salaryForXYearP1);
        //налог за рік
        double taxForYearP1 = (salaryForYearP1 / 100) * tax;
        System.out.println("Налог першої особи за рік: " + taxForYearP1);
        //налог за ??? років
        double taxForXYearP1 = (salaryForXYearP1 / 100) * tax;
        System.out.println("Налог першої особи за " + year + " років/роки: " + taxForXYearP1);
        //Зарплата після віддачі налогу за рік
        double salaryWithTaxForYearP1 = salaryForYearP1 - taxForYearP1;
        System.out.println("Зарплата першої особи за рік після налогу: " + salaryWithTaxForYearP1);
        //Зарплата після віддачі налогу за ?? років
        double salaryWithTaxForXYearP1 = salaryForXYearP1 - taxForXYearP1;
        System.out.println("Зарплата першої особи за" + year + " років/роки після налогу: " + salaryWithTaxForXYearP1);
        System.out.println(" ");

        //1
        System.out.println("    Друга особа особа: ");
        //зарплата за рік
        double salaryForYearP2 = p2 * 12;
        System.out.println("Зарплата другої особи за рік: " + salaryForYearP2);
        //зарплата за ??? років
        double salaryForXYearP2 = salaryForYearP2 * year;
        System.out.println("Зарплата другої особи за " + year + " років/роки: " + salaryForXYearP2);
        //налог за рік
        double taxForYearP2 = (salaryForYearP2 / 100) * tax;
        System.out.println("Налог другої особи за рік: " + taxForYearP2);
        //налог за ??? років
        double taxForXYearP2 = (salaryForXYearP1 / 100) * tax;
        System.out.println("Налог другої особи за " + year + " років/роки: " + taxForXYearP2);
        //Зарплата після віддачі налогу за рік
        double salaryWithTaxForYearP2 = salaryForYearP2 - taxForYearP2;
        System.out.println("Зарплата другої особи за рік після налогу: " + salaryWithTaxForYearP2);
        //Зарплата після віддачі налогу за ?? років
        double salaryWithTaxForXYearP2 = salaryForXYearP2 - taxForXYearP2;
        System.out.println("Зарплата другої особи за" + year + " років/роки після налогу: " + salaryWithTaxForXYearP2);
        System.out.println(" ");


        //1
        System.out.println("    Третя особа особа: ");
        //зарплата за рік
        double salaryForYearP3 = p3 * 12;
        System.out.println("Зарплата третьої особи за рік: " + salaryForYearP3);
        //зарплата за ??? років
        double salaryForXYearP3 = salaryForYearP3 * year;
        System.out.println("Зарплата третьої особи за " + year + " років/роки: " + salaryForXYearP3);
        //налог за рік
        double taxForYearP3 = (salaryForYearP3 / 100) * tax;
        System.out.println("Налог третьої особи за рік: " + taxForYearP3);
        //налог за ??? років
        double taxForXYearP3 = (salaryForXYearP3 / 100) * tax;
        System.out.println("Налог третьої особи за " + year + " років/роки: " + taxForXYearP3);
        //Зарплата після віддачі налогу за рік
        double salaryWithTaxForYearP3 = salaryForYearP3 - taxForYearP3;
        System.out.println("Зарплата третьої особи за рік після налогу: " + salaryWithTaxForYearP3);
        //Зарплата після віддачі налогу за ?? років
        double salaryWithTaxForXYearP3 = salaryForXYearP3 - taxForXYearP3;
        System.out.println("Зарплата третьої особи за" + year + " років/роки після налогу: " + salaryWithTaxForXYearP3);
        System.out.println(" ");


    }

}
