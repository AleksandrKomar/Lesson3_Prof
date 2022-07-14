package hometasks.task3;

public class Main {

    public static void main(String[] args) {


        String str = new String("Ќеобходимо создать строку с текстом (текст вз€ть любой из интернета)." +
                " –азбить эту строку на 2 подстроки равной длине и вывести на экран каждое предложени€ с новой строки.");

        System.out.println(str.substring(0, str.length() / 2) + "\n" + str.substring(str.length() / 2));

        System.out.println();
        //данный вариант сделан дл€ корректного разделени€ предложений
        String[] isStr = str.split("\\.");

        for (String temp : isStr) {
            System.out.println(temp.trim() + ".");
        }


    }

}
