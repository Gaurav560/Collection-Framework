import java.util.*;

public class LaunchArrayListInbuiltMethods {

	
	//using ArrayList Inbuilt Methods
	public static void main(String[] args) {

		ArrayList al1 = new ArrayList();
		al1.add(10);
		al1.add(20);
		al1.add(30);
		al1.add(40);
		al1.add(50);
		System.out.println(al1);
System.out.println(al1.contains(30));
System.out.println(al1.indexOf(30));
System.out.println(al1.isEmpty());

//size is how data we have stored 
System.out.println(al1.size());


//capacity is how much data we can keep
al1.ensureCapacity(10);

//trim to size from capacity
al1.trimToSize();

//now again checking the size of arrayList
System.out.println(al1.size());
	

//to get the class 
System.out.println(al1.getClass());

//to wipe out everything from arrayList Object
al1.clear();

//again checking the size
System.out.println(al1.size());
	}

}
