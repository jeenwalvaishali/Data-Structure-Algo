import java.util.ArrayList;
import java.util.List;

public class Permutation {

    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> permutationList = new ArrayList<>();
        printPermutation(permutationList, new ArrayList<>(), nums);
        return permutationList;
    }

    public void printPermutation(List<List<Integer>> list, List<Integer> temp, int [] nums){
        if(temp.size() == nums.length)
            list.add(new ArrayList<>(temp));
        else {
            for(int i = 0; i < nums.length; ++i) {
                if(temp.contains(nums[i])) {
                    continue;
                }
                temp.add(nums[i]);
                printPermutation(list, temp, nums);
                temp.remove(temp.size() - 1);
            }
        }
    }

}
