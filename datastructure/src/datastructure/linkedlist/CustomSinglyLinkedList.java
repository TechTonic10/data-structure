package datastructure.linkedlist;

public class CustomSinglyLinkedList {
	
	private Node head;
	private Node tail;
	private int length;
	
	public CustomSinglyLinkedList(Object value) {
		this.head = new Node(value);		
		this.tail = head;
		this.length = 1;
	}
	
	public CustomSinglyLinkedList append(Object value) {
		Node node = new Node(value);
		this.tail.next = node;
		this.tail=node;
		this.length++;
		return this;
	}
	
	public CustomSinglyLinkedList prepend(Object value) {
		Node node = new Node(value);
		node.next=this.head;
		this.head=node;
		this.length++;
		return this;
	}
	
	public void insert(int index, Object value) {
		if(index==0) {
			this.prepend(value);
		} else if((this.length==1 && index<=this.length) || (index>=this.length) ) {
			this.append(value);
		} else {						
			Node nodeToReplace = traverseToIndex(index);
			Node nodeLead = traverseToIndex(index-1);
			Node node = new Node(value);
			node.next = nodeToReplace;
			nodeLead.next = node;
			this.length++;
		}		
	}
	
	
	
	public Node traverseToIndex(int index) {		
		int counter = 0;
		Node currentNode = this.head;
		while(counter < index) {
			currentNode =(Node) currentNode.next;
			counter++;
		}		
		return currentNode;
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

	private class Node{
		Object value;
		Object next;
		Node(Object value){
			this.value = value;
		}	
		@Override
		public String toString() {
			return "Node [value=" + value + ", next=" + next + "]";
		}
		
	}

	@Override
	public String toString() {
		return "CustomLinkedList [head=" + head + ", tail=" + tail + ", length=" + length + "]";
	}
	
	

}
