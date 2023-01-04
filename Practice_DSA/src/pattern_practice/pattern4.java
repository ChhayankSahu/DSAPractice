package pattern_practice;

public class pattern4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		int i=1,j=1,n=3;
		while(i<=n)
		{
			j=1;
			while(j<=n)
			{
				char c=(char) (i+j -2+'A');
				System.out.print(c+" ");
				j++;
			}
			i++;
			System.out.println();
		}		
/*

A B C 
B C D 
C D E 

*/
		
		
		
		
	}

}
