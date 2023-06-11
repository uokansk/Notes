package exceptions;

/*
Если необходимо, исправьте данный код (задание 2) NullPointerException
 */
public class sem2HW002 {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5, 6,7,8,9,10,11};
        try {
            int d = 5;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("деление на ноль: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("слишком короткий: " + e);
        }
    }

}
