package javalearning;

public class Operators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		        int a = 10;
		        int b = 5;
		        
		        // Arithmetic operators
		        int sum = a + b;
		        int difference = a - b;
		        int product = a * b;
		        int quotient = a / b;
		        int remainder = a % b;
		        
		        System.out.println("Arithmetic Operators:");
		        System.out.println("Sum: " + sum);
		        System.out.println("Difference: " + difference);
		        System.out.println("Product: " + product);
		        System.out.println("Quotient: " + quotient);
		        System.out.println("Remainder: " + remainder);
		        
		        // Relational operators
		        boolean isEqual = a == b;
		        boolean isNotEqual = a != b;
		        boolean isGreaterThan = a > b;
		        boolean isLessThan = a < b;
		        boolean isGreaterThanOrEqual = a >= b;
		        boolean isLessThanOrEqual = a <= b;
		        
		        System.out.println("\nRelational Operators:");
		        System.out.println("Equal: " + isEqual);
		        System.out.println("Not Equal: " + isNotEqual);
		        System.out.println("Greater Than: " + isGreaterThan);
		        System.out.println("Less Than: " + isLessThan);
		        System.out.println("Greater Than or Equal: " + isGreaterThanOrEqual);
		        System.out.println("Less Than or Equal: " + isLessThanOrEqual);
		        
		        // Logical operators
		        boolean logicalAnd = (a > 0) && (b > 0);
		        boolean logicalOr = (a > 0) || (b > 0);
		        boolean logicalNotA = !(a > 0);
		        boolean logicalNotB = !(b > 0);
		        
		        System.out.println("\nLogical Operators:");
		        System.out.println("Logical AND: " + logicalAnd);
		        System.out.println("Logical OR: " + logicalOr);
		        System.out.println("Logical NOT for A: " + logicalNotA);
		        System.out.println("Logical NOT for B: " + logicalNotB);
		        
		        // Assignment operators
		        int c = 7;
		        c += 3; 
		        c -= 2; 
		        c *= 5; 
		        c /= 2; 
		        c %= 3;
		        
		        System.out.println("\nAssignment Operators:");
		        System.out.println("Value of c: " + c);
		        
		        // Increment and Decrement operators
		        int d = 8;
		        d++; 
		        d--;
		        
		        System.out.println("\nIncrement and Decrement Operators:");
		        System.out.println("Value of d: " + d);
		    
			

	}

}
