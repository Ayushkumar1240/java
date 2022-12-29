//import java.util.HashMap;
import java.util.*;

public class Hashmap 
{
public static void main(String[] args) 
{
    

    //country(key), population
    HashMap<String,Integer> map=new HashMap<>();


    //insertion

    map.put("India",130);
    map.put("US",30);
    map.put("China",150);
    System.out.println(map);

    map.put("China",180);
    System.out.println(map);


    //searching
    if(map.containsKey("China"))
    {
        System.out.println("The key is present");
    }
    else
    {
        System.out.println("The key is not present");
    }



    //print the key and its value

    System.out.println(map.get("China"));      //key is present
    System.out.println(map.get("Indonesia"));  //key is not present



    //Iteration
    //for(int val : arr)

    for(Map.Entry<String,Integer> e: map.entrySet())
    {
        System.out.println(e.getKey());
        System.out.println(e.getValue());
    }


    Set<String> keys=map.keySet();
    for(String key : keys)
    {
        System.out.println(key + " "+map.get(key));
    }




    //removing a key value pair
    map.remove("China");
    System.out.println(map);

}
}