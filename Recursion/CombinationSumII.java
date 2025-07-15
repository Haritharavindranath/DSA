import java.util.*;

public class CombinationSumII {

    public Set<List<Integer>> combinationSum(int[] candidates, int target) {
        Set<List<Integer>> result = new HashSet<>();
        List<Integer> current = new ArrayList<>();
        Arrays.sort(candidates);
        findCombinations(candidates, target, 0, current, result);
        return result;
    }

    private void findCombinations(int[] c, int t, int i, List<Integer> b, Set<List<Integer>> a) 
    {
        if(t==0)
        {
            Collections.sort(b);
            a.add(new ArrayList<>(b));
            return;
        }
        if(t<0 || i==c.length) return;
        b.add(c[i]);
        findCombinations(c, t-c[i], i+1, b, a);
        b.remove(b.size()-1);
        findCombinations(c, t, i+1, b, a);
    }

    public static void main(String[] args) {
        CombinationSumII cs = new CombinationSumII();

        int[] candidates = {10,1,2,7,6,1,5};
        int target = 8;

        Set<List<Integer>> combinations = cs.combinationSum(candidates, target);

        System.out.println("Combinations that sum to " + target + ":");
        for (List<Integer> combination : combinations) {
            System.out.println(combination);
        }
    }
}
