import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        CombinationSum combinationSum = new CombinationSum();
//        int[] candidates = {2,3,6,7};
//        int target = 7;
//        List<List<Integer>> uniqueCombinationList = combinationSum.combinationSum(candidates, target);
//        System.out.println("Output " + uniqueCombinationList);

//        Permutation permutation = new Permutation();
//        int[] nums = {1,2,3};
//        List<List<Integer>> permutationList = permutation.permute(nums);
//        System.out.println("Output " + permutationList);
//

//        PhoneNumber phoneNumber = new PhoneNumber();
//        String digits = "23";
//        List<String> letterComList = phoneNumber.letterCombinations(digits);
//        System.out.println("Output " + letterComList);

//        WordSearch wordSearch = new WordSearch();
//        char[][] boardGrid = {{'A','B','C','E'}, {'S','F','C','S'}, {'A','D','E','E'}};
//        String word = "ABCCED";
//        boolean isWordExist = wordSearch.exist(boardGrid, word);
//        System.out.println("Output " + isWordExist);

//        SameConsecutiveNumber consecutiveNumber= new SameConsecutiveNumber();
//        int n = 3;
//        int k = 7;
//        int[] intArray = consecutiveNumber.numsSameConsecDiff(3,7);
//        System.out.println("Output " + Arrays.toString(intArray));

//        Subsets subsets = new Subsets();
//        int[] nums = {1,2,3};
//        List<List<Integer>> subsetList = subsets.subsets(nums);
//        System.out.println("Output " + subsetList);

        Parentheses parentheses = new Parentheses();
        int n = 3;
        List<String> list =  parentheses.generateParenthesis(n);
        System.out.println("Output " + list);


        
    }
}