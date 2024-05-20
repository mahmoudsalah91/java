package OPP_day13;

public class StaticKeywordMain {

    public static void main(String[] args){
         // IF we want access static data from another class
        // static methods can access static data (variables and methods) directly (without object)
        // but write (class name . static data)

        System.out.println(StaticKeyword.a);
        StaticKeyword.m1();


    }

}
