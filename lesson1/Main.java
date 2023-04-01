package homework.lesson1;

import homework.lesson1.task.Task1;
import homework.lesson1.task.Task2;
import homework.lesson1.task.Task3;
import homework.lesson1.task.Task4;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        int number = 0;

        // Задача 1
        System.out.println("Задача № 1");
        System.out.print("Введите номер треугольного числа, которое необходимо вычислить, n: ");
        number = iScanner.nextInt();
        System.out.println("N-е треугольное число Tn = " + Task1.getTNumber(number));

        // Задача 2
        System.out.println("Задача № 2");
        System.out.print("Введите число, факториал которого необходимо вычислить: ");
        number = iScanner.nextInt();
        System.out.println("Факториал числа " + number + " равен: !n = " + Task2.getFactorial(number));

        // Задача 3
        System.out.println("Задача № 3");
        System.out.print("Введите верхнее значение диапазона простых чисел, от 1 до: ");
        number = iScanner.nextInt();
        System.out.println("Все простые числа в заданном диапазоне: " + Task3.getPrimeNumber(number));

        //Задача 4
        System.out.println("Задача № 4");
        System.out.println(Task4.simpleCalculator());

        iScanner.close();
    }
}