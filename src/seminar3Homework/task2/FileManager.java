package seminar3Homework.task2;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileManager {
//    create

    public void createFile(String fileName){
        try {
            File file = new File(fileName);
            if (file.createNewFile()) {
                System.out.printf("File %s created\n", fileName);
            }
            else {
                System.out.printf("File %s already exists\n", fileName);
            }
        }
        catch (IOException exception) {
            System.out.println("Файл не может быть создан. Возможно, ошибка в имени файла.");
            System.out.println("Проверьте имя файла и введите его заново.");
        }
    }

//    read from file
    public List<String> readFromFile (String fileName) {
        List<String> lines = new ArrayList<>();
        try {
            File file = new File(fileName);
            FileReader fr = new FileReader(file);
            BufferedReader reader = new BufferedReader(fr);
            String line = reader.readLine();
            if (line != null) {
                lines.add(line);
            }
            while (line != null) {
                line = reader.readLine();
                if (line != null) {
                    lines.add(line);
                }
            }
            fr.close();
        } catch (FileNotFoundException exception) {
            System.out.println("Read from file: Файл не существует. Вначале создайте файл, потом считывайте информацию. Причина: " + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("Считывание файла не удалось. Причина: " + exception.getMessage());
        }
        return lines;
    }
// печать данных из arrayList
    public void printFromList (List<String> lines){
        if (!lines.isEmpty()) {
            System.out.println("Ниже осуществляется вывод считанной информации в консоль: ");
            for (String line: lines) {
                System.out.println(line);
            }
        } else {
            System.out.println("Print from file: файл пустой!");
        }
    }


//    write to file
    public void writeToFile (List<String> stringArrayList, String fileName) {
        try (FileWriter writer = new FileWriter(fileName, false)) {

            for (String line : stringArrayList) {
                writer.write(line);
                writer.append('\n');
            }
            writer.flush();
            if (!stringArrayList.isEmpty()) {
                System.out.println("Запись информации в файл проведена успешно!");
            } else {
                System.out.println("Запись не удалалась или произошла запись пустого файла.");
            }
//        } catch (FileNotFoundException exception) {
//            System.out.println("Write to file: Файл не существует. Вначале создайте файл, потом проводите запись. Exception: " + exception.getMessage());
        } catch (IOException exception) {
            System.out.println("Запись не удалась. Причина: " + exception.getMessage());
        }
    }

//    copy one file to another file

    public void copyFile (String fileNameFrom, String fileNameTo) {
//        readFromFile(fileNameFrom);
        writeToFile(readFromFile(fileNameFrom), fileNameTo);
    }
}
