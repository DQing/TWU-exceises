package cn.thoughtworks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * Created by douqing on 18-7-11.
 */
public class FizzBuzzExercise{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        List<String> result = new ArrayList<>(n);
        for (int i = 1; i <= n; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                result.add("FizzBuzz");
            } else {
                if (i % 3 == 0) {
                    result.add("Fizz");
                } else {
                    if (i % 5 == 0) {
                        result.add("Buzz");
                    } else {
                        result.add(i + "");
                    }
                }
            }
        }
        System.out.print(result);
    }
}
