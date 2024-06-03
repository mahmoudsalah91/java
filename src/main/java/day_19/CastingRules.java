package day_19;

 /*
 there are 3 rule that must be satisfied to be casting is valid
 -ex--Cat ct = (Cat) an; >>> A=Cat , B=ct , C=(Cat) , D=an
 1- Rule1: D and C must have some relation (parent to child or child to parent)
 2- Rule2: C must be either the same or Child of A
 3- Rule3: D object type must be either the same or child of C

    Note: Rule1 and Rule2  if not satisfy get compiler error
          Rule3 if not satisfy get run time exception
  */

class Animal{}
class Dog extends Animal{}
class Cat extends Animal{}

public class CastingRules {
    public static void main(String[]args){
        /*
        Animal an = new Dog();
        Cat ct = (Cat) an;   // valid as per Rule1
        */
        /*
        Dog dg = new Dog();
        Cat ct = (Cat) dg;   // invalid as per Rule1 as (Cat) and dg have not relation
        */


        /*
        Animal an =new Dog();
        Cat ct = (Cat) an;  // valid as per Rule2
        */
         /*
        Animal an =new Dog();
        Cat ct = (Dog) an;  // invalid as per Rule2
        */


        /*
        Animal an =new Dog();
        Dog ct =(Dog) an;     // valid as per Rule3
        */

        /*
        Animal an =new Dog();
        Cat ct =(Cat) an;     // invalid as per Rule3
       */


        // Rule1,Rule2,Rule3  are Satisfy
        Animal an = new Dog();
        Dog dg = (Dog) an;

        // Examples

        //1
        /*
        Object o = new String("Welcome");
        StringBuffer sb = (StringBuffer) o;         //Rule1>>pass , Rule2>>pass , Rule3>>fail
        */

        //2
        /*
        String s =new String("Welcome");
        StringBuffer sb= (StringBuffer) s;       //Rule1>>fail
        */

        //3
        /*
        Object o= new String("Welcome");
        StringBuffer sb= (String) o;             //Rule1>>pass , Rule2>>fail
        */

        //4
        /*
        String s= new String("Welcome");
        StringBuffer sb =(String) s            //Rule1>>pass , Rule2>>fail
        */

        //5
        Object o = new StringBuffer("Welcome");
        StringBuffer sb = (StringBuffer) o;       //Rule1>>pass , Rule2>>pass , Rule3>>pass
        System.out.println(sb.reverse());






    }

}
