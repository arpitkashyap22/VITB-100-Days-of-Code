package Day25;

public class ThreeWayPartition {
    public void threeWayPartition(int array[], int a, int b)
    {
        // code here 
       int st = 0;
       int en = array.length-1;
       int i = 0;
       
       while(i<=en){
           if(array[i] < a){
               int temp = array[st];
               array[st] = array[i];
               array[i] = temp;
               st++;
               i++;
           }
           
           else if(array[i] > b ){
                int temp = array[en];
               array[en] = array[i];
               array[i] = temp;
               en--;
           }
           else{
               i++;
           }
       }
       
        
    }
}
