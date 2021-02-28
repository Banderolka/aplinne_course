import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class FinalTask_4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

       System.out.println("Отгадай загадку \nСидит дед, во сто шуб одет, кто его раздевает, тот слезы проливает");

       String attempt;
       int count = 0;

        for (int i = 0; i < 4; i++) {
            attempt = reader.readLine();
            if (attempt.equalsIgnoreCase("Заархивированный вирус")){
                System.out.println("Правильно!");
                break;
            }else if (!attempt.equalsIgnoreCase("Заархивированный вирус") && count < 2){
                System.out.println("Подумай ещё!");
                count++;
            }else if (!attempt.equalsIgnoreCase("Заархивированный вирус") && count == 2){
                System.out.println("Обидно, приходи в другой раз");
                break;
            }

        }
    }
}
