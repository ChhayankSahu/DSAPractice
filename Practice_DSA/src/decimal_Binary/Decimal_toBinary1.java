package decimal_Binary;

class Decimal_toBinary1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int n=11;
		int ans=0;
		int i=0;
		int rem=0;
		int var=0;
		int  n2=n;
		int ans2=0;
		int bit=0,rem2=0, result=0,var2=0;
		while (n!=0)
		{
			 rem=n%10;
			 
			 
			n=n/10;
		
			 var=(int) (rem*(	Math.pow(10, i)));
			 
			 ans2= ans2*10 +rem; //  reverse print decimal no.
			 
			ans=var+ans;   //  as it is print decimal no.
			i++;
		}
		i=0;
		
		while(n2!=0)
		{
			
			bit=n2&1;
			var2=(int)(bit*(Math.pow(10, i)));
			result=result + (var2);  // bit representation of given no.
			i++;
			n2 >>= 1;
		}
		 
		System.out.println(ans);
		
		System.out.println("result id "+result);
		System.out.println("ans2  is "+ans2);
		
		int p=-78;
		
		System.out.println(~p);
		
		
		
		//  result contain binary rep. of the positive part of the number 
		
		// now do complement the result 
		 n=-11;
		 ans=0;
		 i=0;
		 rem=0;
		 var=0;
		  n2=-n;
		 ans2=0;
		 bit=0;rem2=0; result=0;var2=0;
		
		 System.out.println("n2  id "+n2);
		while(n2!=0)
		{
			
			bit=n2&1;
			var2=(int)(bit*(Math.pow(10, i)));
			result=result + (var2);  // bit representation of given no.
			i++;
			n2 >>= 1;
		}
		System.out.println(" result id "+result);
		int lesscomp=0;
		 i=0;
		 boolean flag=false;
		while(result!=0 | i<=31)
		{
			
			bit=result % 10;
		//	System.out.println("bit  result id "+bit);
		
			if(bit==0 && flag==false)
			{
				var2=(int)(bit*(Math.pow(10, i)));
				lesscomp=lesscomp + (var2);  // bit representation of given no.
				i++;
				result /= 10;
				System.out.println("bit  0false id "+bit);
				continue;
				
			}
			else if (bit==1 &&  flag==false)
			{
				System.out.println("bit  1false id "+bit);
				var2=(int)(bit*(Math.pow(10, i)));
				lesscomp=lesscomp + (var2);  // bit representation of given no.
				i++;
				result /= 10;
				flag=true;
				continue;
			}
			else {				
				bit= bit==0 ? 1 :0;
				System.out.println("bit  true id "+bit);
				var2=(int)(bit*(Math.pow(10, i)));
				lesscomp=lesscomp + (var2);  // bit representation of given no.
				i++;
				result /= 10;
			
			}
			
			
		//	System.out.println("complement bit  id "+bit);
	//		System.out.println("-----------------------------");
		
			
		}
		
		System.out.println("lesscomp is  actual complement  id "+lesscomp);
		
	}

}
