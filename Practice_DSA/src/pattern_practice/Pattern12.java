package pattern_practice;

class Pattern12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		
		
		
		int i=1,j=1,n=4;
		int m=0;
		
		while(i<=n)
		{
			
			
				j=n-i+1;
			
			while(j>1)
			{
				
				System.out.print( "-");
				j--;
			}
			
			j=1;
			while(j<=i)
			{
				
				System.out.print(i);
				j++;
			}
			
			
			i++;
			System.out.println();
		}	
			
/*		
			---1
			--22
			-333
			4444
		
*/	
			
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
