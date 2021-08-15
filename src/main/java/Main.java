import java.util.*;

public class Main {

    public static void main (String[] args) {

        String[] str1 = {"кот", "собака", "весна", "дождь", "дым", "собака", "кот", "ложка", "август", "Рим"};

        ArrayList<String> list = new ArrayList<>(List.of(str1));
        System.out.println(list);

        Set<String> listOfUnique = new HashSet<>(list);
        System.out.println(listOfUnique);
        System.out.println(" Уникальных значений : " + listOfUnique.size());
        for (String s : listOfUnique) {
            System.out.println("Значение  " + s + " : повторяется - " + Collections.frequency(list, s));
        }
        System.out.println("=========================================");
        System.out.println("задание №2");
        System.out.println();

        Phonebook phonebook = new Phonebook();
        phonebook.add("Ivanov", "89276663432");
        phonebook.add("Shishov", "892766634112");
        phonebook.add("Sidorov", "89276664445");
        phonebook.add("Toporov", "89276663876");
        phonebook.add("Gadskih", "89276663454");
        phonebook.add("Shishov", "892766634116");
        phonebook.add("Sidorov", "89276664446");
        phonebook.add("Ivanov", "89276663472");
        phonebook.add("Toporov", "89276662876");


        phonebook.get("Ivanov");


    }
}

