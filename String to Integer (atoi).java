// leetcode 8 problem
// 把string转化成int

public class Solution {
    public int myAtoi(String str) {
        if (str.length() == 0) return 0;
        long res = 0;
        int sign = 1;
        int hasDigit = 0;
        int sign_count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (sign_count == 0 && hasDigit == 0) {
                if (str.charAt(i) == ' ') continue;
            }

            if (str.charAt(i) == '+' || str.charAt(i) == '-') {
                if (str.charAt(i) == '-') sign = -1;
                sign_count++;
                continue;
            }
            if (sign_count <= 1) {
                if (str.charAt(i) >= '0' && str.charAt(i) <= '9') {
                    hasDigit = 1;
                    res = res * 10 + (str.charAt(i) - '0');
                    if (res > Integer.MAX_VALUE)
                        return sign < 0 ? Integer.MIN_VALUE : Integer.MAX_VALUE;
                }
                else break;
            }
            else return 0;
        }
        if (sign == 1) return (int)res;
        else return -(int)res;
    }

    public static void main(String[] args) {
        String str = "";
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            str = sc.nextLine();
        }
        Solution solution = new Solution();
        int res = solution.myAtoi(str);
        System.out.println(res);
    }
}


