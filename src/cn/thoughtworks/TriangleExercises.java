package cn.thoughtworks;

import java.util.Scanner;

/**
 * Created by douqing on 18-7-11.
 */
public class TriangleExercises {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 0; i < number; i++) {
            for (int j = 0; j < i + 1; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

