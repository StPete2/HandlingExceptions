package seminar3Homework.task2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StringList {
    public List<String> createStringArray(){
        List<String> stringArray = new ArrayList<>();
        String str1 = "Test String 1";
        String str2 = "Test String 2";
        String str3 = "Test String 3";
        stringArray.add(str1);
        stringArray.add(str2);
        stringArray.add(str3);
        return stringArray;
    }

    public List<String> inputStringArray(Scanner scanner){
        List<String> stringArray = new ArrayList<>();
        System.out.println("Введите первую строчку: ");
        while (true){
            String str1 = scanner.nextLine();
            if (!str1.isEmpty()){
                stringArray.add(str1);
            }
            System.out.println("Ввести ещё одну строчку? (Y/N)");
            String decision = scanner.nextLine();
            if (decision.equalsIgnoreCase("N")){
                break;
            } else {
                System.out.println("Введите ещё одну строчку: ");
            }
        }
        return stringArray;
    }
}
