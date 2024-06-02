package day_18;

    //Exception: is event that cause terminate immediately for programme when user enter invalid inputs (user mistake)
    // when exception thrown the lines of the code after that not execute
    //there are two type of exceptions
    //1-checked exception that compiler detects it to handel EX:FileNotFound

    //2 unchecked exception  that compiler can not detect it to handel    EX: NullPointerException , ArithmeticException ,NumberFormatException ...

    //note error is not exception error is (developer mistake) there are 2 type of error 1-logical error 2-syntax error


import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ExceptionTypes {

    //1-checked exception that compiler detects it to handel EX:FileNotFound
    // can handel by two ways
    //1- try-catch block
    //2- throws


    static void system() throws InterruptedException {
        System.out.println("system start...");
        System.out.println("system on process...");

        //BY throws InterruptedException in main method

        Thread.sleep(3000);

        System.out.println("system finish...");

        //BY try-catch block

        try{FileInputStream File=new FileInputStream("c:\\TEXT.txt");}
        catch (FileNotFoundException e){
            System.out.println("file not found");
        }

    }


    public static void main(String[]args) throws InterruptedException {

        system();

        //2 unchecked exception  that compiler can not detect it:-

        Scanner userInput = new Scanner(System.in);

        System.out.println("Enter a number");
        int num =userInput.nextInt();
        System.out.println(100/num);                //ArithmeticException



        /*String name=null;
        System.out.println(name.length());          //NullPointerException


        String s="Welcome";
        System.out.println(Integer.parseInt(s));   //NumberFormatException
        */
        int[] a =new int[5];
        System.out.println(a.length);

        System.out.println("Enter position");
        int pos=userInput.nextInt();

        System.out.println("Enter value");
        int value=userInput.nextInt();
        a[pos]=value;

        System.out.println(a[pos]);                 // ArrayIndexOutOfBoundsException






    }


}
