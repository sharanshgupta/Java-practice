package datastructures;

import java.util.HashSet;
import java.util.Set;

import javax.lang.model.type.IntersectionType;
import javax.naming.InsufficientResourcesException;

public class Sets {

	public static void main(String[] args) {
		// Create a collection
		Set<String> animals = new HashSet<String>();

		// Add elements
		animals.add("Tiger");
		animals.add("Hippo");
		animals.add("Rabit");
		animals.add("Pig");
		animals.add("Crocodile");
		// Adding Rabbit again but it wont add as Hashset keeps unique values
		animals.add("Rabit");

		for (String animal : animals) {
			System.out.println(animal);
		}

		Set<String> farmanimals = new HashSet<String>();
		farmanimals.add("Hen");
		farmanimals.add("Pig");
		farmanimals.add("Dog");
		farmanimals.add("Crocodile");
		
		System.out.println(farmanimals);

		// Intersection beetwen animals and farm animals
		// Cop existing Set into New Set
		Set<String> intersectionset = new HashSet<String>(animals);
		System.out.println(intersectionset);
		
		//Retain elements that are also in other set
		intersectionset.retainAll(farmanimals);
		System.out.println("The Intersection is " + intersectionset );

	}

}
