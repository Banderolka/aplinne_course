import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Task14WorkingWithData {
    public static void main(String[] args) {
        Random random = new Random();

        int[] array = new int[15];

    // заполняю массив  рандомными значениями в диапазоне от -20 до 20
        for (int i = 0; i < 15; i++) {
            boolean a = random.nextBoolean();
            if (a == false) {
                array[i] = random.nextInt(20)*(-1);
            }else {
                array[i] = random.nextInt(20);
            }
        }

        int min = array[0];
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < min) min = array[i]; // нахожу миниальное занчение в массивве
            if (array[i] > max) max = array[i]; // нахожу максимальное значение в массиве
        }

        System.out.println("Минимальное значение: " + min  + "\nМаксимальное значение: " + max );

        //нахожу наибольшее по модулю и ввывожу в консоль
        System.out.println("Наибольшее по модулю: " + Math.max( Math.abs(min), Math.abs(max)));
    }
}
