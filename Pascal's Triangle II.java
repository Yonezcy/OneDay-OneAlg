// leetcode 119th problem
// 杨辉三角问题dp实现（返回某一行）
class Solution {
    public List<Integer> getRow(int rowIndex) {
        ArrayList<Integer> row = new ArrayList<Integer>();
        for(int i=0; i<=rowIndex; i++)
        {
            row.add(0, 1);
            for(int j=1; j<row.size()-1; j++)
                row.set(j, row.get(j)+row.get(j+1));
        }
        return row;
    }
}