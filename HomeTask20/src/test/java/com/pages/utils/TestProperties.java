package com.pages.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class TestProperties {
    Properties properties;

    public TestProperties(String environment) {
        String propFileName = environment + ".properties";
        properties = new Properties();

        try (InputStream inputStream = getClass().getClassLoader().getResourceAsStream(propFileName)) {
            if (inputStream == null) {
                throw new IOException("Property file '" + propFileName + "' not found in the classpath.");
            }
            properties.load(inputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public String getProperty(String key) {
        return properties.getProperty(key);
    }
}
