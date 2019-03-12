package datastructures;

public class Arrays {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] alphabet = { "a", "b", "c", "d", "e", "f", };

		System.out.println("Using the For-each way");
		for (String letter : alphabet) {
			System.out.print(letter);
		}

		System.out.println("\n**Double arrays**");
		String[][] users = { { "Sachin", "Tendulkar", "srt@gmail.com", "9999999999" },
				{ "Virat", "Kohli", "vk@gmail.com", "8888888888" },
				{ "Virender", "Sehwag", "vs@gmail.com", "7777777777" } };
		// Get size of the double array
		int numofusers = users.length;
		int numoffields = users[0].length;
		System.out.println("Number of users is " + numofusers);
		System.out.println("Number of fields is " + numoffields);

		// Traverse through a double array Manually when you know number of fields
		for (int i = 0; i < numofusers; i++) {
			String firstname = users[i][0];
			String lastname = users[i][1];
			System.out.println(firstname + " " + lastname);
		}
		//Traverse double array using for-each
		System.out.println("**Traversing double array using for each**");
		for (String[] row : users) {
			System.out.print("[");
			for (String field : row) {
				System.out.print(field + " ");
			}
			System.out.println("]");
		}
	}

}
