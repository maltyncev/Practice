package s05;

import java.util.Scanner;

public class T04 {

    public static void main(String[] args) {
        String name = requestString();
        Alphabet letter = Alphabet.valueOf(name);
        int index = letter.ordinal() + 1;
        System.out.println(name + " - это " + index + "-я буква латинского алфавита");
    }


    static String requestString() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите букву латинского алфавита: ");
        return scanner.nextLine();
    }
}
