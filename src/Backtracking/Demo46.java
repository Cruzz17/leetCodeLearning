package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class Demo46 {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        int[] visited = new int[nums.length];
        backtracking(nums, res, new ArrayList<Integer>(), visited);
        return res;
    }

    private void backtracking(int[] nums, List<List<Integer>> res, List<Integer> temp, int[] visited) {
        if(temp.size() == nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for (int i = 0; i <nums.length ; i++) {
            if(visited[i]==1) continue;
            visited[i]=1;
            temp.add(nums[i]);
            backtracking(nums,res,temp,visited);
            visited[i]=0;
            temp.remove(temp.size()-1);
        }
    }
}
