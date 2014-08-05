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

    /**
     * @param input input LinkedList;
     * @param value value which you want to add
     */
    public static void add(LinkedList input, int value) {
        LinkedList oldHead = getHead(input);
        LinkedList newHead = new LinkedList(value, null);
        oldHead.setNext(newHead);
    }

    /**
     * First element position is 0
     *
     * @param input input LinkedList;
     * @param value value which you want to add
     * @param position position where you want to put
     */
    public static void add(LinkedList input, int value, int position) {
        LinkedList newNode;
        if (position == LinkedListUtills.size(input) - 1) {
            add(input, value);
        } else {
            int currentIdx = 0;
            while (position - 1 < currentIdx) {
                input = input.getNext();
                currentIdx++;
            }
            newNode = new LinkedList(value, input.getNext());
            input.setNext(newNode);
        }
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

    public static int size(LinkedList input) {
        if (input == null) {
            return 0;
        } else {
            int result = 1;
            while (input.getNext() != null) {
                input = input.getNext();
                result++;
            }
            return result;
        }
    }

    public static int max(LinkedList input) {
        int result = input.getValue();

        while (input.getNext() != null) {
            if (input.getNext().getValue() > result) {
                result = input.getNext().getValue();
            }
            input = input.getNext();
        }
        return result;
    }
}
