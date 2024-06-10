import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int[] newArray = new int[accounts.length];
        
        for(int i=0; i<accounts.length; i++){
            for(int j=0; j<accounts[i].length; j++){
                newArray[i] += accounts[i][j];
            }
        }
        
        Arrays.sort(newArray);
        return newArray[newArray.length-1];
        
    }
}