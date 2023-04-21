

import java.util.*;

//it is not best practice to import all the classes of util package
//because it creates performance issue.import only the required classes.
public class LaunchLinkedList1 {

	public static void main(String[] args) {

		// these classes are present in util package so we have to import that package
		// 7 classes in collection framework and 3 interfaces(List,Queue,Set)
		// 7 classes are :
		// ArrayList
		// LinkedList
		// ArrayDeque
		// PriorityQueue
		// TreeSet
		// HashSet
		// Linked HashSet

//Note:In collection framework ,whatever data you add gets stored as object
		// ArrayList internally uses Doubly Linked List

		LinkedList ll1 = new LinkedList();
		ll1.add(10);
		ll1.add(20);
		ll1.add(30);
		ll1.add(40);
		ll1.add(40);
		ll1.add(50);
		ll1.addFirst("Gaurav Sharma");
		ll1.add("bengaluru");
		ll1.addLast("kicks");
		System.out.println(ll1);
		System.out.println(ll1.getFirst());
		System.out.println(ll1.getLast());
		System.out.println(ll1.lastIndexOf(40));
		System.out.println(ll1.indexOf(40));

		System.out.println("**********************************************************");

//Interview questions
//difference between offerFirst ,offerLast and addFirst ,addLast Method 

//there is no restriction on ll1 to add these objects in itslef.it is not guaranteed that your offer will be accepeted by LinkedList  

		ll1.offerFirst("kalia");
		ll1.offerLast("ooops");

		// but in case of addFirst and addLast you have to add elements(forcefully)
		ll1.addLast(33);
		ll1.addFirst(43);

		System.out.println(ll1);

		// peekFirst and pollFirst(peek mein first object ka data ka copy aata hai aur
		// list waise ka waise hi rehta hai but pollfirst mein mein pehla object return
		// hota hai aur wo object list se remove ho jaata hai )
		
	System.out.println(ll1.peekFirst());
	System.out.println(ll1);
	System.out.println(ll1.pollFirst());
	System.out.println(ll1);
	
	//also removes the first element and returns the first element
	System.out.println(ll1.pop());
	System.out.println(ll1);

	}

}
