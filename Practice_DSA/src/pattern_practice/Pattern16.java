package pattern_practice;

class Pattern16 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		

		
		int i=1,j=1,n=8;
		int m=1;
		
		while(i<=n)
		{
			
			
				j=1;
	
			while(j<n-i+1)
			{
				
				System.out.print( "-" +" ");
				j++;
			}
			
		
			
			j=1;
			while(j<=i)
			{
				
				System.out.print(j +" ");
				j++;
			}
			
			
			
			j=i-1;
			while(j>0)
			{
				
				System.out.print(j +" ");
				j--;
			}
			
			
			
			
			i++;
			System.out.println();
		}	
			
		
		
/*	
  
  
  
  
 	
- - - - - - - 1 
- - - - - - 1 2 1 
- - - - - 1 2 3 2 1 
- - - - 1 2 3 4 3 2 1 
- - - 1 2 3 4 5 4 3 2 1 
- - 1 2 3 4 5 6 5 4 3 2 1 
- 1 2 3 4 5 6 7 6 5 4 3 2 1 
1 2 3 4 5 6 7 8 7 6 5 4 3 2 1 



		
	*/	
		
		
	}

}
