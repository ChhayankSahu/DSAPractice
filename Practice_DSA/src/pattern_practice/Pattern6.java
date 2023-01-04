package pattern_practice;

class Pattern6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=1,j=1,n=5;
		int m=0;
		while(i<=n)
		{
			j=1;
			while(j<=i)
			{
				char c=(char) (i-1 +'A');
				System.out.print(c+" ");
				j++;
			}
			i++;
			System.out.println();
		}	
		
		
		
/*
 * 
A 
B B 
C C C 
D D D D 
E E E E E 
 
 
 * 
 * */		
		
		
		
		
		
		
		
		
		
	}

}
