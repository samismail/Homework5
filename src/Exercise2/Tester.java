package Exercise2;

import java.io.*;


public class Tester {
    public static void main(String[] args) {

        Poem poem1 = new Poem("Future\n","Trynna find right in my wrongs hope my legacy lives on.\n");
        Poem poem2 = new Poem("NoCap\n","It's so much of pain in us, always feel like I'm givin' up \n" +
                                "It ain't the same no more, death brought me anger\n");
        Poem poem3 = new Poem("Duvy\n","If they could kill me and you could stop it, would you let 'em?\n" +
                                "It's hard to explain my feelings, this life mean more than letters");
        try(BufferedWriter br = new BufferedWriter(new FileWriter("src/Exercise2/poem1.txt"))){
            br.write(poem1.getName() + poem1.getPoet()+ poem2.getName() + poem2.getPoet()+poem3.getName() + poem3.getPoet());

        }catch (IOException e){
            e.printStackTrace();
        }
    }
}
