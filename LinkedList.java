package LinkedList;
public class LinkedList<K> {

	private K key;
	private LinkedList next;

	//Constructor Declaration
	public LinkedList(K key) {
		this.key = null;
		this.next = null;
	}

	//To get Key
	public K getKey() {
		return key;
	}

	//To set Key
	public void setKey(K key) {
		this.key = key;
	}

	//To get Next
	public LinkedList getNext() {
		return next;
	}

	//To set Next
	public void setNext(LinkedList next) {
		this.next = next;
	}	
}
