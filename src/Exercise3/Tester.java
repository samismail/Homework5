package Exercise3;

import java.io.*;
import java.util.Scanner;

public class Tester {
    public static void main(String[] args) {

        try{
            Scanner scan = new Scanner(new FileReader("src/Exercise3/poem2.txt"));
            while(scan.hasNextLine()){
                String line = scan.nextLine();
                System.out.println(line);
            }
        }catch (FileNotFoundException e){
            e.printStackTrace();
        }
    }
}