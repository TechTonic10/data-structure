package datastructure.linkedlist;

public class CustomSinglyLinkedListTest {
	
	public static void main(String[] args) {
		
		CustomSinglyLinkedList linkedList = new CustomSinglyLinkedList(3);
		linkedList.append(4);
		linkedList.append(5); 
		
		linkedList.prepend(1);
				
		linkedList.insert(1, 2);
		
		System.out.println(linkedList);
		
	}
	

}
