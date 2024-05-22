package OPP_day15;

    //Super : related to overriding (inheritance)
    //Super : used to invoke the immediate parent class variables or methods

class Animal{
    String color = "white";
    void eat(){
        System.out.println("eating....");
    }
}
class Dog extends Animal{
    String color ="black";
    void display(){
        System.out.println(color);          // invoke child variables when use object of child to call this variable in main
        System.out.println(super.color);   // invoke parent variables when use object of child to call this variable in main

    }
    void eat(){
        System.out.println("eating bread....");   // invoke child method when use object of child to call this method in main
        super.eat();                             // invoke parent method when use object of child to call this method in main
    }

}

public class SuperKeyword {
    public static void main(String[]args){

        Dog obj =new Dog();
        obj.display();
        obj.eat();
    }
}
