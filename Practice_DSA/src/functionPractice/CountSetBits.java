package functionPractice;

import java.io.IOException;
import java.util.Scanner;

class CountSetBits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("enter varaible");
		a=sc.nextInt();
		
		System.out.println("enter varaible");
		b=sc.nextInt();
		
		int bits=countBits(a)+countBits(b);
		System.out.println("no. of bits are "+ countBits(a));
		System.out.println("no. of bits are "+ countBits(b));
		
	}

	private static int countBits(int x) {
		// TODO Auto-generated method stub
		
		int count=0;
		
		while (x!=0)
		{
			
			if((x&1)==1)
				count++;
			x>>=1;
		}
		
		return count;
	}

}
