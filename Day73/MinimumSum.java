package Day73;

import java.util.Arrays;

public class MinimumSum {
    static String solve(int[] arr, int n) {
        // code here
        Arrays.sort(arr);
        
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        
        for(int i = 0; i<n; i++){
            if(i % 2 != 0){
                a = a.append(""+arr[i]);
            }else{
                b = b.append(""+arr[i]);
            }
        }
        
        String sum  = sum (a.reverse(), b.reverse());
        
        return sum;
    }
    
    static String sum(StringBuilder a, StringBuilder b){
        int len = a.length() > b.length() ? a.length() : b.length();
        int carry = 0;
        StringBuilder temp = new StringBuilder();
        int i = 0;
        
        while(i<len || carry != 0){
            int d1 = i >= a.length() ? 0 : Character.getNumericValue(a.charAt(i));
            int d2 = i >= b.length() ? 0 : Character.getNumericValue(b.charAt(i));
            int sum = d1+d2+carry;
            carry = sum/10;
            sum = sum%10;
            temp.append(""+sum);
            ++i;
        }
        temp.reverse();
        
        // trim leading zeros
        i = 0;
        while(i<temp.length() && temp.charAt(i)=='0'){
            i++;
        }
        if(i==temp.length())return "0";
        return temp.toString().substring(i);
    }
}
