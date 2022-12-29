class charExtraction
{
    public static void main(String[] args) 
    {
        String s1="My name is ayush kumar";
       // System.out.println(s1.charAt(6));
    //    int start=10;
    //    int end=15;
       int length=s1.length();
       char result[]=new char[length];

    //    s1.getChars(6,14, result, 10);
    //    System.out.println(result);


    
    // char[] s4=s1.toCharArray();
    // for(int i=0;i<length;i++)
    // {
    //     System.out.println(s4[i]);
    // }

    byte[] b3=s1.getBytes();

    for(int i=0;i<length;i++)
    {
        System.out.println(b3[i]);
    }

    }
}
