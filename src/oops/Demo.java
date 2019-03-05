package oops;

class Person {
	private String name;
	private String food;
	private String phone;
	
	public Person(String name, String food, String phone) throws Exception {
		this.setName(name);
		this.food = food;
		this.phone = phone;
	}
	
	public String getName(){
		return this.name;
	}
	
	public void setName(String name) throws Exception {
		if(name != null 
				&& !name.isEmpty() 
				&& !name.trim().isEmpty()){
			this.name = name;
		} else {
			throw new Exception("Name is not valid");
		}
	}
	
	void walk()
	{
		System.out.println(name + " is walking.");
	}
	
	void eat()
	{
		System.out.println(name + " is eating " + food + ".");
	}
	
	void contact()
	{
		System.out.println("Phone number of " + name + " is " + phone + ".");
	}
}

public class Demo {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub

		
		Person p2 = new Person("Roman","Burger","999999999");
		Person p1 = new Person("Sharansh","Burger","999999999");

		
		System.out.println("P1 Name -"+p1.getName());
		
		p1.walk();
		p1.eat();
		p1.contact();
		
		
	
		System.out.println("P2 Name -"+p2.getName());
		
		
		
	}

}
