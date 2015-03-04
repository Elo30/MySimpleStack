package dcll.eber.MySimpleStack;

import dcll.eber.MySimpleStack.Item;
import dcll.eber.MySimpleStack.SimpleStack;

import java.util.EmptyStackException;
import java.util.Stack;

/**
 * Created by 21406945 on 04/03/2015.
 *
 * Un commentaire répondant à l'exigence #3
 */
public class SimpleStackImpl implements SimpleStack {

    Stack<Object> wrappedStack = new Stack<Object>();

    public boolean isEmpty(){
        return wrappedStack.isEmpty();
    }

    public int getSize(){
        return wrappedStack.size();
    }

    public void push(Item item){
        wrappedStack.push(item);
    }

    public Item peek() throws EmptyStackException {
        return (Item) wrappedStack.peek();
    }

    public Item pop() throws EmptyStackException {
        return (Item) wrappedStack.pop();
    }

}
