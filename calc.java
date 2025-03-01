package com.madesh.demo;
import java.util.*;
public class calc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0;
		while(i<1) {
		System.out.println("SCIENTIFIC CALCULATOR");
		System.out.println();
		System.out.println("Press 1 for Addition");
		System.out.println("Press 2 for Subtraction");
		System.out.println("Press 3 for Multiplication");
		System.out.println("Press 4 for Division");
		System.out.println("Press 5 for Square Root");
		System.out.println("Press 6 for Exponential");
		System.out.println("Press 7 for Celcius");
		System.out.println("Press 8 for Fhrenheit");
		System.out.println("Press 9 for AusToInd");
		System.out.println("Press 10 for IndToAus");
		System.out.println();
		Scanner sc=new Scanner(System.in);
		
		calc c=new calc();
		System.out.println("Enter the Type of Calculation:");
		int type_of_calculation=sc.nextInt();
		
	
		
		
 		
		
		if(type_of_calculation==1) {
			System.out.println("Enter the value of a:");
			int a=sc.nextInt();
			System.out.println("Enter the value of b:");
			
			int b=sc.nextInt();
			System.out.println("Respected added value: "+c.add(a,b));
			System.out.println("Wants to run once more press 0 else 1");
			i=sc.nextInt();
			
}
		else if(type_of_calculation==2) {
			System.out.println("Enter the value of a:");
			int a=sc.nextInt();
			System.out.println("Enter the value of b:");
			//int a=sc.nextInt();
			int b=sc.nextInt();
			System.out.println("Respective subtracted value: "+c.sub(a,b));
			System.out.println("Wants to run once more press 0 else 1");
			i=sc.nextInt();
		}
		else if(type_of_calculation==3) {
			System.out.println("Enter the value of a:");
			int a=sc.nextInt();
			System.out.println("Enter the value of b:");
		//	int a=sc.nextInt();
			int b=sc.nextInt();
	System.out.println("Respective multiplied value: "+c.mul(a,b));
	System.out.println("Wants to run once more press 0 else 1");
	i=sc.nextInt();
}
		else if(type_of_calculation==4) {
			System.out.println("Enter the value of a:");
			int a=sc.nextInt();
			System.out.println("Enter the value of b:");
			//int a=sc.nextInt();
			int b=sc.nextInt();
	System.out.println("Respective quotient value: "+ c.div(a,b));
	System.out.println("Wants to run once more press 0 else 1");
	i=sc.nextInt();
}
		
		else if(type_of_calculation==6) {
			System.out.println("Enter the value of a:");
			int a=sc.nextInt();
			System.out.println("Enter the value of b:");
			//int a=sc.nextInt();
			int b=sc.nextInt();
	System.out.println("Calculated exponent value: "+c.expo(a,b));
	System.out.println("Wants to run once more press 0 else 1");
	i=sc.nextInt();
}
		else if(type_of_calculation==7) {
			System.out.println("Enter the value of a:");
		//	System.out.println("Enter the value of b:");
			int a=sc.nextInt();
			//int b=sc.nextInt();
	System.out.println("Converted Fahrenheit to celcius: "+c.cel(a));
	System.out.println("Wants to run once more press 0 else 1");
	i=sc.nextInt();
}
		else if(type_of_calculation==8) {
			System.out.println("Enter the value of a:");
		//	System.out.println("Enter the value of b:");
			int a=sc.nextInt();
		//	int b=sc.nextInt();
	System.out.println("Converted celcius to fahrenheit: "+c.fah(a));
	System.out.println("Wants to run once more press 0 else 1");
	i=sc.nextInt();
}
		else if(type_of_calculation==9) {
			System.out.println("Enter the value of australian rupees:");
			//System.out.println("Enter the value of b:");
			int a=sc.nextInt();
			//int b=sc.nextInt();
	System.out.println("Your Australian ruppee at india: "+c.AusToInd(a));
	System.out.println("Wants to run once more press 0 else 1");
	i=sc.nextInt();
}
		else if(type_of_calculation==10) {
			System.out.println("Enter the value of indian rupees:");
		//	System.out.println("Enter the value of b:");
			int a=sc.nextInt();
		//	int b=sc.nextInt();
	System.out.println("Your indian ruppees at australia: "+c.IndToAus(a));
	
	System.out.println("Wants to run once more press 0 else 1");
	i=sc.nextInt();
}
else {
	System.out.println("Enter the valid Method of calculation");
}}
		System.out.println("Thankyou Welcome Again");}


	
	public int add(int x,int y) {
	// double a=x+y;
	// int a1=(int)a;
		return x+y;
	}
	public int sub(int x,int y) {
	//	double s=x-y;
	//	int s1=(int)s;
		return x-y;
	}
	public int mul(int x,int y) {
	//	double m=x*y;
	//	int m1=(int)m;
		return x*y;
	}
	public int div(int x,int y) {
		//double d=x/y;
		//int d1=(int)d;
		return x/y;
	}
	/*public double sqrt() {
		
		return x;
	}*/
	public int expo(int x,int y) {
		int r=x;
		for(int i=0;i<y-1;i++) {
			x=x*r*1;
		}
		return x;
	}
	public double cel(int x) {
		x=(x*9/5)+32;
		return x;
	}
	public double fah(int x) {
		x=(9/5)*(x-32);
		return x;
	}
	public double AusToInd(double x) {
		x=x*53.90;
		return x;
	}
public double IndToAus(double x) {
	x=x*0.019;
	return x;
}}
	//else {
		
	//}

