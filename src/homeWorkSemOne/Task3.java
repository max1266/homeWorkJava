package homeWorkSemOne;

public class Task3 {
    public static void primeNumbers(){
        int a = 1;
        while (a != 1000){
            if (a % a == 0 && a % 1 == 0 && a % 2 !=0 && a % 3 !=0 && a % 4 != 0 && a % 5!=0 && a % 6!=0 && a%7!=0 && a%8 !=0 && a %9 !=0&& a %10 !=0 && a %11 !=0){
                System.out.println(a);
                a++;
            }
            else{
                a++;
            }
        }

    }
}
