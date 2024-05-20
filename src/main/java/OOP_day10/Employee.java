package OOP_day10;

public class Employee {

    // Variables declaration : variables without values
    public int id;
    public String name;
    public String job;
    public String salary;

    // Methods : action take place on variables

    public void display(){
        System.out.println(id);
        System.out.println(name);
        System.out.println(job);
        System.out.println(salary);
    }
   // constructor : object creator
    public Employee() {}


    public Employee(int id,String salary,String name,String job) {
        this.id=id;
        this.salary=salary;
        this.name=name;
        this.job=job;

    }


    public static void  main(String[] args) {

        // create object
        Employee emp1= new Employee();


        emp1.id=101;
        emp1.job="manger";
        emp1.name="john";
        emp1.salary="5000";

        emp1.display();

        Employee emp2= new Employee();

        emp2.id=102;
        emp2.job="senior";
        emp2.name="ahmed";
        emp2.salary="3000";

        emp2.display();


        Employee emp3= new Employee(103,"5000","mahmoud","tester");
        emp3.display();
    }


}
