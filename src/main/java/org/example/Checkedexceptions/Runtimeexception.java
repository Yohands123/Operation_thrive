package org.example.Checkedexceptions;

public class Runtimeexception {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 0;
        try {
            int result = num1 / num2;
            System.out.println(result);

        } catch (ArithmeticException e) {
            System.err.println("Error" + e.getMessage());
        }finally{
            System.out.println("Done!");
        }
    }
}
