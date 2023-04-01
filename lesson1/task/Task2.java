package homework.lesson1.task;

/*
Задача 2
Вычислить n! (произведение чисел от 1 до n)
 */
public class Task2 {
    public static double getFactorial(int number) {
        if (number == 1) return 1;
        else return number * getFactorial( number- 1);
    }
}