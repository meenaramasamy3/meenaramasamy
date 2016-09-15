public class PrimeNumber {

	public static void main(String[] args) {
		int var = 0;
		int n;
		for(int i=1; i<=100; ++i)
		   {
		      
		      for(int j=2; j<=i/2; ++j)
		      {
		    	  var=0;
		         if(i%j==0)
		         {
		            var=1;
		            break;
		         }
		      }
		      if(var==0)
		      { 
		    	  n=i;
		    	  int sum=0;
		    	  while(n!=0)
		    	  {
		            int rem=n%10;
		            sum=sum+rem;
		            n=n/10;
		    	  }
		    	  System.out.println(sum);
		        
		  }
		   }
}
}
