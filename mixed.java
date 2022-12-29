import java.util.HashSet;
import java.util.*;
public class mixed 
{
    public static void main(String[] args) 
    {
        ArrayList<String> list=new ArrayList<String>();
        list.add("vijay");
        list.add("ajay");
        list.add("ravi");

        HashSet<String> set=new HashSet(list);
        set.add("gaurav");

        Iterator<String> i=set.iterator();
        while(i.hasNext())
        {
            System.out.println(i.next());
        }




    }
}
