package EmployeeMain;

import OOP_day10.Employee;

public class EmployeeMain {

    public static void main(String[] args){
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
