package LinkedLists;

import java.util.LinkedList;

import TestInputFiles.ReadInputs;

class LinkedLists {

	public Link firstLink;

	LinkedLists() {
		firstLink = null;
	}

	public boolean isEmpty() {
		return (firstLink == null);
	}

	public void insertLinkStart(int key, int value) {
		Link newLink = new Link(key, value);
		newLink.setNext(firstLink);
		firstLink = newLink;

	}

	public void insertLinkEnd(int key, int value) {
		Link temp = this.firstLink;
		Link myLink = new Link(key, value);

		if (temp == null) {
			this.firstLink = myLink;
		} else {
			while (temp.getNext() != null) {
				temp = temp.getNext();
			}
			temp.setNext(myLink);
		}
	}

	public Link removeLinkStart() {
		Link linkReference = firstLink;

		if (!isEmpty()) {
			firstLink = firstLink.getNext();
		} else {
			System.out.println("Empty LinkedList");
		}
		return linkReference;
	}

	public Link removeLinkEnd() {
		Link temp = this.firstLink;
		Link ref;
		while(temp.getNext().getNext()!=null) {
			temp=temp.getNext();
		}
		
		ref = temp.getNext();
		temp.setNext(null);
		return ref;	
	}
	public void reverseList() {
		Link previous, current, next;

		if (firstLink == null || firstLink.getNext() == null) {
			return;// empty list or list with only one element
		} else {
			previous = firstLink;
			current = firstLink.getNext();
			firstLink.setNext(null);
			while (current != null) {
				next = current.getNext();
				current.setNext(previous);
				previous = current;
				current = next;
			}
		}

		firstLink = previous;
	}

	public void displayListAsInts() {
		Link theLink = this.firstLink;

		while (theLink != null) {

			System.out.println("key="+theLink.getKey()+", val="+theLink.getVal());
			theLink = theLink.getNext();
		}
	}
	
	public void displayListAsChars() {
		Link theLink = this.firstLink;

		while (theLink != null) {

			System.out.println("key="+theLink.getKey()+", val="+(char)theLink.getVal());
			theLink = theLink.getNext();
		}
	}

	public static void main(String args[]) {
		LinkedLists list = new LinkedLists();

		list.insertLinkStart(1, 'C');
		list.insertLinkStart(2, 'B');
		list.insertLinkStart(3, 'A');

		list.insertLinkEnd(4, 'F');
		list.insertLinkEnd(5, 'E');
		list.insertLinkEnd(6, 'D');

		list.displayListAsChars();
		list.removeLinkEnd();
		list.displayListAsChars();
		//list.displayListAsInts();
		//list.reverseList();
		//list.displayList();
		
		//Linked list using Java implementation 
		LinkedList<Integer> l = new LinkedList<Integer>();
		ReadInputs r = new ReadInputs();
		r.ReadFile("TestCases/inputNumbers1.txt", l);
		System.out.println(l);
	}

}