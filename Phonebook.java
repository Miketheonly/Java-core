import java.util.ArrayList;
import java.util.HashMap;

public class Phonebook {

//    HashMap<String, ArrayList<String>> hashMap = new HashMap<String, ArrayList<String>>();
//
//    public Phonebook(HashMap<String, ArrayList<String>> hashMap) {
//        this.hashMap = hashMap;
//    }

    private HashMap <String, ArrayList<String>> phonebook;

    public Phonebook() {
        this.phonebook = new HashMap<String, ArrayList<String>>();
    }

    public void add(String name, String tel) {

        //if such entry hasn't yet been created
        if (phonebook.get(name) == null) {
            ArrayList<String> arrayList = new ArrayList();
            arrayList.add(tel);
            phonebook.put(name, arrayList);
        }
        // if such entry already exists
        else {
            phonebook.get(name).add(tel);
        }

    }

    public ArrayList<String> get(String name) {
        if (phonebook.get(name) == null) {
            System.out.println("There is no such entry");
        }
        return phonebook.get(name);

    }
}
