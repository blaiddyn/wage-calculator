import java.util.Scanner;

public class wageCalc {
	
	public static void main(String args[]) {
		
		double hourlyWage, hoursWorked, daysWorked, tax, total;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Hourly Wage: ");
		hourlyWage = input.nextDouble();
		
		System.out.print("Hours worked today: ");
		hoursWorked = input.nextDouble();
		
		System.out.print("Days worked this week: ");
		daysWorked = input.nextDouble();
		
		System.out.print("Enter tax rate as a decimal: ");
		tax = input.nextDouble();
		
		total = hourlyWage * hoursWorked * daysWorked * tax;
		
		System.out.print("You will make $" + total);
		System.out.print(" this week!"); 
		
	}

}
