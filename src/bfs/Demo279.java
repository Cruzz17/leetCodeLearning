package bfs;

import com.sun.tools.javac.util.StringUtils;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class Demo279 {
    public int numSquares(int n) {
        Queue<Integer> queue = new LinkedList<>();
        Set<Integer> set =new HashSet<>();
        int depth = 0;
        queue.add(n);
        while (!queue.isEmpty()){
            int size = queue.size();
            depth++;
            for (int i = 0; i <size ; i++) {
                int temp = queue.poll();
                for (int j = 0; j*j <temp ; j++) {
                    int next = temp - j*j;
                    if (next == 0)
                        return depth;
                    if(!set.contains(next)){
                        queue.add(next);
                        set.add(next);
                    }
                }
            }
        }
        return depth;
    }
    public boolean isPalindrome(int x) {
        String s1 = String.valueOf(x);
        int i = 0;
        int j = s1.length()-1;
        while (i<=j){
            if(s1.charAt(i)!=s1.charAt(j))
                return false;
            else {
                i++;j--;}
        }
        return true;
    }

    public static void main(String[] args) {
        Demo279 demo279 = new Demo279();
        System.out.println(demo279.isPalindrome(10));
    }
}
