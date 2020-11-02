import java.util.HashSet;
import java.util.Set;

public class TaskSet {
    public static Set<String> union(Set <String> set1, Set <String> set2) {
        Set<String> set3 = new HashSet();
        set3.addAll(set1);
        set3.addAll(set2);
        return set3;
    }

    public static Set<String> intersect(Set <String> set1, Set <String> set2) {
        set1.retainAll(set2);
        return set1;
    }

    public static void main(String[] args) {
        Set<String> set1 = new HashSet();
        Set<String> set2 = new HashSet();
        set1.add("a");
        set1.add("b");
        set1.add("c");
        set1.add("d");
        set2.add("a");
        set2.add("m");
        set2.add("n");
        set2.add("d");

        System.out.println("Set1: " + set1);
        System.out.println("Set2: " + set2);
        System.out.println("Union: " + union(set1, set2));
        System.out.println("Intersect: " + intersect(set1, set2));
    }
}
