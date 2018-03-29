package com.usharesoft.basicmaven;

/**
 * Hello world!
 */
public class App {

    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int add = calculator.add(5, 10);
        System.out.println("5 + 10 = " + add);

        int subtract = calculator.subtract(5, 10);
        System.out.println("5 - 10 = " + subtract);

        float divide = calculator.divide(7, 2);
        System.out.println("7 / 2 = " + divide);

        int multiply = calculator.multiply(5, 10);
        System.out.println("5 x 10 = " + multiply);
        
    }
}
