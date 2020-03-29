package oop.inheritance.verifone.v240m;

import oop.inheritance.TPV.StorageSystem;

import java.util.Properties;

public class VerifoneV240mStorageSystem implements StorageSystem {
    private static VerifoneV240mStorageSystem verifoneV240mStorageSystem = null;

    private VerifoneV240mStorageSystem(){

    }

    public static VerifoneV240mStorageSystem getInstance(){
        if(verifoneV240mStorageSystem == null){
            verifoneV240mStorageSystem = new VerifoneV240mStorageSystem();
        }
        return verifoneV240mStorageSystem;
    }

    private Properties properties = new Properties();

    public void save(String key, String value) {
        properties.setProperty(key, value);
    }

    public String get(String key) {
        return properties.getProperty(key);
    }

}
