package OPP_day13;

public class ThisKeyword {

    //variables in java  2 types
    //1- class or instance variables : can access from all methods in class
    //2-local variables : can access only inside its method
    // (This Keyword)  refer to class use as class variables and local variables with same name
    // so (This)  used as a signature of  class variables

    ThisKeyword(){}     // default constructor

    int x,y;

    ThisKeyword(int x , int y){

        this.x=x;
        this.y=y;
    }

    void number(int x , int y){
        this.x=x;
        this.y=y;
    }

    void display(){
        System.out.println(x);
        System.out.println(y);
    }



    public static void main (String[] args){

        ThisKeyword obj=new ThisKeyword(100,200);

        obj.display();

        ThisKeyword obj2=new ThisKeyword();
        obj2.number(100,200);
        obj2.display();


    }

}

