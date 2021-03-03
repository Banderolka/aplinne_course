import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Task13WorkingWithData {
    public static void main(String[] args) {
        String str = "I love java 8 Я люблю java 14 core1";

        //задаю регулятное выражение
       Pattern pattern = Pattern.compile("[A-Za-z]{1,}\\s");
       Matcher matcher = pattern.matcher(str);


        List<String> stringList = new ArrayList<>(); // создаю лист для хранения отсортировных данных
        while (matcher.find()) {
           stringList.add(str.substring(matcher.start(), matcher.end())); // сортирую данные соглачно условию и сохраняю в лист
       }

       System.out.println(stringList.size());

        for (String x: stringList){
            System.out.println(x);
        }


    }
}


