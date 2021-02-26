import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5Operators {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите два числа");
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());

        System.out.println("Введите арифиметический оператор");
        String str = reader.readLine();

        if (str.equals("+")) System.out.println(a + b);
        else if (str.equals("-")) System.out.println(a - b);
        else if (str.equals("*")) System.out.println(a * b);
        else if (str.equals("/")) System.out.println(a / b);
    }
}
