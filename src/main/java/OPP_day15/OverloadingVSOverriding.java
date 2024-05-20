package OPP_day15;

    //overloading : same methods with different signature (change in parameters>>with or without parameters - order - datatype)
    // related to polymorphism
    // can apply with same class or between two or more classes (inheritance)
    // can apply with or without inheritance (in same class)

    //override: a methode in parent class create the same method in child class with same declaration (name ,parameters) but different implementation (body)
    // related to inheritance
    // can not apply with same class must have two or more classes (inheritance)
    // must apply with inheritance


class A{
    void m1 (int a){
        System.out.println(a);
    }
}

class B extends A {

    void m1(int a){                 // overriding
        System.out.println(a*a);
    }
}

class C extends A{

    void m1(int a ,int b) {         // overloading
        System.out.println(a+b);
    }
}


public class OverloadingVSOverriding {

    public static void main(String[] args){

        B objB=new B();             // objB have one method from parent A
        objB.m1(100);

        C objC = new C();           // objC have two method one from parent A and another from owb (overloading methode)
        objC.m1(100+200);
        objC.m1(100);
    }
}
