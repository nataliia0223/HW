import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Person {
    public static void printMap(Map map) {
        for (Iterator i = map.entrySet().iterator(); i.hasNext();){
            Map.Entry entry = (Map.Entry) i.next();
            System.out.println(entry.getKey() + " "
                    + entry.getValue());
        }
    }

    public static void remove(Map map){
        for (Iterator i = map.entrySet().iterator(); i.hasNext();) {
            Map.Entry entry = (Map.Entry) i.next();
            if ((entry.getValue()).equals("Olha")) {
                i.remove();
            }
        }
    }

    public static void contain(Map map){
        boolean contain = false;
        for (Iterator i = map.entrySet().iterator(); i.hasNext();){
            Map.Entry entry = (Map.Entry) i.next();
            if (map.containsValue(entry.getValue())) {
                contain = true;
            }else{
                contain = false;
            }
        }
        if(contain == true){
            System.out.println("There are at less two persons with the same first name!");
        }else{
            System.out.println("There aren`n at less two persons with the same first name!");
        }
    }
    public static void main(String [] args){
        Map personMap = new HashMap();
        personMap.put("Petrov", "Ivan");
        personMap.put("Konotop", "Nazar");
        personMap.put("Danych", "Ivan");
        personMap.put("Koval", "Nataliia");
        personMap.put("Hrynevych", "Olha");
        personMap.put("Prokulevych", "Mariia");
        personMap.put("Kuk", "Andriana");
        personMap.put("Danylov", "Oleh");
        personMap.put("Iskiv", "Arsen");
        personMap.put("Klymentovych", "Yuliia");

        System.out.println("The full MAP: ");
        printMap(personMap);
        remove(personMap);
        System.out.println("\nThe MAP without person \"Olha\": ");
        printMap(personMap);
        contain(personMap);
    }
}
