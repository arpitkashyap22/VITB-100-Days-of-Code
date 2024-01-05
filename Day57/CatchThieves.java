package Day57;

public class CatchThieves {
    static int catchThieves(char arr[], int n, int k) 
	{ 
        // Code here
        int ans = 0;
        int p =0;
        while(p<n){
            if(arr[p] == 'P'){
                int temp = p-k;
                if(temp <= 0){
                    temp =0;
                }
                while(temp < n && temp<= p+k){
                    if(arr[temp] == 'T'){
                        ans++;
                        arr[temp] = 'A';
                        break;
                    }
                    temp++;
                }
            }
            p++;
        }
        return ans;
	} 
}
