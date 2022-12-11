import java.util.*;

public class GroupAnagrams {

    public List<String> groupAnagrams(String[] strs){

        Map<String, List> map = new HashMap<>();

        if (strs.length == 0){
            return new ArrayList<>();
        }
        for (String str: strs){
            char[] charArray = str.toCharArray();
            Arrays.sort(charArray);
            String key = String.valueOf(charArray);

            if (!map.containsKey(key)){
                map.put(key, new ArrayList<>());
            }

            map.get(key).add(str);

        }

        return new ArrayList(map.values());
    }
}


/*Time Complexity=  O(Nklogk)
*Space Complexity= O(NK)
* */