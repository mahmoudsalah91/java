package day_20;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Hash_MapDemo {
    /*

    Hashmap : is class of map interface

    Hashmap Properties

    allowed store data with pair key and value
    can not duplicate key but can duplicate values
    not Store data by indexing (orders) store randomly
    */
    public static void main(String[] args){

        //Declaration of Hashmap >> as Hashmap is class we need object from it to use this object to call Hashmap own methods

        //1- Declaration for store Heterogeneous data
        HashMap myHash = new HashMap();

        Map myHash2 =  new HashMap();

        //2- Declaration for store specific data ex: <Integer,String> --- key is Integer & values is String
        HashMap <Integer,String> myHash3 = new HashMap <Integer,String> ();

        // add pairs
        myHash.put(101,"john");
        myHash.put(102,"mahmoud");
        myHash.put(103,"Ahmed");
        myHash.put(104,"john");
        myHash.put(103,"sayed");   // with duplicate key it replace new value of similar key
        myHash.put(106,"yasser");

        System.out.println(myHash);          //return data in a list {...}

        // remove pair
        myHash.remove(106);
        System.out.println(myHash);

        // access value of the key
        System.out.println(myHash.get(101));


        // get all key from myHash
        System.out.println(myHash.keySet());

        // get all values from myHash
        System.out.println(myHash.values());

        // get all keys and values from myHash
        System.out.println(myHash.entrySet());                 //return data in a set [...]

        //Reading data from   HashMap
        //1- By using for loop

        for(int i=0;i>myHash.size();i++){
            System.out.println(myHash.get(i));
        }

        //2- By using each for loop    enhanced   for loop
        for(Object i : myHash.keySet())
        {
            System.out.println(i+"    "+myHash.get(i));
        }

        //3- By using Iterator  method 
      Iterator it  =myHash.entrySet().iterator();
        while(it.hasNext())
        {
            System.out.println(it.next());
        }
        
        // clear data from Hashmap
       myHash.clear();
        System.out.println(myHash.isEmpty());



    }





}
