package seminar3Homework.task2;

//import java.nio.file.Paths;
import java.util.Scanner;

//Задача 2: Файловый менеджер (ООП, исключения)
//
// Создайте класс FileManager. Этот класс должен иметь методы для выполнения основных операций
// с файлами: чтение, запись и копирование. Каждый из этих методов должен выбрасывать
// соответствующее исключение, если в процессе выполнения операции произошла ошибка
// (например, FileNotFoundException, если файл не найден).
public class FileManagerApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите имя файла: ");
        String fileNamePart = scanner.nextLine();

        GetFileName fileNameInter = new GetFileName(fileNamePart);
        String fileName = fileNameInter.getFileName();

        FileManager fileManager = new FileManager();
        fileManager.createFile(fileName);

//        System.out.println(Paths.get("").toAbsolutePath().toString());

        scanner.close();

    }
}
