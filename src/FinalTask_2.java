public class FinalTask_2 {
    public static void main(String[] args) {
        String str = "x+5=7";

        // в if две проверки, потому что не понятно х написано латиницей или кириллицей
        // юзер теоретически может ввести и так и так
        if (str.indexOf("x") == 4 || str.indexOf("х") == 4){
            switch (str.charAt(1)){
                case '+':
                    System.out.println("Вывод: " + (Integer.parseInt(String.valueOf(str.charAt(0))) + Integer.parseInt(String.valueOf(str.charAt(2)))));
                    break;
                case '-':
                    System.out.println("Вывод: "  + (Integer.parseInt(String.valueOf(str.charAt(0))) - Integer.parseInt(String.valueOf(str.charAt(2)))));
                    break;
                case '*':
                    System.out.println("Вывод: " + (Integer.parseInt(String.valueOf(str.charAt(0))) * Integer.parseInt(String.valueOf(str.charAt(2)))));
                    break;
                case '/':
                    System.out.println("Вывод: " + (double)(Integer.parseInt(String.valueOf(str.charAt(0))) / Integer.parseInt(String.valueOf(str.charAt(2)))));
                    break;
            }
        }

        if (str.indexOf("x") == 2 || str.indexOf("х") == 2){
            switch (str.charAt(1)){
                case '+':
                    System.out.println("Вывод: " + (Integer.parseInt(String.valueOf(str.charAt(4))) - Integer.parseInt(String.valueOf(str.charAt(0)))));
                    break;
                case '-':
                    System.out.println("Вывод: "  + (Integer.parseInt(String.valueOf(str.charAt(0))) - Integer.parseInt(String.valueOf(str.charAt(4)))));
                    break;
                case '*':
                    System.out.println("Вывод: " + (double)(Integer.parseInt(String.valueOf(str.charAt(4))) / Integer.parseInt(String.valueOf(str.charAt(0)))));
                    break;
                case '/':
                    System.out.println("Вывод: " + (double)(Integer.parseInt(String.valueOf(str.charAt(0))) / Integer.parseInt(String.valueOf(str.charAt(4)))));
                    break;
            }
        }

        if (str.indexOf("x") == 0 || str.indexOf("х") == 0){
            switch (str.charAt(1)){
                case '+':
                    System.out.println("Вывод: " + (Integer.parseInt(String.valueOf(str.charAt(4))) - Integer.parseInt(String.valueOf(str.charAt(2)))));
                    break;
                case '-':
                    System.out.println("Вывод: "  + (Integer.parseInt(String.valueOf(str.charAt(4))) + Integer.parseInt(String.valueOf(str.charAt(2)))));
                    break;
                case '*':
                    System.out.println("Вывод: " + (double)(Integer.parseInt(String.valueOf(str.charAt(4))) / Integer.parseInt(String.valueOf(str.charAt(2)))));
                    break;
                case '/':
                    System.out.println("Вывод: " + (Integer.parseInt(String.valueOf(str.charAt(4))) * Integer.parseInt(String.valueOf(str.charAt(2)))));
                    break;
            }
        }

    }
}
