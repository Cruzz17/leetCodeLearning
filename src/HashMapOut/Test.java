package HashMapOut;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Test {
    public static void main(String[] args) {
        Map map=new HashMap();
        Set keyset=map.keySet();
        Iterator iterator=keyset.iterator();
        while (iterator.hasNext()){
            Object key=iterator.next();
            Object value=map.get(key);
        }

    }
    public static void IteratorOne(Map<Integer,Integer> map){
        Set<Map.Entry<Integer,Integer>>set=map.entrySet();
        for(Map.Entry<Integer,Integer> entry1:set){
            entry1.getValue();
            entry1.getKey();
        }
    }
}
