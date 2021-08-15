import java.util.HashMap;
import java.util.Map;

public class Phonebook {
    Map<String, String> phonebook = new HashMap<>();


    public void add (String surname, String number) {
        if (!phonebook.containsKey(number)) {
            phonebook.put(number, surname);
            System.out.printf("Абонент по фамилии %s, c номером %s добавлен\n", surname, number);
        } else {
            System.out.printf("номер %s, уже занят \n", number);
        }

    }

    public void get (String name) {
        for (Map.Entry<String, String> element : phonebook.entrySet()) {
            String key = element.getKey();
            String value = element.getValue();
            if (value.equals(name)) {
                System.out.println("По фамилии " + element.getValue() + " айдены телефоны : " + key);
            }

        }

    }


}
