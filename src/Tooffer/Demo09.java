package Tooffer;

import java.util.Stack;

public class Demo09 {
    Stack<Integer>a;//输入栈
    Stack<Integer>b;//输出栈

    Demo09(){
        a=new Stack<>();
        b=new Stack<>();
    }
    public void appendTail(int value) {
        if(a.isEmpty() && b.isEmpty()){
            a.push(value);
        }else {
            exchange(a,b);
            a.push(value);
            exchange(b,a);
        }
    }

    public int deleteHead() {
        return a.pop();
    }
    public void exchange(Stack<Integer> left,Stack<Integer> right){
        while (!left.empty()){
            right.push(left.pop());
        }
    }

    public static void main(String[] args) {
        Demo09 demo09 =new Demo09();
        demo09.appendTail(1);
        demo09.appendTail(2);
        System.out.println(demo09.deleteHead());
    }
}
