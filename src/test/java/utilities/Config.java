package utilities;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Config {

    private static Properties properties;




    static {


        String path = "src/test/resources/configuration.properties";


        try {
            FileInputStream file  =new FileInputStream(path);
            properties = new Properties();
            properties.load(file);
            file.close();



        } catch (IOException e) {
            System.out.println("Could not read the file " + path);
            e.printStackTrace();
        }



    }

    public  static  String getProperty(String key) {return  properties.getProperty(key);}
    public  static  String getProperties(String key) {return  properties.getProperty(key);}

}
