package test;

import org.junit.Test;
import static org.junit.Assert.*;

import src.MinStack;

public class MinStackTest {
    @Test
    public void testCase1(){
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);

        assertEquals(1, minStack.min());
    }

    @Test
    public void testCase2(){
        MinStack minStack = new MinStack();
        minStack.push(3);
        minStack.push(2);
        minStack.push(5);
        minStack.push(1);
        minStack.pop();

        assertEquals(2, minStack.min());
    }

    @Test
    public void testCase3(){
        MinStack minStack = new MinStack();
        minStack.push(1);
        minStack.push(2);
        minStack.push(3);
        minStack.push(4);

        assertEquals(1, minStack.min());
    }
}
