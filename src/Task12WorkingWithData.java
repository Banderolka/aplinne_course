public class Task12WorkingWithData {
    public static void main(String[] args) {
        String string = "I like Java!!!";

        //проверяю, содержит ли "I like Java!!!" подстроку "Java"
        boolean contains = string.contains("Java");

        //проверяю, начинается ли строка "I like Java!!!" с подстроки “I like”
        boolean start = string.startsWith("I like");

        //проверяю, заканчивается ли строка "I like Java!!!" с подставки “!!!”
        boolean end = string.endsWith("!!!");

        //сравниваю, если 3 предыдущих условия верны, вывожу данную строку, преобразованную к верхнему регистру.
        if (contains == true && start == true && end == true) System.out.println(string.toUpperCase());

        //заменяю все символы ‘a’ на ‘о’ и вывожу подстроку “Jovo” на экран
        System.out.println(string.replace('a', 'o').substring(7,11));

    }
}
