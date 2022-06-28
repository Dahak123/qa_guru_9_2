package guru.qa;

import org.junit.jupiter.api.Assertions;

public class HelloWorldTest {

    private HelloWorld hw = new HelloWorld();


   @org.junit.jupiter.api.Test
    void summTest() {
        int summ = hw.summ(2,4);
        Assertions.assertEquals(6,summ);
    }

}
