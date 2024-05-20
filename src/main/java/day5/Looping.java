package day5;

public class Looping {
    public static void main(String[] args) {
        //use when i know number of iterations ex i=10
        //normal for statement //
        //syntax
        //for(initialization;condition;inc/dec){statement}
        for (int i =1; i<=10 ; i++){
            System.out.println(i+" - for loop");
        }

        //while statement//
        //use when i not know number of iterations
        //syntax
        //initialization
        //while(condition){statement;inc/dec}
        int i =1;
        while (i<=10){
            System.out.println(i+" - while loop");
            i++;
        }
        //use when i not know number of iterations
        i=1;
        while (true) {
            System.out.println("i not know what number of iteration");
            i++;
            if (i==10){
                break;
            }
        }


         i = 1;
        while(i<=10){
        if(i%2==0){
            System.out.println(i);
        }else
            System.out.println(i+ " odd number");
        i++;
        }
        //do while statement//
        //use when i want print statement at least one time before check condition
        //syntax
        //initialization
        //do{statement;inc/dec;}
        //while(condition);
        i= 10;
        do {
            System.out.println(i +" do while loop");
            i--;}
        while (i>=1);

        //jumping statements
        // break and continue statement
//break to stop iteration in this condition
//continue to skip the iteration when this condition is true
        for(i=1;i<=10;i++){
            System.out.println(i +" break");
            if(i==5){
                break;
            }
        }
        for(i=1;i<=10;i++){
            if(i==5 || i==6 || i==7){
                continue;
            }
            System.out.println(i+ " continue");
        }
        }

    }





