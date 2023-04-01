package homework.lesson1.task;

/*
Задача:
Вывести все простые числа от 1 до 1000 простое число - то число которое делится без остатка
только на 1 и на само себя (1 - это не простое число);
 */
public class Task3 {
    public static String getPrimeNumber(int number) {
        String arrOfPrimes = ""; // сюда будем складывать все найденные простые числа
        boolean isPrime = true;
        int i = 0;
        int j = 0;
        for (i = 2; i < number; i++){
            for (j = 2; j < i; j++){
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) arrOfPrimes += " " + i;
            else isPrime = true;
        }

        return arrOfPrimes;
    }
}
