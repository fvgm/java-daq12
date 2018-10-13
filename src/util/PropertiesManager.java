/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package util;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

/**
 *
 * @author fernando_2
 */
public class PropertiesManager {
    Properties props;
    String fileTitle;
    
    public PropertiesManager(String fileName) throws FileNotFoundException, IOException {
        this.fileTitle = fileName;
         props = new Properties();
         props.load(new FileInputStream(fileName));
    }
    
    public String getProperty(String property) {
        return props.getProperty(property);
    }
    
    public void setProperty(String property, String value) throws IOException {
        props.setProperty(property, value);
        props.store(new FileWriter("config.properties"), fileTitle);
    }
    
    
}
