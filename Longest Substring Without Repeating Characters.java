class Solution {
    public int lengthOfLongestSubstring(String s) {
        int n = s.length();
        int i, j, ans=0;
        for (i=0; i<n; i++)
            for (j=i+1; j<=n; j++)
                if (isAllUnique(s, i, j)) ans = Math.max(ans, j-i);
        return ans;
    }
    public boolean isAllUnique(String s, int start, int end){
        int i;
        Set<Character> set = new HashSet<>();
        for (i=start; i<end; i++){
            char ch = s.charAt(i);
            if (set.contains(ch)) return false;
            set.add(ch);
        }
        return true;
    }
}

class Solution{
    public int lengthOfLongestSubstring(String s){
        int n = s.length();
        Set<Character> set = new HashSet<>();
        int i=0, j=0, ans=0;
        while (i<n && j<n){
            if (!set.contains(s.charAt(j))){
                set.add(s.charAt(j++));
                ans = Math.max(ans, j-i);
            }
            else{
                set.remove(s.charAt(i++));
            }
        }
        return ans;
    }
}

class Solution{
    public int lengthOfLongestSubstring(String s){
        int n = s.length();
        int i, j, ans = 0;
        Map<Character, Integer> map = new HashMap<>();
        for (i=0, j=0; j<n; j++){
            if (map.containsKey(s.charAt(j))){
                i = Math.max(map.get(s.charAt(j)), i);
            }
            ans = Math.max(ans, j-i+1);
            map.put(s.charAt(j), j+1);
        }
        return ans;
    }
}