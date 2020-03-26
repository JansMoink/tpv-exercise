package oop.inheritance.verifone.vx690;

import java.util.Properties;

public class VerifoneVx690StorageSystem {
    private static VerifoneVx690StorageSystem verifoneVx690StorageSystem = null;

    private VerifoneVx690StorageSystem(){

    }

    public static VerifoneVx690StorageSystem getInstance(){
        if(verifoneVx690StorageSystem == null){
            verifoneVx690StorageSystem = new VerifoneVx690StorageSystem();
        }
        return verifoneVx690StorageSystem;
    }

    private Properties properties = new Properties();

    public void save(String key, String value) {
        properties.setProperty(key, value);
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

}
