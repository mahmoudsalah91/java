package OPP_day15;


    //overriding : a methode in parent class create the same method in child class with same declaration (name ,parameters) but different implementation (body)
    // why we use : useful inheritance as some time we want change implementation of inherit method
    // note when we change value of inherit variables in child class that called override variables

class Bank{

    double roi(){
        return 0;
    }
}

class QNB extends Bank{
    double roi(){
        return 10.5;
    }
}

class HSBC extends Bank{
    double roi(){
        return 11.5;
    }
}

public class Overriding {

    public static void main(String[]args){

        QNB objQNB=new QNB();
        System.out.println(objQNB.roi());

        HSBC objHSBC=new HSBC();
        System.out.println(objHSBC.roi());

    }

}
