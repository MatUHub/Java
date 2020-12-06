/*package lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Main2 {

    public static void main(String[] args) {
        OneAndZero();
        FillArray();
        Multiplication();
        TwoArray();
        MaxAndMin();
        Equality();
        Moving();
    }

    private static void Moving() {

        System.out.println("Задание №7");
        System.out.println();

        int[] arr = {1, 2, 3, 4, 5, 6};
        int a = 1;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[arr.length - a];
            a++;
            System.out.println(arr[i]);

        }
    }

    private static void Equality() {

        System.out.println("Задание №6");
        System.out.println();

        int[] arr = {1, 1, 1, 2, 2};
        int a = 0;
        for (int i = 0; i < arr.length; i++) {
            int b = 0;
            a += arr[i];
            for (int j = i + 1; j < arr.length; j++) {
                b += arr[j];
            }
            if (a == b) {
                System.out.println("true");
                break;
            } else {
                System.out.println("false");
                break;
            }
        }
        System.out.println();
    }

    private static void MaxAndMin() {

        System.out.println("Задание №5");
        System.out.println();

        int[] arr = {4, 5, 7, 8, 3, 5, 12, 3, 45, 6, 7, 2};
        int a = arr[1];
        int b = arr[1];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > a) a = arr[i];
            if (arr[i] < b) b = arr[i];
        }
        System.out.printf("Максимальное значение в массиве: %d \nМинимальное значение в массиве: %d\n ", a, b);
        System.out.println();
    }

    private static void TwoArray() {

        System.out.println("Задание №4");
        System.out.println();
        int SIZE = 7;

        int[][] arr = new int[SIZE][SIZE];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                arr[i][j] = 0;
                if (i == j) arr[i][j] = 1;
                if (i == arr.length - 1 - j) arr[i][j] = 1;

            }
        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length; j++) {
                System.out.printf("%2d ", arr[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void Multiplication() {

        System.out.println("Задание №3");
        System.out.println();

        int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Исходный массив: ");
        System.out.println(Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) arr[i] *= 6;
        }
        System.out.println("Массив после преобразования: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    private static void FillArray() {

        System.out.println("Задание №2");
        System.out.println();

        int[] arr = new int[8];
        int i = 0;
        for (int j = 0; i < arr.length; j++) {
            if (j % 3 == 0) {
                arr[i] = j;
                i++;
            }

        }
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }

    private static void OneAndZero() {

        System.out.println("Задание №1");
        System.out.println();

        System.out.println("Исходный массив: ");
        int[] arr = {1, 1, 0, 0, 1, 0, 1, 1, 0, 0};
        System.out.println(Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 1) arr[i] = 0;
            else arr[i] = 1;
        }
        System.out.println("Массив после преобразования: ");
        System.out.println(Arrays.toString(arr));
        System.out.println();
    }
}*/
