package utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Properties;

public class CustomerProperty {

    public ArrayList<String> getCustomerData(String propFileName) {
        ArrayList<String> customerDataList = new ArrayList<>();

        try {
            Properties prop = new Properties();
            InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName);

            if (inputStream != null) {
                prop.load(inputStream);
            } else {
                throw new FileNotFoundException("Указанный properties файл '" + propFileName + "' не найден в classpath");
            }

            prop.forEach((key, value) -> customerDataList.add(value.toString()));

        } catch (IOException e) {
            e.printStackTrace();
        }

        return customerDataList;
    }
}
