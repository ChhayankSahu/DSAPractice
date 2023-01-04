package pattern_practice;

class AAABBBCCC_pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i=1,j=1,n=5;
		int c=0;

		
/**
A A A A A 

B B B B B 

C C C C C 

D D D D D 

E E E E E

*/
		
		while (i<=n)
		{
			j=1;
			//int m=i-1;
			while(j<=n)
			{
				char ch=(char) (i-1 +'A');
				System.out.print(ch+" ");
				//System.out.print( i+" ");
				j++;
				//m++;
			}
			i++;
			System.out.println("\n");
		}	
		
	}

}
