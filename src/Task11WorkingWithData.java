import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task11WorkingWithData {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();

        int number = Integer.parseInt(reader.readLine());

        int max = Math.max(Integer.parseInt(str), number); // нахожу максимальное

        System.out.println(max);

        double min = (double)Math.min(Integer.parseInt(str), number); //нахожу минимальное и преобразую в double

        System.out.println(min);

    }
}
