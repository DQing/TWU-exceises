package cn.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class FizzBuzzExercise{
    private static List<String> results = new ArrayList<>();

    public static void main(String[] args){
        System.out.print("n=");
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        for (int i = 1; i <= number; i++) {
            String result = sayNumber(i);
            results.add(result);
        }
        System.out.print(results);
    }

    private static String sayNumber(int number) {
        String word = "";
        String num = String.valueOf(number);
        if (num.contains("3")) {
            return "Fizz";
        }
        word += threeMultiple(number) + fiveMultiple(number) + sevenMultiple(number);
        if (word.equals("")) {
            return num;
        }
        return word;
    }
    private static String threeMultiple(int i) {
        return i % 3 == 0 ? "Fizz" : "";
    }
    private static String fiveMultiple(int i) {
        return i % 5 == 0 ? "Buzz" : "";
    }
    private static String sevenMultiple(int i) {
        return i % 7 == 0 ? "Whizz" : "";
    }

}
