
import java.util.*;

/* Name of the class has to be "Main" only if the class is public. */
class codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		try (Scanner sc = new Scanner(System.in)) {
			int T=sc.nextInt();
			
			for(int i=0;i<T;i++)
			{
			    int N=sc.nextInt();
			    String s=sc.next();
			    int len=s.length();
			    int counter=0;
			    
			    char[] string1=s.toCharArray();
			    if(N%2!=0)
			    {
			        System.out.println("NO");
			    }
			    else
			    {
			        int mid=len/2;
			        Arrays.sort(string1);
			        for(int j=0;j<len;j=j+2)
			        {
			            if(string1[j]==string1[j+1])
			            {
			                counter++;
			            }
			        }
			        if(counter==mid)
			        {
			            System.out.println("YES");
			        }
			        else
			        {
			            System.out.println("NO");
			        }
			    }
			}
		}
	}
}
