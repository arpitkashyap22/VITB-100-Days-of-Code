package Day19;

public class Median2SortedArray {
    static double medianOfArrays(int n, int m, int a[], int b[]) 
    {
        // Your Code Here
        int total = m+n;
        int arr[] = new int[total];
        int st1 = 0;
        int st2 = 0;
        int i = 0;
        while((st1 < n && st2 < m)){
            if(a[st1] < b[st2]){
                arr[i] = a[st1];
                st1++;
            }else{
                arr[i] = b[st2];
                st2++;
            }
            i++;
        }
        
        while(st2<m){
            arr[i] = b[st2];
            i++;
            st2++;
        }
            
        while(st1<n){
            arr[i] = a[st1];
            i++;
            st1++;
        }
        
    
        if(total % 2 == 0 ){
            return (arr[(total/2)] + arr[(total/2) -1]) / 2.0;
        }
        return arr[(total/2)];
        
        
    }


    public static void main(String[] args) {
        int[] a = {4,6};
        int[] b = {1,2,3,5};
        System.out.println(medianOfArrays(a.length, b.length, a, b));
    }
}
