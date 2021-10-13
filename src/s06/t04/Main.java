package s06.t04;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку: ");
        String message = scanner.nextLine();

        LongWordHandler longWordHandler = new LongWordHandler(2,3);
        System.out.println(longWordHandler.handleMessage(message));
    }
}
