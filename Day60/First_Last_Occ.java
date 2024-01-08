package Day60;

import java.util.ArrayList;

public class First_Last_Occ {
    ArrayList<Integer> find(int arr[], int n, int x)
    {
        ArrayList<Integer> ans = new ArrayList<>();
        ans.add(-1);
        ans.add(-1);
        int index = -1;
        int st = 0 ; 
        int en = n-1;
        while(st<=en){
            int mid = st + (en - st) / 2;
            if(arr[mid] == x ){
              index = mid;
              break;
            }
            if(arr[mid] > x){
                en = mid-1;
            }else{
                st = mid+1;
            }
        }
        if (index != -1) {
        int leftIndex = index;
        while (leftIndex >= 0 && arr[leftIndex] == x) {
            ans.set(0, leftIndex);
            leftIndex--;
        }

        int rightIndex = index;
        while (rightIndex < n && arr[rightIndex] == x) {
            ans.set(1, rightIndex);
            rightIndex++;
        }
    }
        
        return ans;
    }
}
