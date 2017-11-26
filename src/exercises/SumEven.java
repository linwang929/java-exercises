package exercises;

import java.util.ArrayList;
import java.util.Scanner;

public class SumEven {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>();
        Scanner in = new Scanner(System.in);
        int newInt;
        int sumEven = 0;

        System.out.println("Enter your list of integers (or enter ANY letter to finish):");
        while (in.hasNextInt()) {
            newInt = in.nextInt();
            numbers.add(newInt);
            }

        for (int i = 0; i < numbers.size(); i++) {
            if (numbers.get(i) % 2 == 0) {
                sumEven += numbers.get(i);
            }
        }

        System.out.println("The sum of the even numbers of in this list is: " + sumEven);
    }
}
