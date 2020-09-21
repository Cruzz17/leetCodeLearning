package Backtracking;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Demo17 {
    private static final Map<String,String> keyMap = new HashMap<>();

    List<String> result = new ArrayList<>();

    StringBuilder stringBuilder = new StringBuilder();

    public List<String> letterCombinations(String digits) {
        keyMap.put("2","abc");
        keyMap.put("3","def");
        keyMap.put("4","ghi");
        keyMap.put("5","jkl");
        keyMap.put("6","mno");
        keyMap.put("7","pgrs");
        keyMap.put("8","tuv");
        keyMap.put("9","wxyz");
        return null;
    }
    private void dfs(String digits, int index){

    }
}
