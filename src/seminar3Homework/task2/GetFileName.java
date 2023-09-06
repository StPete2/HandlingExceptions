package seminar3Homework.task2;

import java.util.Scanner;

public class GetFileName {
    Scanner scanner;

    String extension = ".txt";

    public String getFileName(Scanner scanner) {
        System.out.println("Введите имя файла (без расширения): ");
        String fileNamePart = scanner.nextLine();
        return fileNamePart + extension;
    }
}
