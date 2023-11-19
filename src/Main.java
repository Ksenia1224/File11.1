import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) throws Exception {
        try (FileReader br = new FileReader("E:\\notes.txt")) {
            Scanner scanner = new Scanner(br);
            List<String> fileLines = new ArrayList<>();
            while (scanner.hasNextLine()) {
                fileLines.add(scanner.nextLine());
            }
            System.out.println("В файле" + fileLines.size() + "строк");//
                int i=1;
            for (String s:fileLines) {
                System.out.println("В строке " + i+ " количество символов " + s.length());
                String[] str = s.split(" ");
                int j=0;
                for (String s1:str) {
                    j=s1.length()>0?++j:j;
                }
                i++;
            }

        }catch (IOException ex) {
                System.out.println(ex.getMessage());
            }
        }

    }

