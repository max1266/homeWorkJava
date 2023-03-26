package homeWorkSemOne;

import java.util.Scanner;

public class Task2 {
    public static void factorial() {
        int a = 1;
        int b = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = scanner.nextInt();
        while (a != n){
            a++;
            b = a * b;
        }
        System.out.println(b);

    }
}
