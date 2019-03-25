// leetcode 876 problem
// 找出链表的中间节点（偶数选第二个）

class Solution {
    public ListNode middleNode(ListNode head) {
        if (head == null || head.next == null) return head;
        ListNode fast = head, slow = head;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public static void main(String[] args) {
        String s = "";
        Scanner sc = new Scanner(System.in);
        if (sc.hasNextLine()) {
            s = sc.nextLine();
        }
        String[] str = s.split(" ");
        int[] nums = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            nums[i] = Integer.parseInt(str[i]);
        }
        Solution solution = new Solution();

        ListNode head = new ListNode(nums[0]);
        ListNode fake = head;
        for (int i = 1; i < nums.length; i++) {
            ListNode temp = new ListNode(nums[i]);
            fake.next = temp;
            fake = temp;
        }

        ListNode sol = solution.middleNode(head);
        while (sol != null) {
            System.out.println(sol.val);
            sol = sol.next;
        }
    }
}