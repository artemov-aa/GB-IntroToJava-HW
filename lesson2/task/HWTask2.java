package homework.lesson2.task;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/*
Дана строка json:
[{"фамилия":"Иванов","оценка":"5","предмет":"Математика"}, {"фамилия":"Петрова","оценка":"4","предмет":"Информатика"}, {"фамилия":"Краснов","оценка":"5","предмет":"Физика"}]
Написать метод, который распарсит этот текст и, используя StringBuilder, создаст строки вида:
Студент [фамилия] получил [оценка] по предмету [предмет]. Например:
Студент Иванов получил 5 по предмету Математика.
Студент Петрова получил 4 по предмету Информатика.
Студент Краснов получил 5 по предмету Физика.
 */
public class HWTask2 {

    public static String readFromFile(String fileName) {

        try {
            File file = new File(fileName);
            FileReader fileReader = new FileReader(file);
            BufferedReader reader = new BufferedReader(fileReader);
            return reader.readLine();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    public static void parseString(String arg) {
        // Разделяем исходную строку и создаем массив строк, содержащий элементы вида:
        // {"фамилия":"Иванов","оценка":"5","предмет":"Математика"}
        String[] strArray = arg.split(", ");

        // Разделяем каждый элемент полученного массива и создаем массив строк, содержащий элементы вида:
        // "фамилия":"Иванов"
        // "оценка":"5"
        // "предмет":"Математика" и т.д.
        ArrayList <String> arrayList = new ArrayList<>();
        for (String element: strArray) {
            arrayList.addAll(List.of(element.split(",")));
        }

        int count = 1;
        for (String element: arrayList) {
            String[] buffer = element.split(":");
            switch (count){
                case 1:
                    System.out.print("Студент " + buffer[1].substring(1, buffer[1].length() - 1)); // Отбрасываем кавычки
                    count++;
                    break;
                case 2:
                    System.out.print(" получил "+ buffer[1].substring(1, buffer[1].length() - 1)); // Отбрасываем кавычки
                    count++;
                    break;
                case 3:
                    System.out.println(" по предмету "+ buffer[1].substring(1, buffer[1].length() - 2)); // Отбрасываем кавычки и закрывающую фигурную скобку
                    count = 1;
                    break;
            }
        }
    }
}
