package datastructure.linkedlist;

public class CustomDoublyLinkedListTest {
	
	public static void main(String[] args) {
		
		CustomDoublyLinkedList doublyLinkedList = new CustomDoublyLinkedList(2);
		doublyLinkedList.append(4);
		doublyLinkedList.append(5);
		doublyLinkedList.prepend(1);
		doublyLinkedList.insert(2, 3);
		
		System.out.println(doublyLinkedList);
		
		System.exit(0);
		
	}
	

}
