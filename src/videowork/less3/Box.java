package videowork.less3;

import java.util.Scanner;

public class Box {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // расчитать обьем коробкт width, height, depth
        System.out.println("Write width, height, depth");
        double width = scanner.nextDouble();
        double height = scanner.nextDouble();
        double depth = scanner.nextDouble();
        double volume = calculation(width, height, depth);
        System.out.println(volume);

        if (volume > 500){
            System.out.println("big box");

        }else {
            System.out.println("small box");
        }

    }
    public static double calculation(double width, double height, double depth){
        return width * height * depth;

    }

}
