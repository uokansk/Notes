package exceptions;

import java.util.ArrayList;
import java.util.List;

/*
Реализуйте метод, принимающий в качестве аргументов два целочисленных
массива, и возвращающий новый массив, каждый элемент которого равен
частному элементов двух входящих массивов в той же ячейке. Если длины
массивов не равны, необходимо как-то оповестить пользователя.
 */
public class Sem1HW004 {
    public static void main(String[] args) {
        float[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        float[] arr2 = {7, 6, 5, 4, 3, 2, 0};
        List<Float> result = divisionArrays(arr1, arr2);
        System.out.println("Разница массивов " + result);

    }

    public static List<Float> divisionArrays(float[] arr1, float[] arr2) {
        List<Float> divisionArr = new ArrayList<>();
        if (arr1.length != arr2.length) {
            throw new RuntimeException("Длины массивов не равны");
        } else {
            for (int i = 0; i < arr1.length; i++) {
                if (arr2[i] == 0) {
                    throw new RuntimeException("Деление на ноль невозможно");
                }
                float a = arr1[i] / arr2[i];
                divisionArr.add(a);
            }
        }
        return divisionArr;
    }
}
