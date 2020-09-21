package temp;

import java.util.Arrays;

public class Demo914 {
    public boolean hasGroupsSizeX(int[] deck) {
        if(deck.length<2)
            return false;
        Arrays.sort(deck);
        int X = 0;
        for (int i = 0; i < deck.length-1; i++) {
            if (deck[i+1]!=deck[i] ){
                if(X==0)
                    X=i+1;
                while ((i+1)%X !=0) {
                    return false;
                }

            }
        }
        return deck.length%X==0;
    }

    public static void main(String[] args) {
        Demo914 demo914 = new Demo914();
        int [] a= {1,1,1,1,2,2,2,2,2,2};
        System.out.println(demo914.hasGroupsSizeX(a));
    }
}
