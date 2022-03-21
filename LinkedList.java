package iterables_in_java;
import java.util.NoSuchElementException;
import java.util.Iterator;

/**
 * A class to represent a linked list of nodes.
 *
 * @author parvbhardwaj
 *
 */
public class LinkedList<T> implements Iterable<T> {
	
	/** the first node of the listm or null if the list is empty */
	private LLNode<T> firstNode;

	
	/**
	 * Creates an intially empt linked list
	 */
	public LinkedList() {
		firstNode = null;
		
		
	}
	/**
	 * Returns the first node.
	 * @return
	 */
	protected LLNode<T> getFirstNode(){
		return firstNode;
		
		
	}
	/**
	 * Sets the first node
	 * @param node the fist node of thr new linked list
	 */
	protected void setFirstNode(LLNode<T> node) {
		this.firstNode = node;
	}
	
	public void addToFront( T element) {
		
		setFirstNode(new LLNode<T>( element , getFirstNode()));
		
		
	}
	/**
	 * Return whether the list is empty.
	 * @return true if the list is empty.
	 */
	public boolean isEmpty() {
		
		return(getFirstNode() == null);
		
	}
	/**
	 * Returns the length of the linked list.
	 * @return the number of nodes in the list.
	 */
	public int length() {
		int count = 0;
		LLNode<T> nodeptr = getFirstNode();
		
		while(nodeptr !=null) {
			count++;
			nodeptr = nodeptr.getNext();
			
			
		}
		return count;
		
	}
	/**
	 * Remove and return the elemnt at front of the list
	 * @return the first element of the list
	 * @throws NoSuchElementException if there is no such element.
	 * 
	 */
	public T removeFromFront() {
	if(isEmpty()) {
		throw new NoSuchElementException();
		
	}
	else {
		T save = getFirstNode().getElement();
		setFirstNode(getFirstNode().getNext());
		return save;
		
	}
	
	
	}
		
	/**
	 * 
	 */
	public void addToEnd(T element) {
		if(isEmpty()) {
			addToFront(element);
			
		}
		else {
			LLNode<T> nodeptr = getFirstNode();
			
			// the loop will end with nodeptr looking at the last node in list
			while(nodeptr.getNext() != null) {
				nodeptr = nodeptr.getNext();
				nodeptr.setNext(new LLNode<T>(element, null));
				
			}
		}
		
	}
	
	/** 
	 * Overrides the iterator method of Iterable to return an iterator for this list.
	 * @return an iterator for the list.
	 */
	@Override
	public LinkedListIterator<T> iterator(){
		return new LinkedListIterator<>(this);
	}
	
	/**
	 * Print the contents of the list.
	 * We don't get to use the class's generic T in a static method.
	 * We'll declare a generic for this method.
	 * @param list the list to print
	 */
	public static <S> void printList(LinkedList<S> list) {
		
		LLNode<S> nodeptr = list.getFirstNode();
		while(nodeptr != null) {
			System.out.println(nodeptr.getElement());
		}
		
	}
	/**
	 * Prints the contents of the list
	 * USes a wildcard for the generic instead of declaring a new generic.
	 * @param list the list to print
	 */
	public static void printList2(LinkedList<?> list) {
		
		LLNode<?> nodeptr = list.getFirstNode();
		while(nodeptr !=null) {
			System.out.println(nodeptr.getElement());
			nodeptr = nodeptr.getNext();
			
		}
		
	}
}