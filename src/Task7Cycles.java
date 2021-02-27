import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task7Cycles {

    //задаю константы
    static int x = 5;
    static int y = 7;
    static int z = 13;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите длину массива");
        int sizeArray;

        // делаю проверку чтобы дляна массива не была меньшей либо равной 0
        while (true){
             sizeArray = Integer.parseInt(reader.readLine());
            if (sizeArray <=0 ){
                System.out.println("Длина массива не может быть меньше либо равной 0");
            }else {
                break;
            }
        }

        int[] ints = new int[sizeArray]; // инициализирую массив

        System.out.println("Заполните массив числами");

        // заполняю массив
        for (int i = 0; i < ints.length; i++) {
            ints[i] = Integer.parseInt(reader.readLine());
        }

        // проверяю массив на наличие констант
        for (int perebor: ints){
            if (perebor == x || perebor == y || perebor == z ){
                System.out.println("Данное значение имеется в константах");
                break;
            }
        }




    }
}
