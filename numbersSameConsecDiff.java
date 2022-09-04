import java.util.*;

class Solution {
    public int[] numsSameConsecDiff(int n, int k) {
        List<Integer> res = new ArrayList<>();
        
        // Taking all possible cases for first digit from 1-9
        for(int M=1; M<=9; M++)
            solve(M,1,n,k,res);
        
        // Converting List to Array
        int len = res.size();
        int[] arr  = new int[len];
        
        for(int i=0; i<len; i++)
            arr[i] = res.get(i);
        
        return arr;
    }
    
    private void solve(int item, int i, int n, int k, List<Integer> res){
        if(i==n){
            res.add(item);
            return;
        }
        
        // To check for +k and -k results with the last digit
        int a = item % 10;
        
        // If the absolute difference is zero, then should be single recursive call else there will be duplicate values in the result
        if(k == 0){
            int temp = (item*10) + a;
            solve(temp,i+1,n,k,res);
        }
        // Check for +k and -k values and proceed accordingly
        else{
            if((a+k)<=9){
                int temp = (item*10) + (a+k);
                solve(temp,i+1,n,k,res);
            }
            if((a-k)>=0){
                int temp = (item*10) + (a-k);
                solve(temp,i+1,n,k,res);
            }    
        }
    }
    
    public static void main(String[] args) {
        Solution s1 = new Solution();
        int[] res = s1.numsSameConsecDiff(3, 9);

        for(int i=0; i<res.length; i++){
            System.out.print(res[i]);
            System.out.println();
        }
    }
}