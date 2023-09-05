package seminar3Homework.task2;

import java.io.File;
import java.io.IOException;

public class FileManager {
//    create

    public void createFile(String fileName){
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.printf("File %s created", fileName);
            }
            else {
                System.out.printf("File %s already exists", fileName);
            }
        }
        catch (IOException exception) {
            System.out.println("Файл не может быть создан. Возможно, ошибка в имени файла.");
            System.out.println("Проверьте имя файла и введите его заново.");
        }
    }

//    read from file
//    write to file
//    copy one file to another file
}
