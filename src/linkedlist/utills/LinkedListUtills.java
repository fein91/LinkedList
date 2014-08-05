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

    public static void add(LinkedList input, int value) {
        LinkedList oldHead = getHead(input);
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

    public static void remove(LinkedList input) {
        while (input.getNext().getNext() != null) {
            input = input.getNext();
        }
        input.setNext(null);
    }
}
