import java.util.HashSet;
import java.util.Iterator;

public class Hashing
{
    public static void main(String[] args)
    {
      HashSet<Integer> set=new HashSet<>();           //ArrayList<Integer> list=new ArrayList<>();
      
      //inserting elements in hashset
      set.add(3);
      set.add(7);
      set.add(1);
      set.add(9);
      set.add(3);
      // set.add(70);
      // set.add(38);
      // set.add(56);
      // set.add(25);
      // set.add(108);

      //size of hashset
      System.out.println("The size of this hashset is "+ set.size());



      //printing all elements in a set
      System.out.println(set);



      //searching elements in hashset
 
     if(set.contains(3))
     {
        System.out.println("The set contains 3");
     }
     if(!set.contains(5))
     {
        System.out.println("The set does not contains 5");
     }




     //deleting from set

     set.remove(7);

     System.out.println(set);


    
      //Iterator

     Iterator it=set.iterator();

     //iterator has only two functions
     //hasnext() and next()

     while(it.hasNext())
     {
        System.out.println(it.next());
     }




     


    }
}