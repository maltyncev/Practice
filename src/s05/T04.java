package s05;

import java.util.Arrays;
import java.util.Scanner;

public class T04 {

    public static void main(String[] args) {
        String str = requestString().toUpperCase();
        if (Alphabet.strCheck(str)) {
            int index = Alphabet.getIndex(str);
            //System.out.println(str + " - это " + index + "-я буква латинского алфавита");
        } else {
            System.out.println("Введенный символ не является буквой латинского алфавита");
        }
    }

    static String requestString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите букву латинского алфавита: ");
        return scanner.nextLine();
    }
}
