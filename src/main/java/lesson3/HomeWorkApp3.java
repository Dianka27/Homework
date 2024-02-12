package lesson3;

public class HomeWorkApp3 {
    public static void main(String[] args) {
        invertArray();
        System.out.println("----------");
        fillArray();
        System.out.println("----------");
        changeArray();
        System.out.println("----------");
        fillDiagonal();
        System.out.println("----------");
        createArray();
        System.out.println("----------");
        findMinMax();
    }

//    Задать целочисленный массив, состоящий из элементов 0 и 1. Например: [ 1, 1, 0, 0, 1, 0, 1, 1,
//    0, 0 ]. С помощью цикла и условия заменить 0 на 1, 1 на 0
    public static void invertArray() {
        int[] arr = { 1, 0, 1, 0, 0, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else if (arr[i] == 1) {
                arr[i] = 0;
            }
            System.out.println(arr[i]);
        }
    }

//    Задать пустой целочисленный массив длиной 100. С помощью цикла заполнить его
//    значениями 1 2 3 4 5 6 7 8 … 100
    public static void fillArray() {
        int[] arr = new int[100];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.println(arr[i]);
        }
    }

//    Задать массив [ 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 ] пройти по нему циклом, и числа меньшие 6
//    умножить на 2
    public static void changeArray() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1 };
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
            System.out.println(arr[i]);
        }
    }


//    Создать квадратный двумерный целочисленный массив (количество строк и столбцов
//    одинаковое), и с помощью цикла(-ов) заполнить его диагональные элементы единицами
//    (можно только одну из диагоналей, если обе сложно). Определить элементы одной из
//    диагоналей можно по следующему принципу: индексы таких элементов равны, то есть [0][0],
//    [1][1], [2][2], …, [n][n]
    public static void fillDiagonal() {
        int[][] arr = new int[4][4];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
            }
        }
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }


//    Написать метод, принимающий на вход два аргумента: len и initialValue, и возвращающий
//    одномерный массив типа int длиной len, каждая ячейка которого равна initialValue
    public static void createArray() {
        int len = 4;
        int initialValue = 5;
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.println(arr[i]);
        }
    }


//    Задать одномерный массив и найти в нем минимальный и максимальный элементы
    public static void findMinMax() {
        int[] array = {4, 8, 1, 5, 2, 9, 3};
        int min = array[0]; // Допустим, что первый элемент минимальный
        int max = array[0]; // Допустим, что первый элемент максимальный
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) {
                min = array[i]; // Обновим минимальное значение, если найдем меньшее
            }
            if (array[i] > max) {
                max = array[i]; // Обновим максимальное значение, если найдем большее
            }
        }
        System.out.println("Минимальный элемент: " + min);
        System.out.println("Максимальный элемент: " + max);
        }
    }

