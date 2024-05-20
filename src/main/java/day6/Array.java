package day6;

import java.util.Arrays;
import java.util.Objects;

public class Array {
    public static void main(String[] args) {
        //Array:is a collection of elements with same data type (homogeneous data)
        // we can store multiple values in single variables
        //syntax  data type + [] + variable name  = New + data type + [number of values that array hold];
        int[] a = new int[5];  // 5 is number of rows hold in memory each row with index ex a[0]=1 ; a[1]=2
        //type of Arrays
        //1- single dimensional array hold single values
        //syntax {declaration - assignment - find length -read single value - read multiple values}

        // approach 1
        int[] b = new int[2]; //declaration
        //assignment
        b[0] = 1;
        b[1] = 2;
        // approach 2
        int[] c = {1, 2, 3};  //declaration and assignment in one line

        // find length
        System.out.println(a.length);
        System.out.println(b.length);

        //read single value
        System.out.println(b[0]);  // 0 is index

        // read multiple values
        // approach 1
        for (int i = 0; i < c.length; i++)  //or i<=c.length-1
        {
            System.out.println("array index value " + c[i]);System.out.println(c[i]);

        }
        // approach 2  called enhanced loop or each loop
        for (int x : c) {
            System.out.println(x);
        }

        //2- multiple dimensional array hold multiple values
        //syntax {declaration - assignment - find length -read single value - read multiple values}

        // approach 1
        int[][] d = new int[3][2]; //declaration number of rows = 3   number of columns = 3
        //assignment
        d[0][0] = 100;
        d[0][1] = 200;

        d[1][0] = 300;
        d[1][1] = 400;

        d[2][0] = 500;
        d[2][1] = 600;

        System.out.println(d[2][1]);
        // approach 2
        int[][] f = {{100, 200}, {300, 400}, {500, 600}};  //declaration and assignment in one line
        System.out.println(f[0][1]);

        // find length
        System.out.println("number of rows :" + d.length);  // number of rows
        System.out.println("number of columns :" + d[0].length);  // number of columns


        //read single value
        System.out.println(f[0][1]);


        // read multiple values
        // approach 1
        for (int R = 0; R < f.length; R++) {
            for (int C = 0; C < f[R].length; C++) {

                System.out.println(f[R][C]);
            }

        }

        // approach 2  called enhanced loop or each loop
        for (int[] arr : f) {

            for (int x : arr) {
                System.out.print(x + "  ");
            }
            System.out.println();

        }

        // if you want hold in array hydrogenous data

        Object[] A = {100, 10.5, "A", "Welcome", true};
        System.out.println(A[1]); // print single value

        // print all value  with normal for loop
        for (int i = 0; i < A.length; i++) {
            System.out.println(A[i]);
        }

        // print all value  with enhancement for loop
        for (Object x : A) {
            System.out.println(x);
        }


        //practise 1 summation the array values
        //approach1
        int[] array = {1,3,5,7,9};
        int sum = 0;
        for(int i = 0 ; i< array.length; i++){
            System.out.println(sum + array[i]);
            sum=sum + array[i];

        }
        System.out.println("summation of values in array "+ sum);

        //approach1
        int summation = 0;
        for(int x:array){
            summation = summation+x;
        }
        System.out.println("summation of values in array "+ summation);

        //practise 1 search value in array
        int[] array2 = {100,200,300,400};
        int x = 400;
        for(int i =0;i<array2.length;i++){
            if (array2[i]==x){
                System.out.println(" x found in array  and its value is " + array2[i]);
            }
            else System.out.println(x + " value not found in array");
        }
    }




}
