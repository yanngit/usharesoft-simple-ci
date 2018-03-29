package com.usharesoft.basicmaven;

public class Calculator {

    public Calculator() {
    }

    public float add(int numberOne, int numberTwo) {
        return numberOne + numberTwo;
    }

    public float subtract(int numberOne, int numberTwo) {
        return numberOne - numberTwo;
    }

    public float divide(int numberOne, int numberTwo) {
        return (float) numberOne / (float) numberTwo;
    }
    
    public float multiply(int numberOne, int numberTwo) {
        return numberOne * numberTwo;
    }

}
