public class Task12WorkingWithData {
    public static void main(String[] args) {
        String string = "I like Java!!!";

        //сравниваю, если 3 предыдущих условия верны, вывожу данную строку, преобразованную к верхнему регистру.
        if (string.contains("Java") && string.startsWith("I like") && string.endsWith("!!!")) System.out.println(string.toUpperCase());

        //заменяю все символы ‘a’ на ‘о’ и вывожу подстроку “Jovo” на экран
        System.out.println(string.replace('a', 'o').substring(7,11));

    }
}
