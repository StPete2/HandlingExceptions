package seminar3Homework.task2;

import java.util.Scanner;

public class GetFileName {
    String fileNamePart;

    public GetFileName(String fileNamePart) {
        this.fileNamePart = fileNamePart;
    }
    String extension = ".txt";

    public String getFileName() {
        return fileNamePart+ extension;
    }
}
