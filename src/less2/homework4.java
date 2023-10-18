package less2;

import java.math.BigDecimal;
import java.math.MathContext;
import java.math.RoundingMode;
import java.util.Scanner;

public class homework4 {
    public static void main(String[] args) {
        //Найти результат выражения | a- b | / (a + b) ^3 - √c
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введіть число а: ");
        double a = scanner.nextDouble();
        System.out.println("Введіть число b: ");
        double b = scanner.nextDouble();
        System.out.println("Введіть число c: ");
        double c = scanner.nextDouble();
        System.out.println("Введіть степінь: ");
        double d = scanner.nextDouble();
        System.out.println("Знайдіть: | a- b | / (a + b) ^d - √c якщо a = " + a + ", b = " + b + ", c = " + c + ", d = " + d);
        System.out.println("1. спочатку підставимо усі числа: | " + a + " - " + b + " b | : ( " + a + " + " + b + " ) ^" + d + " - √" + c);
        double module = Math.abs(a - b);
        System.out.println("2. Знаходимо модуль: | " + a + " - " + b + " b |" + " = " + module);
        double degree = Math.pow(a + b, d);
        System.out.println("3. Знаходимо скобки зі степенем:( " + a + " + " + b + " ) ^" + d + " = " + degree);
        double root = Math.sqrt(c);
        System.out.println("4. Знаходимо корінь √" + c + "=" + root);
        System.out.println("5. Вимисуємо все в один приклад: " + module + " : " + degree + " - " + root);
        double division = module / degree;
        System.out.println("6. Ділемо модуль на скобки: " + module + " : " + degree + " = " + division);
        double result = division - root;
        MathContext context = new MathContext(3, RoundingMode.HALF_UP);
        double result1 = result;
        BigDecimal reduction = new BigDecimal(result1, context);
        System.out.println("7. Відіймаємо від діленого корінь: " + division + " - " + root + " = " + result + " ≈ " + reduction);






    }

}
