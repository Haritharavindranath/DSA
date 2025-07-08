//Greedy approach but this is not always correct we should use DP for this
import java.util.Arrays;


public class Coin {
    public static void main(String[] args) {
        int[] coins = {1, 2, 5};
        int amount = 11;

        int result = coinChange(coins, amount);
        System.out.println("Minimum coins required: " + result);
    }

    public static int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int i=coins.length-1;
        int amt=amount;
        int n=0;
        while(i>=0)
        {
            if(coins[i]<=amt)
            {
                n+=1;
                amt-=coins[i];
            }
            else{
                i--;
            }
        }
        return n;
    }
}
