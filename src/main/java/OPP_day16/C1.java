package OPP_day16;

public class C1 extends C2 implements I1,I2 {

    public void m1(){
        System.out.println(x);
    }

    public void m2(){
        System.out.println(y);
    }

    public static void main(String[]args){

        C1 obj = new C1();
        obj.m1();
        obj.m2();
        obj.m3();
        obj.z=400;
        obj.m3();

    }

}
