package com.company;

import java.util.Arrays;
import java.util.Random;

public class Main {

    public static void main(String[] args) {
        //Task1();
        // Task2();
        //Task3();
        //Task4();
        //Task5();
        //Task6();
        //Task7();
        //Task8();
        //Task9();
        Task9_1();
    }

    private static void Task1() {
//        В массиве хранится информация о численности книг в каждом из 35
//        разделов библиотеки. Выяснить, верно ли, что общее число книг в
//        библиотеке есть шестизначное число.

        int[] a = new int[35];
        int summa = 0;
        Random ran = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = ran.nextInt(10000);
            summa = summa + a[i];
        }
        System.out.println(Arrays.toString(a));
        System.out.println("Общее число книг " + summa);
        if (summa > 1000000) {
            System.out.println("Oбщее число книг в библиотеке не является шестизначным числом.");
        } else if (summa > 99999) {
            System.out.println("Общее число книг в библиотеке является шестизначным числом.");
        } else System.out.println("Общее число книг в библиотеке не является шестизначным числом.");
    }

    private static void Task2() {
//        В массиве хранится информация о баллах, полученных спортсменом-
//        десятиборцем в каждом из десяти видов спорта. Для выхода в следующий
//        этап соревнований общая сумма баллов должна превысить некоторое
//        известное значение. Определить, вышел ли данный спортсмен в
//        следующий этап соревнований.

        int[] a = new int[10];
        int summ = 0;
        Random points = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = points.nextInt(10);
            summ += a[i];
        }
        System.out.println("Баллы " + Arrays.toString(a));
        System.out.println("Общее число баллов " + summ);
        if (summ >= 50) {
            System.out.println("Спортсмен вышел в следующий этап соревнований.");
        } else System.out.println("Спортсмен не вышел в следующий этап соревнований.");
    }

    private static void Task3() {
//        Оценки, полученные спортсменом в соревнованиях по фигурному катанию
//        (в баллах), хранятся в массиве из 18 элементов. В первых шести элементах
//        записаны оценки по обязательной программе, с седьмого по
//        двенадцатый — по короткой программе, в остальных — по произвольной
//        программе. Выяснить, по какому виду программы спортсмен показал
//        лучший результат.

        Random ran = new Random();
        int[] a = new int[18];
        int obz = 0, kor = 0, proiz = 0;
        for (int i = 0; i < a.length; i++) {
            a[i] = ran.nextInt(50);
            //  System.out.println(Arrays.toString(a));
            if (i < 7) obz += a[i];
            else if (i > 7 && i < 12) kor += a[i];
            else if (i > 12) proiz += a[i];
        }
        System.out.println("Обязательная программа ровна " + obz + "\nКороткая программа ровна " + kor + "\nПроизвольная программа ровна " + proiz);
        if (obz > kor && obz > proiz)
            System.out.println("Обязательная программа показала лучший результат. ");
        else if (kor > obz && kor > proiz)
            System.out.println("Короткая программа показала лучший результат. ");
        else if (proiz > kor && proiz > obz)
            System.out.println("Произвольная программа показала лучший результат. ");
    }

    private static void Task4() {
//        Написать программу определения в одномерном массиве вещественных
//        чисел наибольшего количества последовательно расположенных
//        положительных чисел.
        int maxNum = 0;
        int positiveNumbers = 0;
        int[] a = {1, 2, -3, 6, -7, -5, 5, 3, 2, -6, 2, 8};
        //int[] a = new int[10];
        for (int i = 0; i < a.length; i++) {
            //   a[i] = (int) (-10 + Math.random() * 20);

            if (a[i] > 0) {
                positiveNumbers += 1;
            } else {
                maxNum = positiveNumbers;
                positiveNumbers = 0;

                System.out.println(maxNum + "  " + positiveNumbers);
            }
            //   System.out.println(positiveNumbers);
            System.out.println(Arrays.toString(a));
            System.out.println("Количество последовательно расположенных положительных чисел " + maxNum);
        }
    }

    private static void Task5() {
//        Задан целочисленный массив размерности N. Есть ли среди элементов
//        массива простые числа? Если да, то вывести номера этих элементов.
        int s = 0;
        Random ram = new Random();
        int[] n = new int[10];
        for (int i = 0; i < n.length; i++) {
            n[i] = ram.nextInt(50);


            for (int j = 2; j < n[i]; j++) {

                s = 0;

                if (n[i] % j == 0) {

                    s = s + 1;

                    break;
                }


            }

            if (s == 0) {
                System.out.println("Простое число " + n[i] + " под номером " + (i + 1));


            }
        }

        System.out.println(Arrays.toString(n));
    }

    private static void Task6() {
        // Дан массив, в котором все элементы различны. Заменить в нём нулём :
        // а) максимальный элемент;
        // б) минимальный элемент.


        Random ram = new Random();
        int min = 0, max = 0;
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = ram.nextInt(50);
        }
        System.out.println(Arrays.toString(a));
        int min2 = 0;

        for (int j = 0; j < a.length; j++) {
            min = Arrays.stream(a).min().getAsInt();
            max = Arrays.stream(a).max().getAsInt();
            System.out.println(min + "  " + max);
            if (a[j] == min) {
                min2 = a[j];
                a[j] = 0;
            } else if (a[j] == max) {
                a[j] = 0;
                break;
            }

        }
        System.out.println("Максимальный элемент " + max);
        System.out.println("Минимальный  элемент " + min2);

        System.out.println(Arrays.toString(a));


    }

    private static void Task7() {
//        Заменить нулями все повторяющиеся элементы в массиве, оставив их
//        первые вхождения, то есть в массиве должны остаться только разные
//        элементы.

        Random ram = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = ram.nextInt(50);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {

            for (int j = i + 1; j < a.length; j++) {
                if (a[j] == a[i]) {
                    a[j] = 0;

                }

            }

        }


        System.out.println(Arrays.toString(a));


    }

    private static void Task8() {
        //  Заменить нулями :
        //  а) все отрицательные элементы;
        //  б) все элементы, большие данного числа n;
        //  в) все элементы, начиная с n1-го по n2-й (n1 ≤ n2).

        int n = 45;
        Random ran = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = -10 + ran.nextInt(100);
        }
        System.out.println(Arrays.toString(a));
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) { //задание a
                a[i] = 0;
            } else if (a[i] > n) { //задание б
                a[i] = 0;
            }
            if (i >= 1 && i <= 5) { // задание в
                a[i] = 0;


            }
        }
        System.out.println(Arrays.toString(a));
    }

    private static void Task9() {
//        Дан массив целых чисел. Удалить из него:
//        а) все четные элементы, стоящие на нечетных местах;
//        б) все элементы, кратные 3 или 5.

        Random ran = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = ran.nextInt(100);
        }


        System.out.println(Arrays.toString(a));
        for (int j = 1; j < a.length; j = j + 2) {

            if (a[j] % 2 == 0) { // задание а
                a[j] = 101;
            }

        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 101) {

                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];


                }
                a[a.length - 1] = 0;
            }

        }
        System.out.println(Arrays.toString(a));
    }

    private static void Task9_1() {
        Random ran = new Random();
        int[] a = new int[20];
        for (int i = 0; i < a.length; i++) {
            a[i] = ran.nextInt(100);
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {
            if (a[i] % 3 == 0 || a[i] % 5 == 0) { //задание б
                a[i] = 101;

            }
        }
        System.out.println(Arrays.toString(a));

        for (int i = 0; i < a.length; i++) {

            if (a[i] == 101) {

                for (int j = i; j < a.length - 1; j++) {
                    a[j] = a[j + 1];

                }
                a[a.length - 1] = 0;
            }
        }
        System.out.println(Arrays.toString(a));
    }
}








