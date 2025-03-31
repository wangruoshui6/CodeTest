import java.util.HashMap;
import java.util.Map;

public class MapAndList {
    public static void main(String[]args) {
        Map<Integer, Integer> map=new HashMap<Integer, Integer>();
        map.put(1, 2);
        map.put(2, 1);
        map.put(3, 100);
        int x=map.get(1);
        int y=map.get(2);
        //size()返回key-value 组数
        int z=map.size();
        int k=map.getOrDefault(3, -1);
        System.out.println(x);
        System.out.println(y);
        System.out.println(z);
        System.out.println(k);

    }
    }


