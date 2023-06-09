package exceptions;

/*
Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
Необходимо посчитать и вернуть сумму элементов этого массива.
При этом накладываем на метод 2 ограничения: метод может работать только с
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать
только значение 0 или 1.
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об
ошибке.
 */
public class Sem1Task002 {
    public static void main(String[] args) {
        int[][] twoDimArray = {{1, 0, 0, 1}, {0, 0, 1, 1}, {1, 1, 1, 1}, {1, 0, 1, 1}};
        int result = summaArr(twoDimArray);
        System.out.printf("Сумма элементов в мвссиве = %d", result);
    }

    public static int summaArr(int[][] twoDimArray) {
        int summaEl = 0;
        for (int[] row : twoDimArray) {
            if (twoDimArray.length != row.length) {
                throw new RuntimeException("Массив не квадратный");
            }
        }

        for (int[] row : twoDimArray) {
            for (int value : row) {
                summaEl += value;
                if (value != 0 && value != 1) {
                    throw new RuntimeException("Есть что- то кроме 0 или 1");
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
