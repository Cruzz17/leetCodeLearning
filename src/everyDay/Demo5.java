package everyDay;

import java.util.ArrayList;
import java.util.List;

public class Demo5 {
    public int[] distributeCandies(int candies, int num_people) {
        int start = 1;
        int[] people = new int[num_people];
        while (candies > 0) {
                for (int i = 0; i < people.length; i++) {
                    if(candies==0){
                        break;
                    }
                    else if (candies - start > 0) {
                        candies -= start;
                        people[i] += (start++);
                    } else if (candies <= start) {
                        people[i] += candies;
                        candies = 0;
                    }
                }
        }
        return people;
    }

    /*public void splicCandy(int[] people, int candy, int start) {
        for (int i = 0; i < people.length; i++) {
            if (candy - start > 0) {
                candy-=start;
                people[i] += (start++);
            }else if(candy<=start){
                people[i]+=start;
                 candy=0;
            }
        }
    }*/

    public static void main(String[] args) {
        Demo5 demo5 = new Demo5();
        System.out.println(demo5.distributeCandies(10, 3).toString());
    }
}
