package iterables_in_java;

import java.util.Iterator;

/**
 * An iterator for our linked list, The iterator permits looping without using the nodes directly.
 * 
 * @author parvbhardwaj
 *
 */
public class LinkedListIterator<T> implements Iterator<T> {
	// nodeptr makes the current node as we're iterating.
	
	private LLNode<T> nodeptr;
	/**
	 * Create an iterator for a linked list.
	 * @param list the list we're creating an iterator for.
	 */
	
	public LinkedListIterator(LinkedList<T> list) {
		nodeptr = list.getFirstNode();
		
		
	}
	/**
	 * Returns true if there are more elements in the iteration
	 * @return ttur if ther are more element in the iteration
	 * 
	 */

	@Override
	public boolean hasNext() {
		return nodeptr != null;
		
				
	}
	/**
	 * Returns the next element of the iteration and "increment" the iteration
	 * @return the next element of the iteration.
	 */
	@Override
	public T next() {
		T save = nodeptr.getElement();
		nodeptr = nodeptr.getNext();
		return save;
		
	}
	
}

