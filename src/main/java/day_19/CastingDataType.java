package day_19;

public class CastingDataType {

    //Casting : convert data type to another both in the same family
    //type of casting:
    //1- Up casting (widening) : convert value from small to large ex:int>>>long , float>>>double
    // Up casting convert values directly not need converter ex:int intValue=100; >> long longValue=longValue;
    //2-Down casting (narrowing) : convert value from large to small ex:long>>>int  , double>>>float
    // Down casting convert values NOT directly need converter to minimize value ex:long longValue=100; >> int intValue=(int)longValue; converter like(int)

    public static void main(String[]args){

        // Up casting small >>> large
        int intValue=100;
        double doubleValue= intValue;
        System.out.println(doubleValue);

        // Down casting large >>> small
        double d=10.5;
        float f=(float) d;
        System.out.println(f);

    }
}
