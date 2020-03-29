package oop.inheritance.verifone.vx520;

import oop.inheritance.TPV.StorageSystem;

import java.util.Properties;

public class VerifoneVx520StorageSystem implements StorageSystem {
    private static VerifoneVx520StorageSystem verifoneVx520StorageSystem = null;

    private VerifoneVx520StorageSystem(){

    }

    public static VerifoneVx520StorageSystem getInstance(){
        if(verifoneVx520StorageSystem == null){
            verifoneVx520StorageSystem = new VerifoneVx520StorageSystem();
        }
        return verifoneVx520StorageSystem;
    }

    private Properties properties = new Properties();

    public void save(String key, String value) {
        properties.setProperty(key, value);
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

}
