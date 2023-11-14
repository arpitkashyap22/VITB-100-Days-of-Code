package Day4;

import java.util.ArrayList;

public class MaxOfArrSizeK{
   
    public static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0 ; i <= n - k; i++){
            int max = arr[i];
            for(int j = i+1; j < i+k ; j++){
                if(arr[j] > max){
                    max = arr[j];
                }
            }
            list.add(max);
        }

        return list;
    }
    
    
    public static void main(String[] args){
        int arr[] = {1, 2, 3, 1, 4, 5, 2, 3, 6};
        ArrayList<Integer> ans = new ArrayList<>() ;
        ans.addAll( max_of_subarrays( arr, 9, 3));
        System.out.println(ans.toString());
    }
}