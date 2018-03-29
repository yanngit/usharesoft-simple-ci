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
        float sum = calculator.add(numberOne, numberTwo);

        //then
        assertThat(sum).isEqualTo(new Float(15));
    }

    @Test
    public void add_should_subtract_the_two_numbers() {
        //given
        int numberOne = 5;
        int numberTwo = 10;

        //when
        float subtract = calculator.subtract(numberOne, numberTwo);

        //then
        assertThat(subtract).isEqualTo(new Float(-5));
    }

    @Test
    public void divide_should_divide_six_by_two() {
        //given

        //when
        float divide = calculator.divide(6, 2);

        //then
        assertThat(divide).isEqualTo(new Float(3));
    }

    @Test
    public void divide_should_divide_seven_by_two() {
        //given

        //when
        float divide = calculator.divide(7, 2);

        //then
        assertThat(divide).isEqualTo(new Float(3.5));
    }

    @Test
    public void multiply_should_multiply_seven_by_two() {
        //given

        //when
        float multiply = calculator.multiply(7, 2);

        //then
        //TODO fix this
        assertThat(multiply).isEqualTo(new Float(14));
    }
}