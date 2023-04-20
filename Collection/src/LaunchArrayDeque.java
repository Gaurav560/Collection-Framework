import java.util.*;
//it is not best practice to import all the classes of util package
//because it creates performance issue.import only the required classes.
public class LaunchArrayDeque {

	public static void main(String[] args) {
	
		//these classes are present in util package so we have to import that package 
		//7 classes in collection framework and 3 interfaces(List,Queue,Set)
		//7 classes are :
		//ArrayList
		//LinkedList
		//ArrayDeque
		//PriorityQueue
		//TreeSet
		//HashSet
		//Linked HashSet
		
		
		
//Note:In collection framework ,whatever data you add gets stored as object
		//ArrayDeque internally uses Double Ended Queue Data Structure
		
		ArrayDeque  ad1=new ArrayDeque();
ad1.add(10);
ad1.add(20);
ad1.add(30);
ad1.add(40);
ad1.add(50);
System.out.println(ad1);

ad1.addFirst(23);
ad1.addLast(65);

System.out.println(ad1);

System.out.println("**********************************************************");




	}
	
	
	
	

}
