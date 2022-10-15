/*Given an integer array nums of unique elements, return all possible subsets (the power set).
The solution set must not contain duplicate subsets. Return the solution in any order.

Input: nums = [1,2,3]
Output: [[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]

Input: nums = [0]
Output: [[],[0]]
* */

import java.util.ArrayList;
import java.util.List;

public class Subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> listOfSubsets=new ArrayList<>();
        listOfSubsets.add(new ArrayList<>());
        for(int num : nums){
            int size = listOfSubsets.size();
            for(int i = 0; i < size; i++){
                List<Integer> intList = new ArrayList<>(listOfSubsets.get(i));
                intList.add(num);
                listOfSubsets.add(intList);
            }
        }
        return listOfSubsets;
    }
}
