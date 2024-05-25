package day17;

import day6.Array;

import java.util.ArrayList;

public class WrapperClass {

    public static void main(String[]args){

        //wrapper class : is built-in classes in java related to primitive data type (int,boolean,double,float...)
        //wrapper classes use to :
        //1-create variables to object format  >>> int x = int(10)
        //2-convert normal data type like String to primitive data type
        //note : string can convert only "numeric"("1234") can not convert "alphabetic"("Welcome")

        //convert data type

        //1-convert String to integer    >>> Integer.parseInt(String value)

        String s1="10";
        String s2="20";
        System.out.println(s1+s2);  // just concatenate not summation
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));

        //2-convert String to double    >>> Integer.parseDouble(String value)

        String d1="10.5";
        String d2="20.5";
        System.out.println(d1+d2);  // just concatenate not summation
        System.out.println(Double.parseDouble(d1)+Double.parseDouble(d2));

        //3-convert String to boolean    >>> Integer.parseBoolean(String value)
        String b1="false";
        String b2="true";
        String b3="welcome";
        System.out.println(Boolean.parseBoolean(b1));
        System.out.println(Boolean.parseBoolean(b2));
        System.out.println(Boolean.parseBoolean(b3));
        // note : String b1="welcome"; any_thing than "true" will return false as is default value of Boolean.parseBoolean

        //4-convert String to char    >>> Not possible

        //*-convert any primitive data to String use String.valueOf();
        int x=100;
        double d=10.5;
        boolean b=true;
        char c ='A';

        System.out.println(String.valueOf(x));
        System.out.println(String.valueOf(d));
        System.out.println(String.valueOf(b));
        System.out.println(String.valueOf(c));

        //*-convert any collection data to primitive data

        ArrayList<Integer>arr=new ArrayList<Integer>();     //Convert to integer
        ArrayList<Boolean>arr1=new ArrayList<Boolean>();    //Convert to Boolean




    }
}
