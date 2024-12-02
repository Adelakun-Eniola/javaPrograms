package DataStructures;
import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.ArrayList;
import java.util.Stack;



public class MyStack {

    private int noOfElement;

    private int capacity = 5;
    private int[] elements = new int[5];


    public int size() {
        return noOfElement;
    }

    public void push(int element) {
        if (noOfElement == capacity) throw new BufferOverflowException();
        elements[noOfElement] = element;
        noOfElement++;
    }

    public void pop() {
        if (noOfElement == 0){
            throw new BufferUnderflowException();
        }
        elements[noOfElement] = 0;
        noOfElement--;
    }

    public int peek() {
        return elements[noOfElement - 1];
    }


    public boolean isEmpty() {
        return noOfElement == 0;
    }
}
