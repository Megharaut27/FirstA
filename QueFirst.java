package LOOP;

public class QueFirst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				
				int n=9;
				for(int i=0;i<n;i++)
				{
					//Letter E
					for(int j=0;j<n;j++) 
					{
						if(i==0||i==n-1||j==n/2)
						System.out.print("*");
						else 
						System.out.print(" ");
					}
					System.out.print("   ");
					//Letter N
					for(int j=0;j<n;j++) 
					{
						if(j==0||i==j||j==n-1)
						System.out.print("*");
						else 
						System.out.print(" ");
					}
					System.out.print("   ");
					//Letter E
					for(int j=0;j<n;j++)
					{
						if(i==0||i==n-1||j==0||i==n/2)
						System.out.print("*");
						else 
						System.out.print(" ");
					}
					System.out.print(" ");
				    // Letter U	
				   for(int j=0;j<n;j++)
				   {
					   if(j==0  && i!=n-1||j==n-1 && i!=n-1||i==n-1 && j!=0 && j!=n-1)
					   System.out.print("*");
					   else 
					   System.out.print(" ");
				   }
				   System.out.print(" ");
					// Letter R
					for(int j=0;j<n;j++) 
					{
						if(i==0||j==0||i==n/2||i-j==(n-1)/2||j==n-1&& i<=(n-1)/2)
						System.out.print("*");
						else 
						System.out.print(" ");
					}
					System.out.print(" ");
					// Letter o
					for(int j=0;j<n;j++) 
					{
						if(i==0 && j!=0&& j!=n-1||j==0 && i!=0&& i!=n-1||j==n-1 && i!=0&& i!=n-1||i==n-1 &&j!=0 && j!=n-1)
						System.out.print("*");
					    else 
					 	System.out.print(" ");
				    }
				   System.out.print("  ");
				   // Letter N
				    for(int j=0;j<n;j++) 
				    {
				    	if(j==0||i==j||j==n-1)
				    	System.out.print("*");
				    	else 
						System.out.print(" ");
				    }
				    System.out.println(" ");
				}
	}

}
