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

        //� ������ ������� ������ 1 ��� �������� ������ - �� ����� ��� ������� � ��������
        if (file.length() == 0) {

            PrintWriter pw = new PrintWriter(new FileWriter(file, true));
            pw.println("������ �������� ����� � ������ � ���� ����� ������.");
            pw.flush();
            pw.close();
        }

        // ��������� ��������� ���� � ������
        BufferedReader br = new BufferedReader(new FileReader(file));

        String temp;
        while ((temp = br.readLine()) != null) {
            System.out.println(temp);
        }
        br.close();

    }

}
