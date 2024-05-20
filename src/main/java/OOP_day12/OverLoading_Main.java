package OOP_day12;

public class OverLoading_Main {

    public static void  main(String[] grs){

        OverLoading obj = new OverLoading();

        obj.sum(); //1

        obj.sum(100,200);  //2

        obj.sum(10.5,20);  //3

        obj.sum(100,200.5);  //4
    }
}
