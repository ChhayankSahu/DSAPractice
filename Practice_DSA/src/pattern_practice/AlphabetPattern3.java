package pattern_practice;

class AlphabetPattern3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/*
		 * 
A B C D E 

A B C D E 

A B C D E 

A B C D E 

A B C D E 

			
			
		 * */
		int i=1,j=1,n=5;
		int c=0;
		
		
		while (i<=n)
		{
			j=1;
			int m=0;
			while(j<=n)
			{
				char ch=(char) (m++ +'A');
				//System.out.print(ch+" ");
				System.out.print( ch+" ");
				j++;
				//m++;
			}
			i++;
			System.out.println("\n");
		}
	}

}

