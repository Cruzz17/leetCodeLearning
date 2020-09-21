package everyDay;

public class Demo13 {
    public String compressString(String S) {
        if (S.length() <= 0)
            return "";
        if (S.length() == 1)
            return S;
        int l = 1;
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != S.charAt(i - 1)) {
                result.append(S.charAt(i-1)).append(l);
                l=1;
            }
            else if(i==S.length()-1){
                result.append(S.charAt(i)).append(l+1);
            }else {
                l++;
            }
        }
        if(S.charAt(S.length()-1)!=S.charAt(S.length()-2)){
            result.append(S.charAt(S.length()-1)).append(1);
        }
        return result.toString().length() < S.length() ? result.toString() : S;

    }

    public static void main(String[] args) {
        Demo13 demo13 = new Demo13();
        System.out.println(demo13.compressString("bbbac"));
    }
}
