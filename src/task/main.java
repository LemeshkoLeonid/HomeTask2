package task;

import java.util.Scanner;

public class main {public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int number_1 = 0;
    int number_2 = 0;
    int number_3 = 0;
    int result = 0;

    System.out.print ("Введите число: ");
    number_1 = Math.abs(sc.nextInt());
    System.out.println ("Введите второе число: ");
    number_2 = Math.abs(sc.nextInt());
    System.out.println ("Введите третье число: ");
    number_3 = Math.abs(sc.nextInt());

    result = (number_1 < number_2 && number_1 < number_3) ? number_1 : (number_2 < number_3 && number_2 < number_1) ? number_2 : number_3;
    System.out.println (result);
}
}
