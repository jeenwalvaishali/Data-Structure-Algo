import java.util.ArrayList;
import java.util.List;

/*Given n pairs of parentheses, write a function to generate all combinations of well-formed parentheses.
Input: n = 3
Output: ["((()))","(()())","(())()","()(())","()()()"]

Input: n = 1
Output: ["()"]
* */

public class Parentheses {

    public List<String> generateParenthesis(int n) {
        List<String> list = new ArrayList<>();
        generateAllCombinations("", n, 0, 0, list);
        return list;
    }

    public void generateAllCombinations(String str, int n, int openBracket, int closeBracket, List<String> possibleList) {
        if (str.length () == 2 * n) {
            possibleList.add (str);
        }
        if (openBracket < n) {
            generateAllCombinations(str + '(', n, openBracket + 1, closeBracket, possibleList);
        }
        if (closeBracket < openBracket) {
            generateAllCombinations(str + ')', n, openBracket, closeBracket + 1, possibleList);
        }
    }
}
