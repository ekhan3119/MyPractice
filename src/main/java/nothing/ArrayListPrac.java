package nothing;

import java.util.ArrayList;
import java.util.Collections;

public class ArrayListPrac {

	public static void main(String[] args) {
		ArrayList<String> cars = new ArrayList<String>();
	    cars.add("Volvo");
	    cars.add("BMW");
	    cars.add("Ford");
	    cars.add("Mazda");
	    //System.out.println(cars.set(1, "toyota"));
	    //System.out.println(cars);
	    //System.out.println(cars.get(1));
	    //System.out.println(cars.remove(1));
	    //System.out.println(cars.add("BMW"));
	    //System.out.println(cars);
	    //cars.clear();
	    //System.out.println(cars.size());
//	    for (int i =0; i< cars.size(); i++) {
//	    	System.out.println(cars.get(i));
//	    }
	    
//	    for (String i: cars) {
//	    	System.out.println(i);
//	    }
	    
	    
	    ArrayList<Integer> myNumbers = new ArrayList<Integer>();
	    myNumbers.add(33);
	    myNumbers.add(15);
	    myNumbers.add(20);
	    myNumbers.add(34);
	    myNumbers.add(8);
	    myNumbers.add(12);
	    Collections.sort(myNumbers);
	    System.out.println(myNumbers);
	    
	    
	    //for each loop
	    for(int i : myNumbers) {
	    	System.out.println(i);
	    }
	}

}
