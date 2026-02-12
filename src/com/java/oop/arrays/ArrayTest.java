package com.java.oop.arrays;

public class ArrayTest {
    public static void main(String[] args) {
        int[] ids;//declaration
        ids=new int[4];//Instantiation
        System.out.println(ids[0]);
        //Initialisation
        ids[0]=111;
        ids[1]=222;
        ids[2]=333;
        ids[3]=444;
        System.out.println(ids[0]);
        System.out.println(ids[1]);
        System.out.println(ids[2]);
        System.out.println(ids[3]);

        int[] rollNos={1,2,3,4};
        //all 3 like declaration,I,I in single line
        /*System.out.println(rollNos[0]);
        System.out.println(rollNos[1]);
        System.out.println(rollNos[2]);
        System.out.println(rollNos[3]);*/
        for(int rollNo :rollNos ){//for each
            System.out.println(rollNo);

        }
//you can use this for each for every datatype like int,byte,char,short,float,double,boolean etc
        //also objects
        /*like Customer[] customers;
        customers=new Customer[4];
        default value of customers[0] is null for all 4
         */

        Customer[] customers = new Customer[4];
    }
}
