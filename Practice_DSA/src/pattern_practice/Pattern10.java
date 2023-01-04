package pattern_practice;

class Pattern10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		

		
		int i=1,j=1,n=4;
		int m=0;
		
		while(i<=n)
		{
			j=n-i+1;
			
			while(j>=1)
			{
				//char c=(char) ('A' -i+j+1-1  + n-1  );
				System.out.print("*");
				j--;
			}
			i++;
			System.out.println();
		}	
		
		
/*
		
****
***
**
*


*/		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
