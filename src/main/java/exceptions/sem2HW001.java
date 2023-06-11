package exceptions;

import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */
public class sem2HW001 {
    public static void main(String[] args) {
        Float inputNumber = inputFloat();
        System.out.println(inputNumber);

    }
    public static Float inputFloat(){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите десятичное число: ");
        while (!scanner.hasNextFloat()){
            scanner.nextLine();
            System.out.println("Это не десятичное число!");
        }
        return scanner.nextFloat();
    }

}
