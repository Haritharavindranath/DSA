import java.util.*;

public class Knapsack {
    public static void main(String[] args) {
        int capacity = 50;
        List<List<Integer>> items = new ArrayList<>();
        items.add(Arrays.asList(60, 10));
        items.add(Arrays.asList(100, 20));
        items.add(Arrays.asList(120, 30));
        double maxValue = knapsack(items, capacity);
        System.out.println("Maximum value in knapsack: " + maxValue);
    }

    public static double knapsack(List<List<Integer>> items, int capacity) {
        items.sort((a,b)->b.get(0)/b.get(1)-a.get(0)/a.get(1));
        int w=capacity;
        double totval=0.00;
        for(int i=0;i<items.size();i++)
        {
            if(items.get(i).get(1)<=w)
            {
                totval+=items.get(i).get(0);
                w=w-items.get(i).get(1);

            }
            else 
            {
                if(w!=0)
                {
                    double a=(double)w/items.get(i).get(1);
                    totval=totval+(items.get(i).get(0)*a);
                    w=0;
                }
                if(w==0)
                {
                    break;
                }
            }
        }
        return totval; 
    }
}
