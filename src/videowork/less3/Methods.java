package videowork.less3;

public class Methods {
    public static void main(String[] args) {
        Methods.printMassage();
        int num = generateRandom();
        System.out.println(num);
        int rundom = generateRandom(18, 50);
        System.out.println(rundom);

    }

    public static void printMassage(){
        System.out.println("hi");

    }

    public  static  int generateRandom(){
        return (int) (Math.random() * 100);


    }

    public static int generateRandom(int min, int max) {
        return (int )(Math.random() * (max - min) + min);

    }


}
