package javalearning;

import java.util.Scanner;

public class Employeeallowence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sal;
		double da,hra,pf,gross;
		System.out.println("Enter the Salary :");
		Scanner sc=new Scanner(System.in);
		sal=sc.nextInt();
		da=sal*12/100;
		hra=sal*13/100;
		pf=sal*15/100;
		gross=sal+da+hra+pf;
		System.out.println("The Slary was: "+sal+"The da was: "+da+"The hra was: "+hra+"The pf was: "+pf+"Total gross was : "+gross);
		
	}

}
