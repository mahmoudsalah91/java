package day_18;

import java.util.Scanner;

    // to handle exception use try and catch block
    //1-identify the statement that possible trows exception
    //2-put this statement in try block
    //3-handel this by catch block by but the name of exception if you know ex: catch (ArithmeticException e)
    //if you don't know the name of exception just use parent class called Exception (all exceptions type are child from it)  ex: catch (Exception e)
    //Note: can use (e.getMessage());  // to know why exception occur (reason of exception )

    //Note: can use finally block (that it execute however Exception present   OR   not present )
        // finally block is optional use to execute something however exception occur or not

public class ExceptionHandling {

    public static void main(String[]args){

        Scanner userInput = new Scanner(System.in);

        //1-ArithmeticException

        System.out.println("Enter a number");
        int num =userInput.nextInt();
        try
        {
            System.out.println(100/num);

        }
        catch (ArithmeticException e)            // name of exception if you know ex: catch (ArithmeticException e)
        {
            System.out.println("data invalid");
            System.out.println(e.getMessage());  // to know why exception occur (reason of exception )
        }

        System.out.println("Enter a number");
        int num1 =userInput.nextInt();
        try
        {
            System.out.println(100/num1);

        }
        catch (Exception e)                      // if you don't know the name of exception just use parent class called  ex: catch (Exception e)
        {
            System.out.println("data invalid");
            System.out.println(e.getMessage());  // (e.getMessage()); to know why exception occur (reason of exception )
        }

        String name="null";
        try
        {
            System.out.println(name.length());   //NullPointerException
        }
        catch (Exception e)
        {
            System.out.println("data invalid");
        }
        finally                                  // finally block is optional use to execute something however exception occur or not
        {
            System.out.println("this finally statement ....");
        }



    }
}
