package day8;

import day6.Array;

import java.util.Arrays;

public class StringMethod {
    public static void main(String[] args) {

        //1- length

        String s = "Welcome";
        System.out.println(s.length());
        System.out.println("Welcome".length());

        //2- concat - joining string

        String a= "Welcome ";
        String b= "to Java ";
        String c= "Automation";
        System.out.println(a+b);
        System.out.println(a.concat(b));  //  join 2 String

        System.out.println(a+b+c);
        System.out.println(a.concat(b).concat(c));  // join 3 String
        System.out.println(a+b.concat(c));

        // 3-trim  - remove spaces right and left side

        String d= "   Welcome   ";
        System.out.println(d);
        System.out.println(d.trim());

        // 4-charAt - returns a character from a string based on index

        String f="Welcome";
        System.out.println(f.charAt(3));
        System.out.println(f.charAt(0));

        // 4- contains - return check true/false string contains this part or not

        System.out.println(f.contains("Wel"));
        System.out.println(f.contains("wel"));
        System.out.println(f.contains("Wlome"));

        // 5 -equals , equalsIgnoreCase  - compare strings
        String g= "Welcome";
        String h= "Welcome";
        String j= "welcome";
        System.out.println(g==h);
        System.out.println(g.equals(h));

        System.out.println(g.equals(j));
        System.out.println(g.equalsIgnoreCase(j));  // ignore case sensitivity


        // 6- replace - replace single/multiple/sequence of characters in string
        s= "Welcome to java";

        System.out.println(s.replace("e","x"));
        System.out.println(s.replace("java","python"));

        // 7-substring - extract substring from the main string
        // starting index 0
        //ending index 1
       String k="Selenium";
        System.out.println(k.substring(0,5));
        System.out.println(k.substring(1,5));

        // 7-extract number of page from string
        String text = "Showing 1 to 10 of 2815 (282 Pages)";
        String pages=text.substring(text.indexOf("(")+1,text.indexOf("Pages")-1);
        System.out.println(pages);
        int totalPages = Integer.parseInt(pages);  // convert String to integer using Wrapper class
        System.out.println(totalPages);

        // 8- toUpperCase  toLowerCase
        System.out.println(s.toUpperCase());
        System.out.println(s.toLowerCase());

        // 9- split - split the string into multiple parts based on delimiter بيقسم الكلمة الى قسمين قبل وبعد الحرف او الرمز المشار ليه ويتم حفظ المقطعين داخل مصفوفة

        String l="abc123@gmail.com";
        String[] q =(l.split("@"));
        System.out.println(q[0]);
        System.out.println(q[1]);
        System.out.println(Arrays.toString(q)); // to print all elements in array

        //10- reverse string - can solve by may approach

        // Approach 1  - length() - charAt()
        String name = "Mahmoud";
        String reverse="";
        for(int i=name.length()-1;i>=0;i--){
           reverse=reverse+name.charAt(i);
        }
        System.out.println("reverse name is "+reverse);

        // Approach 2  - converting string  toCharArray type
         name= "Selenium";
         reverse="";
         char [] w =name.toCharArray();
         for(int i=w.length-1;i>=0;i--){
             reverse=reverse+w[i];
         }
        System.out.println("reverse String is "+reverse);

        // Approach 3 - StringBuffer and StringBuilder class
        StringBuffer t= new StringBuffer("Welcome");
        System.out.println(t.reverse());
        StringBuilder y= new StringBuilder("Appium");
        System.out.println(y.reverse());


        // String comparison
        //case 1
        String u="Welcome";
        String o="Welcome";

        System.out.println(u==o);  //compare between values of variables u and o  - true
        System.out.println(u.equals(o));  //compare between values of variables u and o - true

        //case 2
         u=new String("Welcome");
         o=new String("Welcome");

        System.out.println(u==o);   //compare between objects u and o - false
        System.out.println(u.equals(o));  //compare between values of objects u and o  - true
        //case 3
        u="Welcome";
        o=new String("Welcome");

        System.out.println(u==o);   //compare between value of variable u and object of o - false
        System.out.println(u.equals(o));  //compare between values of variable u and objects o  - true

        // 10-examples
        //1- remove elements in string
        String m= "$15,20,10";  // want print 152010
        System.out.println(m.replace("$","").replace(",",""));

        // 2- split 3 elements
        String n="abc,123@xyz";   //want print abc  123  xyz
        String[] Q = n.split(",");
        System.out.println(Arrays.toString(Q));
        String[] W=Q[1].split("@");
        System.out.println(Arrays.toString(W));

        System.out.println(Q[0]);
        System.out.println(W[0]);
        System.out.println(W[1]);

        // 3- split spaces
        b= "  AHMED  ";
        System.out.println(b);
        System.out.println(b.trim());
        System.out.println(b.toLowerCase().trim());

    }


}
