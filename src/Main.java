import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int a;
        int b;
        int n;
        int maxValue = 1000000000;
        System.out.println("Введите 3 числа");
        while(true) {
            Scanner scannerInt = new Scanner(System.in);
            try {
                a = scannerInt.nextInt();
                b = scannerInt.nextInt();
                n = scannerInt.nextInt();
                if (a <= maxValue && a >= 0 &&
                        b <=maxValue && b >=0 &&
                        n <=maxValue && n >=0)  {
                    break;
                }
                else {
                    throw new Exception("Вводите данные удовлетворяющие условиям задачи");
                }
            } catch (Exception e) {
                System.out.println("Вводите данные удовлетворяющие условиям задачи");
            }
        }

        double x = (a+b)/2d;
        if (x>=a || x % 1 != 0) {
            System.out.println("NO");
        } else {
            System.out.println("YES");
        }
    }

}
