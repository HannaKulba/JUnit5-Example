package eu.senla.junit5.examples.package1;

import org.junit.jupiter.api.*;
import utils.Log;

import static org.junit.jupiter.api.Assertions.fail;

@TestInstance(TestInstance.Lifecycle.PER_CLASS)
public class TestAnnotations {

    private static Class<TestAnnotations> clazz = TestAnnotations.class;

    @BeforeAll
    static void initAll() {
        Log.info("Старт запуска тестов в классе " + clazz.getName());
    }

    @BeforeEach
    void init(TestInfo test) {
        Log.info("Старт запуска теста " + test.getDisplayName());
    }

    @Test
    @DisplayName("Позитивный кейс")
    void succeedingTest() {
        Log.info("Выполнен позитивный тест-кейс");
    }

    @Test
    @DisplayName("Негативный кейс")
    void failingTest() {
        fail("Выполнен негативный кейс");
    }

    @Test
    @Disabled("Тест, который проигнорирован при запуске")
    void skippedTest() {
        // not executed
    }

    @AfterEach
    void tearDown(TestInfo test) {
        Log.info("Завершение запуска теста " + test.getDisplayName());
    }

    @AfterAll
    static void tearDownAll() {
        Log.info("Завершение запуска тестов в классе " + clazz);
    }
}
