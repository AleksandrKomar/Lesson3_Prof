package hometasks.task3;

public class Main {

    public static void main(String[] args) {


        String str = new String("���������� ������� ������ � ������� (����� ����� ����� �� ���������)." +
                " ������� ��� ������ �� 2 ��������� ������ ����� � ������� �� ����� ������ ����������� � ����� ������.");

        System.out.println(str.substring(0, str.length() / 2) + "\n" + str.substring(str.length() / 2));

        System.out.println();
        //������ ������� ������ ��� ����������� ���������� �����������
        String[] isStr = str.split("\\.");

        for (String temp : isStr) {
            System.out.println(temp.trim() + ".");
        }


    }

}
