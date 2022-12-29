import javax.lang.model.util.ElementScanner14;

public class regionmatches 
{
    public static void main(String[] args) 
    {
        String s1="Hello there my name is ayush kumar.";
        String s2=new String("ayush kumar");
        if(s1.regionMatches(true, 25, s2, 2, 7))
        {
            System.out.println("equals");
        }        
        else
        {
            System.out.println("Not equlas");
        }
    }
    
}
