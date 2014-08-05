/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

import linkedlist.utills.LinkedListUtills;

/**
 *
 * @author otatarik
 */
public class LinkedListMain {

    public static void main(String[] args) {
        LinkedList ll2 = new LinkedList(2, null);
        LinkedList ll1 = new LinkedList(7, ll2);
        LinkedList ll0 = new LinkedList(8, ll1);

        System.out.println(ll0);
        System.out.println(LinkedListUtills.size(ll0));
        LinkedListUtills.add(ll0, 15);
        System.out.println(ll0);
        System.out.println(LinkedListUtills.size(ll0));

        LinkedListUtills.add(ll0, 1);
        System.out.println(ll0);
        System.out.println(LinkedListUtills.size(ll0));
        LinkedListUtills.add(ll0, 178);
        System.out.println(ll0);
        System.out.println(LinkedListUtills.size(ll0));
        LinkedListUtills.add(ll0, 45, 2);
        System.out.println(ll0);
        System.out.println(LinkedListUtills.size(ll0));
        
        LinkedListUtills.add(ll0, 41, 0);
        System.out.println(ll0);
        System.out.println(LinkedListUtills.size(ll0));
        
        LinkedListUtills.add(ll0, 11, 8);
        System.out.println(ll0);
        System.out.println(LinkedListUtills.size(ll0));
    }
}
