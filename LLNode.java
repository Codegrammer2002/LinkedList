package iterables_in_java;

/**
 * The node of a linked list
 * @author parvbhardwaj
 *
 */
public class LLNode<T> {

	
	/** the element stored in the node **/
	
	private T element;
	
	/** a reference to the next node of the list **/
	private LLNode<T> next;
	
	/**
	 * 
	 * @param element
	 * @param next
	 */
	public LLNode( T element, LLNode<T> next) {
		this.element = element;
		this.next = next;
		
		
	}
	/**
	 * Returns the element stored in the node
	 * @return the element stored in the node
	 */
	public T getElement() {
		return element;
		
		
	}
	/**
	 * Returns the next node of the list.
	 * @return the next of the list.
	 */
	public LLNode<T> getNext(){
		return next;
		
		
	}
	
	/**
	 * Changes the node that comes after this in the list.
	 * @param next the node that should come after this node in the list. It can be null.
	 */
	public void setNext(LLNode<T> next) {
		this.next = next;
		
		
	}
	
}
