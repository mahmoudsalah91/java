package day_20;

import java.util.*;

/*
    COLLECTION :is group of elements
    in java COLLECTION is a predefined interface use to store objects
    note COLLECTION not allowed store primitive data like int boolean ...
    COLLECTION is interface there are two child interfaces extends from it List and Set
    List >>> implements by class called ArrayList  &   Set >>> implements by class called HashSet

    Different between normal Array and Array List :
    Array : preferred use to store primitive data type , has fixed size
    ArrayList : preferred use to store objects data type , has dynamic size

    ArrayList Properties

    allowed Heterogeneous and also Homogenous
    Store data by indexing (orders)
    allowed Duplicate elements
    allowed multiple Nulls

    HashSet Properties

    allowed Heterogeneous and also Homogenous
    not Store data by indexing (orders) store randomly
    not allowed Duplicate elements
    not allowed multiple Nulls only single null

     */
public class Collections {
    public static void main(String[] args){
        //Declaration of ArrayList >> as ArrayList is class we need object from it to use this object to call ArrayList own methods

        //1- Declaration for store Heterogeneous data
        ArrayList myList = new ArrayList();
        List myList1 = new ArrayList();

        //2- Declaration for store Homogeneous data
        ArrayList<String> stringList = new <String> ArrayList(); // as String is Wrapper class can use Integer, Boolean

        myList.add(100);
        myList.add(10.5);
        myList.add("Welcome");
        myList.add("Welcome");
        myList.add('A');
        myList.add(true);
        myList.add(false);
        myList.add(null);
        myList.add(null);

        // to get size of ArrayList
        System.out.println(myList.size());

        // to print elements of ArrayList
        System.out.println(myList);

        // to remove element on ArrayList by using element index >> note index start by zero
        // so if I want to remove false use index 6
        myList.remove(6);
        System.out.println(myList);

        // insert element in ArrayList by use add(position index which element add after it,Element you want added) ex:add(2,"java)
        myList.add(2,"java");
        System.out.println(myList);

        //modify element by use .Set(position index which element modify it,modification Element replaced) ex:Set(2,"python)
        myList.set(2,"python");
        System.out.println(myList);

        // get specific element from ArrayList use get(position index which element you want get it) ex:get(2)
        System.out.println(myList.get(2));

        // read element in ArrayList by 3 approach

        //1-normal for loop
        for(int i =0;i<myList.size();i++){
            System.out.println(myList.get(i));
        }
        //2-enhanced for loop (for...each loop)
        for (Object i:myList){
            System.out.println(i);
        }

        /*
         //3-iterator and while loop  (perf ere approach in case we not know how much element in ArryList)
         1-iterator is a method in ArrayList class which call it by object create from ArrayList class (myList)
         2-store it in variable (ex: it) its type Iterator ()
         3-use while loop by use it.hasNext >> to check if next element exist in ArrayList
         4-if exist print it by it.next
        */
        Iterator it = myList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }

        //checking if ArrayList is empty or not
        System.out.println(myList.isEmpty());

        // remove specific elements in ArrayList
        //create second ArrayList contain elements you want ro remove from first ArrayList
        ArrayList myList2=new ArrayList();
        myList2.add("Welcome");
        myList2.add(null);

        System.out.println(myList);
        myList.removeAll(myList2);
        System.out.println(myList);

        // clear all elements / remove all elements
        myList2.clear();
        System.out.println(myList2.isEmpty());  //true



        ///HashSet
        //Declaration of HashSet >> as HashSet is class we need object from it to use this object to call HashSet own methods

        //1- Declaration for store Heterogeneous data
        HashSet myset = new HashSet();
        Set myset1 = new HashSet();

        //2- Declaration for store Homogeneous data
        HashSet<String> stringHashSet = new <String> HashSet(); // as String is Wrapper class can use Integer, Boolean

        myset.add(100);
        myset.add(10.5);
        myset.add("Welcome");
        myset.add("Welcome");
        myset.add('A');
        myset.add(true);
        myset.add(false);
        myset.add(null);
        myset.add(null);


        // to get size of HashSet
        System.out.println("HashSet size is " +myset.size());

        // to get size of HashSet
        System.out.println(myset.size());   // no count multiple null or Duplicate element ("Welcome")

        // to print elements of HashSet
        System.out.println(myset);          //[null, A, 100, 10.5, false, Welcome, true]  not allowed multiple null or Duplicate element ("Welcome")

        //removing element
        //to remove element on HashSet by using element value >> not index like ArrayList
        myset.remove(false);
        System.out.println(myset);

        // insert element in HashSet not possible as it not support indexing but store data randomly

        // get specific element from HashSet not possible as it not support indexing but store data randomly

        // convert HashSet >>> ArrayList  BY make object from ArrayList and pass HashSet Object that store data on it ex :ArrayList mylist2 = new ArrayList(myset)
        ArrayList myList3 = new ArrayList(myset);
        System.out.println(myList3);
        // so can use covert HashSet to ArrayList for insert element and get specific element that both not possible on HashSet

        myList3.add(2,"java");      // insert element
        System.out.println(myList3);

        System.out.println(myList3.get(2));            // get specific element



        // read element in ArrayList by 3 approach

        //1-normal for loop   not possible myset.get>>>not valid
        //for(int i=0;i<myset.size();i++){
       //    System.out.println(myset.get);
        //}


        //2-enhanced for loop (for...each loop)
        for (Object i:myset){
            System.out.println(i);

         /*
         //3-iterator and while loop  (perf ere approach in case we not know how much element in HashSet)
         1-iterator is a method in HashSet class which call it by object create from HashSet class (mySet)
         2-store it in variable (ex: iterator1) its type Iterator ()
         3-use while loop by use it.hasNext >> to check if next element exist in HashSet
         4-if exist print it by >>  it.next
        */
          Iterator iterator1 = myset.iterator();
          while (iterator1.hasNext()){
              System.out.println(iterator1.next());
          }
        }

        // remove specific elements in HashSet
        //you need made maltiple method for remove can not remove set of element by one line code

        System.out.println(myset);

        myset.remove('A');
        myset.remove(100);

        System.out.println(myset);


        // clear all elements / remove all elements
        myset.clear();
        System.out.println(myset.isEmpty());  //true


    }



}
