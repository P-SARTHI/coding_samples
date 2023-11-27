
public class  pascaltriangle
{
	public static void main (String[] args)
	{
		int n=5;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<=n-i;j++)
			{
				System.out.print(" ");
		    }
			for(int k=0;k<=i;k++)
			{   int f1=1;
				int f2=1;
				int f3=1;
				for(int f=1;f<=i;f++)
				{
					f1=f1*f;
				}
				for(int f=1;f<=k;f++)
				{
					f2=f2*f;
				}
				for(int f=1;f<=i-k;f++)
				{
					f3=f3*f;
				}
				System.out.print(f1/(f2*f3)+" ");

			}
			System.out.println();
		}
	
		
	}
}
