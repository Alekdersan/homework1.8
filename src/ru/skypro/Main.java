package ru.skypro;

import java.time.LocalDate;
import java.util.Arrays;

public class Main {


    public static void main(String[] args) {
//        ЗАДАЧА 1
        int year = 2005;
        printYearEven(year);

//        ЗАДАЧА 2
        printVersion(1, 2023);
        System.out.println();

//        ЗАДАЧА 3
        computing(10);
        System.out.println();

//        ЗАДАЧА 4
        findAndPrintDouble("abccddefgghiijjkk"); // abccddefgghiijjkk
        System.out.println();

//        ЗАДАЧА 5
        int[] arr = new int[]{3, 2, 1, 6, 5}; // массив 3, 2, 1, 6, 5
        reversOrderOfNumbersArray(arr);
        System.out.println("reversOrderOfNumbersArray = " + Arrays.toString(arr));
    }

    // ------------------------------------------к задаче 1
    public static void printYearEven(int years) {
        boolean evenYear = isLeapYear(years);
        printYear(years, evenYear);
    }

    public static boolean isLeapYear(int years) {
        return years % 4 == 0 || years % 400 == 0 && years % 100 != 0;
    }

    public static void printYear(int years, boolean evenYear) {
        if (evenYear) {
            System.out.println(years + " год является високосным.");
        } else {
            System.out.println(years + " год не является високосным.");
        }
        System.out.println();
    }

    //    --------------------------------------------------------к Задаче 2
    public static void printVersion(int customerOs, int deviceYear) {
        boolean device = deviceOld(deviceYear);
        System.out.print("Установите ");
        if (device) {
            System.out.print("lite ");
        }
        System.out.print("версию для ");
        if (customerOs == 0) {
            System.out.println("iOS.");
        } else {
            System.out.println("Android.");
        }
    }

    public static boolean deviceOld(int deviceYear) {
        int currentYear = LocalDate.now().getYear();
        return deviceYear <= currentYear;
    }

    //    -------------------------------------------------------------------к Задаче 3
    public static void computing(int distance) {
        int deliveryDay = 1;

        if (distance > 20) {
            deliveryDay++;
        }

        if (distance > 60) {
            deliveryDay++;
        }
        System.out.println("Количество дней доставки: " + deliveryDay);
    }

    // -------------------------------------------------------------------к Задаче 4
    public static void findAndPrintDouble(String abc) {
        char[] letters = abc.toCharArray();
        for (int i = 0; i < letters.length - 1; i++) {
            if (letters[i] == letters[i + 1]) {
                System.out.println("Найден дубль по символу - " + letters[i]);
                return;
            }
        }
        System.out.println("Дублей не найдено.");
    }

    // -------------------------------------------------------------------к Задаче 5
    public static void reversOrderOfNumbersArray(int[] arr) {
        int forward = 0;            // первый элемент массива
        int last = arr.length - 1; // последний элемент массива
        while (forward < last) {
            int temp = arr[forward];
            arr[forward] = arr[last];
            arr[last] = temp;
            forward++;
            last--;
        }
    }
}
