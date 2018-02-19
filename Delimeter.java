/* 
Name: shokouh Motamedi 
Date: 1/31/2018
Program should read 10 number, rewrite and make thier average.

*/

import java.util.Scanner;

public class Delimeter {
	public static void main(String[] args) {

	Scanner keyboard = new Scanner(System.in);
		keyboard.useDelimiter(",");

	System.out.println(" Enter 10 numbers \n  Separated with , ");

	int firstNum = keyboard.nextInt(); //read first number

	int secondNum = keyboard.nextInt(); // read Secoun Number

	int thirdNum = keyboard.nextInt(); // read Thired Number

	int fourNum = keyboard.nextInt(); //read Four number

	int fiveNum = keyboard.nextInt(); //read Five number

	int sixNum = keyboard.nextInt(); //read Six number

	int sevenNum = keyboard.nextInt(); //read Seven number

	int eightNum = keyboard.nextInt(); //read Eight number

	int nineNum = keyboard.nextInt(); //read Nine number

	int tenNum = keyboard.nextInt(); //read Ten number

	int sum = firstNum + secondNum + thirdNum + fourNum + fiveNum + sixNum + sevenNum + eightNum + nineNum + tenNum ;
	int average = sum/10;

	System.out.println(firstNum);
	System.out.println(secondNum);
	System.out.println(thirdNum);
	System.out.println(fourNum);		
	System.out.println(fiveNum);	
	System.out.println(sixNum);	
	System.out.println(sevenNum);	
	System.out.println(eightNum);	
	System.out.println(nineNum);	
	System.out.println(tenNum);	

	System.out.println("The \t Average of \t This TEN \t Number \t iS \t" + average);	
	

}

}