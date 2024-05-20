package OPP_day13;

public class StaticKeyword {

    static int a =10; // static variable

    int b=20;        // non-static variable

    static void m1(){   //static methode
        System.out.println("this is m1 static methode....");
    }

    void m2(){          //non-static methode
        System.out.println("this is m2 non-static methode....");
    }

    // non-static methods can access static and non-static data (variables and methods) directly (without object)
    void m3(){
        System.out.println(a);
        System.out.println(b);
        m1();
        m2();

    }

    public static void main(String[] args){

        // static methods can access static data (variables and methods) directly (without object)
        System.out.println(a);
        m1();

        // static methods can not  access non-static data (variables and methods) directly (need object)
        /*
        System.out.println(b);
        m2();
         */
        StaticKeyword obj = new StaticKeyword();
        System.out.println(obj.b);
        obj.m2();
        obj.m3();
    }

}
