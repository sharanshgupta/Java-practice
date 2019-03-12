package datastructures;

import java.util.ArrayList;

public class Lists {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Create a collection
		ArrayList<String> cities = new ArrayList();
		
		//Add some elements
		cities.add("Delhi");
		cities.add("Mumbai");
		cities.add("Chennai");
		cities.add("Kolkata");
		
		//Iterate the collection
		for (String city : cities) {
			System.out.println(city);
		}
		
		//Get the size
		System.out.println("There are " + cities.size() + " cities in the colection");
		
		//Get a particular element
		System.out.println("First city in collection is " + cities.get(0));
		//Removing first city
		cities.remove(0);
		System.out.println("Now first city after removal is " + cities.get(0));

	}

}
