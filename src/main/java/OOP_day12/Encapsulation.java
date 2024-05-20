package OOP_day12;

public class Encapsulation {

    //main : wrapping data (variables and methode in single unite (class)
    // by use 1- all variables be private
    // 2- make set and get methode for variables
    // 3- access variables in run time by call getter and setter methods

    // note: (This)  refer to class use as class variables and local variables with same name
    // so (This)  used as a signature of  class variables

    private String name;
    private  int id;
    private double amount;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }
}
