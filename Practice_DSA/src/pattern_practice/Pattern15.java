package pattern_practice;

class Pattern15 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		
		int i=1,j=1,n=8;
		int m=1;
		
		while(i<=n)
		{
			
			
				j=1;
	
			while(j<=n-i+1)
			{
				
				System.out.print( j +" ");
				j++;
			}
			
			j=2*i-2;
			while(j>0)
			{
				
				System.out.print("*" +" ");
				j--;
			}
			
			j=n-i+1;
			while(j>0)
			{
				
				System.out.print(j +" ");
				j--;
			}
			
			
			i++;
			System.out.println();
		}	
			
		
		
/*	
  
  
  
  
 	
1 2 3 4 5 6 7 8 8 7 6 5 4 3 2 1 
1 2 3 4 5 6 7 * * 7 6 5 4 3 2 1 
1 2 3 4 5 6 * * * * 6 5 4 3 2 1 
1 2 3 4 5 * * * * * * 5 4 3 2 1 
1 2 3 4 * * * * * * * * 4 3 2 1 
1 2 3 * * * * * * * * * * 3 2 1 
1 2 * * * * * * * * * * * * 2 1 
1 * * * * * * * * * * * * * * 1 



		
	*/	
		
		
	}

}
