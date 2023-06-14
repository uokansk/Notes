package exceptions;
/*
Напишите приложение, которое будет запрашивать у пользователя следующие данные в произвольном порядке, разделенные пробелом: Фамилия Имя Отчество датарождения номертелефона пол

Форматы данных:
фамилия, имя, отчество - строки
датарождения - строка формата dd.mm.yyyy
номертелефона - целое беззнаковое число без форматирования
пол - символ латиницей f или m.

Приложение должно проверить введенные данные по количеству. Если количество не совпадает с требуемым, вернуть код ошибки, обработать его и показать пользователю сообщение, что он ввел меньше и больше данных, чем требуется.

Приложение должно попытаться распарсить полученные значения и выделить из них требуемые параметры. Если форматы данных не совпадают, нужно бросить исключение, соответствующее типу проблемы. Можно использовать встроенные типы java и создать свои. Исключение должно быть корректно обработано, пользователю выведено сообщение с информацией, что именно неверно.

Если всё введено и обработано верно, должен создаться файл с названием, равным фамилии, в него в одну строку должны записаться полученные данные, вида

<Фамилия><Имя><Отчество><датарождения> <номертелефона><пол>

Однофамильцы должны записаться в один и тот же файл, в отдельные строки.

Не забудьте закрыть соединение с файлом.

При возникновении проблемы с чтением-записью в файл, исключение должно быть корректно обработано, пользователь должен увидеть стектрейс ошибки.
 */

import java.io.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class sem3HM {
    public static void main(String[] args) throws Exception {
        System.out.println(inputData());

    }

    public static String inputData() throws Exception {
//        String text;
        System.out.println("Введите Фамилия Имя Отчество, дата_рождения (dd.mm.yyyy),номер_телефона(8xxxxxxxxxx),пол (f или m): ");
        BufferedReader reader = new BufferedReader(
                new InputStreamReader(System.in));

        String title = reader.readLine();
        reader.close();
        String[] array = title.split(" ");

        if (array.length != 6) {
            throw new Exception("Введено неверное количество параметров");
        } else {
            String surname = array[0];
            String name = array[1];
            String patronymic = array[2];
            SimpleDateFormat format = new SimpleDateFormat("dd.MM.yyyy");

            Date birthdate;
            try {
                birthdate = format.parse(array[3]);
            } catch (ParseException e) {
                throw new ParseException("Неверный формат даты рождения", e.getErrorOffset());
            }
            System.out.println(birthdate);

            long phone;
            try {
                phone = Long.parseLong(array[4]);
            } catch (NumberFormatException e) {
                throw new NumberFormatException("Неверный формат телефона");
            }
            System.out.println(phone);

            String sex = array[5];
            if (!sex.toLowerCase().equals("m") && !sex.toLowerCase().equals("f")) {
                throw new RuntimeException("Неверно введен пол");
            } else {
                String fileName = surname.toLowerCase() + ".txt";
                File file = new File("D:/javaProects/Notes/src/main/java/fileData/" + fileName);
                try {
                    FileWriter fileWriter = new FileWriter(file, true);
                    fileWriter.write(String.format("%s %s %s %s %s %s", surname, name, patronymic, format.format(birthdate), phone, sex  + "\n"));

                    fileWriter.close();
                } catch (IOException e) {
                    throw new IOException("Возникла ошибка при работе с файлом");

                }
            }
        }
        return title;
    }
}
