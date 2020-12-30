import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        String[] fruit = {"apple", "orange", "melon", "apple", "kiwi", "kiwi", "banana", "kiwi", "pear", "mango", "papaya","banana","pineapple"};
        HashMap<String, Integer> fetus = new HashMap<>();
        for (String x : fruit) {
            fetus.put(x, fetus.getOrDefault(x, 0) + 1);
            System.out.println(fetus);

        }
        Phonebook book = new Phonebook();
        book.addContact("Romanov", "363487");
        book.addContact("Goshina", "870977");
        book.addContact("Kulikova", "544456");
        book.addContact("Romanov", "877765");
        book.addContact("Selifonov", "877737");
        book.addContact("Selifonov", "877733");

        book.findAndPrint("Romanov");
        book.findAndPrint("Selifonov");
        book.findAndPrint("Goshina");

    }

}
