package pattern_practice;

public class Pattern9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int i=1,j=1,n=4;
		int m=0;
		
		while(i<=n)
		{
			j=1;
			
			while(j<=n-i)
			{
				
				System.out.print( "-");
				j++;
			}
			j=1;
			while(j<=i)
			{
				
				System.out.print( "*");
				j++;
			}
			
			
			i++;
			System.out.println();
		}	
		
		
		
		
/*
 
---*
--**
-***
****

 
 
 *
 *
 */	
		
		
		
		
		
		
		
		
		
	}

}
