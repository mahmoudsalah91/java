package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        for(int num=0;num<=10;num++){
            System.out.println("hello " + num);
        }
        int num2=11;
        while (num2<=20){
            System.out.println(num2);
            num2++;}


        System.out.println("please enter day number");
        Scanner userInput = new Scanner(System.in);
        int dayNum = userInput.nextInt();
        switch (dayNum){
            case 1:
                System.out.println("yesterday");
                break;
            case 2:
                System.out.println("sunday");
                break;
            case 3:
                System.out.println("monday");
                break;
            default:
                System.out.println("not to day");
        }
        if(dayNum==1){
            if(false)
            System.out.println("saturday");
            else{
                System.out.println("not saturday");
            }
        }
        else if (dayNum==2){
            System.out.println("sunday");
        }
        else
            System.out.println("not to day");

        int sd=100;
        int sdd=(sd>=3)? sd:dayNum;
        System.out.println(sdd);


        add(2, 4);
        add(10, 30);

        int result = mul(2, 8);
        System.out.println(result);

        int x = 10;
        int y = 6;
        int age = x + y;

        if (age > 18) {
            System.out.println("you are allowed");
        } else if (age == 16) {
            System.out.println("you are same age");
        } else {
            System.out.println("you are underage");
        }

        if (true) {
            x = 20;
            System.out.println(x);
        }

        for (int i = 0; i <= 10; i++) {
            System.out.println("that is for loop number " + i);


        }


        int i = 0;
        while (i <= 10) {
            System.out.println("that is while loop number " + i);
            i++;
        }

        int h = 0;  // like while if condition is true
        do {
            System.out.println("that is do-while loop number " + h);
            h++;
        } while (h <= 10);


        int l = 33;  // do execute however condition not true
        do {
            System.out.println("that is do-while loop number " + l);
            l++;
        } while (l <= 10);

        int myFavoriteNumber = 12;
        switch (myFavoriteNumber) {
            case 10:
                System.out.println("my number is 10");
                break;
            case 11:
                System.out.println("my number is 11");
                break;
            case 12:
                System.out.println("my number is 12");
                break;
            default:
                System.out.println("my number is not this number");
        }

/*
        System.out.println("please enter your first number");
        Scanner userInput= new Scanner(System.in);
        int firstNumber = userInput.nextInt();
        System.out.println("please enter your second number");
        int secondNumber = userInput.nextInt();
        System.out.println("please enter your operator");
        System.out.println("+ or - or * or / ");
        String operator= userInput.next();
        switch (operator){
            case "+":
                int sum = firstNumber + secondNumber;
                System.out.println(firstNumber + secondNumber);
                break;
            case "-":
                int discount = firstNumber - secondNumber;
                System.out.println(discount);
                break;
            case "*":
                int multiply = firstNumber * secondNumber;
                System.out.println(multiply);
                break;
            case "/":
                int dev = firstNumber / secondNumber;
                System.out.println(dev);
                break;
            default:
                System.out.println("please enter correct operator");
        }

        try{
            int m = 10;
            int n= 0;
            System.out.println(m/n);
        }catch (Exception exception){
            System.out.println("there is something wrong");

        }finally {
            System.out.println("print however enter on catch or not");
        }*/

        //operators
        //+,-,*,/,==,!=,!,<, > ,<= ,>=,% ,&&,
        int t = 4;
        t = t + 3;
        System.out.println(t);
        t += 3;
        System.out.println(t);

        boolean isAtWork = true;
        if (!isAtWork) {    //  ! >> reverse condition from true to false or vis versa
            System.out.println("sure at work");
        } else
            System.out.println("no he is at home");

        int c = 10;
        int v = 3;
        System.out.println(c % v);  // باقى القسمة

        int o = 2;
        int p = 4;
        if ((o + p) > 2 && (o + p) > 7) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        int u = 2;
        int k = 4;
        if ((u + k) > 20 || (u + k) > 5) {
            System.out.println(true);
        } else {
            System.out.println(false);
        }
        // ternary operator
        int m=20 , b=10;
        int res=(m>b)? m:b;
        System.out.println("result " + res);
         res=(m<b)? m:b;
        System.out.println("result " + res);

/*        System.out.println("enter your age");
        Scanner userInput = new Scanner(System.in);
        int myAge = userInput.nextInt();
        if (myAge <= 18) {
            System.out.println("you are under age");
        } else if (myAge <= 50) {
            System.out.println("your age is valid");
        } else
            System.out.println("your age is over");*/




        int bottlesNum=10;
        String word="bottles";
        while(bottlesNum>0){
            if(bottlesNum==1){
                word = "bottle";
            }
            System.out.println(bottlesNum + " green " + word + " on the shelf");
            System.out.println("And if one green "+ word + " accidentally fall");
            bottlesNum=bottlesNum-1;
            if(bottlesNum>0){
                System.out.println("there will be " + bottlesNum + " green "+ word + " on the shelf");
            }else {
                System.out.println("there will be NO " + "green " + word + " on the shelf");
            }

        }

        // make three sets of words to choose from. Add your own!
        String[] wordListOne = {"agnostic", "opinionated",
                "voice activated", "haptically driven", "extensible",
                "reactive", "agent based", "functional", "AI enabled",
                "strongly typed"};
        String[] wordListTwo = {"loosely coupled", "six sigma",
                "asynchronous", "event driven", "pub-sub", "IoT", "cloud",
        "native", "service" ,"oriented", "containerized", "serverless",
        "microservices", "distributed ledger"};
        String[] wordListThree = {"framework", "library",
                "DSL", "REST API", "repository", "pipeline", "service",
                "mesh", "architecture", "perspective", "design",
                "orientation"};
        // find out how many words are in each list
        int oneLength = wordListOne.length;
        int twoLength = wordListTwo.length;
        int threeLength = wordListThree.length;

        // generate three random numbers
        java.util.Random randomGenerator = new java.util.Random();
        int rand1 = randomGenerator.nextInt(oneLength);
        System.out.println(rand1);
        int rand2 = randomGenerator.nextInt(twoLength);
        System.out.println(rand2);
        int rand3 = randomGenerator.nextInt(threeLength);
        System.out.println(rand3);

        // now build a phrase
        String phrase = wordListOne[rand1] + " " +
                wordListTwo[rand2] + " " + wordListThree[rand3];

        // print out the phrase
        System.out.println("What we need is a " + phrase);


    } // end main method






    public static void add(int numberOne, int numberTwo) {
        System.out.println(numberOne + numberTwo);

    }

    public static int mul(int numberOne, int numberTwo) {
        return (numberOne * numberTwo);
    }





}

