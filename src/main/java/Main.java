import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public class Main {
    public static void addPhoneNumber(String key, int value, Map<String, ArrayList<Integer>> map){
        if (map.containsKey(key)) {
            map.get(key).add(value);
        } else {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(value);
            map.put(key, list);
        }
    }
    public static void printPhoneBook(Map<String, ArrayList<Integer>> map){
        for (var item : map.entrySet()) {
            String phones = "";
            for(int el: item.getValue()){
                phones = phones + el + ", ";
            }
            System.out.printf("%s: %s \n", item.getKey(), phones);
        }
    }
    public static void main(String[] args) {
        Map<String, ArrayList<Integer>> phoneBook = new HashMap<>();
        addPhoneNumber("Yana", 898888888, phoneBook);
        addPhoneNumber("Sonya", 598945443, phoneBook);
        addPhoneNumber("Katya", 998898444, phoneBook);
        addPhoneNumber("Nikolay", 655633321, phoneBook);
        addPhoneNumber("Victor", 908454323, phoneBook);
        addPhoneNumber("Petya", 543465309, phoneBook);
        printPhoneBook(phoneBook);
    }
}
