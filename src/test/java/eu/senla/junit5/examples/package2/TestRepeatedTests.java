package eu.senla.junit5.examples.package2;

import org.junit.jupiter.api.RepeatedTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestRepeatedTests {

    @RepeatedTest(5)
    public void repeatedTest() {
        assertEquals("senla", "SENLA".toLowerCase());
    }
}
