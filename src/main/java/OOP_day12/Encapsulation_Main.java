package OOP_day12;

public class Encapsulation_Main {

    public static void main(String[] args){

        Encapsulation obj = new Encapsulation();

        obj.setName("mahmoud");
        obj.setId(101);
        obj.setAmount(105.5);


        System.out.println(obj.getName());
        System.out.println(obj.getId());
        System.out.println(obj.getAmount());

    }
}
