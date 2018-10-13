/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author fernando_2
 */
public class PropertiesManager {
    Properties props = new Properties();
    FileInputStream fis;
    FileOutputStream fos;
    
    public PropertiesManager(String fileName) throws FileNotFoundException, IOException {
         fis = new FileInputStream(fileName);
         fos = new FileOutputStream(fileName);
         props.load(fis);
    }
    
    public String getSerialPort() {
        return props.getProperty("prop.serialPort");
    }
    
    public void setSerialPort(String portName) throws IOException {
        props.setProperty("prop.serialPort", portName);
        props.store(fos, "Propriedades");
    }
    
    
}
