package eu.senla.junit5.examples.package1;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Nested;
import org.junit.jupiter.api.Test;
import utils.CustomerProperty;
import utils.Log;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

@DisplayName("Вложенные классы и assertions")
public class TestNestedClassAndAssertions {

    ArrayList<String> customerDataList = new CustomerProperty().getCustomerData("customer.properties");

    @Test
    @DisplayName("Проверка печати данных о клиенте консоли")
    public void printCustomerData() {
       customerDataList.forEach(System.out::println);
    }

    @Nested
    @DisplayName("Проверка определенных данных клиента")
    class SingleData {
        @Test
        @DisplayName("Проверка имени клиента")
        public void verifyFirstName() {
            assertEquals("Chandler", customerDataList.get(1), "Имя клиент неверно");
        }

        @Test
        @DisplayName("Проверка фамилии клиента")
        public void verifyLastName() {
            assertEquals("Bing", customerDataList.get(2), "Фамилия клиента неверна");
        }
    }

    @Nested
    @DisplayName("Проверка данных клиента")
    class AllData {
        @Test
        @DisplayName("Проверка всех данных клиента")
        public void verifyAllData() {
            assertIterableEquals(customerDataList, Arrays.asList("SMARTID", "Chandler", "Bing", "hrt7438-ri484-fhe839r3", "New York", "15.05.1995"), "Данные в массивах не идентичны");
        }
    }

    @Nested
    @DisplayName("Манипуляции с массивом данных клиента")
    class CustomerData {
        @Test
        @DisplayName("Добавление данных о клиенте в массив")
        public void addParameter() {
            String document = "Passport";
            customerDataList.add(document);
            assertTrue(customerDataList.contains(document), "Параметр не был добавлен в массив днных");
        }
    }

}
