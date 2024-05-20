package OPP_day14;

    //inheritance types

    //1-single : one class inherit from one class
    //2- multi level : B class inherit from A class and then B>>>C>>>D....
    //3- hierarchy : one parent have multiple child classes

    class A {
    int a = 100;

    void display() {
        System.out.println(a);
        }
    }

    class B extends A {         //type 1
    int b= 200;

    void show (){
        System.out.println(b);
         }
    }

    class C extends B {         //type 2
        int c = 300;

        void print() {
            System.out.println(c);
        }

    }
    class D extends A {         //type 3  both D and B  inherit from A
        int d= 300;

        void printD (){
            System.out.println(d);
        }

}




public class InheritanceTypes {

    public static void main(String[]args){

        B objB= new B();

        System.out.println(objB.a);
        System.out.println(objB.b);

        objB.display();
        objB.show();


        C objC = new C();

        objC.a=100;
        objC.b=200;
        objC.c=300;

        objC.display();
        objC.show();
        objC.print();


        D objD= new D();
        System.out.println(objD.a);
        objD.display();
        objD.printD();

        System.out.println(objB.a);
        System.out.println(objB.b);

        objB.display();
        objB.show();
    }


}
