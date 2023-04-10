package homework.lesson2;

import homework.lesson2.task.HWTask1;
import homework.lesson2.task.HWTask2;

public class Main {
    public static void main(String[] args) {
        System.out.println("\n Задача № 1");
        HWTask1.bubbleSort(HWTask1.fillArray(10, 0, 99));
        System.out.println("\n Задача № 2");
        HWTask2.parseString(HWTask2.readFromFile("test.json"));
    }
}