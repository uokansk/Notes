package exceptions;
/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных
массива, и возвращающий новый массив, каждый элемент которого равен
разности элементов двух входящих массивов в той же ячейке.
Если длины массивов не равны, необходимо как-то оповестить
пользователя.
 */
import java.util.ArrayList;
import java.util.List;

public class Sem1HW003 {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        int[] arr2 = {7, 6, 5, 4, 3, 2, 1};
        List<Integer> result = differenceArrays(arr1, arr2);
        if (result.size() > 0) {
            System.out.println("Разница массивов " + result);
        } else {
            System.out.println("Длины массивов не равны");
        }
    }

    public static List<Integer> differenceArrays(int[] arr1, int[] arr2) {
        List<Integer> differenceArr = new ArrayList<>();
        if (arr1.length != arr2.length) {
            return differenceArr;
        } else {
            for (int i = 0; i < arr1.length; i++) {
                differenceArr.add(arr1[i] - arr2[i]);
            }
        }
        return differenceArr;
    }

}
