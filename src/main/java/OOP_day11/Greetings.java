package OOP_day11;

public class Greetings {

    Greetings(){   //Default CONSTRUCTOR

    }

    // methods type

    //1- no parameters no return values

     void m1(){
        System.out.println("Hello...");
    }

    //2- no parameters  return values

    String m2 (){
         return "Hello how you are";
    }

    //3- takes parameters no return values

    void m3(String name){
        System.out.println("Hello "+ name);
    }

    //4- takes parameters  return values

    String m4(String name){
        return "Hello " + name;
    }

    // ways to store data in variables

    // 1- class variables
     int id;
     String name;
     char grad;

     void printStudentData(){
         System.out.println(id+ "  "+name+"  "+grad);
     }

     // 2- local variables (method variables)

    void setStudentData(int sid,String sname,char sgrad){

         id=sid;
         name=sname;
         grad=sgrad;

    }

    // 3-using constructor

    Greetings (int sid,String sname,char sgrad)  //parameterize CONSTRUCTOR
    {
        id=sid;
        name=sname;
        grad=sgrad;
    }
}

