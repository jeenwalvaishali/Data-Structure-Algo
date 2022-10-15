import java.util.ArrayList;
import java.util.List;

public class CombinationSum {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> uniqueCombinationList = new ArrayList<>();
        printCombinationSum(candidates, uniqueCombinationList, new ArrayList<>(), target, 0);
        return uniqueCombinationList;
    }

    private void printCombinationSum(int[] candidates, List<List<Integer>> list , List<Integer> tmp, int target, int i){
        if(target < 0) {
            return;
        }
        else if(target == 0){
            list.add(new ArrayList<>(tmp));
        }
        else{
            while(i<candidates.length){
                tmp.add(candidates[i]);
                printCombinationSum(candidates, list, tmp, target - candidates[i], i++);
                tmp.remove(tmp.size()-1);
            }
        }
    }
}
