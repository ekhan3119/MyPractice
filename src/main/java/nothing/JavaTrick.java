package nothing;

import java.util.HashSet;
import java.util.Set;

public class JavaTrick {

	public static void main(String[] args) {
		/*
		 * Double Brace Initialization: In Java, collections such as sets, lists, maps,
		 * etc. does not have a simple and easy way to initialize the values during
		 * declaration. Developers either push values into the collection or creates a
		 * static block for the constant collection. Using double brace initialization,
		 * collections can be initialized during declaration with less efforts and time.
		 */
		Set<String> GFG = new HashSet<String>() {
			{
				add("DS");
				add("ALGORITHMS");
				add("BLOCKCHAIN");
				add("MACHINE LEARNING");
			}
		};
		System.out.println(GFG);
	}

}
