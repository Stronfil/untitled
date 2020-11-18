public class Main {

    public static void main(String[] args) {
        System.out.println("задание 2");
        byte c = 127;
        c++;
        System.out.println(c);
        short b = 30200;
        b--;
        System.out.println(b);
        int a = 300000000;
        long d = 303030030303011999L;
        float e = 112.1231123f;
        double f = 1111111.111111111;
        System.out.println(a);
        System.out.println(d);
        System.out.println(e);
        System.out.println(f);
        char g = 7777;
        System.out.println(g);
        boolean h = true;


        System.out.print("Задание 3 : ");
        System.out.println(task3(4, 4, 4, 4));
        System.out.print("Задание 4 : ");
        System.out.println(task4(10,5));
        System.out.print("Задание 5 : ");
        isPositiveOrNegative(8);
        System.out.print("Задание 6 : ");
        System.out.println(isNegative(-5));
        System.out.print("Задание 7 : ");
        hello("Вася");






    }

    public static float task3(float a,  float b,  float c,  float d) {

        return  a * (b + (c / d));
    }


    public static boolean task4(int a,int b){
        return  a + b < 20 && a + b > 10;




    }
    public static void isPositiveOrNegative(int a) {

        if (a >= 0) {
            System.out.println(a + " положительное");
        } else {
            System.out.println(a + " отрицательное");
        }



    }


    public static boolean isNegative(int x) {
        if (x < 0){
            return true;}
        return false;
    }

    public static void hello(String name) {
        System.out.println("Привет , "+ name + '!');


    }


}
