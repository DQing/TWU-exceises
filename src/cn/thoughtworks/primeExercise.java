package cn.thoughtworks;

import java.util.Scanner;
public class primeExercise {

    public static void main(String[] args) {
        System.out.print("n=");
        Scanner n = new Scanner(System.in);
        factor(n.nextInt());
    }

    private static void factor(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                System.out.print(i + "  ");
                if (isPrime(number / i)) {
                    System.out.print(number / i + "  ");
                } else {
                    factor(number / i);
                }
                return;
            }
        }
    }
    private static boolean isPrime(int number) {
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
