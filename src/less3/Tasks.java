package less3;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;

public class Tasks {
    public static void main(String[] args) {
//        taskOne();
//        taskTwo();
//        taskThree();
//        taskFour();
        taskFive();

    }

    private static void taskFive() {

        String[] strings = "Да далеко ходить) я тоже дольше открывал, чем сюда прислали :)".split(" ");

        int size = strings.length;

        String temp;

        for (int i = 0; i < size / 2; i++) {
            temp = strings[size - i - 1];
            strings[size - i - 1] = strings[i];
            strings[i] = temp;
        }

        for (String word : strings) {
            System.out.print(word + " ");
        }

    }


    private static void taskFour() {
        int[] mas = new int[10];

        int maxNumber = -16;
        int maxIndex = 0;


        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 31 - 15);
            if (maxNumber <= mas[i]) {
                maxNumber = mas[i];
                maxIndex = i;
            }
        }
        System.out.println(Arrays.toString(mas));
        System.out.println(maxNumber + " " + maxIndex);

    }

    private static void taskThree() {
        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 90) + 10;
        }
        System.out.println(Arrays.toString(mas));

        boolean flag = true;

        for (int i = 1; i < mas.length; i++) {
            if (mas[i] <= mas[i - 1]) {
                flag = false;
                break;
            }
        }

        if (flag) {
            System.out.println("строго возрастает");
        } else {
            System.out.println("хаос");
        }

    }

    private static void taskTwo() {

        int[] mas = new int[10];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 6);
        }

        for (int i = 0; i < mas.length; i++) {
            if (mas[i] % 2 == 1) {
                mas[i] = 0;
            }
        }

        System.out.println(Arrays.toString(mas));

    }

    private static void taskOne() {

        int[] mas = new int[5];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int) (Math.random() * 6);
        }

        double average = 0.0;

        for (int i : mas) {
            average += i;
        }

        System.out.println(average / mas.length);

    }
}
