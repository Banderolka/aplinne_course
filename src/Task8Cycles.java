
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task8Cycles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите любое целое положительное число");

        int n = Integer.parseInt(reader.readLine());
        reader.close();

        int count = 0;

        for (int i = 1; i <= n ; i++) {
            if (i%2 !=0 ) count = count + i;
        }
        System.out.println(count);
    }
}
