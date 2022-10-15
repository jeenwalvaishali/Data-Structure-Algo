/*Given two integers n and k, return an array of all the integers of length n where the difference
between every two consecutive digits is k. You may return the answer in any order.
Note that the integers should not have leading zeros. Integers as 02 and 043 are not allowed.

Input: n = 3, k = 7
Output: [181,292,707,818,929]

Input: n = 2, k = 1
Output: [10,12,21,23,32,34,43,45,54,56,65,67,76,78,87,89,98]
* */

import java.util.ArrayList;
import java.util.List;

public class SameConsecutiveNumber {

    List<Integer> integerArrayList = new ArrayList<>();
    public int[] numsSameConsecDiff(int n, int k) {

        for(int i = 1; i <= 9; i++){
            recursion(i, i, k,n-1);
        }

        int[] arrayIntegers = new int[integerArrayList.size()];

        for(int i = 0; i< integerArrayList.size(); i++){
            arrayIntegers[i] = integerArrayList.get(i);
        }
        return arrayIntegers;
    }

    public void recursion(int i, int num, int k, int n){
        if(n==0){
            if(!integerArrayList.contains(num))
                integerArrayList.add(num);
            return;
        }
        if(i-k>=0){
            recursion(i-k,num * 10 + i -k, k,n-1);
        }
        if(i+k<=9){
            recursion(i+k,num * 10 + i + k, k,n-1);
        }
    }

}
