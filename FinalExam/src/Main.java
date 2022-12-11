import java.util.List;

public class Main {
    public static void main(String[] args) {
       GroupAnagrams groupAnagrams = new GroupAnagrams();
       String[] str = {"eat","tea","tan","ate","nat","bat"};
        List<String> list = groupAnagrams.groupAnagrams(str);
        System.out.println(list);


        NumberOfIslands numberOfIslands = new NumberOfIslands();
//        int[][] grid = {
//                {'1', '1', '1', '1', '0'},
//                {'1', '1', '0', '1', '0'},
//                {'1', '1', '0', '0', '0'},
//                {'0', '0', '0', '0', '0'}
//              };

        int[][] grid = {
                {'1', '1', '0', '0', '0'},
                {'1', '1', '0', '0', '0'},
                {'0', '0', '1', '0', '0'},
                {'0', '0', '0', '1', '1'}
        };

        int output = numberOfIslands.numberOfIslands(grid);
        System.out.println("Output " + output);


        RemoveMinimumParenthesis removeMinimumParenthesis = new RemoveMinimumParenthesis();
        String str1 = "lee(t(c)o)de)";
        String output1 = removeMinimumParenthesis.removeParenthesis(str1);
        System.out.println(output1);


        UniquePath uniquePath = new UniquePath();
        int[][] obstacleGrid = {{0, 0, 0}, {0, 1, 0}, {0, 0, 0}};
        int output3= uniquePath.numberOfPossiblePath(obstacleGrid);
        System.out.println(output3);
    }



}