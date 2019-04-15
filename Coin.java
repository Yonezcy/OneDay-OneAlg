import java.util.*;

public class Solution {
    public static int greedyMinNum(int[] coin, int target) {
        int count = 0;
        for (int i = coin.length-1; i >= 0; i--) {
            if (coin[i] <= target) {
                count = count + target / coin[i];
                target = target % coin[i];
                if (target == 0) break;
            }
        }
        return count;
    }

    public static int dpMinNum(int[] coin, int target) {
        int[] dp = new int[target+1];
        dp[0] = 0;
        dp[1] = 1;
        for (int i = 2; i < target+1; i++) {
            int min = 9999;
            for (int j = 0; j < coin.length; j++) {
                if (coin[j] <= i) {
                    if (i % coin[j] == 0) {
                        min = Math.min(min, i / coin[j]);
                    } else {
                        int remain = i % coin[j];
                        min = Math.min(min, dp[remain] + i / coin[j]);
                    }
                }
            }
            dp[i] = min;
        }
        return dp[target];
    }

    public static int bkMinnum(int[] coin, int target) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> tempList = new ArrayList<>();
        backtrack(res, tempList, coin, target);
        int min = 9999;
        for (int i = 0; i < res.size(); i++) {
            min = Math.min(min, res.get(i).size());
        }
        return min;
    }

    public static void backtrack(List<List<Integer>> res, List<Integer> tempList, int[] coin, int target) {
        if (target == 0) {
            res.add(new ArrayList<>(tempList));
        }
        if (target < 0) return;
        for (int i = 0; i < coin.length; i++) {
            tempList.add(coin[i]);
            backtrack(res, tempList, coin, target-coin[i]);
            tempList.remove(tempList.size()-1);
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int target = sc.nextInt();
        int[] coin = new int[n];
        Arrays.sort(coin);
        for (int i = 0; i < n; i++)
            coin[i] = sc.nextInt();
        System.out.println(bkMinnum(coin, target));
    }
}
