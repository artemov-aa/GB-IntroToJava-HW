package homework.lesson1.task;
/*
Задача:
Вычислить n-ое треугольного число (сумма чисел от 1 до n)
 */
public class Task1 {
    public static int getTNumber(int n) {
        int tNumber = 0;
        for (int i = 1; i <= n; i++){
            tNumber += i;
        }

        return tNumber;
    }
}
