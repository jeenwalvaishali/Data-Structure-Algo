import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PhoneNumber {

    public List<String> letterCombinations(String digits) {

        Map<Character, String> phone = new HashMap<Character, String>();
        phone.put('2', "abc");
        phone.put('3', "def");
        phone.put('4', "ghi");
        phone.put('5', "jkl");
        phone.put('6', "mno");
        phone.put('7', "pqrs");
        phone.put('8', "tuv");
        phone.put('9', "wxyz");

        List<String> letterComList = new ArrayList<>();
        if(digits.length() == 0) {
            return letterComList;
        }
        StringBuilder sb = new StringBuilder();
        generateLetterCombination(sb, digits, letterComList, phone, 0);
        return letterComList;
    }

    public void generateLetterCombination(StringBuilder stringBuilder, String digits, List<String> list, Map<Character, String> phone, int start) {
        if(stringBuilder.length() == digits.length()) {
            list.add(stringBuilder.toString());
            return;
        }

        for(int i = start; i < digits.length(); i++) {
            String s = phone.get(digits.charAt(i));
            for(int j = 0; j < s.length(); j++) {
                stringBuilder.append(s.charAt(j));
                generateLetterCombination(stringBuilder, digits, list, phone, i + 1);
                stringBuilder.deleteCharAt(stringBuilder.length() - 1);
            }
        }
    }
}
