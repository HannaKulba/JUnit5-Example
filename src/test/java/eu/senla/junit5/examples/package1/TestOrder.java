package eu.senla.junit5.examples.package1;

import org.junit.jupiter.api.MethodOrderer;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class TestOrder {

    @Test
    @Order(3)
    void testThree() {
        System.out.print("котики");
    }

    @Test
    @Order(1)
    void testOne() {
        System.out.print("Вы ");
    }

    @Test
    @Order(4)
    void testFour() {
        System.out.println("!");
    }

    @Test
    @Order(2)
    void testTwo() {
        System.out.print("такие ");
    }

}
