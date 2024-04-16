package Exercise2;

import java.io.*;


public class Tester {
    public static void main(String[] args) {

        Poem poem1 = new Poem("Future\n","Trynna find right in my wrongs hope my legacy lives on.\n");
        Poem poem2 = new Poem("Eleanor Roosevelt\n","Do one thing every day that scares you.\n");
        Poem poem3 = new Poem("Franklin D. Roosevelt\n","The only thing we have to fear is fear itself.\n");
        try(BufferedWriter br = new BufferedWriter(new FileWriter("poem1.txt"))){
            br.write(poem1.getName() + poem1.getPoet()+ poem2.getName() + poem2.getPoet()+poem3.getName() + poem3.getPoet());

        }catch (IOException e){
            e.printStackTrace();
        }





    }
}
