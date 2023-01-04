package pattern_practice;
/* pattern 
 * 
 * 
ABC

BCD

CDE

 *  */
 class AlphabetPattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=1,j=1,n=3;
		int c=0;
		
		
		while (i<=n)
		{
			j=1;
			int m=i-1;
			while(j<=n)
			{char ch=(char) (m++ +'A');
				System.out.print(ch);
				j++;
				//m++;
			}
			i++;
			System.out.println("\n");
		}	
		
		
		
	}

}
