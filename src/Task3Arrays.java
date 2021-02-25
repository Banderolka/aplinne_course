public class Task3Arrays {

    public static int[] myArray = new int[] {3, 17, 25, 14, 3};


    public static void main(String[] args) {
        System.out.println(myArray[0] + myArray[myArray.length - 3]);
    }

    public static void swap(int[] myArray) {
        int tmp = myArray[0];
        myArray[0] = myArray[myArray.length - 1];
        myArray[myArray.length - 1] = tmp;
    }
}
