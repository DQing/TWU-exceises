package cn.thoughtworks;

import java.util.Scanner;

public class DiamondExercises {

    public static void main(String[] args) {
        Scanner inputNumber = new Scanner(System.in);
        System.out.print("n=");
        int number = inputNumber.nextInt();
        Scanner inputName = new Scanner(System.in);
        System.out.print("name=");
        String name = inputName.nextLine();

        createFrontPart(number,name);
        createEndPart(number);
    }

    private static void createEndPart(int number) {
        for (int i = number-1; i > 0; i--) {
            for (int k = 0;k<number-i;k++){
                System.out.print(" ");
            }
            for (int j = 0; j < i * 2 - 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    private static void createFrontPart(int number, String name) {
        for (int i = 1; i <= number; i++) {
            for (int k = 0; k < number - i; k++) {
                System.out.print(" ");
            }
            if (i == number) {
                System.out.print(name);
            } else {
                for (int j = 0; j < i * 2 - 1; j++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }

    }
}