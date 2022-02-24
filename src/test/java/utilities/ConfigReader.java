package utilities;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ConfigReader {

    static   Properties properties;

    //-Bu class'in amacı configuration.properties dosyasını okumak
    //ve oradaki key value ikililerini kullanarak istedigimiz key'e ait value'yu bize getirmek
    static {
        String dosyaYolu="configuration.properties";
        try {
            FileInputStream fileInputStream=new FileInputStream(dosyaYolu);
            properties=new Properties();
            properties.load(fileInputStream);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }


    //test class'larindan configReader class'ina ulaşıp yukarıdaki islemleriyapmamızı sağlayacak
    //bir method oluşturacagiz
    public static String getProperty(String key){

        String value=properties.getProperty(key);
        return value;
    }
}