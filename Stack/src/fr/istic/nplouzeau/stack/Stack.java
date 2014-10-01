package fr.istic.nplouzeau.stack;

import java.util.EmptyStackException;

/**
 * Created by plouzeau on 2014-09-02.
 */


public interface Stack {

    /**
     * Returns the number of items in the stack
     * @return  the height
     */
    public int height()  ;

    /**
     * Returs the top item in the stack
     * @return  top item
     * @throws java.util.EmptyStackException if there ar no items in the stack
     */
    public int top() throws EmptyStackException;

    /**
     * Adds a new item on top of stack
     * @param newTop  the new item
     */
    public void push(int newTop);

    /**
     * Removes the top item of stack
     * @throws EmptyStackException
     */
    void pop() throws EmptyStackException;
}
