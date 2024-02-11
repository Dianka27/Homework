package lesson2;

public class HomeWorkApp2 {
    public static void main(String[] args) {
        int a = 45;
        int b = 5;
        int c = 0;
        String word = "Hello";
        int times = 7;
        int year = 2024;

        boolean result1 = within10and20(a, b);
        System.out.println(result1);

        checkInt(c);
        boolean result2 = isNegative(a);
        System.out.println(result2);

        printWordNTimes(word, times);

        boolean result3 = whatYear(year);
        System.out.println(result3);

    }
//    Написать метод, принимающий на вход два целых числа и проверяющий, что их сумма лежит
//    в пределах от 10 до 20 (включительно), если да – вернуть true, в противном случае – false
    public static boolean within10and20(int a, int b) {
        int sum = a + b;
        return sum >= 10 && sum <= 20;
    }


//    Написать метод, которому в качестве параметра передается целое число, метод должен
//    напечатать в консоль, положительное ли число передали или отрицательное. Замечание:
//    ноль считаем положительным числом
    public static void checkInt(int c) {
        if (c == 0) {
            System.out.println("Число положительное");
        } else if (c > 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }


//    Написать метод, которому в качестве параметра передается целое число. Метод должен
//    вернуть true, если число отрицательное, и вернуть false если положительное
    public static boolean isNegative(int a) {
        if (a >= 0) {
            return false;
        } else {
            return true;
        }
    }


//    Написать метод, которому в качестве аргументов передается строка и число, метод должен
//    отпечатать в консоль указанную строку, указанное количество раз
    public static void printWordNTimes(String word, int times) {
        for (int i = 0; i < times; i++) {
            System.out.println(word);
        }
    }


//    Написать метод, который определяет, является ли год високосным, и возвращает boolean
//    (високосный - true, не високосный - false). Каждый 4-й год является високосным, кроме
//    каждого 100-го, при этом каждый 400-й – високосный
    public static boolean whatYear (int year) {
        return (year % 4 == 0) && (year % 100 != 0 || year % 400 == 0);
    }


}
