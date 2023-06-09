package exceptions;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
только значение 0 или 1.
Если нарушается одно из условий, метод должен вернуть код ошибки.
Программа должна корректно обработать код ошибки и вывести соответствующее
сообщение пользователю.
Сравнить такой вариант обработки исключений с предыдущим.
Какое преимущество у исключений перед
кодами ошибок вы можете назвать в данном случае?
 */
public class Sem1Task003 {
    public static void main(String[] args) {
        int[][] twoDimArray = {{0, 0, 1}, {0, 0, 1, 1}, {1, 1, 1, 1}, {1, 0, 1, 1}};
        int result = summaArr(twoDimArray);
        if (result == -1) {
            System.out.println("Массив не квадратный");
        } else if (result == -2) {
            System.out.println("Есть что - то кроме 0 или 1");
        } else {
            System.out.printf("Сумма элементов в мвссиве = %d", result);
        }

    }

    public static int summaArr(int[][] twoDimArray) {
        int summaEl = 0;
        for (int[] row : twoDimArray) {
            if (twoDimArray.length != row.length) {
                return -1;
//                throw new RuntimeException("Массив не квадратный");
            }
        }

        for (int[] row : twoDimArray) {
            for (int value : row) {
                summaEl += value;
                if (value != 0 && value != 1) {
                    return -2;
//                    throw new RuntimeException("Есть что- то кроме 0 или 1");
                }
            }
        }

//        for (int[] ints : twoDimArray) {
//            for (int value: ints) {
//                summaEl = summaEl + value;
//            }
//        }
        return summaEl;
    }
}
