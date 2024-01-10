package Day62;

public class Max1Matrix {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int ansRow = -1;
        int maxCount = -1;
        for(int r =0; r<n; r++){
            int count = 0;
            for(int c = 0; c<m; c++){
                if(arr[r][c] == 1)
                    count++;
            }
            
            if(count>0 && count> maxCount){
                maxCount = count;
                ansRow = r;
            }
        }
        return ansRow;
    }
}
