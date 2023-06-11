package exceptions;

import java.io.*;
import java.util.HashMap;
import java.util.Objects;

/*
Запишите в файл следующие строки:
Анна=4
Елена=5
Марина=6
Владимир=?
Константин=?
Иван=4
Реализуйте метод, который считывает данные из файла и сохраняет в двумерный массив (либо HashMap).
В отдельном методе нужно будет пройти по структуре данных.
Если сохранено значение ?, заменить его на соответствующее число.
Если на каком-то месте встречается символ, отличный от числа или ?, бросить подходящее исключение.
Записать в тот же файл данные с замененными символами ?.
 */
public class sem2task003 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = readData("D:\\javaProects\\Notes\\src\\main\\java\\exceptions\\sem2task003Data.txt");
        writeData("D:\\javaProects\\Notes\\src\\main\\java\\exceptions\\newSem2task003Data.txt", map);

    }

    public static void writeData(String FileName, HashMap<String, Integer> map) {
        try {
            File file = new File(FileName);
            //создаем объект FileReader для объекта File
            FileWriter write = new FileWriter(file);

            for (String name : map.keySet()) {
                int value = map.get(name);
                write.write(name + "=" + value + "\n");
            }
            write.close();
        } catch (IOException e) {
            System.out.println("Ошибка записи");
            ;
        }
    }

    public static HashMap<String, Integer> readData(String Filename) {
        HashMap<String, Integer> map = new HashMap<>();
        try {
            File file = new File(Filename);
            //создаем объект FileReader для объекта File
            FileReader fr = new FileReader(file);
            //создаем BufferedReader с существующего FileReader для построчного считывания
            BufferedReader reader = new BufferedReader(fr);

            // считаем сначала первую строку
            String line = reader.readLine();
            while (line != null) {
                String[] parts = line.split("=");
                System.out.println(line);
                // считываем остальные строки в цикле
                line = reader.readLine();

                int value = 0;
                if (parts[1].equals("?")) {
                    value = parts[0].length();
                } else{
                    try {
                        value = Integer.parseInt(parts[1]);
                    } catch (NumberFormatException e) {
                        throw new IllegalArgumentException("Невнрный формат " + line);
                    }
                }
                map.put(parts[0], value);
            }
            fr.close();
        } catch (FileNotFoundException e) {
//            e.printStackTrace();
            System.out.println("Файл не найден");
        } catch (IOException e) {
            e.printStackTrace();;
        }
        return map;
    }
}
