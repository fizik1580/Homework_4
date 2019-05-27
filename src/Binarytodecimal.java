import java.util.Scanner;

public class Binarytodecimal{

    public static void main(String args[]) {

                // Program info

        System.out.println("Ввести с консоли число в бинарном формате. Перевести его в int и вывести на экран");

                // Data processing

        String binary;
        int res = 0;
        boolean succes_flag = true;

        do {


            try {

                Scanner scan = new Scanner(System.in);
                System.out.print("Введите число в бинарном формате: ");
                binary = scan.next();

                res = Integer.parseInt(binary, 2);

                System.out.println("Результат: " + res);

                break;

            } catch (java.lang.NumberFormatException e) {

                System.out.println("Ошибка ввода: java.lang.NumberFormatException");

            }

        } while (succes_flag);

    }

}
