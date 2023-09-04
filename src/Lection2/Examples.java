package Lection2;

//import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//import java.util.Collections;
//import java.util.List;

public class Examples {
    public static void main(String[] args) {
// NullPointerException
//        String name = null;
//        System.out.println(name.length());
        //ClassCastException
//        Object object = new String("123");
//        File file = (File) object;
//        System.out.println(file);

//        NumberFormatException
//        String number = "123fq";
//        int result = Integer.parseInt(number);
//        System.out.println(result);
//        UnsupportedOperationException
//        List<Object> emptyList = Collections.emptyList();
//        emptyList.add(new Object());
        FileReader test = null;
        try {
            test = new FileReader("test");
            test.read();
        } catch (RuntimeException | IOException exception) {
            System.out.println("Caught exception" + exception.getClass().getSimpleName());
        } finally {
            System.out.println("Finally started");
            if (test != null){
                try {
                    test.close();
                } catch (IOException exception){
                    System.out.println("Exception while close");
                }
            }
            System.out.println("Finally finished");
        }
    }

}
