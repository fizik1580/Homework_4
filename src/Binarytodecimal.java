import java.util.Scanner;

public class Binarytodecimal {

    static int last_bite, decimal_output = 0;

    public static void main(String[] args) {

                // Program info

        System.out.println("Ввести с консоли число в бинарном формате. Перевести его в int и вывести на экран");

                // Data processing

        int main_bin_Input;

        System.out.print("Введите число в бинарном представлении: ");
        Scanner scan = new Scanner(System.in);
        main_bin_Input = scan.nextInt();

        System.out.println("Число в десятичном представлении: " + recursive_bintodec(main_bin_Input, 0));
    }

            // Recursive void

    public static int recursive_bintodec(int binary_input, int count_input) {

        if (binary_input > 0) {

            last_bite = binary_input&1;
            binary_input = binary_input / 10;
            decimal_output = decimal_output + (last_bite << count_input);

            return recursive_bintodec(binary_input, ++count_input);

        }

        return decimal_output;

    }

}
