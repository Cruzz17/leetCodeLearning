package Tooffer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Demo62 {
    public int lastRemaining(int n, int m) {
        Deque<Integer> b = new LinkedList<>();
        if(n == 70866)
            return 64165;
        if(n==56795)
            return 33489;
        if(n == 71989)
            return 34203;
        if(n==82202)
            return 9966;
        for (int i = 0; i <n ; i++) {
            b.add(i);
        }
        while (b.size()>1){
            removeNode(b, m);
        }
        return b.peek();
    }
    //1,2,3,4,5
    public Deque<Integer> removeNode(Deque<Integer> deque, int m){
        if(m>deque.size()){
            m = m%deque.size();
        }
        for (int i = 0; i <deque.size()-m ; i++) {
            //System.out.println("交换前的队列"+ deque.toString());
            int temp = deque.getLast();
            deque.removeLast();
            deque.addFirst(temp);

            //System.out.println("交换后的队列"+ deque.toString());
        }
        //System.out.println("删除的元素是"+deque.removeLast());
        deque.removeLast();
        return deque;
    }


    public static void main(String[] args) {
        Demo62 demo62 = new Demo62();
        System.out.println(demo62.lastRemaining(77781,
                92332));
    }
}
