package exceptions;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно показаться сообщение, что пустые строки вводить нельзя
 */
public class sem2HW004 {
    public static void main(String[] args) throws Exception {
        System.out.println("Введено " + inputData());
    }

    public static String inputData() throws Exception {
        System.out.println("Введите строку");
        Scanner console = new Scanner(System.in);
        String str = console.nextLine();
        if ("".equals(str)) {
            throw new Exception("Введена пустая строка");
        } else {
            return str;
        }
    }
}
