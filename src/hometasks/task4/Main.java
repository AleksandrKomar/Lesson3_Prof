package hometasks.task4;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        //только по такому пути смог считать
        try {
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ALexPC\\IdeaProjects\\Lesson3_Prof\\src\\hometasks\\task4\\task4.txt"));

            String temp;
            while ((temp = br.readLine()) != null) {
                System.out.println(temp);
            }
            br.close();
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
        }

    }

}
