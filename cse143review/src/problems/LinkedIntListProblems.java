package problems;

import datastructures.LinkedIntList;
// Checkstyle will complain that this is an unused import until you use it in your code.
import datastructures.LinkedIntList.ListNode;

/**
 * See the spec on the website for example behavior.
 *
 * REMEMBER THE FOLLOWING RESTRICTIONS:
 * - do not call any methods on the `LinkedIntList` objects.
 * - do not construct new `ListNode` objects for `reverse3` or `firstToLast`
 *      (though you may have as many `ListNode` variables as you like).
 * - do not construct any external data structures such as arrays, queues, lists, etc.
 * - do not mutate the `data` field of any node; instead, change the list only by modifying
 *      links between nodes.
 */

public class LinkedIntListProblems {

    /**
     * Reverses the 3 elements in the `LinkedIntList` (assume there are exactly 3 elements).
     */
    public static void reverse3(LinkedIntList list) {
        ListNode temp = list.front.next.next;
        temp.next = list.front.next;
        temp.next.next = list.front;
        list.front = temp;
        list.front.next.next.next = null;
    }

    /**
     * Moves the first element of the input list to the back of the list.
     */
    public static void firstToLast(LinkedIntList list) {
        if (list.front != null && list.front.next != null) {
            ListNode temp = list.front;
            list.front = list.front.next;
            ListNode curr = list.front;
            while (curr.next != null) {
                curr = curr.next;
            }
            curr.next = temp;
            temp.next = null;
        }
        }

    /**
     * Returns a list consisting of the integers of a followed by the integers
     * of n. Does not modify items of A or B.
     */
    public static LinkedIntList concatenate(LinkedIntList a, LinkedIntList b) {
        // Hint: you'll need to use the 'new' keyword to construct new objects.
        if (a.front == null && b.front == null) {
            return a;
        }
        if (a.front == null && b.front != null) {
            return b;
        }
        if (b.front == null && a.front != null) {
            return a;
        }
        LinkedIntList combinedList = new LinkedIntList();
        ListNode current = null;
        ListNode temp = a.front;
        combinedList.front = new ListNode(temp.data);
        current = combinedList.front;
        while (temp.next != null) {
            temp = temp.next;
            current.next = new ListNode(temp.data);
            current = current.next;
        }
        ListNode temp2 = b.front;
        current.next = new ListNode(temp2.data);
        current = current.next;
        while (temp2.next != null) {
            temp2 = temp2.next;
            current.next = new ListNode(temp2.data);
            current = current.next;
        }
        return combinedList;
        }
    }


