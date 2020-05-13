
public class Main {

    // Task1
    public static void main(String[] args) {
        // Task2
        byte a = 108;
        short b = 1343;
        int c = 9;
        long d = 20675L;
        float usd = 25.56f;
        double pi = 3.14159;
        char e = 'e';
        boolean f = true;

        String string1 = "Hello, World!";
    }

    // Task3
    public static float Task3(float a, float b, float c, float d) {
        float result = a * (b + (c / d));
        return result;
    }

    // Task4
    public static boolean Task4(int a, int b) {
        int sum = a + b;
        if (sum >= 10 && sum <= 20) {
            return true;
        } else return false;
    }


    // Task5
    public static void Task5 (int a) {
        if (a < 0) {
            System.out.println("Число отрицательное");
        } else
            System.out.println("Число положительное");
    }
    // Task6
    public static boolean Task6 (int a) {
        if(a > 0){
            return true;
        } else {
            return false;
        }
    }

    //Task7
    public static void Task7 (String Irene){
        System.out.println("Привет," + Irene);
    }

    //Task8
    public static void Task8 (int year) {
        if (year % 4 == 0 && year % 100 != 0){
            System.out.println("Год високосный");
        } else if (year % 400 == 0){
            System.out.println("Год високосный");
        } else System.out.println("Год не високосный");
    }

}
