package OPP_day15;

    // Final keyword can apply on variables , methods , classes
    //1-Final variable : if variable is final can not change its value (constant)
    //2-Final method : if method is final can not override this method in child class
    //3-Final class  : if class is final can not be extended to be a parent to a child class

class Test{
    final int x =100;

    final void print(){
        System.out.println(x);
    }
}

final class Test1{
     int y =100;

     void print(){
        System.out.println(y);
    }
}

class Test2 extends Test{

     /* void print(){              //2-method is final can not override this method in child class
    System.out.println(x+1);
    }*/
}

/*
class Test3 extends Test1{         //3-class is final can not be extended to be a parent to a child class

     void print(){
    System.out.println(y+1);
    }
}*/
public class FinalKeyword {

   public static void main(String[] args){

       Test obj= new Test();
       // obj.x=200;              //1-can not change variable value (because it is final (constant))
       System.out.println(obj.x);
   }

}
