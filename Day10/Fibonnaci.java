import java.util.Arrays;

public class Fibonnaci {
    public static long[] printFibb(int n) 
    {
        long[] fib = new long[n];
       
        for(int i=0; i<n; i++){
            if(i<2){
                fib[i] = 1;
            }else{
                fib[i] = fib[i-1] + fib[i-2];
            }
        }
        
        return fib;
    }
    public static void main(String[] args) {
        System.out.println(Arrays.toString(printFibb(20)));
    }
}
