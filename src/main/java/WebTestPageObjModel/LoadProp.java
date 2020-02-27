package WebTestPageObjModel;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class LoadProp {

    static Properties prop;
    static FileInputStream input;
    static String fileName = "testconfig.properties";
    static String filelocation = "src/test/Resources/TestData/";

    public String getProperty(String Key) {

        prop = new Properties();
        try {

            input = new FileInputStream(filelocation + fileName);
            prop.load(input);
            input.close();
        } catch(IOException e){

            e.printStackTrace();
        }
        return prop.getProperty(Key);


    }
}