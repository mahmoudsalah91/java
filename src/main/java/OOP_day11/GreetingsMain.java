package OOP_day11;

public class GreetingsMain {

    public static void  main(String[] args){

        Greetings gs= new Greetings();

        // methods type
        gs.m1();   // 1

        String s=   gs.m2();  //2
        System.out.println(s);

        gs.m3("mahmoud"); //3

        String s2 =gs.m4("ahmed");
        System.out.println(s2);

        // ways to store data in variables

        // 1- store data directly in class variables

        gs.id=101;
        gs.name="mahmoud";
        gs.grad='A';
        gs.printStudentData();


        //2- store Data in local variables (method variables)

        gs.setStudentData(102,"ahmed",'A');
        gs.printStudentData();

        // 3-using constructor

        Greetings gs2 =new Greetings(103,"mohammed",'A');
            gs2.printStudentData();

    }

}
