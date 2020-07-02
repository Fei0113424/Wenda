package com.company;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Main {
    /**
     *
     * @param index
     * @param object
     */
    public static void print(int index,Object object){
        System.out.println(String.format("{%d},%s",index,object));
    }


    public static void demoOperation(){
        print(1,5+2);
        print(2,5-2);
        print(3,5*2);
        print(4,5/2);
        print(5,5%2);
        print(6,5<<2);
        print(7,5>>2);
        print(8,5^2);
        print(9,5==2);
        print(10,5!=2);

        print(11,5.0/2);
        print(12,5/2.0);
        int a= 11;
        double b = 2.2f;
        a += 2;
        print(13,a);

    }
    public  static void demoString(){
        String str="hello world";
        print(1,str.indexOf('e'));
        print(2,str.charAt(3));
        print(3,str.codePointAt(1));
        print(4,str.compareToIgnoreCase("Hello World"));
        print(5,str.compareTo("hello corld"));
        print(6,str.contains("hello"));
        print(7,str.concat("!!!"));
        print(8,str.toUpperCase());

        StringBuilder sb= new StringBuilder();
        sb.append("x");
        sb.append(1.2);
        sb.append('a');
        sb.append(true);
        sb.append("x");
        print(9,sb.toString());
    }

    public static void demoControlFlow(){
        int a =4;
        int target = a ==2? 1:3;
        print(1,target);

       // string grade = 'B';

        
    }

    public static void demoList(){
        List<String> stringList = new ArrayList<String>(10);
        for (int i=0;i<4;++i){
            stringList.add(String.valueOf(i*i));
        }
        print(1,stringList);

        List<String> stringList1 = new ArrayList<String>();
        for (int i=0;i<4;++i){
            stringList1.add(String.valueOf(i));
        }
        print(2,stringList1);
        stringList.addAll(stringList1);
        print(3,stringList);

        Collections.reverse(stringList);
        print(4,stringList);

        Collections.sort(stringList);
        print(5,stringList);
    }

    public static void main(String[] args) {
//	// write your code here
  //      System.out.println("HELLO NOW LIFE");
        System.out.println(Math.ceil(2.5));
//        print(2,"hello");
 //       demoOperation();
        //demoControlFlow();
       // demoList();

    }
}
