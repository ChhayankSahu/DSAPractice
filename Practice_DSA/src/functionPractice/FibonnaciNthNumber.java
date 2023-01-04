package functionPractice;

import java.util.Scanner;

class FibonnaciNthNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter varaible");
		a=sc.nextInt();
		
		b=fib(a);
		System.out.println("Nth fibonachi number is -> "+b);
		
	}
	
	private static int fib(int a) {
		// TODO Auto-generated method stub
		int n=a;
		if (n==1)
			return 0;
		else if(n==2)
			return 1;
	
		
		return fib(n-1)+fib(n-2);
	}

	
	

}
