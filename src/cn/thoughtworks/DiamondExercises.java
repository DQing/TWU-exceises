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

        for (int i = 0; i < number; i++) {
            for (int j = 0; j < number*2-1; j++) {
                if (j >= number-1 - i && j <= number-1 + i && i!=number-1) {
                    System.out.print("*");
                }else if (i==number-1){
                    System.out.print(name);
                }else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }


        for (int i = number-2; i >= 0; i--) {
            for (int j = 0; j < number*2-1; j++) {
                if (j >= number-1 - i && j <= number-1 + i) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }

            }
            System.out.println("");
        }
    }
}