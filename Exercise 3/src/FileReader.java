import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FileReader{

public static ArrayList<String> fileOfWordsReader(){
    File file = new File("Exercise 3/HCAHistorie");
    ArrayList<String> words= new ArrayList<String>();
    String line = " ";
    String [] stringarray = new String[1];

    try{
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine()){
            line = scanner.nextLine();
            stringarray = line.split(" ");

            for (int i = 0; i < stringarray.length; i++) {
                words.add(stringarray[i]);
            }

        }
    }catch (FileNotFoundException e) {
        e.printStackTrace();
    }
    return words;
}

    public static void main(String[] args) {
        System.out.println(fileOfWordsReader().size());
    }
}
