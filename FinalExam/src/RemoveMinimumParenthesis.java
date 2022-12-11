public class RemoveMinimumParenthesis {

    public String removeParenthesis(String str){

        char[] chars = str.toCharArray();
        int count = 0;

          for (int i=0; i<chars.length; i++){
              if (chars[i] == '('){
                  count++;
              }
              if (chars[i] == ')'){
                  if (count > 0){
                      count--;
                  }else {
                      chars[i] = 0;
                  }
              }
          }

           count = 0;
           for (int i=chars.length-1; i>=0; i--){
               if (chars[i] == ')'){
                   count++;
               }
               if (chars[i] == '('){
                   if (count > 0){
                       count--;
                   }else {
                       chars[i] = 0;
                   }
               }
           }


       StringBuilder stringBuilder = new StringBuilder();
       for (char c : chars){
           if (c != 0){
               stringBuilder.append(c);
           }
       }

       return stringBuilder.toString();
    }
}

/*Time Complexity= O(n^2)
*
* Space Complexity= O(n)
* */