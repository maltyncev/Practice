package s05.t04;

import java.util.Scanner;

public class T04 {

    public static void main(String[] args) {
        String str = requestString().toUpperCase();
        if (Alphabet.strCheck(str)) {
            int position = Alphabet.getPosition(str);
            System.out.println(str + " - это " + position + "-я буква латинского алфавита");
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
