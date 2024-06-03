package day_19;


    //casting objects access data from classes by child and parent objects
    // there are 2 type
    // Up casting store small (child) data class in to large (parent) class ex: parent p = new child;
    // Down casting store large (parent ) data class in to small (child)    ex: child c = (child) new parent; >> (child) like converter

    //why use casting objects if we down know the data from child class we store it in parent reference object


class Parent{
    String name = "mahmoud";

    void m1(){
        System.out.println("this is m1 from child.... ");
    }

}

class Child extends Parent{
    int id = 101;

    void m2(){
        System.out.println("this is m2 from child.... ");
    }

}
public class CastingObject {


    public static void main(String[]args){

        // normal
        Child c = new Child();      // child data
        System.out.println(c.id);   // child data
        c.m2();                     // parent data
        System.out.println(c.name); // parent data
        c.m1();

        // Up casting
        Parent p = new Child();     //parent data - can access
        System.out.println(p.name); //parent data - can access
        p.m1();
        //System.out.println(p.id);  child data- can not access
        //p.m2();                    child data- can not access

        // Down casting : can access all data in child and parent but throw exception in run time
        Child c1= (Child) new Parent();
        System.out.println(c1.id);    //child data - can access
        c1.m2();                      //child data - can access
        System.out.println(c1.name);  //parent data - can access
        c1.m1();                      //parent data - can access


    }

}
