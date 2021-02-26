import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task6PhysicalUnitConverter {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите что переводить: 1 - масса, 2 - расстояние");

        int a = Integer.parseInt(reader.readLine());

       if (a == 1 ) weight();
       else if (a == 2 ) distance();


    }


    /*метод работает с масой */
   public static void weight() throws IOException{
       BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
       System.out.println("Выберите единицу измерения: 1 - килограмм, 2 - стон, 3 - фунт, 4 - унция");

       int unitsOfMeasure = Integer.parseInt(bufferedReader.readLine());

       System.out.println("Введите число");
       double number = Integer.parseInt(bufferedReader.readLine());

       switch (unitsOfMeasure){
           case 1:
               System.out.println("Результат:");
               System.out.println("Килограмм: " + number);
               System.out.println("Стон: " + number * 0.157473);
               System.out.println("Фунты: " + number * 2.20462);
               System.out.println("Унция: " + number * 35.274 );
               break;
           case 2:
               System.out.println("Результат:");
               System.out.println("Килограмм: " + number * 6.35029);
               System.out.println("Стон: " + number );
               System.out.println("Фунты: " + number * 14);
               System.out.println("Унция: " + number * 224 );
               break;
           case 3:
               System.out.println("Результат:");
               System.out.println("Килограмм: " + number * 0.45359);
               System.out.println("Стон: " + number * 0.07143);
               System.out.println("Фунты: " + number );
               System.out.println("Унция: " + number * 16 );
               break;
           case 4:
               System.out.println("Результат:");
               System.out.println("Килограмм: " + number * 0.02835);
               System.out.println("Стон: " + number *0.00446);
               System.out.println("Фунты: " + number * 0.0625);
               System.out.println("Унция: " + number);
               break;
       }


    }

    /*метод работает с растоянием */

    public static void distance() throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Выберите единицу измерения: 1 - метр, 2 - миля, 3 - ярд, 4 - фут");

        int unitsOfMeasure = Integer.parseInt(bufferedReader.readLine());

        System.out.println("Введите число");
        double number = Integer.parseInt(bufferedReader.readLine());

        switch (unitsOfMeasure){
            case 1:
                System.out.println("Результат:");
                System.out.println("Метры: " + number);
                System.out.println("Мили: " + number * 0.00062);
                System.out.println("Ярды: " + number * 1.094);
                System.out.println("Футы: " + number * 3.281 );
                break;
            case 2:
                System.out.println("Результат:");
                System.out.println("Метры: " + number * 1609.34);
                System.out.println("Мили: " + number);
                System.out.println("Ярды: " + number * 1760);
                System.out.println("Футы: " + number * 5280);
                break;
            case 3:
                System.out.println("Результат:");
                System.out.println("Метры: " + number * 0.9144);
                System.out.println("Мили: " + number * 0.00057);
                System.out.println("Ярды: " + number);
                System.out.println("Футы: " + number * 3);
                break;
            case 4:
                System.out.println("Результат:");
                System.out.println("Метры: " + number * 0.3048);
                System.out.println("Мили: " + number * 0.00019);
                System.out.println("Ярды: " + number * 0.33333344);
                System.out.println("Футы: " + number );
                break;
        }

    }
}
