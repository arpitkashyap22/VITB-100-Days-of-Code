package Day47;

import java.util.HashMap;

public class MajorityNby2 {
     static int majorityElement(int a[], int size)
    {
        // your code here
        HashMap<Integer,Integer> map = new HashMap<>();
        
        //find frequency and store in a map
        
        for(int i = 0; i<size; i++){
            if(map.containsKey(a[i])){
                map.put(a[i], map.get(a[i]) + 1);
            }else{
                map.put(a[i],1);
            }
            if(map.get(a[i]) > size/2){
                    return a[i];
                }
        }
        
        return -1;
    }
}
