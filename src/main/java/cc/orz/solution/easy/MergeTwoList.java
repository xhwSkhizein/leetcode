package cc.orz.solution.easy;

/**
 * @author hongweixu
 * @since 2018/11/8 00:19
 */
public class MergeTwoList {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    private static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        if (l1 == null) {
            return l2;
        }
        if (l2 == null) {
            return l1;
        }

        ListNode start;
        if (l1.val < l2.val) {
            start = l1;
            l1 = l1.next;
        } else {
            start = l2;
            l2 = l2.next;
        }
        ListNode cur = start;
        while (true) {
            if (l1 == null || l2 == null) {
                cur.next = l1 == null ? l2 : l1;
                return start;
            } else {
                if (l1.val < l2.val) {
                    cur.next = l1;
                    l1 = l1.next;
                } else {
                    cur.next = l2;
                    l2 = l2.next;
                }
            }
            cur = cur.next;
        }
    }

    public static void main(String[] args) {

        ListNode node1 = new ListNode(1);
        ListNode node2 = new ListNode(2);
        ListNode node4 = new ListNode(4);
        ListNode node5 = new ListNode(5);
        ListNode node7 = new ListNode(7);
        node1.next = node2;
        node2.next = node4;
        node4.next = node5;
        node5.next = node7;

        ListNode node21 = new ListNode(1);
        ListNode node22 = new ListNode(2);
        ListNode node24 = new ListNode(4);
        ListNode node25 = new ListNode(5);
        ListNode node27 = new ListNode(7);
        node21.next = node22;
        node22.next = node24;
        node24.next = node25;
        node25.next = node27;


        ListNode newNodeList = mergeTwoLists(node1, node21);
        while (newNodeList != null) {
            System.out.println(newNodeList.val);
            newNodeList = newNodeList.next;
        }


        System.exit(0);
    }
}