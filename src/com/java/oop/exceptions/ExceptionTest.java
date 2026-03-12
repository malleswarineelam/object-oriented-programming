package com.java.oop.exceptions;

public class ExceptionTest {
    static String getUsername(){
        String username;
        username = null;
        return username;
    }
    public static void main(String[] args) {
        try {
            int averageMarks = 300 / 0;
            System.out.println(averageMarks);

        } catch (ArithmeticException e) {
            System.out.println("some internal error occured. Please try again later");

        }
        try {
            String username = getUsername();
            if (username.equals("madhu"))
                System.out.println("valid user");
        } catch (NullPointerException e) {
            System.out.println("username is null");
        }
        try{
    int[] ids = new int[5];
    ids[10] = 23432;
}
        catch(NegativeArraySizeException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Some issue in array");

        }
    }
}
