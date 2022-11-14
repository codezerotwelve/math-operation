import java.util.Scanner;

/**
 * 
 * @author - codezerotwelve
 *
 */

public class MathOperation {

	public static void main(String[] args) 
	{
		boolean mathProg = true;
		double n1;
		double n2;
		double result;
		Scanner mathIn = new Scanner(System.in);
		
		while(mathProg != false) 
		{
			System.out.println("==== BASIC MATH OPERATION PROGRAM ====");
			System.out.println("[1] Addition       [2] Substitution\n[3] Multiplication [4] Division\n[5] Exit");
			System.out.println("======================================");
			System.out.print("> ");
			char choose = mathIn.next().charAt(0);
			
			switch(choose) {
			
			case '1':
				System.out.print("Enter first number: ");
				n1 = mathIn.nextDouble();
				System.out.print("Enter second number: ");
				n2 = mathIn.nextDouble();
				result = addOpt(n1,n2);
				System.out.println("Addition: " + result);
				freeze(2000);
				break;
			case '2':
				System.out.print("Enter first number: ");
				n1 = mathIn.nextDouble();
				System.out.print("Enter second number: ");
				n2 = mathIn.nextDouble();
				result = subOpt(n1, n2);
				System.out.println(result);
				freeze(2000);
				break;
			case '3':
				System.out.print("Enter first number: ");
				n1 = mathIn.nextDouble();
				System.out.print("Enter second number: ");
				n2 = mathIn.nextDouble();
				result = mulOpt(n1, n2);
				System.out.println(result);
				freeze(2000);
				break;
			case '4':
				System.out.print("Enter first number: ");
				n1 = mathIn.nextDouble();
				System.out.print("Enter second number: ");
				n2 = mathIn.nextDouble();
				result = divOpt(n1, n2);
				System.out.println(result);
				freeze(2000);
				break;
			case '5':
				mathProg = false;
				System.out.println("The program has stopped.");
				break;
			default:
				System.out.println("Command not found.");
				break;
			}
		}
	}
	
	static double addOpt(double n1, double n2) 
	{
		double add = n1 + n2;
		return add;
	}
	
	static double subOpt(double n1, double n2) 
	{
		double sub = n1 - n2;
		return sub;
	}
	
	static double mulOpt(double n1, double n2) 
	{
		double mul = n1 * n2;
		return mul;
	}
	
	static double divOpt(double n1, double n2) 
	{
		double div = n1 / n2;
		return div;
	}
	
	static void freeze(int mil) {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
