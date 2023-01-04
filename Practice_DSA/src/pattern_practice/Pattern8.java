package pattern_practice;

class Pattern8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=1,j=1,n=4;
		int m=0;
		
		while(i<=n)
		{
			j=1;
			
			while(j<=i)
			{
				char c=(char) ('A' -i+j+1-1  + n-1  );
				System.out.print(c +" ");
				j++;
			}
			i++;
			System.out.println();
		}	
		
		
		
/*4
 * 

D 
C D 
B C D 
A B C D 




 * */		
		
		
		
		
		
	}

}
