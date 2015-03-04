package dcll.eber.MySimpleStack;

import dcll.eber.MySimpleStack.Item;
import java.util.EmptyStackException;

/**
 * Created by 21406945 on 04/03/2015.
 */
public interface SimpleStack {
    /**
     * Tests if this stack is empty
     */

    public boolean isEmpty();
    /**
     * Returns the number of items in this stack.
     */
    public int getSize();
    /**
     * Pushes an item onto the top of this stack.
     * null item is allowed.
     */
    public void push(Item item);
    /**
     * Looks at the object at the top of this stack without removing it from the stack.
     */
    public Item peek() throws EmptyStackException;
    /**
     * Removes the object at the top of this stack and returns that object as the value of this function.
     * @throws EmptyStackException if this stack is empty.
     */
    public Item pop() throws EmptyStackException;
}
