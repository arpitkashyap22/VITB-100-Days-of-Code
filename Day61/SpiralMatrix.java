package Day61;

import java.util.ArrayList;

public class SpiralMatrix {
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
        // code here 
       ArrayList<Integer> ans = new ArrayList<>();
       int top = 0, right = c-1;
       int bottom = r-1, left = 0;
       
       while(bottom>=top && left<=right){
           for(int i = left; i<=right; i++){
               ans.add(matrix[left][i]);
           }
           top++;
           for(int i = top; i <= bottom; i++ ){
               ans.add(matrix[i][right]);
           }
           right--;
           if(top<=bottom){
               for(int i = right; i>=left; i--){
               ans.add(matrix[bottom][i]);
                }
                bottom--;
            }
            if (left <= right) { 
            for (int i = bottom; i >= top; i--) {
                ans.add(matrix[i][left]);
                }
            left++;
            }
       }
       return ans;
}

}