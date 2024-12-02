
package DataStructures;


import org.junit.jupiter.api.Test;

import java.nio.BufferOverflowException;
import java.nio.BufferUnderflowException;
import java.util.Stack;

import static org.junit.jupiter.api.Assertions.*;

public class StackTest {
    @Test
    public void testThatStackIsEmpty(){
        MyStack myStack = new MyStack();
        assertEquals(myStack.size(), 0);
    }

    @Test
    public void testThatStackCanPushElement(){
        MyStack myStack = new MyStack();
        assertEquals(0, myStack.size());
        myStack.push(40);
        assertEquals(1, myStack.size());
    }

    @Test
    public void testThatIfStackIsFullPushMethodThrowsException(){
        MyStack myStack = new MyStack();
        assertEquals(0, myStack.size());
        myStack.push(1);
        myStack.push(2);
        myStack.push(3);
        myStack.push(4);
        myStack.push(5);
        assertEquals(5, myStack.size());
        assertThrows(BufferOverflowException.class, ()->myStack.push(6));
    }

    @Test
    public void testThatStackCanPopElement(){
        MyStack myStack = new MyStack();
        assertEquals(0, myStack.size());
        myStack.push(40);
        assertEquals(1, myStack.size());
        myStack.pop();
        assertEquals(0, myStack.size());
    }

    @Test
    public void testThatAnEmptyStackCannotPop(){
        MyStack myStack = new MyStack();
        assertEquals(0, myStack.size());
        assertThrows(BufferUnderflowException.class, ()-> myStack.pop());
    }

    @Test
    public void testThatStackCanPeek(){
        MyStack myStack = new MyStack();
        assertEquals(0, myStack.size());
        myStack.push(40);
        assertEquals(40, myStack.peek());
    }

    @Test
    public void testThatPushThreeElementAndReturnTheTopmost(){
        MyStack myStack = new MyStack();
        assertEquals(0, myStack.size());
        myStack.push(40);
        myStack.push(25);
        myStack.push(66);
        assertEquals(66, myStack.peek());
    }

    @Test
    public void testToCheckThatStackIsEmpty(){
         MyStack myStack = new MyStack();
         assertEquals(0, myStack.size());
         assertTrue(myStack.isEmpty());
    }

    @Test
    public void testToCheckThatStackIsNotEmptyReturnFalse(){
        MyStack myStack = new MyStack();
        assertEquals(0, myStack.size());
        myStack.push(1);
        assertEquals(1, myStack.size());
        assertFalse(myStack.isEmpty());
    }



}
