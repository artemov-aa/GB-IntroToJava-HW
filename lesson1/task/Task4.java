package homework.lesson1.task;

import java.util.Scanner;

/*
Реализовать простой калькулятор
 */
public class Task4 {
    public static double simpleCalculator() {
        Scanner iScanner = new Scanner(System.in);
        double firstNumber = 0;
        double secondNumber = 0;
        String operation = "";
        Double result = null;

        System.out.print("Введите первое число: ");
        firstNumber = iScanner.nextDouble();
        System.out.print("Введите второе число: ");
        secondNumber = iScanner.nextDouble();
        System.out.print("Введите арифметическую операцию (+, -, *, /): ");
        operation = iScanner.next();
        switch (operation){
            case "+":
                result = firstNumber + secondNumber;
                break;
            case "-":
                result = firstNumber - secondNumber;
                break;
            case "*":
                result = firstNumber * secondNumber;
                break;
            case "/":
                result = firstNumber / secondNumber;
            break;
        }

        return result;

    }
}
