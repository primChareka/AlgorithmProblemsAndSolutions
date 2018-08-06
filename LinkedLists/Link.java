package LinkedLists;

public class Link {
	//Instance Variables
	private int key = 0;
	private int val = 0;
	private Link next = null; //pointer to next link
	
	//Default Constructor
	public Link() {
		this.key = 0;
		this.val = 0;
		this.next = null;
	}

	//Constructor for integer linked list problems
	public Link(int key, int number) {
		this.key = key;
		this.val = number;
		this.next = null;
	}
	
	public int getKey() {
		return this.key;
	}
	
	public int getVal() {
		return this.val;
	}
	
	public void setVal(int val) {
		this.val = val;
	}
	
	public Link getNext() {
		return this.next;
	}
	
	void setNext(Link newLink) {
		this.next = newLink;
	}

	public String toString() {
		return "key="+ key + ", val=" + val + "\n";
	}

}

