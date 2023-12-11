package Day31;

public class CyclicRotateArrby1 {
    public void rotate(int arr[], int n)
    {   int last = arr[n-1];
        for(int i = n-1; i>0;i--){
            arr[i] = arr[i-1];
        }
        arr[0] = last;
    }
}
