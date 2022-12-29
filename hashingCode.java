import java.util.*;
import java.util.function.DoubleToIntFunction;

public class hashingCode 
{
    static class HashMap<K,V>       //generics     //we will create object of this class in main function 
                                                   //type of key and value is not known.
    {
        private class Node               //  for defining node of linked list
        {
            K key;                       // K type ki key
            V value;                     //  V- type ki value

            public Node(K key, V value)       //constructor
            {
                this.key=key;
                this.value=value;
            }
        }
        private int n;                         // number of nodes
        private int N;                          // number of buckets or size of array
        private LinkedList<Node> buckets[];      //name of array   LinkedList<Node> is its type in place of int;
                                                 //     private int arr[]



                                            
    public HashMap()                              //constructor of HashMap class  to initialse with empty LL
    {
        this.N=4;
        this.buckets=new LinkedList[4];

        for(int i=0;i<4;i++)
        {
            this.buckets[i]=new LinkedList<>();                 //creating empty linked list for every bucket
        }
    }

    private int hashfunction(K key)                    //function to find bucket index
    {
        int bi=key.hashCode();                         //bi will get bucket index from hashCode() applied on a key           
        return Math.abs(bi) % N;                      //bi should be always in between 0 and N-1
    }



    private int searchinLL(K key, int bi)              //searching in Linked List
    {
        LinkedList<Node> ll=buckets[bi];

        for(int i=0;i<ll.size();i++)
        {
            if(ll.get(i).key==key)
            {
                return i;                                    //di
            }
        }
        return -1;                                      //key doesnot exists
    }




    private void rehash()
    {
        LinkedList<Node> oldbucket[]=buckets;         //to store the data of current bucket in another bucket so that size can be increased 
        buckets=new LinkedList[N*2];                   // creating new bucket

        for(int i=0;i<N*2;i++)                          //to create empty linked list at indexes
        {
            buckets[i]=new LinkedList<>();           
        }
        for(int i=0;i<oldbucket.length;i++)           //putting the data of oldbucket to the newly created bucket
        {
            LinkedList<Node> ll=oldbucket[i];
            for(int j=0;j<ll.size();j++)
            {
                Node node=ll.get(j);
                put(node.key,node.value);
            }
        }
    }
    public void put(K key, V value)
    {
        int bi=hashfunction(key);                                         //bi=bucket index
        int di=searchinLL(key,bi);                        //di=data index means index of data in linked list

        if(di==-1)                                               //key doesnot exists
        { 
            buckets[bi].add(new Node(key,value));        //adding a new key value pair at bi index of array buckets
            n++;                                         //increasing the size of nodes.
        }
        else                                                     //key exists
        {
            Node node=buckets[bi].get(di);                       //getting the node from di of bi
            node.value=value;                                    //getting nodes value
        }
        double lambda=(double) n/N; 
        if(lambda>2.0)                                      //checking if lambda>k
        {
            rehash();                                      ///function to increase the size of array
        }
    }


    public boolean containskey(K key)
    {
        int bi=hashfunction(key);
        int di=searchinLL(key,bi);

        if(di==-1)                                         //key doesnot exists
        {
            return false;
        }
        else                                                 //key exists
        {
           return true;
        }
    }
    public V get(K key)
    {
        int bi=hashfunction(key);
        int di=searchinLL(key,bi);

        if(di==-1)                                            //key doesnot exist
        {
            return null;
        }
        else                                                  //key exists
        {
            Node node=buckets[bi].get(di);
            return node.value;                                 //return its value
        }
    }

    public V remove(K key)
    {
        
        int bi=hashfunction(key);
        int di=searchinLL(key,bi);

        if(di==-1)                         //key doesnot exist
        {
            return null;
        }
        else
        {
            Node node=buckets[bi].remove(di);             //data index pe stored node delete ho jayega
            n--;
            return node.value;
        }
    }




    public ArrayList<K> keySet()
    {
        ArrayList<K> keys=new ArrayList<>();

        for(int i=0;i<buckets.length;i++)
        {
            LinkedList<Node> ll=buckets[i];
            for(int j=0;j<ll.size();j++)
            {
                Node node=ll.get(j);
                keys.add(node.key);
            }
        }
        return keys;
    }
    public boolean isEmpty()
    {
        return n==0;
    }

    public static void main(String[] args) 
    {
        HashMap<String, Integer> map=new HashMap<>();
        map.put("India",190);
        map.put("china",180);
        map.put("US",100);

        ArrayList<String> keys=map.keySet();
        for(int i=0;i<keys.size();i++)
        {
            System.out.println(keys.get(i)+" "+map.get(keys.get(i)));
        }
        map.remove("India");
        System.out.println(map.get("India"));

    }
    }
}
