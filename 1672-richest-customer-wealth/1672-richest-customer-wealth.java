import java.util.Arrays;

class Solution {
    public int maximumWealth(int[][] accounts) {
        
        int maxWealth = Integer.MIN_VALUE;
        
        for (int[] account : accounts) {
            System.out.println("account : " + Arrays.toString(account));
            maxWealth = Math.max(maxWealth, Arrays.stream(account).sum());
            System.out.println("maxWealth : " + maxWealth);
        }
        System.out.println(maxWealth);
        return maxWealth;
    }
}