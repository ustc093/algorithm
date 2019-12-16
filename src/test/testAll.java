package test;

import GoF.LazySingleton;
import com.sun.javafx.scene.layout.region.Margins;
import javafx.scene.input.DataFormat;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author gaozhen@cloudwalk.cn
 * 2019年09月23日 14:21
 */
public class testAll {
    public static void main(String[] args) throws ParseException {
        Map<String,String> map = new HashMap<>();
        map.put("hello","world");
        map.put("apple","pen");

        for(Map.Entry<String,String> entry:map.entrySet()){
            System.out.println(entry.getKey()+""+entry.getValue());
        }
    }
}
