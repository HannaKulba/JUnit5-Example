package eu.senla.junit5.examples.package1;

import org.junit.jupiter.api.DynamicTest;
import org.junit.jupiter.api.TestFactory;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestDynamicTests {

    private ArrayList<String> words = new ArrayList<>(Arrays.asList("sunny", "funny", "bunny"));

    @TestFactory
    public Stream<DynamicTest> testWordLength() {
        return words.stream()
                .map(word ->
                        DynamicTest.dynamicTest("Проверка длины слова " + word, () -> {
                            assertEquals(5, word.length(), "Длинна слова не сопадает с ожидаемой");
                        })
                );
    }
}
