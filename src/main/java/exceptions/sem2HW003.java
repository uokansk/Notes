package exceptions;

//Дан следующий код, исправьте его там, где требуется (задание 3

public class sem2HW003 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 89;
            int b = 10;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = {1, 2};
            abc[3] = 9;
        } catch (ArithmeticException ex) {
            System.out.println("Деление на 0");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        }
    }

    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }
}
