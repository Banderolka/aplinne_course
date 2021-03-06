import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task10Cycles {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите сколько в матрице будет строк");
        int str;

        // делаю проверку чтобы длинна массива не была меньшей либо равной 0
        while (true){
            str = Integer.parseInt(reader.readLine());
            if (str <= 0 ){
                System.out.println("Длинна массива не может быть меньше либо равной 0");
            }else {
                break;
            }
        }

        System.out.println("Введите сколько в матрице будет столбцов");
        int column ;

        // делаю проверку чтобы длинна массива не была меньшей либо равной 0
        while (true){
            column = Integer.parseInt(reader.readLine());
            if (column <= 0 ){
                System.out.println("Длинна массива не может быть меньше либо равной 0");
            }else {
                break;
            }
        }

        int[][] matrix = new int[str][column];

        System.out.println("Заполните матрицу");

        //заполняю матрицу
        for (int i = 0; i < column; i++) {
            for (int j = 0; j < str; j++) {
                matrix[j][i] = Integer.parseInt(reader.readLine());
            }
        }

        //вывод первой строки матрицы на экран, где каждый элемент умножается на 3
        for (int j = 0; j < str; j++) {
            System.out.println( matrix[j][0] * 3);
        }
    }

}



