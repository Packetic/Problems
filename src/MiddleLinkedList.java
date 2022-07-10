import java.io.Serializable;

public class MiddleLinkedList {
    public static void main(String[] args) {
        ListNode head = new ListNode(65,new ListNode(66,new ListNode(26,new ListNode(77, new ListNode(96, new ListNode(86, new ListNode(11, new ListNode(21, new ListNode(13, new ListNode(80))))))))));
        ListNode a = head;
        ListNode middleNode = head;
        int x = 0;
        while (a != null) {
            a = a.next;
            x++;
        }
        x = x % 2 != 0 ? (int) Math.ceil((double)x/2) : x/2 + 1;
        int k = 0;
        while (middleNode != null) {
            k++;
            if (k == x) break;
            middleNode = middleNode.next;
        }
        System.out.println(middleNode);
    }
}

class ListNode implements Serializable {
    int val;
    ListNode next;

    ListNode() {
    }

    ListNode(int val) {
        this.val = val;
    }

    ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    @Override
    public String toString() {
        return "(" +
                "" + val +
                ')' + "(" + next + ")";
    }
}