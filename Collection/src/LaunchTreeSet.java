
import java.util.*;

public class LaunchTreeSet {

	public static void main(String[] args) {

		TreeSet ts1 = new TreeSet();
		ts1.add(-1);
		ts1.add(90);
		//duplicates ignored
		ts1.add(90);
		
		ts1.add(20);
		ts1.add(30);
	ts1.add(34);
	ts1.add(55);
	
//ts1.add("gaurav");
//ts1.add("amar");
//
////duplicate gets ignored
//ts1.add("amar");
//
//ts1.add("piyush");
//ts1.add("divya");
//ts1.add("sameer");
//ts1.add("puchu");
		System.out.println(ts1);
		System.out.println(ts1.ceiling(40));
		System.out.println(ts1.floor(40));
		System.out.println("**********************************************************");

		System.out.println(ts1.ceiling(30));
		System.out.println(ts1.floor(30));
		System.out.println("**********************************************************");

	


	}

}
