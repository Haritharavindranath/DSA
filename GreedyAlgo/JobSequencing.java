import java.util.*;

public class JobSequencing {
    public static void main(String[] args) {
        int[][] jobs = {
            {1, 4, 20},
            {2, 1, 10},
            {3, 1, 40},
            {4, 1, 30}
        };

        int[] result = scheduleJobs(jobs); 
        System.out.println("Max jobs: " + result[0] + ", Max profit: " + result[1]);
    }

    public static int[] scheduleJobs(int[][] jobs) {
        Arrays.sort(jobs, (a, b) -> b[2] - a[2]);

        int maxDeadline = 0;
        for (int[] job : jobs) {
            maxDeadline = Math.max(maxDeadline, job[1]);
        }
        boolean[] slots = new boolean[maxDeadline + 1]; 
        int jobsDone = 0;
        int totalProfit = 0;

        for (int[] job : jobs) {
            int deadline = job[1];
            int profit = job[2];

            for (int t = deadline; t > 0; t--) {
                if (!slots[t]) {
                    slots[t] = true;  // Mark slot as filled
                    jobsDone++;
                    totalProfit += profit;
                    break;
                }
            }
        }

        return new int[]{jobsDone, totalProfit};
    }
}
