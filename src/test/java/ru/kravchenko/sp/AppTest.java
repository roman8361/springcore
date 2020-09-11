package ru.kravchenko.sp;

import org.junit.Test;

import java.util.Random;

/**
 * Unit test for simple App.
 */
public class AppTest {

    @Test
    public void shouldAnswerWithTrue() {
        System.out.println("Hello world!");
    }

    @Test
    public void randomNumber() {
        Random random = new Random();
        for (int i = 0; i < 100; i++) {
            System.out.println(random.nextInt());
        }
    }

    @Test
    public void mathRandom(){
        Double idRandom = Math.random();
        System.out.println(idRandom);
    }

}
