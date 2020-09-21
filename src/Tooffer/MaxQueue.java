package Tooffer;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class MaxQueue {

    Queue<Integer> a;//输入队列
    PriorityQueue<Integer> b;//输出队列

    public MaxQueue() {
        a = new LinkedList<>();
        Comparator<Integer> comparator = Comparator.comparingInt(x -> x);
        b = new PriorityQueue<>(comparator.reversed());
    }

    public int max_value() {
        return b.isEmpty() ? -1 : b.peek();
    }

    public void push_back(int value) {
        a.offer(value);
        b.offer(value);
    }

    public int pop_front() {
        if (a.isEmpty())
            return 0;
        else {
            b.remove(a.peek());
            return a.poll();
        }
    }
}

