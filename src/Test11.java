
import java.util.*;
public class Test11
{
	public static void main(String[] args)
	{
		int n;
		int count=0;
		Vector v = new Vector();
		for(int i=1;i<=4;i++)
		{
			for(int j=1;j<=4;j++)
			{
				if(i!=j)
				{
					for(int k=1;k<=4;k++)
					{
						if(i!=k&&j!=k)
						{
							n=i*100+j*10+k;
							v.add(n);
							count++;
						}
					}
				}
			}
		}
		System.out.println(count);
		System.out.println(v);
	}
}
