class Box
{
    double width;
    double height;
    double depth;

    Box(double w, double h, double d)
    {
        width=w;
        height=h;
        depth=d;
    }

    public String toString()
    {
        return "Dimensions of a "+width+ " by "+ depth + " by "+ height+ " ";
    }
}

class toStringDemo
{
    public static void main(String[] args) 
    {
        Box b=new Box(0, 0, 0);
        b.toString();
        String s="Box b: "+b;
        System.out.println(b);
       System.out.println(s);
        
    }
}
