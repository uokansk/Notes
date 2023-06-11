package exceptions;

/*
Обработайте возможные исключительные ситуации. “Битые” значения в исходном массиве считайте нулями.
Можно внести в код правки, которые считаете необходимыми.
*/
public class sem2task002 {
    public static void main(String[] args) {
        String[][] arr = {{"a", "1", "1", "1", "1", "1"}, {"1", "1", "1", "1", "1", "1"}, {"1", "1", "1", "1", "1", "1"}, {"1", "1", "1", "1", "1", "1"}, {"1", "1", "1", "1", "1", "1"}};
        System.out.println(sum2d(arr));

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                int val = tryParseInt(arr[i][j]);
                sum += val;
            }
        }
        return sum;
    }
    public static int tryParseInt(String a){
        try {
            return Integer.parseInt(a);
        }
        catch (NumberFormatException e){
            return 0;
        }
    }
}
