/*
 * Copyright (c) 2018 to Xinwei Jin.
 * All Rights Reserved.
 */

package codinghigh.common;

/**
 * Created by xinweijin on 2/4/18.
 */
public class ListNode {
    public int val;
    public ListNode next;

    public ListNode(int val) {
        this.val = val;
    }

    public static ListNode generateSingleLinkedListFromArray(int[] array) {
        if (array == null || array.length == 0) {
            return null;
        }
        ListNode head = new ListNode(array[0]);
        ListNode cur = head;
        for (int i = 1; i < array.length; i++) {
            cur.next = new ListNode(array[i]);
            cur = cur.next;
        }
        cur.next = null;
        return head;
    }
    
    public static int[] toArray(ListNode head) {
        int size = 0;
        ListNode cur = head;
        while (cur != null) {
            size++;
            cur = cur.next;
        }
        int[] array = new int[size];
        cur = head;
        int i = 0;
        while(cur != null) {
            array[i++] = cur.val;
            cur = cur.next;
        }
        return array;
    }
}
