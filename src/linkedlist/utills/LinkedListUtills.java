/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist.utills;

import linkedlist.LinkedList;

/**
 *
 * @author otatarik
 */
public class LinkedListUtills {

    public static void add(LinkedList newItem, int value) {
        LinkedList oldHead = getHead(newItem);
        LinkedList newHead = new LinkedList(value, null);
        oldHead.setNext(newHead);
        
    }

    public static LinkedList getHead(LinkedList tail) {
        LinkedList head;
        if (tail.getNext() != null) {
            head = getHead(tail.getNext());
        } else {
            head = tail;
        }
        return head;
    }
}
