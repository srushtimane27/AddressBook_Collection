//Address book program using collection method
package com.Bridgelabz;

import javax.naming.Name;
import java.util.*;

public class AddressBookDemo {
    public static void main(String[] args) {
        Map<String,String> map1 = new HashMap<>();
        Map<String,String> map2 = new HashMap<>();
        Map<String,String> map3 = new HashMap<>();

        map1.put("Srushti" , "Mane");
        map1.put("Komal" ,"More");
        map1.put("Sahil" , "Surve");
        System.out.println(map1);

        map2.put("Srushti" , "Pune");
        map2.put("Komal" , "Mumbai");
        map2.put("Sahil" , "Delhi");
        System.out.println(map2);

        map3.put("Srushti" , "Maharashtra");
        map3.put("Komal" , "Punjab");
        map3.put("Sahil" , "Goa");
        System.out.println(map3);

       // System.out.println(map2.get("Komal"));









    }
}
