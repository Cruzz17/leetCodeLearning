//import java.util.Stack;
//
//public class Demo155 {
//    private Stack<Integer> stack;
//
//    public Demo155() {
//        stack = new Stack<Integer>;
//    }
//
//    public void push(int x) {
//        if (stack.isEmpty()) {
//            stack.push(x);
//            stack.push(x);
//
//        } else {
//            int temp = stack.peek();
//            stack.push(x);
//            if (temp < x) {
//                stack.push(temp);
//            } else {
//                stack.push(x);
//            }
//        }
//    }
//
//    public void pop() {
//        stack.pop();
//        stack.pop();
//    }
//
//    public int top() {
//        return stack.get(stack.size() - 2);
//    }
//
//    public int getMin() {
//        return stack.peek();
//    }
//}
