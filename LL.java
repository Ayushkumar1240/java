public class LL 
{
    private static Object head;
    class Node
    {
       String data;
       Node next;

      public Node(String data)
       {
        this.data=data;
        this.next=null;

       }
    }

   
   

    public static void addFirst(String data)
    {
        Node newNode=new Node(data);
        if(head==null)
        {
            head=newNode;
            return;
        }
        newNode.next=head;
        head=newNode;
    }

   public static void main(String[] args)
   {
    LL list=new LL();
    LL.addFirst("is");
    LL.addFirst("this");
   }
}
