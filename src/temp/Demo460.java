package temp;

import java.util.*;

public class Demo460 {
    private Integer capacity;
    // 缓存值
    private Map<Integer,Integer> arr = new HashMap<>();
    // key是放入的key，value是使用次数
    private Map<Integer,Integer> useTime = new HashMap<>();
    // 针对每个使用次数，存放最近使用的key,key是使用次数，value是每一次的key
    private Map<Integer, Integer> lastkey = new HashMap<>();

    public  Demo460(int capacity){
        this.capacity= capacity;
    }
    public int get(int key) {
        if(useTime.containsKey(key)){
            useTime.put(key,useTime.get(key)+1);
        }else {
            useTime.put(key,1);
        }
        operation(key,useTime.get(key));
        return arr.getOrDefault(key, -1);
    }

    public void put(int key, int value) {
        if(arr.size()<capacity)
            arr.put(key,value);
        else {
            arr.remove(lastkey.get(getNouser()));
            arr.put(key,value);
        }
    }

    public void operation(int key, int times){
        lastkey.replace(times,key);
    }
    public Integer getNouser(){
        List<Map.Entry<Integer, Integer>> list = new ArrayList(useTime.entrySet());
        list.sort(Comparator.comparingInt(Map.Entry::getValue));
        return list.get(0).getKey();
    }

    public static void main(String[] args) {

    }
}
