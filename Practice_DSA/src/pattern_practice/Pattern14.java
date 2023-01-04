package pattern_practice;

class Pattern14 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		
		int i=1,j=1,n=4;
		int m=0;
		
		while(i<=n)
		{
			
			
				j=i-1;
			
			while(j>0)
			{
				
				System.out.print( "-");
				j--;
			}
			
			j=i;
			while(j<=n)
			{
				
				System.out.print(j);
				j++;
			}
			
			
			i++;
			System.out.println();
		}	
			
		
		
/*		
		1234
		-234
		--34
		---4
		
	*/	
		
		
	}

}
