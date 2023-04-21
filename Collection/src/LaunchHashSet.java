
import java.util.*;

public class LaunchHashSet {

	public static void main(String[] args) {

		LinkedHashSet lhs1 = new LinkedHashSet();
		lhs1.add(5);
		lhs1.add(90);
	//duplication not allowed
		lhs1.add(90);

		lhs1.add(20);
		lhs1.add(30);
		lhs1.add(34);
		lhs1.add(55);

		System.out.println(lhs1);

		System.out.println("**********************************************************");

	}

}
