package OPP_day16;

interface Shape{
     //  interface : is hiding the implementation
    // properties of interface

    // 1- by default  all variable final & static
    int length =10;
    int width  = 20;

    // 2- can create abstract methods and also from java 8 can create default and static method
    // 3- by default  all methods ara public

    void Circle();                                       // abstract method (un implemented static)

    default void square(){
        System.out.println("this is default method");    //  default method
    }

   static void rectangle(){
       System.out.println("this is static method");     //  static method
    }

}


public class Interface implements Shape {   //4-class can implement from interface but can not vis vesa
    @Override
    public void Circle() {
        System.out.println("this is circle --abstract method ");
    }
    public static void main(String[]args){
        //scenario 1 can call  methods  by class object  (object reference+instantiate)

        Interface objClass=new Interface(); //class object  (object reference+instantiate)
        objClass.Circle();                 // abstract method
        objClass.square();                //  default method
        Shape.rectangle();               //  static method  (static methode not need object can directly access from interface)
        System.out.println(Shape.length*Shape.width);       // static variables  (static variables not need object can directly access from interface)

        //5- scenario 2 can call  methods  by interface object reference only  (as interface can not instantiate)

        Shape objInterface=new Interface(); // interface object reference only  (as interface can not instantiate[new Interface();])
        objInterface.Circle();          // abstract method
        objInterface.square();         //  default method
        Shape.rectangle();            //  static method  (static methode not need object can directly access from interface)
        System.out.println(Shape.length*Shape.width);       // static variables  (static variables not need object can directly access from interface)

    }
}
