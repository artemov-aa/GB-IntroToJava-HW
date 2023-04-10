package homework.lesson2.task;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

/*
1.Реализуйте алгоритм сортировки пузырьком числового массива, результат после каждой итерации запишите в лог-файл.
(через FileWriter).
 */
public class HWTask1 {
    private static void writeToFile(String arg) {
        try (FileWriter in = new FileWriter("logBubbleSort.txt", true)) {
            in.flush();
            in.append(arg);
            in.append('\n');
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static int[] fillArray(int size, int origin, int bound) {

        int[] array = new int[size];
        Random rndElement = new Random();

        for (int i = 0; i < array.length; i++) {
            array[i] = rndElement.nextInt(origin, bound);
        }

        System.out.print("Исходный массив: ");
        System.out.println(Arrays.toString(array));

        return array;
    }
    public static void bubbleSort(int[] array) {

        for (int i = 0; i < array.length - 1; i++) {
            for(int j = 0; j < array.length - i - 1; j++) {
                if(array[j + 1] < array[j]) {
                    int swap = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = swap;
                }
                writeToFile(i + " " + j + " " + Arrays.toString(array));
            }
            writeToFile("\n");
        }

        System.out.print("Отсортированный массив: ");
        System.out.println(Arrays.toString(array));
    }
}
