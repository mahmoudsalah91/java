package day17.AcessModifers;


    // there are 4 type of access modifiers

    //1- private >>> access in the class only
    //2- default >>> access in the package
         // note: default not keyword just no need to write anything before method or variables
    //3- protected >>> access outside the package through inheritance
         //note:need import package-name.class-name;(day17_AccessModifiers.Test3;)
    //4- Public >>> access everywhere project including outside the package not need through inheritance
        //note:need import package-name.class-name;(day17_AccessModifiers.Test4;)


import day17_AccessModifiers.Test3;
import day17_AccessModifiers.Test4;

public class Test1 extends Test3 {

    private int x=100;

    private void m1(){
        System.out.println("this is m1....");
    }

    public static void main(String[]args){

        Test1 obj = new Test1();                //1- private >>> access in the class only
        System.out.println(obj.x=100);
        obj.m1();


        Test2 obj2 = new Test2();              //2- default >>> access in the package
        System.out.println(obj.x=200);
        obj2.m2();

        System.out.println(obj.y=300);        //3- protected >>> access outside the package through inheritance
        obj.m3();

        Test4 obj4 = new Test4();            //4- Public >>> access everywhere project including outside the package not need through inheritance
        System.out.println(obj4.z=400);
        obj4.m4();

    }
}
