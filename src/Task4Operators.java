import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task4Operators {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите 3 числа");
        int x = Integer.parseInt(reader.readLine());
        int y = Integer.parseInt(reader.readLine());
        int z = Integer.parseInt(reader.readLine());

        double average = (x + y + z)/3;

        System.out.println("Среднее арифметическое равно: " + average);

        if ((int)(average/2) > 3) System.out.println("Программа выполнена корректно");

    }

}
