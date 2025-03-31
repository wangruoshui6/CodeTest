import java.util.HashSet;

public class HashSetExample {
    public static void main(String[] args) {
        HashSet<Object> set =new HashSet<>();
        set.add(1);
        set.add("Asss");
        set.add(null);
        System.out.println("集合的大小"+set.size());
        for (Object o:set) {
            System.out.println(o);
        }
    }
}
