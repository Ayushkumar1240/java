public class compareto 
{
    static String arr[]={"Now","is","the","time","for","all","good","men","to","come","to","the","aid","of","their","country"};
    public static void main(String[] args)              // s1>s2  ->+ve
    {                                                   // s1<s2  ->-ve
        for(int i=0;i<arr.length;i++)                   // s1==s2  ->0
        {
            for(int j=i+1;j<arr.length;j++)
            {
                if(arr[j].compareTo(arr[i])<0)       // comparision is based on ASCII values
                {                                    // comparToIgnoreCase() also exists
                    String t=arr[i];
                    arr[i]=arr[j];
                    arr[j]=t;

                }
            }
            System.out.println(arr[i]);
        }
        
    }
    
}
