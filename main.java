import java.util.HashMap;

public class main {
    public static void main(String[] args) {

        //#1

        String[] words = {"ugly", "fff", "ggg", "fff", "ugly", "funny", "fff", "desperate", "give", "joke", "health"};

        HashMap<String, Integer> hashMap = new HashMap<String, Integer>();

        for (String word: words) {
            if (hashMap.get(word) == null) {
                hashMap.put(word, 1);
            }
            else  {
                hashMap.put(word, hashMap.get(word) + 1);
            }
        }
        System.out.println(hashMap);

        //#2

        Phonebook phonebook = new Phonebook();
        phonebook.add("James", "12345");
        phonebook.add("James", "1235");
        phonebook.add("Steven", "1345");
        phonebook.add("Jane", "123456");
        phonebook.add("James", "1245");
        System.out.println(phonebook.get("James") + " " + phonebook.get("Jane"));
        System.out.println(phonebook.get("Steve"));


    }
}
