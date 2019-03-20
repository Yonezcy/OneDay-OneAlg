// leetcode 402 problem
// 移除字符串中的k个字符，使余下的数字最小

class Solution {
    public String removeKdigits(String num, int k) {
        if (num == null || k == 0) return num;
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < num.length(); i++) {
            while (k > 0 && !stack.isEmpty() && stack.peek() > num.charAt(i)) {
                stack.pop();
                k--;
            }
            stack.push(num.charAt(i));
        }

        // Case 1111.
        while (k > 0) {stack.pop(); k--;}

        // Build String.
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        sb.reverse();

        // Get rid of leading 0.
        while (sb.length() > 1 && sb.charAt(0) == '0') {
            sb.deleteCharAt(0);
        }
        return sb.toString();
    }
}