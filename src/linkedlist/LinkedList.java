/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author otatarik
 */
public class LinkedList {

    private int value;
    private LinkedList next;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public LinkedList getNext() {
        return next;
    }

    public void setNext(LinkedList next) {
        this.next = next;
    }

    public LinkedList(int value, LinkedList next) {
        this.next = next;
        this.value = value;
    }
    
    @Override
    public String toString(){
        String result="("+getValue()+") ";
        LinkedList next = getNext();
        while (next != null) {
            result+="("+next.getValue()+") ";
            next = next.getNext();
        }
        return result;
    }

}
