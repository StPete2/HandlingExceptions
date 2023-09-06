package seminar3Homework.task2;

//import java.nio.file.Paths;
import java.sql.SQLOutput;
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
        FileManager fileManager = new FileManager();

//        System.out.println("Введите имя файла, с которым будете работать: ");
        String fileName = new GetFileName().getFileName(scanner);

        System.out.println("Введите Ваш выбор: ");
        System.out.println("Создать файл: 2, прочитать из файла: 3, записать в файл: 4");
        System.out.println("Скопировать файл целиком в другой: 6");

        while (true){
            String result = scanner.nextLine();
            switch (result){
                case "2":
                    fileManager.createFile(fileName);
                    break;
                case "3":
                    fileManager.readFromFile(fileName);
                    System.out.println("Просмотреть данные? (Y/N): ");
                    String dec1 = scanner.nextLine();
                    if (dec1.equalsIgnoreCase("Y")){
                        fileManager.printFromList(fileManager.readFromFile(fileName));
                    }
                    break;
                case "4":
                    System.out.println("Вы хотите ввести данные с клавиатуры? (Y/N): ");
                    String dec2 = scanner.nextLine();
                    if (dec2.equalsIgnoreCase("Y")){
                        fileManager.writeToFile(new StringList().inputStringArray(scanner), fileName);
                    } else {
                        fileManager.writeToFile(new StringList().createStringArray(), fileName);
                    }
                    break;
//                case "5":
//                    fileManager.printFromList(new StringList().createStringArray());
//                    break;
                case "6":
                    fileManager.copyFile(fileName, new GetFileName().getFileName(scanner));
//                    fileManager.copyFile("12345.txt", "1257");
                    break;
                default:
                    System.out.println("Введите корректную команду!");
                    break;
            }
            System.out.println("Ввести новую команду (Y/N): ");
            String decision = scanner.nextLine();
            if (decision.equalsIgnoreCase("N")){
                break;
            } else {
                System.out.println("Введите Ваш выбор: ");
            }
        }

//        System.out.println(Paths.get("").toAbsolutePath().toString());

        scanner.close();

    }
}
