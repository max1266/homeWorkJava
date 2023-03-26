package homeWorkSemOne;

import java.util.Scanner;

public class Task1 {
    public static void summNumber() {
        int a1 = 1;
        int a2 = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите число N: ");
        int n = scanner.nextInt();
        while (a1 != n){
            a1++;
            a2 = a1 + a2;
        }
        System.out.println(a2);
    }
}
