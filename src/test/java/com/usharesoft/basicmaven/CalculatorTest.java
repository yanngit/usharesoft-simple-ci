package com.usharesoft.basicmaven;

import org.junit.Before;
import org.junit.Ignore;
import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() throws Exception {
        calculator = new Calculator();
    }

    @Test
    public void add_should_add_the_two_numbers() {
        //given
        int numberOne = 5;
        int numberTwo = 10;

        //when
        int sum = calculator.add(numberOne, numberTwo);

        //then
        assertThat(sum).isEqualTo(15);
    }

    @Test
    public void add_should_subtract_the_two_numbers() {
        //given
        int numberOne = 5;
        int numberTwo = 10;

        //when
        int subtract = calculator.subtract(numberOne, numberTwo);

        //then
        assertThat(subtract).isEqualTo(-5);
    }

    @Test
    public void divide_should_divide_six_by_two() {
        //given

        //when
        int divide = calculator.divide(6, 2);

        //then
        assertThat(divide).isEqualTo(3);
    }

    @Test
    public void divide_should_divide_seven_by_two() {
        //given

        //when
        int divide = calculator.divide(7, 2);

        //then
        assertThat(divide).isEqualTo(3);
    }

    @Test
    public void multiply_should_multiply_seven_by_two() {
        //given

        //when
        int multiply = calculator.multiply(7, 2);

        //then
        //TODO fix this
        assertThat(multiply).isEqualTo(14);
    }
}