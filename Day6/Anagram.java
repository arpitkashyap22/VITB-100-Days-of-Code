// Given two strings a and b consisting of lowercase characters. The task is to check whether two given strings are an anagram of each other or not. An anagram of a string is another string that contains the same characters, only the order of characters can be different. For example, act and tac are an anagram of each other.

// Note:-

// If the strings are anagrams you have to return True or else return False

// |s| represents the length of string s.


// Example 1:

// Input:a = geeksforgeeks, b = forgeeksgeeks
// Output: YES
// Explanation: Both the string have same characters with
//         same frequency. So, both are anagrams.
package Day6;

public class Anagram {
        public static boolean isAnagram(String a,String b){
            if (a.length() != b.length()) {
                return false;
            }
            
            int arr[] = new int[26];
            for (char ch : a.toCharArray()) {
                arr[ch - 97]++; 
            }

            for (char ch : b.toCharArray()){
                if (arr[ch-97] == 0) {
                    return false;
                }else{
                    arr[ch-97]--;
                }
            }

            for (int i : arr) {
                if(i>0){
                    return false;
                }
            }

            return true;
        }
       
        //public static boolean isAnagram(String a,String b){
        //     if (a.length() != b.length()) {
        //         return false;
        //     }
        //     for (int i = 0; i < a.length(); i++) {
        //         boolean flag = false;
        //         for (int j = 0; j < b.length(); j++) {
        //             if(a.charAt(i) == b.charAt(j)){
        //                 flag = true;
        //                 b = b.substring(0, j) + b.substring(j+1);
        //                 break;
        //             }
        //         }
        //         if (!flag) {
        //             return false;
        //         }
        //     }
        //     return true;
        // }

        public static void main(String[] args) {
            String a = "allergy";
            String b = "allergy";
            System.out.println(isAnagram(a, b));
        }

}
