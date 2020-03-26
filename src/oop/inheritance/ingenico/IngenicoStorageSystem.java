package oop.inheritance.ingenico;

import java.util.Properties;

public class IngenicoStorageSystem {

    private static IngenicoStorageSystem ingenicoStorageSystem = null;

    private IngenicoStorageSystem(){

    }

    public static IngenicoStorageSystem getInstance(){
        if(ingenicoStorageSystem == null){
            ingenicoStorageSystem = new IngenicoStorageSystem();
        }
        return ingenicoStorageSystem;
    }

    private Properties properties = new Properties();

    public void save(String key, String value) {
        properties.setProperty(key, value);
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

}
