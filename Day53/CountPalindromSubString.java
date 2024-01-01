package Day53;

public class CountPalindromSubString {
    public int CountPS(String S, int N)
    {
        int count = 0;
        
        for(int i = 0; i<N-1; i++){
            for(int j = i+1; j <=N; j++){
                String temp = S.substring(i, j) ;
                if(temp.length() >= 2 && isPalindrom(temp)){
                    count++;
                }
            }
        }
        
        return count;
    }
    private boolean isPalindrom(String S){
        int st = 0;
        int en = S.length()-1;
        while(en>st){
            if(S.charAt(st) != S.charAt(en)){
                return false;
            }
            en--;
            st++;
        }
        return true;
    }
}
