package pattern_practice;

class Pattern7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=1,j=1,n=14;
		int m=0;
		while(i<=n)
		{
			j=1;
			while(j<=i)
			{
				char c=(char) (i+j-2 +'A');
				System.out.print(c+" ");
				j++;
			}
			i++;
			System.out.println();
		}	
		
/*	
 	
A 
B C 
C D E 
D E F G 
E F G H I 

*/		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
