import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.text.DecimalFormat;

public class FinalTask_1 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите курс доллара");
        double dollarRate = Double.parseDouble(reader.readLine());

        System.out.println("Сколько рублей вы хотите поменять?");
        double amountOfRubles = Double.parseDouble(reader.readLine());
        reader.close();

        DecimalFormat f = new DecimalFormat("##.00"); // задаю формат округления

        System.out.println("Итого: " + f.format(amountOfRubles / dollarRate) );
    }
}
