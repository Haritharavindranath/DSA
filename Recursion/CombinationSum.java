import java.util.*;

public class CombinationSum {

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> result = new ArrayList<>();
        List<Integer> current = new ArrayList<>();
        findCombinations(candidates, target, 0, current, result);
        return result;
    }

    private void findCombinations(int[] c, int t, int i, List<Integer> b, List<List<Integer>> a) 
    {
        if(t==0)
        {
            a.add(new ArrayList<>(b));
            return;
        }
        if(t<0 || i==c.length) return;
        b.add(c[i]);
        findCombinations(c, t-c[i], i, b, a);
        b.remove(b.size()-1);
        findCombinations(c, t, i+1, b, a);
    }

    public static void main(String[] args) {
        CombinationSum cs = new CombinationSum();

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> combinations = cs.combinationSum(candidates, target);

        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
