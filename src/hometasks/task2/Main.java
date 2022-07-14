package hometasks.task2;

import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {

        File file = new File("C:\\Users\\ALexPC\\IdeaProjects\\Lesson3_Prof\\src\\hometasks\\task2\\task2.txt");

        try {
            boolean created = file.createNewFile();
            if (created)
                System.out.println("File has been created");
        } catch (IOException ex) {

            System.out.println(ex.getMessage());
            return;
        }

        //в задаче сказано только 1 раз записать данные - по этому раз записал и считываю
        if (file.length() == 0) {

            PrintWriter pw = new PrintWriter(new FileWriter(file, true));
            pw.println("ѕервое создание файла и запись в него этого текста.");
            pw.flush();
            pw.close();
        }

        // —читываем текстовый файл в пакете
        BufferedReader br = new BufferedReader(new FileReader(file));

        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();

    }

}
