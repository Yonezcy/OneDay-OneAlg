// leetcode 118th problem
// 杨辉三角问题

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> res = new ArrayList<>();
        List<Integer> row = new ArrayList<>();
        for(int i = 0; i < numRows; i++) {
            row.add(0, 1);
            for(int j = 1; j < row.size()-1; j++)
                row.set(j, row.get(j)+row.get(j+1));
            res.add(new ArrayList<>(row));
        }
        return res;
    }

    public static void main(String[] args) {
        int numRows = 0;
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextInt()) {
            numRows = sc.nextInt();
        }
        Solution solution = new Solution();
        System.out.println(solution.generate(numRows));
    }
}
