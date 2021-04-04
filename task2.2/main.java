package task;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        System.out.println("Please enter an integer");
        Scanner scn = new Scanner(System.in);
        if (scn.hasNextInt()) {
            if (scn.nextInt() % 2 == 0) {
                System.out.println("Even number");
            } else System.out.println("The number is not even");
        } else System.out.println("Mistake. You entered a non-integer number");
    }
}
