import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Map;

//Enum сделать, римские цыфры и ограничить область вводимых чисел 1-10

public class Calculator {

    public static int add(int a, int b) {
        int res = a + b;
        return res;
    }

    public static int sub(int a, int b) {
        int res = a - b;
        return res;
    }

    public static int div(int a, int b) {
        int res = a / b;
        return res;
    }

    public static int multipl(int a, int b) {
        int res = a * b;
        return res;
    }

    public static void main(String[] args) throws IOException {


        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

        String[] arr = s.split(" ");
        int a;
        int b = 0;

        try {
            a = Integer.parseInt(arr[0]);
            b = Integer.parseInt(arr[2]);
            int result = arifm(a, b, arr);
            System.out.println(result);
        } catch (Exception o) {
            a = 0;
            for (RomeNum x : RomeNum.values()) {
                if (arr[0].equalsIgnoreCase(x.getRome()))
                    a = x.getNum();


                if (arr[2].equalsIgnoreCase(x.getRome()))
                    b = x.getNum();

            }
            int res = arifm(a, b, arr);
            String result = RomeNum.arabicToRoman(res);
            System.out.println(result);
        }

    }


    public static int arifm(int a, int b, String[] arr){
        int result;
        if (a <= 0 || a > 10 || b <= 0 || b > 10) {
            System.out.println("Введены недопустимые значения!");
            System.exit(1);
            result = 0;
        } else {

            switch (arr[1]) {
                case "+":
                    result = add(a, b);
                    break;
                case "-":
                    result = sub(a, b);
                    break;
                case "*":
                    result = multipl(a, b);
                    break;
                case "/":
                    result = div(a, b);
                    break;
                default:
                    result = 0;
            }
        }
        return result;
    }
}

