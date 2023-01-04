package pattern_practice;

class Pattern5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		int i=1,j=1,n=5;
		int m=0;
		while(i<=n)
		{
			j=i;
			while(j<i*2)
			{
				char c=(char) (j-1 +'A');
				System.out.print(c+" ");
				j++;
			}
			i++;
			System.out.println();
		}		
/*

A 
B C 
C D E 
D E F G 
E F G H I 

 

*/
		
		
	}

}
