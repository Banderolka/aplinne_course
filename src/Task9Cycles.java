import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task9Cycles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите длину массива");
        int sizeArray;

        // делаю проверку чтобы длинна массива не была меньшей либо равной 0
        while (true){
            sizeArray = Integer.parseInt(reader.readLine());
            if (sizeArray <=0 ){
                System.out.println("Длинна массива не может быть меньше либо равной 0");
            }else {
                break;
            }
        }


        double[] doubles = new double[sizeArray]; // инициализирую массив

        double count = 0; //создаю переменную для подчёта суммы елементов массива

        System.out.println("Заполните массив ");

        // заполняю массив и нахожу сумму елементов масива
        for (int i = 0; i < doubles.length; i++) {
            doubles[i] = Double.parseDouble(reader.readLine());
            count = count + doubles[i];
        }

        count = count/sizeArray; //нахожу среднее арифмитическое


        // вывод массива на экран, где каждый элемент массива умножается на среднее арифметическое
        for (double x: doubles){
            System.out.println(x * count);
        }




    }
}
