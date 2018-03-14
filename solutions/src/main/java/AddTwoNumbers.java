/**
 * add two numbers stored in two lists
 *
 * You are given two linked lists representing two non-negative numbers.
 * The digits are stored in reverse order and each of their nodes contain a single digit.
 * Add the two numbers and return it as a linked list.
 *
 * Input: (2 -> 4 -> 3) + (5 -> 6 -> 4)
 * Output: 7 -> 0 -> 8
 *
 * @author Ulong
 * @create 2016/10/17
 */
public class AddTwoNumbers {

    public static void main(String[] args) {
        ListNode root1 = new ListNode(((int) (Math.random() * 5)));
        ListNode root2 = new ListNode(((int) (Math.random() * 5)));
        ListNode l1 = root1;
        ListNode l2 = root2;
        for(int i = 0; i < Math.random()*5; i++){
            l1.next = new ListNode(((int) (Math.random() * 10)));
            l2.next = new ListNode(((int) (Math.random() * 10)));
            l1 = l1.next;
            l2 = l2.next;
        }

        ListNode l3 = addTwoNumbers(root1, root2);

        while (null != root1){
            System.out.print(root1.val+"\t");
            root1 = root1.next;
        }
        System.out.println();

        while (null != root2){
            System.out.print(root2.val+"\t");
            root2 = root2.next;
        }
        System.out.println();

        while (null != l3){
            System.out.print(l3.val+"\t");
            l3 = l3.next;
        }
    }

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode result = new ListNode(0);
        ListNode pointer = result;

        while(true){

            l1 = (null == l1)? new ListNode(0):l1;
            l2 = (null == l2)? new ListNode(0):l2;

            if(pointer.val + l1.val + l2.val < 10){     //you must be careful of critical conditions
                pointer.val += l1.val + l2.val;
                pointer.next = new ListNode(0);
            }else {
                pointer.val += l1.val + l2.val - 10;
                pointer.next = new ListNode(1);
            }

            l1 = l1.next;
            l2 = l2.next;
            if(null == l1 && null == l2){
                pointer.next = (0 == pointer.next.val)? null:pointer.next;
                break;
            }
            pointer = pointer.next;
        }

        return result;
    }
}

//Definition for singly-linked list.
class ListNode {
    int val;
    ListNode next;
    ListNode(int x) { val = x; }
}
