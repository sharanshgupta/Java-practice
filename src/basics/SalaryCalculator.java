package basics;

public class SalaryCalculator {

	public static void main(String[] args)
	{
		int salary;
		int hoursPerWeek = 40;
		int weeksPerYear = 52;
		int rate = 50;
		salary = hoursPerWeek * weeksPerYear * rate;
		System.out.println("My total salary at  " + rate + " per hour for an year is " + salary + ".");
		
	}
}
