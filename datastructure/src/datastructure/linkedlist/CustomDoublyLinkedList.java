package datastructure.linkedlist;

public class CustomDoublyLinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	
	public CustomDoublyLinkedList(Object value) {
		this.head = new Node(value);
		this.tail = this.head;
		this.length = 1;
	}
	
	public CustomDoublyLinkedList append(Object value) {
		Node node = new Node(value);
		node.previous = this.tail;
		this.tail.next=node;
		this.tail = node;
		this.length++;
		return this;
	}
	
	public CustomDoublyLinkedList prepend(Object value) {
		Node node = new Node(value);		
		node.next=this.head;
		this.head.previous=node;
		this.head=node;
		this.length++;
		return this;
	}
	
	public CustomDoublyLinkedList insert(int index, Object value) {
		if(index<=0) {
			return prepend(value) ;
		} else if(index<this.length) {
			Node nodeToReplace = traverseToIndex(index);
			Node node = new Node(value); 			
			node.previous = nodeToReplace.previous;
			node.next=nodeToReplace;
			nodeToReplace.previous=node;
			this.length++;
			return this;
		}
		return this;
	}
	
	private Node traverseToIndex(int index) {
		
		int counter=1;
		Node node = this.head;
		while(counter <= index) {
			node = (Node) node.next;
			counter++;		
		}
		
		return node;
	}
	
	
	private class Node{		
		Object value;
		Object next;
		Object previous;
		
		Node(Object value){
			this.value = value;
		}
		
		@Override
		public String toString() {
			//return "Node [value="+value+ "]";
			return "Node [value=" + value + ", next=" + (null != next ? ((Node)next).value : null) + ", previous=" + (null != previous ? ((Node)previous).value : null) + "]";
		}					
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	@Override
	public String toString() {
		return "CustomDoublyLinkedList [head=" + head + ", tail=" + tail + ", length=" + length + "]";
	}
	
	
}
