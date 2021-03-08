import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class FinalTask_3 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите количество строк");
        int a = Integer.parseInt(reader.readLine());

        List<String> stringList = new ArrayList<>(); // коллекция для хранения стрингов

        System.out.println("Введите сами строки");
        for (int i = 0; i < a; i++) {
            stringList.add(reader.readLine());
        }
        reader.close();      

       
        List<Integer> integerList = new ArrayList<>(); // коллекция для хранения скол-во повторений
        int coutn = 0;

        //подчитываем кол-во повторений в каждой стринге
        for (int i = 0; i < a; i++) {
            for (int j = 1; j < stringList.get(i).toCharArray().length; j++) {
                for (int k = 0; k < stringList.get(i).toCharArray().length; k++) {
                    if (stringList.get(i).toCharArray()[j - 1] == stringList.get(i).toCharArray()[k] && j - 1 != k)
                        coutn++;


                }

            }
            integerList.add(i, coutn);
            coutn = 0;
        }

        int min = 0;


        for (int i = 0; i < integerList.size() - 1; i++) {
            min = integerList.get(i);
            if (min > integerList.get(i + 1)){
                min = integerList.get(i + 1);

                System.out.println(min + " ");
            }
        }

        System.out.println(stringList.get(integerList.indexOf(min)));




    }
}

