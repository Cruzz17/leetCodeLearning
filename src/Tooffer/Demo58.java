package Tooffer;

public class Demo58 {
    public String reverseLeftWords(String s, int n) {
        return s.substring(n + 1, s.length() - 1) + s.substring(0, n);
    }
    public String reverseWords(String s) {
        String [] strings = s.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = strings.length-1; i >= 0 ; i--) {
            if(strings[i].equals("")){
                continue;
            }
            stringBuilder.append(strings[i]).append(" ");
        }
        return stringBuilder.toString().trim();
    }

    public static void main(String[] args) {
        Demo58 demo58 =new Demo58();
        System.out.println(demo58.reverseWords("a good   example"));
    }
}
