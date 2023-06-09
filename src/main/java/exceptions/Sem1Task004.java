package exceptions;

import java.util.ArrayList;
import java.util.List;

/*
Реализуйте метод checkArray(Integer[] arr), принимающий в качестве аргумента
целочисленный одномерный массив.
Метод должен пройтись по каждому элементу и проверить что он не равен null.
А теперь реализуйте следующую логику:
1. Если в какой-то ячейке встретился null, то необходимо “оповестить” об этом
пользователя
2. Если null’ы встретились в нескольких ячейках, то идеально было бы все их
“подсветить”
 */
public class Sem1Task004 {
    public static void main(String[] args) {
        Integer[] arr = {1, 2, 3, 4, 5, 6, 7};
        List<Integer> result = checkArray(arr);
        if (result.size()>0){
            System.out.println("Массив содержит null в ячейках %d " + result);
        }else {
            System.out.println("Массив не содержит null");
        }
    }

    public static List<Integer> checkArray(Integer[] arr) {
        List<Integer> nullIndexes = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == null) {
                nullIndexes.add(i);
            }
        }
        return nullIndexes;
    }
}
