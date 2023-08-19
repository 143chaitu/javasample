package javalearning;

public class Bank {

	public static void main(String[] args) {
		int i,d,t,bal,in,ti,tb;
		i=25000;//initial balance
		d=1500;//deposit balance
		t=1100;//transfer money
		bal=(i+d)-t;
		in=bal*2/100;//interest of 2%
		ti=in*12;//total interest
		tb=bal+ti;
		System.out.println("interest was "+ti+"total balance is :"+tb);
	}

}
