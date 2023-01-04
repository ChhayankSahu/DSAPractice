package pattern_practice;

class AlphabetPattern2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * 
		 *  1 

			2 1 

			3 2 1 

			4 3 2 1 

			5 4 3 2 1 
			
			
		 * */
		int i=1,j=1,n=5;
		int c=0;
		
		
		while (i<=n)
		{
			j=1;
			int m=i-1;
			while(j<=i)
			{
				char ch=(char) (m++ +'A');
				//System.out.print(ch+" ");
				System.out.print( i-j+1+" ");
				j++;
				//m++;
			}
			i++;
			System.out.println("\n");
		}	
		
		
		
		
		
	}

}
