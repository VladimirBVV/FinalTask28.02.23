//package utils;
//
//import lombok.SneakyThrows;
//
//import java.io.BufferedReader;
//import java.io.FileReader;
//import java.util.Properties;
//
//public class PropertyReader {
//    private static PropertyReader instance = new PropertyReader();
//
//    private Properties props;
//
//    @SneakyThrows
//    private PropertyReader() {
//        props = new Properties();
//        try (BufferedReader reader = new BufferedReader(new FileReader("mytest.properties"))) {
//            props.load(reader);
//        }
//    }
//
//    public static PropertyReader getInstance() {
//        return instance;
//    }
//
//    public String getURL() {
//        return props.getProperty("url");
//    }
//}
