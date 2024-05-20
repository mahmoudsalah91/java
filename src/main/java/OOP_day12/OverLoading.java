package OOP_day12;

public class OverLoading {


    // polymorphism
    // using overloading : methods with same name but have different signature

    int x=10;
    int y=20;

    //1   no parameters
    void sum (){
        System.out.println(x+y);
    }

    //2    with parameters
    void sum (int x , int y){
        System.out.println(x+y);
    }

    //3   with parameters different data type
    void sum (int x , double y){
        System.out.println(x+y);
    }

    //4   with parameters different order of data type
    void sum (double x , int y){
        System.out.println(x+y);
    }
}
