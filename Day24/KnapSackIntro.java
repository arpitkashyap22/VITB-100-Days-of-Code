package Day24;

import java.util.Arrays;
import java.util.Comparator;

class Item {
    int value, weight;
    Item(int x, int y){
        this.value = x;
        this.weight = y;
    }
}



class ItemComparator implements Comparator<Item>{
    
    @Override
    public int compare(Item i1, Item i2){
        double v1 = (double)i1.value / (double)i1.weight;
        double v2 = (double)i2.value / (double)i2.weight;
        if(v1 < v2) return 1;
        else if(v1 > v2) return -1;
        return 0;
    }
}

class KnapSackIntro
{
    //Function to get the maximum total value in the knapsack.
    double fractionalKnapsack(int W, Item arr[], int n) 
    {
        // Brute force - arrange item according to their values in asc order
        // Try to check all possible fraction which gives maximum value
        
        // Better approach - arrange items in dsc order of their value/weight
        // 100/20 = 5 , 120/30 = 4, 60/10 = 6
        // Pick items with more value/weight ratio
        // 60 + 100 + 80 = 240
        
        Arrays.sort(arr, new ItemComparator());
        double val = 0.0;
        int currWeight = 0;
        
        for(Item item : arr){
            // pick whole items
            if(currWeight + item.weight <= W){
                currWeight += item.weight;
                val += item.value;
            }
            // pick fractional items
            else{
                int diff = W - currWeight;
                val += (double)((double)item.value / (double)item.weight) * diff;
                break;
            }
        }
        
        return val;
    }
}